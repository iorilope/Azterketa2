/*
 * 2023(e)ko aza. 20(a)
 * Ioritz Lopetegi
 */
package azalerakalkulatu;


import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class AzaleraKalkulatu.
 */
public class AzaleraKalkulatu {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);
		//Eskenrra hasi
		System.out.println("Sar laukizuzenaren alde bat");
		int aldea1 = sc.nextInt();
		//Lehen aldagaia sartu dugu
		System.out.println("Sar laukizuzenaren  beste aldea");
		//Bigarren aldagia sartzen dugu
		int aldea2 = sc.nextInt();
		//Aldagaien batura egin dugu
		int azalera = aldea1 * aldea2 ; 
		//Emaitza ikusten dugu
		System.out.println("Azalera " + azalera + " da" );
		//Eskanerra ixten dugu
		sc.close();

	}

}
