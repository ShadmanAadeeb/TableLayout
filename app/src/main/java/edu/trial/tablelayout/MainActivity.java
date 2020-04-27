package edu.trial.tablelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
	View tableActivityLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.d("TAG1","I came here");

		CountryDataTable countryDataTable=new CountryDataTable((TableLayout) findViewById(R.id.table_id));
		countryDataTable.addTableHeaderContents(new String[]{"Country", "Affected", "Cured","Apple","Banana","Crocodile","Dinosaur","Elephat"},8);
		for(int i=0;i<100;i++){
			countryDataTable.addStringArrayContents(new String[]{"Bangladesh", "199", "2","Apple","Banana","Crocodile","Dinosaur","Elephat"},8);
			countryDataTable.addStringArrayContents(new String[]{"India", "299", "2","Apple","Banana","Crocodile","Dinosaur","Elephat"},8);
			countryDataTable.addStringArrayContents(new String[]{"Japan", "19", "5","Apple","Banana","Crocodile","Dinosaur","Elephat"},8);
			countryDataTable.addStringArrayContents(new String[]{"USA", "500", "10","Apple","Banana","Crocodile","Dinosaur","Elephat"},8);

		}
		Log.d("TAG1","I came here 2");





	}
}
