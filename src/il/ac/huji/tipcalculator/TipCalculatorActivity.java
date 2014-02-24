package il.ac.huji.tipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculatorActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tip_calculator);
		final Button button = (Button) findViewById(R.id.btnCalculate);
        final TextView tipText = (TextView)findViewById(R.id.txtTipResult);
        final EditText amountTxt = (EditText)findViewById(R.id.edtBillAmount);
        final CheckBox roundCheck = (CheckBox)findViewById(R.id.chkRound);
        
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
					try{
							float amount = Float.parseFloat(amountTxt.getText().toString());
							amount = amount*12/100;
							if(roundCheck.isChecked()){
								amount = Math.round(amount);
							}
							tipText.setText("Tip: $" + Float.toString(amount));
						
					}
					catch(Exception e)
					{
						

						tipText.setText("Please insert an amount");
					}
				
				};
				
			
		});
	}



}
