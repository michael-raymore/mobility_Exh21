package webModule;

import org.openqa.selenium.WebDriver;

import pageObjectRepositories.Objects_Job_Completion_Device_Binding_Commissioning_Page;
import utility.Log;
import utility.Utils;

public class Methods_Job_Completion_Device_Binding_Commissioning{
	
		
	/* **************************************************************************************************
	* Function: viewPage
	* Author: Iain Storrie
	* Date: 06/07/2017
	* Purpose: This method checks the main page elements on the Job Completion Device Binding & Commissioning 
	* page upon initial landing
	* Arguments: 
	* 			
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void viewPage(WebDriver driver, String sTestCaseName) throws Exception{
	
		//Check that all of the elements of that are expected are displayed
		Objects_Job_Completion_Device_Binding_Commissioning_Page.lbl_Device_Binding_Commissioning(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Device Binding & Commissioning label displayed as expected");
		}
		
		Objects_Job_Completion_Device_Binding_Commissioning_Page.btn_IHD_Accepted_Yes(driver).isDisplayed();{
		Log.info(sTestCaseName + " | IHD Accepted - Yes radio button displayed as expected");
		}
		
		Objects_Job_Completion_Device_Binding_Commissioning_Page.btn_IHD_Accepted_No(driver).isDisplayed();{
		Log.info(sTestCaseName + " | IHD Accepted - No radio button displayed as expected");
		}
		
				
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-viewPage");
		
	//END OF VIEW PAGE METHOD
	}
	
	
	/* **************************************************************************************************
	* Function: addSuccessValues
	* Author: Iain Storrie
	* Date: 06/07/2017
	* Purpose: This method adds the required responses in the Job Completion Device Binding & Commissioning 
	* page in order to force a successful device binding and commissioning
	* Arguments: 
	* 			
	* Returns: 
	*****************************************************************************************************
	* Change Log:
	* 
	* Date:
	* Author: 
	* Details:
	*
	****************************************************************************************************/	
	public static void addSuccessValues(WebDriver driver, String sTestCaseName) throws Exception{
		
		if ("Exchange_1_End_To_End_Chrome".equals(sTestCaseName)
				|| "Exchange_2_End_To_End_Chrome".equals(sTestCaseName)
				|| "FLTY_2_End_To_End_Chrome".equals(sTestCaseName)
				|| "INST_15_End_To_End_Chrome".equals(sTestCaseName)
				|| "INST_14_End_To_End_Chrome".equals(sTestCaseName)
				|| "Exchange_19_End_To_End_Chrome".equals(sTestCaseName)
				|| "Exchange_20_End_To_End_Chrome".equals(sTestCaseName))
		{ 
			Objects_Job_Completion_Device_Binding_Commissioning_Page.btn_IHD_Accepted_Yes(driver).click();{
			Log.info(sTestCaseName + " | IHD Accepted - Yes radio button clicked");
			}
			Objects_Job_Completion_Device_Binding_Commissioning_Page.btn_IHD_Paired_Successfully_Yes(driver).click();{
			Log.info(sTestCaseName + " | IHD Paired Successfully - Yes radio button clicked");
			}		
		}
		else if ("Exchange_3_End_To_End_Chrome".equals(sTestCaseName)
				|| "Exchange_9_End_To_End_Chrome".equals(sTestCaseName)
				|| "FLTY_17_End_To_End_Chrome".equals(sTestCaseName)
				|| "Exchange_3_Gas_Meter_Post_Installation_Gas_Tightness_Test_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_3_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Failed_Test_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_3_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Low_Pressure_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_3_Gas_Risk_Assessment_Gas_Abort_Low_Pressure_Chrome".equals(sTestCaseName)
				|| "Exchange_3_Gas_Risk_Assessment_Gas_Abort_Med_Pressure_Chrome".equals(sTestCaseName)
				|| "Exchange_3_Gas_SMeter_Post_Installation_Pressure_Drop_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_9_Elec_HAN_WAN_Checks_Page_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_9_Gas_Meter_Initial_Risk_Assessment_Gas_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_9_Gas_Meter_Post_Installation_Gas_Tightness_Test_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_9_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Failed_Test_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_9_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Low_Pressure_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_9_Gas_Risk_Assessment_Gas_Abort_Low_Pressure_Chrome".equals(sTestCaseName)
				|| "Exchange_9_Gas_Risk_Assessment_Gas_Abort_Med_Pressure_Chrome".equals(sTestCaseName)
				|| "FLTY_17_Gas_Meter_Post_Installation_Gas_Tightness_Test_Abort_Chrome".equals(sTestCaseName)
				|| "FLTY_17_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Failed_Test_Abort_Chrome".equals(sTestCaseName)
				|| "FLTY_17_Gas_Meter_Pre_Installation_Gas_Tightness_Test_Low_Pressure_Abort_Chrome".equals(sTestCaseName)
				|| "FLTY_17_Gas_Risk_Assessment_Gas_Abort_Low_Pressure_Chrome".equals(sTestCaseName)
				|| "FLTY_17_Gas_Risk_Assessment_Gas_Abort_Med_Pressure_Chrome".equals(sTestCaseName)
				|| "FLTY_17_Gas_Suitable_For_Smart_Installation_Abort_Chrome".equals(sTestCaseName)
				|| "Exchange_21_End_To_End_Chrome".equals(sTestCaseName)
				|| "INST_16_End_To_End_Chrome".equals(sTestCaseName)
				|| "Exchange_3_Elec_HAN_WAN_Checks_Page_Abort_Chrome".equals(sTestCaseName)) 
		{ 
			Objects_Job_Completion_Device_Binding_Commissioning_Page.btn_IHD_Accepted_Yes(driver).click();{
			Log.info(sTestCaseName + " | IHD Accepted - Yes radio button clicked");
			}
			Objects_Job_Completion_Device_Binding_Commissioning_Page.btn_Gas_Electricity_Meter_Paired_Successfully_Yes(driver).click();{
			Log.info(sTestCaseName + " | Gas and Electric Meters Paired Successfully - Yes radio button clicked");
			}
			
			Objects_Job_Completion_Device_Binding_Commissioning_Page.btn_IHD_Paired_Successfully_Yes(driver).click();{
			Log.info(sTestCaseName + " | IHD Paired Successfully - Yes radio button clicked");
			}	
			
			Objects_Job_Completion_Device_Binding_Commissioning_Page.btn_Full_HAN_Established_Yes(driver).click();{
			Log.info(sTestCaseName + " | Full HAN Established Successfully - Yes radio button clicked");
			}	
		}
		
		else if ("Exchange_3_Elec_HAN_WAN_Checks_Page_Abort_Chrome".equals(sTestCaseName))
		{
			Objects_Job_Completion_Device_Binding_Commissioning_Page.lbl_Device_Binding_Commissioning_Complete(driver).click();{
			Log.info(sTestCaseName + " | IHD Accepted - Yes radio button clicked");
			}
			Objects_Job_Completion_Device_Binding_Commissioning_Page.btn_IHD_Accepted_Yes(driver).click();{
			Log.info(sTestCaseName + " | IHD Accepted - Yes radio button clicked");
			}
			Objects_Job_Completion_Device_Binding_Commissioning_Page.btn_Gas_Electricity_Meter_Paired_Successfully_No(driver).click();{
			Log.info(sTestCaseName + " | Gas and Electric Meters Paired Successfully - Yes radio button clicked");
			}
		}
		else 
		{ 
			System.out.println("Doing the else "); 
		}
		
		Objects_Job_Completion_Device_Binding_Commissioning_Page.lbl_Device_Binding_Commissioning_Complete(driver).isDisplayed();{
		Log.info(sTestCaseName + " | Device Binding Commissioning Complete Label displayed");
		}
		
		//Take a screenshot to show what we've done
		Utils.takeScreenshot(driver, sTestCaseName + "-addSuccessValues");
	}
		
	//END OF ADD SUCCESS VALUES METHOD
}		
//END OF METHODS