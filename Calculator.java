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
		@param params Аргументы суммирования
	*/
	public void add(int ... params){
		for (Integer param: params){
			this.result += param;
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