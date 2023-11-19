public class HitungIp {
	public static void main(String[] abc){
		int sksPF = 4;
		int sksKalkulus = 3;
		int sksSistemDigital = 2;
		int totalSks = sksPF + sksKalkulus + sksSistemDigital;
		double nilaiIndexPF = 3.5;
		double nilaiIndexKalkulus = 4.0;
		double nilaiIndexSisDig = 2.75;
		double totalIndex = (sksPF * nilaiIndexPF) + (sksKalkulus * nilaiIndexKalkulus) + (sksSistemDigital * nilaiIndexSisDig);
		double ip = totalIndex / totalSks;
		System.out.println("IP Anda adalah " + ip);
	}	
}