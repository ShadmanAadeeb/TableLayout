package edu.trial.tablelayout;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class CountryDataTable  {
	TableLayout tableLayout;
	public CountryDataTable(TableLayout tableLayout){
		this.tableLayout=tableLayout;
	}
	public CountryDataTable(Context context){
		this.tableLayout=new TableLayout(context);
	}
	void addTableHeaderContents(String [] stringArray,int stringArrayLength){
		//making the table row
		TableRow tableRow=new TableRow(tableLayout.getContext());
		tableRow.setOrientation(LinearLayout.HORIZONTAL);
		tableRow.setPaddingRelative(10,10,10,10);

		//making the textview array
		TextView[] textView=new TextView[stringArrayLength];

		//setting each of the strings in textviews
		for(int i=0;i<stringArrayLength;i++){
			textView[i]=new TextView(tableLayout.getContext());
			textView[i].setText(stringArray[i]);
			textView[i].setTextColor(Color.WHITE);
			textView[i].setPadding(10,10,10,10);

			textView[i].setAllCaps(true);


			textView[i].setBackgroundColor(Color.BLACK);

		}
		//adding the textviews to the tablerow
		for(int i=0;i<stringArrayLength;i++){
			tableRow.addView(textView[i]);
		}
		//finally adding the table row to the table layout
		tableLayout.addView(tableRow);
	}



	void addStringArrayContents(String [] stringArray,int stringArrayLength){
		//making the table row
		TableRow tableRow=new TableRow(tableLayout.getContext());
		tableRow.setOrientation(LinearLayout.HORIZONTAL);
		tableRow.setPadding(10,10,10,10);

		//making the textview array
		TextView[] textView=new TextView[stringArrayLength];

		//setting each of the strings in textviews
		for(int i=0;i<stringArrayLength;i++){
			textView[i]=new TextView(tableLayout.getContext());
			textView[i].setText(stringArray[i]);
			textView[i].setTextColor(Color.BLACK);


			if(i%2==0){//even textview or cell
				textView[i].setBackgroundColor(Color.LTGRAY);
			}else{
				textView[i].setBackgroundColor(Color.WHITE);
			}
		}
		//adding the textviews to the tablerow
		for(int i=0;i<stringArrayLength;i++){
			tableRow.addView(textView[i]);
		}
		//finally adding the table row to the table layout
		tableLayout.addView(tableRow);
	}

}
