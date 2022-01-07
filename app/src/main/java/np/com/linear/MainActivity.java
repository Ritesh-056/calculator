package np.com.linear;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btnValue1,btnValue2,btnValue3,btnValue4,btnValue5,btnValue6,btnValue7,btnValue8,btnValue9,btnValue0,btnAdd,btnSubtraction,btnMuliply,btnAnswer,btnClear;
    TextView resultBox;
    int Addition,Multiplication,Divison, Subtraction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declaring UI and initialization
         uiDefine();

         btnAnswer.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 Toast.makeText(getApplicationContext(), "Answer is pending", Toast.LENGTH_SHORT).show();
             }
         });
    }


    public void uiDefine(){

        btnValue1 = findViewById(R.id.btn1);
        btnValue2 = findViewById(R.id.btn2);
        btnValue3 = findViewById(R.id.btn3);
        btnValue4 = findViewById(R.id.btn4);
        btnValue5 = findViewById(R.id.btn5);
        btnValue6 = findViewById(R.id.btn6);
        btnValue7 = findViewById(R.id.btn7);
        btnValue8 = findViewById(R.id.btn8);
        btnValue9 = findViewById(R.id.btn9);
        btnValue0 = findViewById(R.id.btn0);
        btnAdd =  findViewById(R.id.btnplus);
        btnSubtraction = findViewById(R.id.btnminus);
        btnMuliply =  findViewById(R.id.btnmul);
        btnAnswer =findViewById(R.id.btnAns);
        resultBox =findViewById(R.id.editText);
        btnClear =findViewById(R.id.btnclear);

    }
}
