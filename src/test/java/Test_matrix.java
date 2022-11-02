import org.example.Matrix_average;
import org.example.Matrix_square;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test_matrix {
    static int [] average_numbers = {2,3,5};
    @Test
    public static void AverageReturn(){
        double actualResult = Matrix_average.average(average_numbers);
        double expectedResult = 4;
        assertEquals(expectedResult, actualResult);
    }

    static int [][] isSquare = new int[2][3];
    @Test
    public static void IsSquareReturn(){
        boolean actualResult = Matrix_square.isSquare(isSquare);
        boolean expectedResult = false;
        assertEquals(actualResult,expectedResult);
    }
}
