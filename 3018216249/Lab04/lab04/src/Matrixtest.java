

public class Matrixtest 
{	
	public static void main(String[] args) throws InterruptedException 
	{
		int size = 2500;
		
		Matrix matrix1 = new MatrixGenerator(size, size).getMatrix();
		
		Matrix matrix2 = new MatrixGenerator(size, size).getMatrix();
		
		long time1 = System.nanoTime();
		
		Matrix resultSequentially = MatrixMultiplication.multiplySequentially(matrix1, matrix2);
		
		long time2 = System.nanoTime();
		
		Matrix resultParallelTwoThread = MatrixMultiplication.multiplyParallelTwo(matrix1, matrix2);
		
		long time3 = System.nanoTime();
		
		Matrix resultParallelThreeThread = MatrixMultiplication.multiplyParallelThree(matrix1, matrix2);
		
		long time4 = System.nanoTime();
		
		Matrix resultParallelFourThread = MatrixMultiplication.multiplyParallelFour(matrix1, matrix2);
		
		long time5 = System.nanoTime();

		assert resultSequentially.equals(resultParallelTwoThread);
		assert resultSequentially.equals(resultParallelThreeThread);
		assert resultSequentially.equals(resultParallelFourThread);
		System.out.println("==============================================");
		System.out.print("size of Matrix: " + size + " * " + size +"\n");
		System.out.print("serial method : " + (time2 - time1) + "ns\n");
		System.out.print("Two threads : " + (time3 - time2) + "ns\n");
		System.out.print("Three threads: " + (time4 - time3) + "ns\n");
		System.out.print("Four threads: " + (time5 - time4) + "ns\n");
		System.out.println("==============================================");
	}	
}
