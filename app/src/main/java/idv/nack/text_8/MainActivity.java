package idv.nack.text_8;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    private final static String TAG = "MainActivity";
    private final static String PREF_NAME = "Text8";
    private final static boolean DEFAULT_SAVE = true;
    private EditText editText;
    private EditText editText2;
    private Button btsure, btcel;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        loadPref();
    }

    private void findViews(){
        editText =(EditText)findViewById(R.id.editText);
        editText2 =(EditText)findViewById(R.id.editText2);
        checkBox =(CheckBox)findViewById(R.id.checkbox);
        btsure =(Button)findViewById(R.id.btsure);
        btcel =(Button)findViewById(R.id.btsure);
        btsure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadPref();
                String Name = editText.getText().toString();
                String Password =editText2.getText().toString();

            }
        });
        btcel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
    }

    private void savePref(){
        SharedPreferences preferences = getSharedPreferences(PREF_NAME, MODE_PRIVATE);
        

    }

    private void loadPref(){}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
