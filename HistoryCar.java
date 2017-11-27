package blogfa.roeintan.besrcars.you_knows;

import android.app.Activity;
import android.os.Bundle;

import blogfa.roeintan.besrcars.R;
import ir.noghteh.JustifiedTextView.JustifiedTextView;

/**
 * Created by sr on 7/25/2016.
 */
public class HistoryCar extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history_car);

        JustifiedTextView txt_history1= (JustifiedTextView) findViewById(R.id.txt_history1);
        txt_history1.setLineSpacing(24);
        JustifiedTextView txt_history2= (JustifiedTextView) findViewById(R.id.txt_history2);
        txt_history2.setLineSpacing(24);
        JustifiedTextView txt_history3= (JustifiedTextView) findViewById(R.id.txt_history3);
        txt_history3.setLineSpacing(24);
        JustifiedTextView txt_history4= (JustifiedTextView) findViewById(R.id.txt_history4);
        txt_history4.setLineSpacing(24);
        JustifiedTextView txt_history5= (JustifiedTextView) findViewById(R.id.txt_history5);
        txt_history5.setLineSpacing(24);
        JustifiedTextView txt_history6= (JustifiedTextView) findViewById(R.id.txt_history6);
        txt_history6.setLineSpacing(24);
        JustifiedTextView txt_history7= (JustifiedTextView) findViewById(R.id.txt_history7);
        txt_history7.setLineSpacing(24);
        JustifiedTextView txt_history8= (JustifiedTextView) findViewById(R.id.txt_history8);
        txt_history8.setLineSpacing(24);



    }
}
