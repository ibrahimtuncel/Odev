public class Odev13 {
	
		String ID;
		String isim;
		String soyisim;
		double vize1;
		double vize2;
		double donemSonu;
		double finalNotu;

		public Odev13(String ID, String isim, String soyisim, double vize1, double vize2, double donemSonu) {
			this.ID = ID;
			this.isim = isim;
			this.soyisim = soyisim;
			this.vize1 = vize1;
			this.vize2 = vize2;
			this.donemSonu = donemSonu;
		}

		public static void main(String[] args) {

			Odev13 ogr1 = new Odev13("1001", "Ahmet", "TUFAN", 50, 60, 95);
			Odev13 ogr2 = new Odev13("1002", "Yavuz", "AKGUN", 75, 60, 55);
			Odev13 ogr3 = new Odev13("1003", "Selim", "SUKUR", 95, 85, 92);
			Odev13 ogr4 = new Odev13("1004", "Hurrem", "ERDEM", 65, 65, 98);
			Odev13 ogr5 = new Odev13("1005", "Buket", "KORKMAZ", 95, 70, 70);
			Odev13 ogr6 = new Odev13("1006", "Betul", "OZTURK", 30, 60, 74);
			Odev13 ogr7 = new Odev13("1007", "Hasan", "YILMAZ", 40, 65, 25);
			Odev13 ogr8 = new Odev13("1008", "Kerem", "DEMIR", 66, 99, 55);
			Odev13 ogr9 = new Odev13("1009", "Eysan", "KAYNAK", 98, 70, 60);
			Odev13 ogr10 = new Odev13("1011", "Merve", "IKBAL", 81, 60, 95);
			Odev13 ogr11 = new Odev13("1012", "Hakan", "BURUK", 87, 80, 80);

			Odev13[] ogrenciler = { ogr1, ogr2, ogr3, ogr4, ogr5, ogr6, ogr7, ogr8, ogr9, ogr10, ogr11 };
			
			System.out.println(ogrenciler[5].isim+ " "+ogrenciler[5].soyisim  + " eski vize1 notu: "  +ogrenciler[5].getvize1());
			ogrenciler[5].setvize1(90);
			System.out.println("ogrencinin yeni vize1 notu: " + ogrenciler[5].getvize1());	
			
			System.out.println(ogrenciler[10].isim+ " "+ogrenciler[10].soyisim  + " eski vize2 notu: "  +ogrenciler[10].getvize2());
			ogrenciler[10].setvize2(50);
			System.out.println("ogrencinin yeni vize2 notu: " + ogrenciler[10].getvize2());	
			
			System.out.println(ogrenciler[6].isim+ " "+ogrenciler[6].soyisim  + " eski donemSonu notu: "  +ogrenciler[6].getdonemSonu());
			ogrenciler[6].setdonemSonu(75);
			System.out.println("ogrencinin yeni donemSonu notu: " + ogrenciler[6].getdonemSonu());	
			
			
			for (int i = 0; i < ogrenciler.length; i++) {
				ogrenciler[i].ogrenciyiNotlandir();
			}
			}
			
		public void ogrenciyiNotlandir() {
			char harfNotu;
			double finalNotu = this.vize1 * 0.25 + this.vize2 * 0.25 + this.donemSonu * 0.5;

			if (finalNotu >= 90) {
				harfNotu = 'A';
			} else if (finalNotu >= 80) {
				harfNotu = 'B';
			} else if (finalNotu >= 70) {
				harfNotu = 'C';
			} else if (finalNotu >= 60) {
				harfNotu = 'D';
			} else			{
				harfNotu = 'F';
			}
			System.out.println(this.ID + " nolu " + this.isim + " " + this.soyisim + "'in harf notu: " + finalNotu + "'den "
					+ harfNotu);
			
		}
		
		public void setID(String ID) 
		{
			this.ID = ID;
		}

		public String getID() 
		{
			return this.ID;
		}
		
		
		public void setIsim(String isim)  // isim ayarla
		{
			this.isim = isim;
		}

		public String getIsim() // isim getir
		{
			return this.isim;
		}
		

		public void setSoyIsim(String soyisim)
		{
			this.soyisim = soyisim;
		}

		public String getSoyIsim() 
		{
			return this.soyisim;
		}
		
		
		public void setvize1(double vize1) 
		{
			this.vize1 = vize1 ;
		}
		

		public double getvize1() 
		{
			return this.vize1;
		}
		
		public void setvize2(double vize2) 
		{
			this.vize2 = vize2;
		}

		public double getvize2() 
		{
			return this.vize2;
		}
		
		public void setdonemSonu(double donemSonu) 
		{
			this.donemSonu = donemSonu;
		}

		public double getdonemSonu() 
		{
			return this.donemSonu;
		}
		
		
}

