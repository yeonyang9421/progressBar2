package kr.co.woobi.imyeon.progressbar2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    TextView textView, textView2;
    ProgressBar progressBar;
   ImageView imageView;
   RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton=(ToggleButton)findViewById(R.id.toggleButton);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        textView=(TextView)findViewById(R.id.textView);
        imageView=(ImageView)findViewById(R.id.imageView);
        textView2=(TextView)findViewById(R.id.textView2) ;
        progressBar.setVisibility(View.GONE);
        imageView.setVisibility(View.INVISIBLE);
        radioButton=(RadioButton)findViewById(R.id.radioButton1);
        radioButton=(RadioButton)findViewById(R.id.radioButton2);
    }

    public void onClickWidget(View view){
        String text = toggleButton.getText()+"-"+toggleButton.isChecked();
        if(toggleButton.isChecked()) {
            progressBar.setVisibility(View.VISIBLE);
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            progressBar.setVisibility(View.GONE);
            imageView.setVisibility(View.INVISIBLE);
        }
        Toast.makeText(view.getContext(),text,Toast.LENGTH_SHORT).show();
        textView.setText(text);
    }

    public void onClickRadio(View view){
        int id = view.getId();
        String text2 = ((RadioButton)view).getText().toString();
        switch (id){
            case R.id.radioButton1:
                text2=text2+ "-" + ((RadioButton)view).isChecked();
                break;
            case R.id.radioButton2:
                text2=text2 + "_" + ((RadioButton)view).isChecked();
                break;
                default:
                    text2="Noting";
        }
        textView2.setText(text2);
        Toast.makeText(view.getContext(),text2, Toast.LENGTH_SHORT).show();

    }
}
