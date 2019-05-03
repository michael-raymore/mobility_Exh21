package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 05/06/2017
* Function: Objects_Electiricty_Meter_Remove_Meter_Details_Page
* Purpose: This class contains all of the elements on the Electricity Meter Remove Meter page
* Arguments: 
* 			
* Returns: 
**********************************************************************
* Change Log:
* 
* Date:
* Author: 
* Details:
*
*********************************************************************/

public class Objects_Electricity_Meter_Remove_Meter_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_Remove_Meter_Page";

    public static WebElement lbl_Remove_Meter(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/removemeter/div/div[1]/div[1]/h4"));
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div[2]/ng-switch/div/electask/div/div/removemeter/div/div[1]/div[1]/h4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Remove_Meter not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Status_Of_Asset(WebDriver driver){
   	 
		try{
			//element = driver.findElement(By.id("select1"));
			element = driver.findElement(By.id("cbx_StaAss_sel"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Status_Of_Asset not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Removed_Meter_Readings(WebDriver driver){
      	 
		try{
			element = driver.findElement(By.id("input0"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Removed_Meter_Readings not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Unable_Read_Meter_Yes(WebDriver driver){
     	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/removemeter/div/div[2]/div/div[3]/div[2]/div[2]/div/label"));
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div[2]/ng-switch/div/electask/div/div/removemeter/div/div[2]/div/div[3]/div[2]/div[2]/div/label"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Unable_Read_Meter_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Additional_Notes(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("text1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Additional_Notes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Next_Section(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("btnNextrmv"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}

	public static WebElement lbl_Remove_Meter_Complete(WebDriver driver){
	   	 
		try{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/removemeter/div/div[1]/div[2]"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Remove_Meter_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
