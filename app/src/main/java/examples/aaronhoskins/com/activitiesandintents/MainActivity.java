package examples.aaronhoskins.com.activitiesandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etUserInput;
    EditText etFirstName;
    EditText etLastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUserInput = findViewById(R.id.etUserInput);
        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnStartUserDisplayActivity:
                final String userInputString = etUserInput.getText().toString();
                //Explicit Intent
                Intent explicitIntent = new Intent(this, UserDisplayActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("user_input", userInputString);
                explicitIntent.putExtras(bundle);
                //explicitIntent.putExtra("user_input", userInputString);
                startActivity(explicitIntent);


                //Implicit Intent
                //Intent implicitIntent = new Intent("open.user.display.activity");
                //startActivity(implicitIntent);
                break;
            case R.id.btnStartPersonActivity:
                final String firstName = etFirstName.getText().toString();
                final String lastName = etLastName.getText().toString();
                Person person = new Person(firstName, lastName);
                Intent personActivityIntent = new Intent(this, PersonActivity.class);
                //pass in intent
                //personActivityIntent.putExtra("person", person);
                //pass using bundle
                Bundle bundlePerson = new Bundle();
                bundlePerson.putParcelable("person", person);
                personActivityIntent.putExtras(bundlePerson);
                startActivity(personActivityIntent);
                break;
        }

    }
}
