package com.floatisnan;

public class FloatIsNaN {

	public static void main(String[] args) {
		Float number1 = new Float(16.0);
		Float number2 = new Float(0.0);
		Float number3 = new Float(0.0);
		Float num = number2 / (number2 + number3);
		System.out.println(number1.isNaN()); //number���Ƿ����֣�NaN��ֵ
		System.out.println(num.isNaN()); //num�Ƿ����֣�NaN��ֵ
	}

}
