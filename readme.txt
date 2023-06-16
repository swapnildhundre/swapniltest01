1.created maven project.

2. at the time of creating maven project mentioned group id and artifact id, 
group id nothing but the package name : BaseLayer
and artifact id is nothing but the project name : SongSequence.

3.once create maven project it create default src/main/java and src/test/java package.

4. it generate the pom.xml file, pom.xml file means project object model.XML is extensive mark up languages file.
pom.xml file is heart of maven project inside the pom.xml file we add different types of dependency as :
testng : 7.4.0 Ver. : to acchive testing  

5.inside the src/main/java created different types of package as :
BaseLayer
HelperLayer
UtilsLayer

6.inside the src/test/java created TestLayer package

7. as a normal practice of creating framework Folders created under main project as :
Source folder : resources:  to maintain the all xml files , configuration.properties file , *.json file.
Folder : FailScreenShot  : to store failed screen shot as ddmmyyyy_hhmmss.png
	 PassScrennShot  : to store failed screen shot as ddmmyyyy_hhmmss.png
	 Reports         : to store reports as ddmmyy_hhmmss.html

8.inside BaseLayer Package created SongStore class without main method as base class.

9.Decleared capacity as public (to access variable through the project) integer as data type variable.

10.Decleared songs as public List of String to store collection of songs. 
   import java.util.List; to access List inside class.

11. created constructor "SongStore" : public (access modifier) non-static without return type with 1 argument as capacity integer as datatype.

    to assign maximum numbers of song capacity is defined, 
    this.capacity= capacity is used inside constructor to change value of capacity from any other class.   
    new object of ArrayList is created & assign to songs variable.
    ArrayList is resizable & Array list implements Random Access interface so we can access random value with same speed.
    import java.util.ArrayList to access ArrayList inside class.

12.Inside HelperLayer packge created addSongs class which is extends of SongStore class to acchive Hierarchical Inheritance.
    Inheritance is process of reusing class members from one class to another class.
    so addSongs class is child class of SongStore class.
    import BaseLayer.SongStore; to access SongStore class

13.created constructor of class with 1 integer argument as capacity.
   super(capacity); : superkeyword is use to call members from base class.

14. created addSongs method : public (access modifier) non-static without return type with 1 String argument as song.
    inside method created if block (songs.size() == capacity) {songs.remove(0);}
    size() method present inside List interface.
    if number of songs present inside playlist (songs) is equal to maximum capacity then remove song which is present at index number 0.
    song.add(song) is used to add new song.

15. Inside HelperLayer packge created ResentPlayedSongs class which is extends of addSongsclass to acchive Hierarchical Inheritance.	     
    so ResentPlayedSongs class is child class of addSongs class & Grand child of SongStore.
    or  SongStore class if grand parent of ResentPlayedSongs class & parent of addSongs class.

16.created constructor of class with 1 integer argument as capacity.
   super(capacity); : superkeyword is use to call members from SongStore.class.		 
 
17. created getResentPlayedSongs method : public (access modifier) non-static List<String> interface as return type without any argument.
     import java.util.List; to access List.	
     List is used to maintain insertion order.  
     return songs; it will return as playlist as per insertion order.

18. inside src/test/java we created TestLayer package.
    inside TestLayer package create TestPlayList class.

19. created test method : public (access modifier) static without return type & without any argument.
     provde @Test before methode to define method to test.
     import org.testng.annotations.Test; to achieve testing of respective method.

20. create new object (store) of ResentPlayedSongs class by passing instance as maximum capacity as 3 & providing reference as ResentPlayedSongs.
    after creating object of ResentPlayedSongs we can access all methods & variables from class which are defined as Hierarchical Inheritance.
    store.addSong("S1"); it will add song S1 as String. 
    store.addSong("S2"); it will add song S2 as String after song S1. 
    store.addSong("S3"); it will add song S3 as String after song S2. 
    System.out.println(store.getResentPlayedSongs()); 
    so it will print in console all the playlist as S1 , S2 , S3.
 
21. store.addSong("S4"); first it will remove S1 song & then it will add song S4 as String after song S3.
    System.out.println(store.getResentPlayedSongs()); 
    so it will print in console all the playlist as S2 , S3 , S4.

22. store.addSong("S2"); first it will remove S2 song & then it will add song S2 as String after song S4.
    System.out.println(store.getResentPlayedSongs()); 
    so it will print in console all the playlist as S3 , S4 , S2.

23. store.addSong("S1"); first it will remove S3 song & then it will add song S1 as String after song S2.
    System.out.println(store.getResentPlayedSongs()); 
    so it will print in console all the playlist as S4 , S2 , S1.

we can see test result in console as PASSED : test.
Default test : 
Tests run: 1, Failures: 0, Skips: 0.

Default suite :
Total tests run: 1, Passes: 1, Failures: 0, Skips: 0.



Following are not required as per given task, but provided as practice while creating framework.

A. Dependance : extentreports : 5.0.9 Ver. : to generate reports
              : webdrivermanager : 3.8.1
              : selenium-java : 4.4.0

UtilsLayer Package : 
B. ExtentReportSetUp class: 
 1.to generate current date & time
 2.to generate & store reports as per current date & time as html format in Reports folder.
 3.take screenshot of pass test cases & store at PassScreenshot folder with name as current date & time with png format.
 4.take screenshot of fail test cases & store at FailScreenshot folder with name as current date & time with png format.

C. ListenerClass class: to generate report & take Screenshot as per defined test results. 

D. TestPlayList.xml file to define ListenerClass to listener tag for generation of result as per defined class. 





Project Upload to Github as : 
1.go inside project folder , right click & select GitBash here
2.configure email id in GitBash : git config --global user.email "xxx@gmail.com"
3.configure password in GitBash : git config --global user.pass "Password"
4.create local git repository , initialize the git repository : git init
5.add files to stagging area : git add * or git add filename
6.check how many files is added to stagging area or not added to stagging area : git status
7.commit files to local git repository : git commit -m "message".
8.set github remote repository  in git bash : git remote add origin url
9.push code to master branch in GitHub : git push -u origin master












 










