package JIRA;

import com.atlassian.jira.rest.client.api.AuthenticationHandler;
import com.atlassian.jira.rest.client.api.IssueRestClient;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.domain.BasicIssue;
import com.atlassian.jira.rest.client.api.domain.input.IssueInput;
import com.atlassian.jira.rest.client.api.domain.input.IssueInputBuilder;
import com.atlassian.jira.rest.client.auth.BasicHttpAuthenticationHandler;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;



import org.testng.annotations.Test;

import java.net.URI;

public class CreateJIRAIssue {
	
	@Test
	public static void test1() throws Exception  {
		
		URI jiraServerUri = URI.create("http://usddjira01:8080/rest/api/2/issue/createmeta");

        AsynchronousJiraRestClientFactory factory = new AsynchronousJiraRestClientFactory();

        AuthenticationHandler auth = (AuthenticationHandler) new BasicHttpAuthenticationHandler("admin","admin");
        JiraRestClient restClient = factory.create(jiraServerUri, auth);        
        IssueRestClient issueClient = restClient.getIssueClient();  

        try {
            IssueInputBuilder iib = new IssueInputBuilder();
            iib.setProjectKey("ZEP");
            iib.setSummary("Test Automation");            
            iib.setDescription("Test Description Automation");                        
            iib.setReporterName("rpradeep");
            IssueInput issue = iib.build();
            BasicIssue issueObj = issueClient.createIssue(issue).claim();

            System.out.println("Issue " + issueObj.getKey() + " created successfully");
        } finally {
            restClient.close();
        }

    }


}
