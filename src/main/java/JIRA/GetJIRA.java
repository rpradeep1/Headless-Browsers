package JIRA;





import java.io.IOException;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.Field;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.JiraClient;
import net.rcarz.jiraclient.JiraException;
import net.rcarz.jiraclient.RestException;	




public class GetJIRA {
	
	@Test
	public void testcase1() throws JiraException, InterruptedException, RestException, IOException, URISyntaxException
	{
		
        BasicCredentials creds = new BasicCredentials("ipcmtest23", "Service123");
        JiraClient jira = new JiraClient("https://jira-qa.ihealthtechnologies.com", creds);
        
        //BasicCredentials creds = new BasicCredentials("rpradeep", "Aug2018@");
        //JiraClient jira = new JiraClient("http://usddjira01:8080/", creds);
        
                
        final Issue issue = jira.getIssue("ID-799");
        
        
        
        System.out.println("Assigned To --" + issue.getAssignee() + "\n"); 
        
        System.out.println("Issue Description --" + issue.getDescription() + "\n");         
        
        System.out.println("Issue Sumamry -- " +  issue.getSummary() + "\n");
        
        
        Issue issue1 = jira.createIssue("Jira Bridge Test (TEST)", "Bug").field(Field.DESCRIPTION, "Test Automation First Defect").field(Field.SUMMARY, "Test Automation First Defect - I & V Team").field(Field.REPORTER, "rpradeep").execute();
        
        System.out.println(issue1.getId());
        
        
  
		
	}
	

}
