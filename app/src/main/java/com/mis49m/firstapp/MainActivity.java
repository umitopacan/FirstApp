package com.mis49m.firstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    EditText etNum1, etNum2;
    Button btnCal;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText)findViewById(R.id.et_num1);
        etNum2 = (EditText)findViewById(R.id.et_num2);
        tvResult = (TextView)findViewById(R.id.tv_result);

    }

    public void calculate(View view){
        int n1 = Integer.valueOf(etNum1.getText().toString());
        int n2 = Integer.valueOf(etNum2.getText().toString());

        tvResult.setText( String.valueOf(n1+n2) );

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(SecondActivity.PARAM_KEY, String.valueOf(n1+n2) );
        startActivity(intent);

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
