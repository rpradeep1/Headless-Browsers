package JIRA;





import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


import org.testng.annotations.Test;

import com.atlassian.jira.rest.client.GetCreateIssueMetadataOptionsBuilder;
import com.atlassian.jira.rest.client.IssueRestClient;
import com.atlassian.jira.rest.client.JiraRestClient;
import com.atlassian.jira.rest.client.domain.CimProject;
import com.atlassian.jira.rest.client.internal.jersey.JerseyJiraRestClientFactory;

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
		
        //BasicCredentials creds = new BasicCredentials("ipcmtest23", "Service123");
        //JiraClient jira = new JiraClient("https://jira-qa.ihealthtechnologies.com", creds);
		//final Issue issue = jira.getIssue("ID-799");
		
        
        BasicCredentials creds = new BasicCredentials("admin", "admin");
        JiraClient jira = new JiraClient("http://usddjira01:8080/", creds);
        final Issue issue = jira.getIssue("ZEP-2");
        
        
        
        System.out.println("Assigned To --" + issue.getAssignee() + "\n");         
        System.out.println("Issue Description --" + issue.getDescription() + "\n");   
        System.out.println("Issue Sumamry -- " +  issue.getSummary() + "\n");        
        
        Issue issue1 = jira.createIssue("Zephyr_Test (ZEP)", "Bug").field(Field.DESCRIPTION, "Test Automation First Defect").field(Field.SUMMARY, "Test Automation First Defect - I & V Team").field(Field.REPORTER, "rpradeep").execute();
        
        System.out.println(issue1.getId());
        
        
    	final JerseyJiraRestClientFactory clientFactory = new JerseyJiraRestClientFactory();
    	final JiraRestClient restClient = clientFactory.createWithBasicHttpAuthentication(URI.create("http://usddjira01:8080/"), "admin", "admin");
    	final IssueRestClient issueClient = restClient.getIssueClient();
    	
    
    	
    	
    	
        
        
 
        
  
		
	}
	

}
