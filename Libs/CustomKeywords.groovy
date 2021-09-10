
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject

import com.applitools.eyes.selenium.Eyes

import org.openqa.selenium.WebElement

import com.applitools.eyes.RectangleSize


 /**
	 * Open and return a connection to database
	 * @param dataFile absolute file path 
	 * @return an instance of java.sql.Connection
	 */ 
def static "connection.oracleConnection.connectOracleDB"(
    	String url	
     , 	String port	
     , 	String dbname	
     , 	String username	
     , 	String password	) {
    (new connection.oracleConnection()).connectOracleDB(
        	url
         , 	port
         , 	dbname
         , 	username
         , 	password)
}

 /**
	 * execute a SQL query on database
	 * @param queryString SQL query string
	 * @return a reference to returned data collection, an instance of java.sql.ResultSet
	 */ 
def static "connection.oracleConnection.executeQuery"(
    	String queryString	) {
    (new connection.oracleConnection()).executeQuery(
        	queryString)
}


def static "connection.oracleConnection.closeDatabaseConnection"() {
    (new connection.oracleConnection()).closeDatabaseConnection()
}

 /**
	 * Execute non-query (usually INSERT/UPDATE/DELETE/COUNT/SUM...) on database   
	 * @param queryString a SQL statement
	 * @return single value result of SQL statement
	 */ 
def static "connection.oracleConnection.execute"(
    	String queryString	) {
    (new connection.oracleConnection()).execute(
        	queryString)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkElement"(
    	Eyes eyes	
     , 	WebElement element	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkElement(
        	eyes
         , 	element)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}
