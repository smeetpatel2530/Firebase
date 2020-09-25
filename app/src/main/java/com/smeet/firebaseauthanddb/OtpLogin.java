package com.smeet.firebaseauthanddb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;
public class OtpLogin extends AppCompatActivity {

    EditText textotp;
    Button verify;
    PhoneAuthProvider.OnVerificationStateChangedCallbacks verificationStateChangedCallbacks;

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_login);

        textotp = findViewById(R.id.otp);
        verify = findViewById(R.id.button_otp);
        
        verificationStateChangedCallbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
            @Override
            public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                Toast.makeText(OtpLogin.this, "Mobile Number verifed successfully", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onVerificationFailed(@NonNull FirebaseException e) {
                Toast.makeText(OtpLogin.this, "Verification Failed", Toast.LENGTH_SHORT).show();
            }
        };

        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mobileNumber = textotp.getText().toString();
                if (!mobileNumber.equalsIgnoreCase(""))
                {
                    verifyMobileNumber(mobileNumber);
                }else {
                    Toast.makeText(OtpLogin.this, "Please enter valid mobile number", Toast.LENGTH_SHORT).show();
                }

            }
            public void verifyMobileNumber(String mobile)
            {
              // PhoneAuthProvider.getInstance().verifyPhoneNumber(mobile, 60, TimeUnit.SECONDS, this,verificationStateChangedCallbacks);
            }


        });


        }
    }
