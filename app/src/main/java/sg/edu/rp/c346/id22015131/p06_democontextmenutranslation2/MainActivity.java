package sg.edu.rp.c346.id22015131.p06_democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText = findViewById(R.id.textViewTranslatedText);

        registerForContextMenu(tvTranslatedText);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,0,0, "English");
        menu.add(0,1,1, "Italian");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getItemId()==0) {
            Toast.makeText(getApplicationContext(), "English is chosen", Toast.LENGTH_SHORT).show();
            tvTranslatedText.setText("Hello");
            return true;
        } else if (item.getItemId()==1) {
            Toast.makeText(getApplicationContext(), "Italian is chosen", Toast.LENGTH_SHORT).show();
            tvTranslatedText.setText("Ciao");
            return true;
        }
        return super.onContextItemSelected(item);
    }
}