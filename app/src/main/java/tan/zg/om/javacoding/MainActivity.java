package tan.zg.om.javacoding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import tan.zg.om.javacoding.utilities.MyTextUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyTextUtil util = new MyTextUtil();
        TextView tv = (TextView) findViewById(R.id.myTextView);
        tv.setText(util.getValue());
    }
}
