/*
James Dotson
  /\_/\
=( °w° )=
  )   (  //
 (__ __)//
CODE CAT APPROVED!
*/
package com.example.james.icantcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView incDecInd, incDecInd2;
    Button count, count2, res, res2, incDec, incDec2;
    int currentCount = 0, currentCount2 = 0;
    String str, str2;
    Boolean inDe = false, inDe2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mein code
        count = (Button) findViewById(R.id.counterButton);
        count2 = (Button) findViewById(R.id.counterButton2);
        res = (Button) findViewById(R.id.resetButton);
        res2 = (Button) findViewById(R.id.resetButton2);
        incDec = (Button) findViewById(R.id.inc_dec);
        incDec2 = (Button) findViewById(R.id.inc_dec2);
        incDecInd = (TextView) findViewById(R.id.incDecIndicator);
        incDecInd2 = (TextView) findViewById(R.id.incDecIndicator2);
        count.setOnClickListener(bCount);
        res.setOnClickListener(bRes);
        incDec.setOnClickListener(bIncDec);
        count2.setOnClickListener(bCount2);
        res2.setOnClickListener(bRes2);
        incDec2.setOnClickListener(bIncDec2);
    }

        Button.OnClickListener bIncDec = new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //increment/decrement selection
                if (inDe == true)
                {
                    inDe = false;
                    incDec.setText("DECREMENT");
                    incDecInd.setText("INCEMENTING");
                }
                else if (inDe == false)
                {
                    inDe = true;
                    incDec.setText("INCREMENT");
                    incDecInd.setText("DECREMENTING");
                }
            }
        };
        Button.OnClickListener bIncDec2 = new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //increment/decrement selection
                if (inDe2 == true)
                {
                    inDe2 = false;
                    incDec2.setText("DECREMENT");
                    incDecInd2.setText("INCEMENTING");
                }
                else if (inDe2 == false)
                {
                    inDe2 = true;
                    incDec2.setText("INCREMENT");
                    incDecInd2.setText("DECREMENTING");
                }
            }
        };

        Button.OnClickListener bCount = new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //if statement for increment/decrement
                if (inDe == true)
                {
                    //decrementing
                    currentCount--;
                    //setting text on counter button
                    str = Integer.toString(currentCount);
                    count.setText(str);
                }
                else if(inDe == false)
                {
                    //incrementing
                    currentCount++;
                    //setting text on counter button
                    str = Integer.toString(currentCount);
                    count.setText(str);
                }
            }
        };
        Button.OnClickListener bCount2 = new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //if statement for increment/decrement
                if (inDe2 == true)
                {
                    //decrementing
                    currentCount2--;
                    //setting text on counter button
                    str2 = Integer.toString(currentCount2);
                    count2.setText(str2);
                }
                else if(inDe2 == false)
                {
                    //incrementing
                    currentCount2++;
                    //setting text on counter button
                    str2 = Integer.toString(currentCount2);
                    count2.setText(str2);
                }
            }
        };

        Button.OnClickListener bRes = new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //reseting count, setting to increment
                currentCount = 0;
                count.setText("TAP TO START");
                incDec.setText("DECREMENT");
                incDecInd.setText("INCREMENTING");
                inDe = false;
            }
        };
        Button.OnClickListener bRes2 = new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //reseting count, setting to increment
                currentCount2 = 0;
                count2.setText("TAP TO START");
                incDec2.setText("DECREMENT");
                incDecInd2.setText("INCREMENTING");
                inDe2 = false;
            }
        };
}
