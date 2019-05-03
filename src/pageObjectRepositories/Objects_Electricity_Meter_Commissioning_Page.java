package pageObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/* *******************************************************************
* Author: Iain Storrie
* Date: 06/06/2017
* Function: Objects_Electiricty_Meter_Commissioning_Page
* Purpose: This class contains all of the elements on the Electricity Meter Commissioning page
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

public class Objects_Electricity_Meter_Commissioning_Page {
   
    private static WebElement element = null;
    private static String sRepositoryName = "Objects_Electricity_Meter_Commissioning_Page";

    public static WebElement lbl_Commissioning(WebDriver driver){
    	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/commission/div/div[1]/div[1]/h4"));
			element = driver.findElement(By.id("Title_commissioning"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Commissioning not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Non_Serialised_Assets(WebDriver driver){
   	 
		try{
			//element = driver.findElement(By.id("cbx_NonSAss_sel"));
			element = driver.findElement(By.id("Cselect4"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Non_Serialised_Assets not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Non_Serialised_Assets_Number(WebDriver driver){
      	 
		try{
			//element = driver.findElement(By.id("txt_NonSAss_num"));
			element = driver.findElement(By.id("Cbar3"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Non_Serialised_Assets_Number not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement img_Trash(WebDriver driver){
     	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/commission/div/div[2]/div[1]/div[2]/div/div[3]"));
			//element = driver.findElement(By.id("btn_Del_Ass"));
			element = driver.findElement(By.xpath("//*[@class='delIcon del']"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | img_Trash not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Add_Another_Asset(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("Cbtn1"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Add_Another_Asset not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Comms_Hub_Connected_WAN_Yes(WebDriver driver){
   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/commission/div/div[2]/div[1]/div[2]/div[1]/label"));
			element = driver.findElement(By.id("Cradionm1"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Comms_Hub_Connected_WAN_Yes not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Comms_Hub_Connected_WAN_No(WebDriver driver){
      	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/commission/div/div[2]/div[1]/div[2]/div[2]/label"));
			element = driver.findElement(By.id("Cradionm2"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Comms_Hub_Connected_WAN_No not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Gas_Meter_Location(WebDriver driver){
     	 
		try{
			element = driver.findElement(By.id("cbx_GasMLoc_sel"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Gas_Meter_Location not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Distance_Gas_Electric(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("txt_DisGasElec"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Distance_Gas_Electric not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Electric_Meter_Signal(WebDriver driver){
    	 
		try{
			element = driver.findElement(By.id("cbx_ElecMetSig_sel"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Electric_Meter_Signal not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement txt_Commissioning_Code(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("txt_Com_Code"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | txt_Commissioning_Code not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement cbx_Time_Taken_Commission_Meter(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("cbx_TimTakComm_sel"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | cbx_Time_Taken_Commission_Meter not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
    
    public static WebElement btn_Next_Section(WebDriver driver){
   	 
		try{
			element = driver.findElement(By.id("CbtnNextComm"));
 		}catch(Exception e){
			Log.error(sRepositoryName + " | btn_Next_Section not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
      
	public static WebElement lbl_Commissioning_Complete(WebDriver driver){
	   	 
		try{
			//element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/ng-switch/div/electask/div/div/commission/div/div[1]/div[2]"));
			element = driver.findElement(By.id("Title_Commission_e"));
		}catch(Exception e){
			Log.error(sRepositoryName + " | lbl_Commissioning_Complete not found | Exception desc : "+e.getMessage());		
 		} 
	    return element;
	}
	
			
//END OF METHODS	    
}
