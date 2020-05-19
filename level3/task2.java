public class task2{
	public static void main(String[] args){
		System.out.println(findZip("all zip files are compressed"));
	}

	public static int findZip(String zip) {
		if (zip.lastIndexOf("zip") != zip.indexOf("zip") && zip.indexOf("zip") != -1 ) {
			return zip.lastIndexOf("zip");
		}
		return -1;
	}
}