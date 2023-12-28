class Th{
	public static void main(String[] args) {
		System.out.println("Program Started");
		System.out.println("Current Thread name is :"+Thread.currentThread().getName());
		Thread.currentThread().setName("MainMethodThread");
		System.out.println("Current Thread name is :"+Thread.currentThread().getName());
		System.out.println("Current Thread ID is :"+Thread.currentThread().getId());
		System.out.println("Program Ended");
	}
}