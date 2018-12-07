package e.android.layoutwithjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * simple project to show how to use java to create a layout
 * james, 12/7/2018
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // build layout frame
        LinearLayout linearLayout = new LinearLayout(this);
        LinearLayout.LayoutParams llParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);
        linearLayout.setLayoutParams(llParams);
        linearLayout.setPadding(20,20,20,20);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);
        // add a edit text to the layout
        final EditText editText = new EditText(this);
        editText.setHint("enter your name");
        linearLayout.addView(editText);
        // add a button to the layout
        Button button = new Button(this);
        // alter to wrap content
        LinearLayout.LayoutParams buttonParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        buttonParams.gravity = Gravity.CENTER;
        button.setText("click me");

        button.setLayoutParams(buttonParams);
        linearLayout.addView(button);
        // add text view
        final TextView textView = new TextView(this);
        textView.setText("Welcome");
        linearLayout.addView(textView);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = editText.getText().toString();
                textView.setText("Welcome"+user);
            }
        });
    }
}
