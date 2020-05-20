public class task5{
	public static void main(String[] args){	
		System.out.println(BMI("55 kilos", "1.65 meters"));
		System.out.println(BMI("154 pounds", "2 meters"));
	}

	public static String BMI(String weight, String height) {
		String[] weig = weight.split(" ");
		String[] heig = height.split(" ");
		String res = "";

		double kilos = weig[1].equals("pounds") ? Double.parseDouble(weig[0]) * 0.453592 : Double.parseDouble(weig[0]);
		double meters = heig[1].equals("inches") ? Double.parseDouble(heig[0]) * 0.0254 : Double.parseDouble(heig[0]);
		double imt = kilos / (meters * meters);
		imt = Math.round(imt * 10.0)/10.0;

		if (imt < 18.5) res += imt+" Underweight";
		if (imt >= 18.5 && imt <= 24.5) res += imt + " Normal weight";
		if (imt >= 25 && imt <= 29.9) res += imt + " Overweight";
		if (imt >= 30) res += imt + " Obesity";

		return res;
	}
}