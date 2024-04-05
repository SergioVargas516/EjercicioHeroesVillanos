import java.util.Arrays;

public class Hero_Villan 
{
	
		private String fakeName, franquicia;
		private String powers[];	
		
		
		
		public Hero_Villan(String fakeName, String franquicia, String[] powers) {
			super();
			this.fakeName = fakeName;
			this.franquicia = franquicia;
			this.powers = powers;
		}




		@Override
		public String toString() {
			return "Nombre de Pila=" + fakeName + "\\nFranquicia=" + franquicia;
		}



		public String getFakeName() 
		{
			return fakeName;
		}

		public void setFakeName(String fakeName) {
			this.fakeName = fakeName;
		}

		public String getFranquicia() {
			return franquicia;
		}

		public void setFranquicia(String franquicia) {
			this.franquicia = franquicia;
		}

		public String[] getPowers() {
			return powers;
		}

		public void setPowers(String[] powers) {
			this.powers = powers;
		}

		
}

