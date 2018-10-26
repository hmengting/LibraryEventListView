package librarical.twelve.group.librarical;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private CustomeAdapter customeAdapter;
    private ArrayList<ImageModel> imageModelArrayList;
    private int[] myImageList = new int[]{R.drawable.fin_reading_circle, R.drawable.knitting,
            R.drawable.music_prod,R.drawable.trans_geek
            ,R.drawable.digital_creation,R.drawable.health_in_square,
            R.drawable.language_hit,R.drawable.better_health
    };
    private String[] myImageNameList = new String[]{"Book Circle in Finnish", "Knitting Workshop",
            "Music Production for You 13-25 years","Trans Geek-gender, identity and nerd culture"
            ,"Digital Creations 8-100 Years","Health in Square",
            "Language Hit","Better Health"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);


//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        lv = (ListView) findViewById(R.id.listView);

        imageModelArrayList = populateList();
        Log.d("hjhjh",imageModelArrayList.size()+"");
        customeAdapter = new CustomeAdapter(this,imageModelArrayList);
        lv.setAdapter(customeAdapter);

    }

    private ArrayList<ImageModel> populateList(){

        ArrayList<ImageModel> list = new ArrayList<>();

        for(int i = 0; i < 8; i++){
            ImageModel imageModel = new ImageModel();
            imageModel.setName(myImageNameList[i]);
            imageModel.setImage_drawable(myImageList[i]);
            list.add(imageModel);
        }

        return list;

    }
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
