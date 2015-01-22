package edu.cs.okstate.edu.baseconverter3;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
	public String selectorType = "HEX";
	
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}	
	
	public void Clear(View view) {
		EditText myText = (EditText) findViewById(R.id.editText1);
		myText.setText("");
	}
	public void buttonHandler(View view) {
	    // Do something in response to button click
		Button theButton = (Button)view.findViewById(view.getId());
        String word = theButton.getText().toString();
        EditText myText = (EditText) findViewById(R.id.editText1);
        myText.append(word);
      
	}
	
	public void convertBase10(View view)
	{
		EditText myText = (EditText) findViewById(R.id.editText1);
		Button octButton = (Button)findViewById(R.id.button6);
		Button decButton = (Button)findViewById(R.id.button1);
		Button hexButton = (Button)findViewById(R.id.Button01);
		Button A = (Button)findViewById(R.id.Button07);
		Button B = (Button)findViewById(R.id.Button10);
		Button C = (Button)findViewById(R.id.Button13);
		Button D = (Button)findViewById(R.id.Button16);
		Button E = (Button)findViewById(R.id.button3);
		Button F = (Button)findViewById(R.id.button4);
		Button eight = (Button)findViewById(R.id.Button14);
		Button nine = (Button)findViewById(R.id.button5);
        String expression = myText.getText().toString();
        
        if(expression.equalsIgnoreCase(""))
        {
        		selectorType = "DEC";
        		decButton.setTextColor(Color.RED);
        		octButton.setTextColor(Color.BLACK);
        		hexButton.setTextColor(Color.BLACK);
        		A.setEnabled(false);
        		B.setEnabled(false);
        		C.setEnabled(false);
        		D.setEnabled(false);
        		E.setEnabled(false);
        		F.setEnabled(false);
        		eight.setEnabled(true);
        		nine.setEnabled(true);
        		
        	
        }
        
		if(!expression.equalsIgnoreCase("") && selectorType.equalsIgnoreCase("HEX")){
	        int base10 = 0;
	        int number = 0;
	        int counter = expression.length()-1;
	        
	        for(int i = 0; i < expression.length();i++)
	        {
		         if(expression.charAt(i) == 'A')
		         {
		        	 	number = 10;
		        	 	
		         }
		         else if(expression.charAt(i) == 'B')
		         {
		        	 	number = 11;
		         }
		         else if(expression.charAt(i) == 'C')
		         {
		        	 	number = 12;
		         }
		         else if(expression.charAt(i) == 'D')
		         {
		        	 	number = 13;
		         }
		         else if(expression.charAt(i) == 'E')
		         {
		        	 	number = 14;
		         }
		         else if(expression.charAt(i) == 'F')
		         {
		        	 	number = 15;
		         }
		         else if(Character.isDigit(expression.charAt(i)))
		         {
		        	 	 String temp = Character.toString(expression.charAt(i));
		        	
		        	 	 number =  Integer.parseInt(temp);
		         }
		         
	             base10 +=  (number * Math.pow(16, counter));
	             counter--;
	             
	             
	        }
	        myText.setText(Integer.toString(base10));
	        selectorType = "DEC";
    		decButton.setTextColor(Color.RED);
    		octButton.setTextColor(Color.BLACK);
    		hexButton.setTextColor(Color.BLACK);
    		A.setEnabled(false);
    		B.setEnabled(false);
    		C.setEnabled(false);
    		D.setEnabled(false);
    		E.setEnabled(false);
    		F.setEnabled(false);
    		eight.setEnabled(true);
    		nine.setEnabled(true);
		}
		else if (!expression.equalsIgnoreCase("") && selectorType.equalsIgnoreCase("OCT"))
		{

			int base8 = 0;
	        int number = 0;
	        int counter = expression.length()-1;
	        
	        for(int i = 0; i < expression.length();i++)
	        {
		         
		       
		        	 	 String temp = Character.toString(expression.charAt(i));
		        	
		        	 	 number =  Integer.parseInt(temp);
		         
		        
	             base8 +=  (number * Math.pow(8, counter));
	             counter--;
	             
	             
	        }
	        myText.setText(Integer.toString(base8));
	        selectorType = "DEC";
    		decButton.setTextColor(Color.RED);
    		octButton.setTextColor(Color.BLACK);
    		hexButton.setTextColor(Color.BLACK);
    		A.setEnabled(false);
    		B.setEnabled(false);
    		C.setEnabled(false);
    		D.setEnabled(false);
    		E.setEnabled(false);
    		F.setEnabled(false);
    		eight.setEnabled(true);
    		nine.setEnabled(true);
		}
	}
	
	public void convertBase8(View view)
	{
		Button octButton = (Button)findViewById(R.id.button6);
		Button decButton = (Button)findViewById(R.id.button1);
		Button hexButton = (Button)findViewById(R.id.Button01);
		EditText myText = (EditText) findViewById(R.id.editText1);
		Button A = (Button)findViewById(R.id.Button07);
		Button B = (Button)findViewById(R.id.Button10);
		Button C = (Button)findViewById(R.id.Button13);
		Button D = (Button)findViewById(R.id.Button16);
		Button E = (Button)findViewById(R.id.button3);
		Button F = (Button)findViewById(R.id.button4);
		Button eight = (Button)findViewById(R.id.Button14);
		Button nine = (Button)findViewById(R.id.button5);
        String expression = myText.getText().toString();
        if(expression.equalsIgnoreCase(""))
        {
        		selectorType = "OCT";
        		octButton.setTextColor(Color.RED);
        		decButton.setTextColor(Color.BLACK);
        		hexButton.setTextColor(Color.BLACK);
        		A.setEnabled(false);
        		B.setEnabled(false);
        		C.setEnabled(false);
        		D.setEnabled(false);
        		E.setEnabled(false);
        		F.setEnabled(false);
        		eight.setEnabled(false);
        		nine.setEnabled(false);
        	
        }
        if(!expression.equalsIgnoreCase("") && selectorType.equalsIgnoreCase("DEC")) {
        ArrayList<String> remainder = new ArrayList<String>();
        int dividend = Integer.parseInt(expression);
        final int divisor = 8;
        String c ="";
        int answer,product,r = 0;
        do
        {
        		answer = (int)(dividend / divisor);
        	    product = divisor*answer;
        	    r = dividend - product;
        	    c = Integer.toString(r);
        	    dividend = answer;
        	    remainder.add(c);
        }while(dividend!=0);
       
      expression = "";
      for(int i = remainder.size() - 1; i >=0;i--)
      {
    	  	
    	  		expression += remainder.get(i);
    	  }
    	  myText.setText(expression);
    	  selectorType = "OCT";
  		octButton.setTextColor(Color.RED);
  		decButton.setTextColor(Color.BLACK);
  		hexButton.setTextColor(Color.BLACK);
  		A.setEnabled(false);
  		B.setEnabled(false);
  		C.setEnabled(false);
  		D.setEnabled(false);
  		E.setEnabled(false);
  		F.setEnabled(false);
  		eight.setEnabled(false);
  		nine.setEnabled(false);
	}else if(!expression.equalsIgnoreCase("") && selectorType.equalsIgnoreCase("HEX")) 
	{
		int base10 = 0;
        int number = 0;
        int counter = expression.length()-1;
        
        for(int i = 0; i < expression.length();i++)
        {
	         if(expression.charAt(i) == 'A')
	         {
	        	 	number = 10;
	        	 	
	         }
	         else if(expression.charAt(i) == 'B')
	         {
	        	 	number = 11;
	         }
	         else if(expression.charAt(i) == 'C')
	         {
	        	 	number = 12;
	         }
	         else if(expression.charAt(i) == 'D')
	         {
	        	 	number = 13;
	         }
	         else if(expression.charAt(i) == 'E')
	         {
	        	 	number = 14;
	         }
	         else if(expression.charAt(i) == 'F')
	         {
	        	 	number = 15;
	         }
	         else if(Character.isDigit(expression.charAt(i)))
	         {
	        	 	 String temp = Character.toString(expression.charAt(i));
	        	
	        	 	 number =  Integer.parseInt(temp);
	         }
	         
             base10 +=  (number * Math.pow(16, counter));
             counter--;
             
             
        }
        myText.setText(Integer.toString(base10));
        ArrayList<String> remainder = new ArrayList<String>();
        int dividend = base10;
        final int divisor = 8;
        String c ="";
        int answer,product,r = 0;
        do
        {
        		answer = (int)(dividend / divisor);
        	    product = divisor*answer;
        	    r = dividend - product;
        	    c = Integer.toString(r);
        	    dividend = answer;
        	    remainder.add(c);
        }while(dividend!=0);
       
      expression = "";
      for(int i = remainder.size() - 1; i >=0;i--)
      {
    	  	
    	  		expression += remainder.get(i);
    	  }
    	  myText.setText(expression);
    	  selectorType = "OCT";
  		octButton.setTextColor(Color.RED);
  		decButton.setTextColor(Color.BLACK);
  		hexButton.setTextColor(Color.BLACK);
  		A.setEnabled(false);
  		B.setEnabled(false);
  		C.setEnabled(false);
  		D.setEnabled(false);
  		E.setEnabled(false);
  		F.setEnabled(false);
  		eight.setEnabled(false);
  		nine.setEnabled(false);
	}
		
	}
	public void convertBase16(View view) {
	    // Do something in response to button click
		Button octButton = (Button)findViewById(R.id.button6);
		Button decButton = (Button)findViewById(R.id.button1);
		Button hexButton = (Button)findViewById(R.id.Button01);
		Button A = (Button)findViewById(R.id.Button07);
		Button B = (Button)findViewById(R.id.Button10);
		Button C = (Button)findViewById(R.id.Button13);
		Button D = (Button)findViewById(R.id.Button16);
		Button E = (Button)findViewById(R.id.button3);
		Button F = (Button)findViewById(R.id.button4);
		Button eight = (Button)findViewById(R.id.Button14);
		Button nine = (Button)findViewById(R.id.button5);
        EditText myText = (EditText) findViewById(R.id.editText1);
        String expression = myText.getText().toString();
        if(expression.equalsIgnoreCase(""))
        {
        		selectorType = "HEX";
        		octButton.setTextColor(Color.BLACK);
        		decButton.setTextColor(Color.BLACK);
        		hexButton.setTextColor(Color.RED);
        		A.setEnabled(true);
        		B.setEnabled(true);
        		C.setEnabled(true);
        		D.setEnabled(true);
        		E.setEnabled(true);
        		F.setEnabled(true);
        		eight.setEnabled(true);
        		nine.setEnabled(true);
        	
        }
        if(!expression.equalsIgnoreCase("") && selectorType.equalsIgnoreCase("DEC")) {
        ArrayList<String> remainder = new ArrayList<String>();
        int dividend = Integer.parseInt(expression);
        final int divisor = 16;
        String c ="";
        int answer,product,r = 0;
        do
        {
        		answer = (int)(dividend / divisor);
        	    product = divisor*answer;
        	    r = dividend - product;
        	    c = Integer.toString(r);
        	    dividend = answer;
        	    remainder.add(c);
        }while(dividend!=0);
       
      expression = "";
      for(int i = remainder.size() - 1; i >=0;i--)
      {
    	  	if(remainder.get(i).equalsIgnoreCase("10"))
    	  	{
    	  		expression+="A";
    	  	}
    	  	else if(remainder.get(i).equalsIgnoreCase("11"))
    	  	{
    	  		expression+="B";
    	  	}
    	  	else if(remainder.get(i).equalsIgnoreCase("12"))
    	  	{
    	  		expression+="C";
    	  	}
    	  	else if(remainder.get(i).equalsIgnoreCase("13"))
    	  	{
    	  		expression+="D";
    	  	}
    	  	else if(remainder.get(i).equalsIgnoreCase("14"))
    	  	{
    	  		expression+="E";
    	  	}
    	  	else if(remainder.get(i).equalsIgnoreCase("15"))
    	  	{
    	  		expression+="F";
    	  	}
    	  	else
    	  	{
    	  		expression += remainder.get(i);
    	  	}
    	  }
    	  myText.setText(expression);
    	  selectorType = "HEX";
  		octButton.setTextColor(Color.BLACK);
  		decButton.setTextColor(Color.BLACK);
  		hexButton.setTextColor(Color.RED);
  		A.setEnabled(true);
  		B.setEnabled(true);
  		C.setEnabled(true);
  		D.setEnabled(true);
  		E.setEnabled(true);
  		F.setEnabled(true);
  		eight.setEnabled(true);
  		nine.setEnabled(true);
	}else if(!expression.equalsIgnoreCase("") && selectorType.equalsIgnoreCase("OCT"))
	{
		int base8 = 0;
        int number = 0;
        int counter = expression.length()-1;
        
        for(int i = 0; i < expression.length();i++)
        {
	         
	       
	        	 	 String temp = Character.toString(expression.charAt(i));
	        	
	        	 	 number =  Integer.parseInt(temp);
	         
	        
             base8 +=  (number * Math.pow(8, counter));
             counter--;
             
             
        }
        myText.setText(Integer.toString(base8));
        ArrayList<String> remainder = new ArrayList<String>();
        int dividend = base8;
        final int divisor = 16;
        String c ="";
        int answer,product,r = 0;
        do
        {
        		answer = (int)(dividend / divisor);
        	    product = divisor*answer;
        	    r = dividend - product;
        	    c = Integer.toString(r);
        	    dividend = answer;
        	    remainder.add(c);
        }while(dividend!=0);
       
      expression = "";
      for(int i = remainder.size() - 1; i >=0;i--)
      {
    	  	if(remainder.get(i).equalsIgnoreCase("10"))
    	  	{
    	  		expression+="A";
    	  	}
    	  	else if(remainder.get(i).equalsIgnoreCase("11"))
    	  	{
    	  		expression+="B";
    	  	}
    	  	else if(remainder.get(i).equalsIgnoreCase("12"))
    	  	{
    	  		expression+="C";
    	  	}
    	  	else if(remainder.get(i).equalsIgnoreCase("13"))
    	  	{
    	  		expression+="D";
    	  	}
    	  	else if(remainder.get(i).equalsIgnoreCase("14"))
    	  	{
    	  		expression+="E";
    	  	}
    	  	else if(remainder.get(i).equalsIgnoreCase("15"))
    	  	{
    	  		expression+="F";
    	  	}
    	  	else
    	  	{
    	  		expression += remainder.get(i);
    	  	}
    	  }
    	  myText.setText(expression);
    	  selectorType = "HEX";
  		octButton.setTextColor(Color.BLACK);
  		decButton.setTextColor(Color.BLACK);
  		hexButton.setTextColor(Color.RED);
  		A.setEnabled(true);
  		B.setEnabled(true);
  		C.setEnabled(true);
  		D.setEnabled(true);
  		E.setEnabled(true);
  		F.setEnabled(true);
  		eight.setEnabled(true);
  		nine.setEnabled(true);
        
	}
	}
	


}
