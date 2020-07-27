package sg.edu.rp.c346.id18004536.demosimplemovielist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView lvExamTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips =findViewById(R.id.listViewMovie);

        ArrayList<String> movieList = new ArrayList<>();


        movieList.add("avengers");
        movieList.add("Naruto");


        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, movieList);

        lvExamTips.setAdapter(arrayAdapter);

        arrayAdapter.notifyDataSetChanged();
    }
}
