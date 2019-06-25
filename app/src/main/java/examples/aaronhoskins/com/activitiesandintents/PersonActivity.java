package examples.aaronhoskins.com.activitiesandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PersonActivity extends AppCompatActivity {
    TextView tvFirstName;
    TextView tvLastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);

        tvFirstName = findViewById(R.id.tvFirstName);
        tvLastName = findViewById(R.id.tvLastName);

        Intent passedIntent = getIntent();
        Bundle passedBundle = passedIntent.getExtras();
        Person passedPerson = passedBundle.getParcelable("person");
        tvLastName.setText(passedPerson.getLastName());
        tvFirstName.setText(passedPerson.getFirstName());
       
    }
}
