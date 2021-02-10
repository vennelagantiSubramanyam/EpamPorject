package com.Subramanyam.calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;

import com.Subramanyam.calculator.expression.Calculator;
import com.Subramanyam.calculator.expression.Expression;
import com.Subramanyam.calculator.string_parser.Parser;

public class Application {
	private void startApp() {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			try {
				String str=reader.readLine();
				Expression exp=Parser.parse(str);
				if(exp==null) {
					throw new InvalidParameterException("Invalid Expression");
				}
				System.out.println("Entered Expression  : "+exp);
				System.out.println("Answer              : "+ Calculator.calculateExp(exp));
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	public void start() {
		startApp();
	}
}
