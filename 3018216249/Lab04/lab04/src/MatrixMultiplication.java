

public class MatrixMultiplication
{
	public static Matrix multiplySequentially(Matrix x, Matrix y)//串行
	{
		int a = x.get_m();
		int b1 = x.get_n();
		int b2 = y.get_m();
		int c = y.get_n();
		if (b1 == b2)
		{
			Matrix result = new Matrix(a, c);
			for (int i = 0; i < a; i++)
			{
				for (int j = 0; j < c; j++)
				{
					double sum = 0;
					for (int k = 0; k < b1; k++)
					{
						sum += x.getMatrix(i, k) * y.getMatrix(k, j);
					}
					result.setMatrix(i, j, sum);
				}
			}
			return result;
		}
		else	
		{
			return null;
		}	
	}
	
	public static Matrix multiplyParallelTwo(Matrix x, Matrix y) throws InterruptedException//二线程
	{
		int a = x.get_m();
		int b1 = x.get_n();
		int b2 = y.get_m();
		int c = y.get_n();
		if (b1 == b2)
		{
			Matrix result = new Matrix(a, c);
			TwoThread tt = new TwoThread(x, y, result);
			Thread thread1 = new Thread(tt, "线程1");
			Thread thread2 = new Thread(tt, "线程2");
			thread1.start();
//			thread1.join();
			thread2.start();
//			thread2.join();
			while (thread1.isAlive() || thread2.isAlive()){}
			return result;
		}
		else	
		{
			return null;
		}
	}
	
	public static Matrix multiplyParallelThree(Matrix x, Matrix y) throws InterruptedException//三线程
	{
		int a = x.get_m();
		int b1 = x.get_n();
		int b2 = y.get_m();
		int c = y.get_n();
		if (b1 == b2)
		{
			Matrix result = new Matrix(a, c);
			ThreeThread tt = new ThreeThread(x, y, result);
			Thread thread1 = new Thread(tt, "线程1");
			Thread thread2 = new Thread(tt, "线程2");
			Thread thread3 = new Thread(tt, "线程3");
			thread1.start();
//			thread1.join();
			thread2.start();
//			thread2.join();
			thread3.start();
//			thread3.join();
			while (thread1.isAlive() || thread2.isAlive() || thread3.isAlive()){}
			return result;
		}
		else	
		{
			return null;
		}
	}
	
	public static Matrix multiplyParallelFour(Matrix x, Matrix y) throws InterruptedException//四线程
	{
		int a = x.get_m();
		int b1 = x.get_n();
		int b2 = y.get_m();
		int c = y.get_n();
		if (b1 == b2)
		{
			Matrix result = new Matrix(a, c);
			FourThread tt = new FourThread(x, y, result);
			Thread thread1 = new Thread(tt, "线程1");
			Thread thread2 = new Thread(tt, "线程2");
			Thread thread3 = new Thread(tt, "线程3");
			Thread thread4 = new Thread(tt, "线程4");
			thread1.start();
//			thread1.join();
			thread2.start();
//			thread2.join();
			thread3.start();
//			thread3.join();
			thread4.start();
//			thread4.join();
			while (thread1.isAlive() || thread2.isAlive() || thread3.isAlive() || thread4.isAlive()){}
			return result;
		}
		else	
		{
			return null;
		}
	}
}

class TwoThread implements Runnable
{
	Matrix matrix1, matrix2, result;
	
	public TwoThread(Matrix matrix1, Matrix matrix2, Matrix result)
	{
		this.matrix1 = matrix1;
		this.matrix2 = matrix2;
		this.result = result;
	}
	
	@Override
	public void run() 
	{
		if (Thread.currentThread().getName().equals("线程1"))
		{
			first();
		}
		else if (Thread.currentThread().getName().equals("线程2"))
		{
			second();
		}
	}
	
	public void first()
	{
		for (int i = 0; i < matrix1.get_m(); i += 2)
		{
			for (int j = 0; j < matrix2.get_n(); j++)
			{
				double sum = 0;
				for (int k = 0; k < matrix1.get_n(); k++)
				{
					sum += matrix1.getMatrix(i, k) * matrix2.getMatrix(k, j);
				}
				result.setMatrix(i, j, sum);
			}
		}

	}
	
	public void second()
	{
		for (int i = 1; i < matrix1.get_m(); i += 2)
		{
			for (int j = 0; j < matrix2.get_n(); j++)
			{
				double sum = 0;
				for (int k = 0; k < matrix1.get_n(); k++)
				{
					sum += matrix1.getMatrix(i, k) * matrix2.getMatrix(k, j);
				}
				result.setMatrix(i, j, sum);
			}
		}
	}
}

