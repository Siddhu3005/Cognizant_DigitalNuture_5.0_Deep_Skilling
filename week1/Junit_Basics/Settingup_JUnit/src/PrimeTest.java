
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeTest{
	@Test
	public void testPrime(){
		int n=9;
//		Prime Prime=new Prime();
		assertEquals(true,Prime.isPrime(n));
	}
}
