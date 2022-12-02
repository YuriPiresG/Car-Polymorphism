public class Fusca extends CarPoly {


		public Fusca(int cylinders, String name) {
			super(cylinders, name);
		}

		@Override
		public String startEngine() {
			return "Fusca -> startEngine()";
		}

		@Override
		public String accelerate() {
			return "Fusca -> accelerate()";
		}

		@Override
		public String brake() {
			return "Fusca -> brake()";
		}
		
		
	}

