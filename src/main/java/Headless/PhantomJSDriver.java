package Headless;



public class PhantomJSDriver {
	
	public static void main(String[] args) {
		
		
String Path = System.getProperty("user.dir");	
		
		System.out.println(Path);
		
		System.setProperty("phantomjs.binary.path", Path + "/BrowserDrivers/PhantomJS/phantomjs-2.1.1-windows/bin/phantomjs.exe");
		
		
		PhantomJSDriver driver = new PhantomJSDriver();
		
		
		
		
		
		
		
		
		
	}

}
