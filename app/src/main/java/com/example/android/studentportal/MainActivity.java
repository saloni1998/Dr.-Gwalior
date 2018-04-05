package com.example.android.studentportal;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //defining view objects
    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button buttonSignup;
    private Button AlreadySignin;
    private ProgressDialog progressDialog;

    //defining firebaseauth object
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing firebase auth object
        firebaseAuth= FirebaseAuth.getInstance();

        //if getCurrentUser does not return null
        if(firebaseAuth.getCurrentUser()!=null){
            //that means user is already logged in so close this activity
            finish();
            //and open login activity
            startActivity(new Intent(getApplicationContext(),InfoActivity.class));
        }
        //initializing views
        editTextEmail= (EditText)findViewById(R.id.editTextEmail);
        editTextPassword=(EditText)findViewById(R.id.editTextPassword);

        buttonSignup=(Button)findViewById(R.id.buttonSignup);
        AlreadySignin=(Button)findViewById(R.id.AlreadySignin);
        progressDialog=new ProgressDialog(this);
        //attaching listener to button
        buttonSignup.setOnClickListener(this);
        AlreadySignin.setOnClickListener(this);


    }
    private void registerUser(){
        //getting email and password from edit texts

        String email=editTextEmail.getText().toString().trim();
        String password= editTextPassword.getText().toString().trim();

        //checking if emails and passwords are empty
        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Please enter email",Toast.LENGTH_LONG).show();
            return;
        }
        if(TextUtils.isEmpty(password))
        {
            Toast.makeText(this,"Please enter password",Toast.LENGTH_LONG).show();
            return;
        }
        //if the email and password are not empty
        //displaying a progress dialog

        progressDialog.setMessage("Registering Please Wait...");
        progressDialog.show();

        //creating new user
        firebaseAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        //checking if success
                        if (task.isSuccessful()) {
                            //display some message
                            Toast.makeText(MainActivity.this, "Successfully registered", Toast.LENGTH_LONG).show();
                            editTextEmail.setText("");
                            editTextPassword.setText("");

                        } else {
                            // display some message
                            Toast.makeText(MainActivity.this, "Registration Error", Toast.LENGTH_LONG).show();
                        }
                        progressDialog.dismiss();
                    }
                });


    }


    @Override
    public void onClick(View view) {
        //calling register method on click
        if(view==buttonSignup) {
            registerUser();
        }
        if(view==AlreadySignin){
            //open login activity when user taps on the already registered textview
            finish();
            startActivity(new Intent(this, LoginActivity.class));
        }
    }
}


