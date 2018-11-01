import de.redsix.pdfcompare.PdfComparator;

public class Test1 {

	public static void main(String[] args) 	throws Exception{
		
		String file1 = "/Users/juan padilla/Documents/EstadosCuenta/Banamex/PagoBanamexPlatinumMesAgosto2018.pdf";
		String file2 = "/Users/juan padilla/Documents/EstadosCuenta/Banamex/PagoBanamezPlatinumMesSeptiembre2018.pdf";
		String resultFile = "/Users/juan padilla/Documents/EstadosCuenta/Banamex/Resultado/result";
		
		//new PdfComparator(file1, file2).compare().writeTo(resultFile);
		
		boolean isEquals = new PdfComparator(file1, file2).compare().writeTo(resultFile);
		if (!isEquals) {
		    System.out.println("Differences found!");
		} else {
			System.out.println("PDF Files Are Similar :" + isEquals);
		}
		
		System.out.println("Process Completed");

	}

}
