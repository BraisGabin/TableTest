package com.example.BuggyTableExample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import com.inqbarna.tablefixheaders.TableFixHeaders;
import com.inqbarna.tablefixheaders.adapters.BaseTableAdapter;

public class MainActivity extends Activity{
    MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_benefit_analysis);

        TableFixHeaders tableFixHeaders = (TableFixHeaders) findViewById(R.id.table);
        mAdapter = new MyAdapter();
        tableFixHeaders.setAdapter(mAdapter);
    }

    public class MyAdapter extends BaseTableAdapter {

        @Override
        public int getRowCount() {
            // Row number without fixed part
            return 30;
        }

        @Override
        public int getColumnCount() {
            // Column number without fixed part
            return 1;
        }

        @Override
        public View getView(int row, int column, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.item_table, parent, false);
            }
            final String value = row + "";
            final TextView t = ((TextView) convertView.findViewById(android.R.id.text1));
            t.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					System.out.println(((TextView)v).getText());
					((TextView)v).setText("hola que tal");
				}
			});
            t.setText(value);
            return convertView;
        }

        @Override
        public int getWidth(int column) {
            return 1;
        }

        @Override
        public int getHeight(int row) {
            return Math.round(55 * getResources().getDisplayMetrics().density);
        }

        @Override
        public int getItemViewType(int row, int column) {
            return 0;
        }

        @Override
        public int getViewTypeCount() {
            return 1;
        }
    }
}
