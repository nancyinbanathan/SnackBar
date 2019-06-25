package com.example.snackbar;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void displayMessage(View view) {
            final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)findViewById(R.id.rootLayout);
            //Snackbar snackBar = Snackbar.make(coordinatorLayout,R.string.popUpMsg,Snackbar.LENGTH_LONG);
            //((Snackbar) snackBar).show();
            Snackbar snackbar = Snackbar
                    .make(coordinatorLayout, "Message is deleted", Snackbar.LENGTH_LONG)
                    .setAction("UNDO", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Snackbar snackbar1 = Snackbar.make(coordinatorLayout, "Message is restored!", Snackbar.LENGTH_SHORT);
                            snackbar1.show();
                        }
                    });

            snackbar.show();
        }



}
