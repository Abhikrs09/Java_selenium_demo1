set "location= C:\Users\Kumar\Desktop\Testing\Testing frameworks\java_selenium\java_selenium_assignment"
call mvn -f %location%/pom.xml dependency:resolve
call mvn -f %location%/pom.xml compile
call mvn -f %location%/pom.xml test -DtestSuite=testng
pause