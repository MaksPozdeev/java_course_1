import java.util.Scanner;

/**
	Класс для запуска кулькулятора. Поддерживает ввод пользователя.
*/

public class InteractRunner{
	
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			while(!exit.equals("yes")){
				System.out.println("Result =  " + calc.getResult());
				System.out.print("Clear Result? y/n  ");
				String res = reader.next();
				if (res.equals("y")){
					calc.cleanResult();
				}
				
				System.out.print("Enter first arg: ");
				String first = reader.next();
				System.out.print("Enter second arg: ");
				String second = reader.next();
				System.out.print("Enter operations (+ - * / Clear): ");
				String operation = reader.next();
				
				if (operation.equals("+")){
					calc.add(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result: " + calc.getResult());
				}
				
				if (operation.equals("-")){
					calc.sub(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result: " + calc.getResult());
				}
				
				if (operation.equals("*")){
					calc.mul(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result: " + calc.getResult());
				}
				
				if (operation.equals("/")){
					if (Integer.valueOf(second) == 0) {
						System.out.println("Деление на ноль запрещено!");
					}else {
						calc.div(Integer.valueOf(first), Integer.valueOf(second));
						System.out.println("Result: " + calc.getResult());
					}
				}
				
				if (operation.equals("Clear")){
					calc.cleanResult();
					System.out.println("Result: " + calc.getResult());
				}
				
				System.out.println("Exit: yes/no ");
				exit = reader.next();
			}
			
		} finally {
			reader.close();
		}
		
		
	}
	
} 