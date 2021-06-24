set projectLocation=D:\Users\navee\eclipse-workspace\SELENIUM_Automation_frameworks
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\TestNG.xml