package examples.aaronhoskins.com.activitiesandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UserDisplayActivity extends AppCompatActivity {
    TextView tvDisplayForPassedData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_display);
        tvDisplayForPassedData = findViewById(R.id.tvDisplay);
        Intent passedIntent = getIntent();
        Bundle passedBundle = passedIntent.getExtras();
        if(passedBundle != null) {
            String passedUserInput = passedBundle.getString("user_input");
            tvDisplayForPassedData.setText(passedUserInput);
        }
        //String passedUserInput = passedIntent.getStringExtra("user_input");

    }
}
