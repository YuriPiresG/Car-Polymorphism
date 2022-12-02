class CarPoly {
	
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
	
	public CarPoly(int cylinders, String name) {
		this.cylinders = cylinders;
		this.engine = true;
		this.wheels = 4;
		this.name=name;
	}

	public String getName() {
		return name;
	}
	public int getCylinders() {
		return cylinders;
	}

	public boolean isEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}
	
	public String startEngine() {
		return "Car -> startEngine()";
	}
	
	public String accelerate() {
		return "Car -> accelerate()";
	}
	
	public String brake() {
		return "Car -> brake()";
	}

	
	
	


}
	
