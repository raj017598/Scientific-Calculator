package rahul.raj.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import rahul.raj.scientificcalculator.scientificcalculator.JsCallback;
import rahul.raj.scientificcalculator.scientificcalculator.JsEvaluator;

public class MainActivity extends AppCompatActivity {
    JsEvaluator jsEvaluator; EditText Text;
    boolean shift = false; Button shiftbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#232D36"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);
        getSupportActionBar().setTitle("Scientific Calculator");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedPreferences",MODE_PRIVATE);
        boolean first = sharedPreferences.getBoolean("firstSC",true);
        if(first)
            showdialogOnStart();
        Text=(EditText)findViewById(R.id.displayText);
        shiftbutton = (Button)findViewById(R.id.shiftButton);
        jsEvaluator = new JsEvaluator(this);
        Text.setText("0"); }
    public void Equals(View view){
        if(Text.getText().toString().equals("null")||Text.getText().toString().equals(" ")){
            Text.setText(".Syntax Error"); }else{
            jsEvaluator.evaluate(Text.getText().toString(), new JsCallback() {
                @Override
                public void onResult(String result) {
                    Text.setText(result);
                    Text.setSelection(Text.getText().length());
                    // Process result here.
                    // This method is called in the UI thread.
                }
                @Override
                public void onError(String errorMessage) {
                    // Process JavaScript error here.
                    // This method is called in the UI thread.
                    Text.setText(".Syntax Error");
                    Text.setSelection(Text.getText().length()); }  }); } }
    public void One(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("1");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"1");
            Text.setSelection(Text.getText().length());} }
    public void Two(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("2");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"2");
            Text.setSelection(Text.getText().length());} }
    public void Three(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("3");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"3");
            Text.setSelection(Text.getText().length());} }
    public void Four(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("4");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"4");
            Text.setSelection(Text.getText().length());} }
    public void Five(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("5");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"5");
            Text.setSelection(Text.getText().length());} }
    public void Six(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("6");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"6");
            Text.setSelection(Text.getText().length());} }
    public void Seven(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("7");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"7");
            Text.setSelection(Text.getText().length());} }
    public void Eight(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("8");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"8");
            Text.setSelection(Text.getText().length());} }
    public void Nine(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("9");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"9");
            Text.setSelection(Text.getText().length());} }
    public void Zero(View view){
        Text.setText(Text.getText()+"0");
        Text.setSelection(Text.getText().length()); }
    public void Plus(View view){
        Text.setText(Text.getText()+"+");
        Text.setSelection(Text.getText().length()); }
    public void Minus(View view){
        Text.setText(Text.getText()+"-");
        Text.setSelection(Text.getText().length()); }
    public void Multiply(View view){
        Text.setText(Text.getText()+"*");
        Text.setSelection(Text.getText().length()); }
    public void Divide(View view){
        Text.setText(Text.getText()+"/");
        Text.setSelection(Text.getText().length()); }
    public void Dot(View view){
        Text.setText(Text.getText()+".");
        Text.setSelection(Text.getText().length()); }
    public void Exp(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("Math.exp(");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"Math.exp(");
            Text.setSelection(Text.getText().length());} }
    public void Ans(View view){
        Text.setText(Text.getText());
        Text.setSelection(Text.getText().length()); }
    public void Cos(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("Math.cos(");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"Math.cos(");
            Text.setSelection(Text.getText().length());} }
    public void Sin(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("Math.sin(");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"Math.sin(");
            Text.setSelection(Text.getText().length());} }
    public void Shift(View view) {
        if(shift == false) { shift = true;
            shiftbutton.setBackgroundColor(Color.parseColor("#ff8383")); }
        else if(shift==true) {
            shift=false;
            shiftbutton.setBackgroundColor(Color.TRANSPARENT); } }
    public void Tan(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("Math.tan(");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"Math.tan(");
            Text.setSelection(Text.getText().length());} }
    public void Log(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("Math.log(");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"Math.log(");
            Text.setSelection(Text.getText().length());} }
    public void Cot(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("Math.atan(");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"Math.atan(");
            Text.setSelection(Text.getText().length());} }
    public void Sec(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("Math.acos(");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"Math.acos(");
            Text.setSelection(Text.getText().length());} }
    public void Csc(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("Math.asin(");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"Math.asin(");
            Text.setSelection(Text.getText().length());} }
    public void RightBracket(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText(")");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+")");
            Text.setSelection(Text.getText().length());} }
    public void LeftBracket(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("(");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"(");
            Text.setSelection(Text.getText().length());} }
    public void Ac(View view){
        Text.setText("0");
        Text.setSelection(Text.getText().length()); }
    public void Del(View view){
        String text = Text.getText().toString();
        if(text.length()==1){
            Text.setText("0");
        }else{
            Text.setText(text.substring(0, text.length() - 1));
            Text.setSelection(Text.getText().length()); } }
    public void C(View view){
        String text = Text.getText().toString();
        if(text.length()==1){
            Text.setText("0");
        }else{
            Text.setText(text.substring(0, text.length() - 1));
            Text.setSelection(Text.getText().length()); } }
    public void X2(View view){
        Text.setText(Text.getText()+"*2");
        Text.setSelection(Text.getText().length()); }
    public void Power(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("Math.pow(");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"Math.pow(");
            Text.setSelection(Text.getText().length());} }
    public void Sqrt(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText("Math.sqrt(");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+"Math.sqrt(");
            Text.setSelection(Text.getText().length());} }
    public void Comma(View view){
        if(Text.getText().toString().equals("0")){
            Text.setText(",");
            Text.setSelection(Text.getText().length());
        }else{Text.setText(Text.getText()+",");
            Text.setSelection(Text.getText().length());} }
    public void Fac(View view){
        int i,fact=1;
        int number=Integer.parseInt(Text.getText().toString());//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i; }
        Text.setText(""+fact);
        Text.setSelection(Text.getText().length()); }
    public void Pi(View view){
        Text.setText(Text.getText()+"3.14159");
        Text.setSelection(Text.getText().length()); }
    public void Rad(View view){
        double Ans =Double.parseDouble(Text.getText().toString())*0.01745329252;
        Text.setText(""+Ans);
        Text.setSelection(Text.getText().length()); }
    public void Reci(View view){
        double Ans =1/Double.parseDouble(Text.getText().toString());
        Text.setText(""+Ans);
        Text.setSelection(Text.getText().length()); }
    public void X3(View view){
        double Ans =Double.parseDouble(Text.getText().toString());
        Ans=Ans*Ans*Ans;
        Text.setText(""+Ans);
        Text.setSelection(Text.getText().length()); }
    public  void showdialogOnStart() {
        new AlertDialog.Builder(MainActivity.this).setTitle("Welcome !")
                .setMessage("Scientific Calculator is designed by Rahul Raj.")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).create().show();
        SharedPreferences sharedPreferences = getSharedPreferences("sharedPreferences",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("firstSC",false);
        editor.apply(); }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Do you want to exit ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).show();
    }
}
