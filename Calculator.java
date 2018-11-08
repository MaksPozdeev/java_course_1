/**
	Класс реализующий калькулятор
*/

public class Calculator{
	/**
		результат вычисления
	*/
	private int result;
	
	/**
		Суммируем аргументы.
		@param params Аргументы сожения (addition)
	*/
	public void add(int ... params){
		for (Integer param: params){
			this.result += param;
		}
	}
	
	/**
		Вычитаем аргументы.
		@param params Аргументы разность (subtraction)
	*/
	public void sub(int ... params){
		for (Integer param: params){
			this.result -= param;
		}
	}
	
	/**
		Умножаем аргументы.
		@param params Аргументы умнодения (multiplication)
	*/
	public void mul(int ... params){
		for (Integer param: params){			
			this.result *= param;			
		}
	}
	
	/**
		Делим аргументы.
		@param params Аргументы деления (division)
	*/
	public void div(int ... params){
		for (Integer param: params){
			this.result /= param;
		}
	}
	
		
	/**
		Получить результат.
		@return результат вычисления
	*/
	public int getResult(){
		return this.result;
	}
	
	/**
		Очистить результат вычиления
	*/
	public void cleanResult(){
		this.result = 0;
	}
	
}