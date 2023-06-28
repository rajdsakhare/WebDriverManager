package Practice;

//getWndowHandle();
//getWindowHandles();


//getWndowHandle();

String windoId = driver.getWindowHandle(); //return id of the single browser window
System.out.println("single browser window Id : "+windoId);
//getWindowHandles();
//1) Using iterator()

aboutus.click();
Set<String> windowids=driver.getWindowHandles();
/*
Iterator<String> it=windowids.iterator();
String firstwindow=it.next();
String secondwindow=it.next();
System.out.println("First window id : "+firstwindow+ "| second window id : "+secondwindow);
*/
//2) using array list 
List<String> idlist= new ArrayList(windowids);
String firstwindow=idlist.get(0);
String secondwindow=idlist.get(1);
System.out.println("First window id : "+firstwindow+ "| second window id : "+secondwindow);
System.out.println("first page itle : "+driver.switchTo().window(firstwindow).getTitle());
System.out.println("first page itle : "+driver.switchTo().window(secondwindow).getTitle());
S

}
