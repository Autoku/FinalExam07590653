package cpsu.pmppalm.remindmovie;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Query;

import java.util.List;

import cpsu.pmppalm.remindmovie.adapter.MovieRecyclerViewAdapter;
import cpsu.pmppalm.remindmovie.database.MovieDao;
import cpsu.pmppalm.remindmovie.database.MovieItem;
import cpsu.pmppalm.remindmovie.database.MovieRepository;


public class ListMovie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_movie);


        Button addButton = findViewById(R.id.register_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMovie.this, AddActivity.class);
                startActivity(intent);
            }

        });
       Button loginBT = findViewById(R.id.login_button);
       loginBT.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
              
           }
       });
    }
}
