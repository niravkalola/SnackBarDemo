package nkdroid.tutorial.snackbar;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {


    private Button mBtnSimple,mBtnWithOption,mBtnWithCustomColor;
    private LinearLayout mRootLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRootLayout= (LinearLayout) findViewById(R.id.rootLayout);

        // Welcome Message
        Snackbar.make(mRootLayout, "Welcome Snackbar Message!", Snackbar.LENGTH_LONG).show();

        mBtnSimple= (Button) findViewById(R.id.simplebutton);
        mBtnWithOption= (Button) findViewById(R.id.optionbutton);
        mBtnWithCustomColor= (Button) findViewById(R.id.colorbutton);

        mBtnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(mRootLayout, "Simple Snackbar Message!", Snackbar.LENGTH_LONG).show();
            }
        });

        mBtnWithOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(mRootLayout, "Snackbar with Option!", Snackbar.LENGTH_SHORT)
                        .setAction("Save", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // save operations
                            }
                        })
                        .setActionTextColor(getResources().getColor(R.color.primaryColor))
                        .setDuration(2000).show();
            }
        });

        mBtnWithCustomColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar=Snackbar.make(mRootLayout, "Snackbar with custom color!", Snackbar.LENGTH_LONG);
                snackbar.getView().setBackgroundColor(getResources().getColor(R.color.primaryColor));
                snackbar.show();
            }
        });

    }
}