class ThreeThread implements Runnable
{
	Matrix matrix1, matrix2, result;
	
	public ThreeThread(Matrix matrix1, Matrix matrix2, Matrix result)
	{
		this.matrix1 = matrix1;
		this.matrix2 = matrix2;
		this.result = result;
	}
	
	@Override
	public void run() 
	{
		if (Thread.currentThread().getName().equals("线程1"))
		{
			first();
		}
		else if (Thread.currentThread().getName().equals("线程2"))
		{
			second();
		}
		else if (Thread.currentThread().getName().equals("线程3"))
		{
			third();
		}
	}
	
	public void first()
	{
		for (int i = 0; i < matrix1.get_m(); i += 3)
		{
			for (int j = 0; j < matrix2.get_n(); j++)
			{
				double sum = 0;
				for (int k = 0; k < matrix1.get_n(); k++)
				{
					sum += matrix1.getMatrix(i, k) * matrix2.getMatrix(k, j);
				}
				result.setMatrix(i, j, sum);
			}
		}
	}
	
	public void second()
	{
		for (int i = 1; i < matrix1.get_m(); i += 3)
		{
			for (int j = 0; j < matrix2.get_n(); j++)
			{
				double sum = 0;
				for (int k = 0; k < matrix1.get_n(); k++)
				{
					sum += matrix1.getMatrix(i, k) * matrix2.getMatrix(k, j);
				}
				result.setMatrix(i, j, sum);
			}
		}
	}
	
	public void third()
	{
		for (int i = 2; i < matrix1.get_m(); i += 3)
		{
			for (int j = 0; j < matrix2.get_n(); j++)
			{
				double sum = 0;
				for (int k = 0; k < matrix1.get_n(); k++)
				{
					sum += matrix1.getMatrix(i, k) * matrix2.getMatrix(k, j);
				}
				result.setMatrix(i, j, sum);
			}
		}
	}
}

class FourThread implements Runnable
{
	Matrix matrix1, matrix2, result;
	
	public FourThread(Matrix matrix1, Matrix matrix2, Matrix result)
	{
		this.matrix1 = matrix1;
		this.matrix2 = matrix2;
		this.result = result;
	}
	
	@Override
	public void run() 
	{
		if (Thread.currentThread().getName().equals("线程1"))
		{
			first();
		}
		else if (Thread.currentThread().getName().equals("线程2"))
		{
			second();
		}
		else if (Thread.currentThread().getName().equals("线程3"))
		{
			third();
		}
		else if (Thread.currentThread().getName().equals("线程4"))
		{
			fourth();
		}
	}
	
	public void first()
	{
		for (int i = 0; i < matrix1.get_m(); i += 4)
		{
			for (int j = 0; j < matrix2.get_n(); j++)
			{
				double sum = 0;
				for (int k = 0; k < matrix1.get_n(); k++)
				{
					sum += matrix1.getMatrix(i, k) * matrix2.getMatrix(k, j);
				}
				result.setMatrix(i, j, sum);
			}
		}
	}
	
	public void second()
	{
		for (int i = 1; i < matrix1.get_m(); i += 4)
		{
			for (int j = 0; j < matrix2.get_n(); j++)
			{
				double sum = 0;
				for (int k = 0; k < matrix1.get_n(); k++)
				{
					sum += matrix1.getMatrix(i, k) * matrix2.getMatrix(k, j);
				}
				result.setMatrix(i, j, sum);
			}
		}
	}
	
	public void third()
	{
		for (int i = 2; i < matrix1.get_m(); i += 4)
		{
			for (int j = 0; j < matrix2.get_n(); j++)
			{
				double sum = 0;
				for (int k = 0; k < matrix1.get_n(); k++)
				{
					sum += matrix1.getMatrix(i, k) * matrix2.getMatrix(k, j);
				}
				result.setMatrix(i, j, sum);
			}
		}
	}
	
	public void fourth()
	{
		for (int i = 3; i < matrix1.get_m(); i += 4)
		{
			for (int j = 0; j < matrix2.get_n(); j++)
			{
				double sum = 0;
				for (int k = 0; k < matrix1.get_n(); k++)
				{
					sum += matrix1.getMatrix(i, k) * matrix2.getMatrix(k, j);
				}
				result.setMatrix(i, j, sum);
			}
		}
	}
}
