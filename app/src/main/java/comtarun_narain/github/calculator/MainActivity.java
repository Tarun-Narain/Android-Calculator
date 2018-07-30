package comtarun_narain.github.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void setText(View view)
    {


        TextView tv=findViewById(R.id.Display);
        Button b1=findViewById(view.getId());
        String str=(String)tv.getText();
        tv.setText(str+b1.getText());

    }
    public void solve(View view)
    {
         TextView tv=findViewById(R.id.Display);
   String str=(String)tv.getText();
   double result=0;
   try {
       Expression e = new ExpressionBuilder(str).build();
        result = e.evaluate();
       tv.setText(Double.toString(result));
   } catch(Exception e)
   {
        tv.setText("ERROR");
   }

    }
    public void Delete(View view)
    {
        TextView tv=findViewById(R.id.Display);
        String str=(String)tv.getText();
        try {
            int len = str.length();
            StringBuilder br = new StringBuilder(str);
            br.deleteCharAt(len - 1);
            tv.setText(br);
        }
        catch(Exception e)
        {
            tv.setText("OUT OF BOUND");
        }
    }
    public void Ac(View view)
    {
        TextView tv=findViewById(R.id.Display);
        tv.setText("");
    }

}
