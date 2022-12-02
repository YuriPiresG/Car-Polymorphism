public class McLaren extends CarPoly{

		public McLaren(int cylinders, String name) {
			super(cylinders, name);
		}

		@Override
		public String startEngine() {
			return "McLaren -> startEngine()";
		}

		@Override
		public String accelerate() {
			return "McLaren -> accelerate()";
		}

		@Override
		public String brake() {
			return "McLaren -> brake()";
		}
		
		
}

