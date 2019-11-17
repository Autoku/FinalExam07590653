package cpsu.pmppalm.remindmovie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import cpsu.pmppalm.remindmovie.database.MovieItem;
import cpsu.pmppalm.remindmovie.database.MovieRepository;


public class AddActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Button saveButton = findViewById(R.id.register_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nameEdit = findViewById(R.id.full_name_edit_text);
                String name = nameEdit.getText().toString();

                EditText dateEdit = findViewById(R.id.username_edit_text);
                String date = dateEdit.getText().toString();

                EditText desEdit = findViewById(R.id.password_edit_text);
                String des = desEdit.getText().toString();

                MovieItem item = new MovieItem(0,name,date,des);

                MovieRepository repository = new MovieRepository(AddActivity.this);
                repository.insertMovie(item, new MovieRepository.InsertCallback() {
                    @Override
                    public void onInsertSuccess() {
                        finish();
                    }
                });
            }
        });

    }
}
