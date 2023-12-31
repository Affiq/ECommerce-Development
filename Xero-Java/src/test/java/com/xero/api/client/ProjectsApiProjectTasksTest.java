package com.xero.api.client;

import static org.junit.Assert.assertTrue;

import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Every.everyItem;

import com.xero.api.ApiClient;
import com.xero.api.client.*;
import com.xero.models.project.*;

import java.io.File;
import java.net.URL;

import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

import org.threeten.bp.*;
import java.io.IOException;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

import java.util.Calendar;
import java.util.Map;
import java.util.UUID;
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class ProjectsApiProjectTasksTest {

	ApiClient defaultClient; 
    ProjectApi projectApi; 
	String accessToken;
    String xeroTenantId; 
   
    private static boolean setUpIsDone = false;
	
	@Before
	public void setUp() {
		// Set Access Token and Tenant Id
        accessToken = "123";
        xeroTenantId = "xyz";
        
        // Init projectsApi client
        // NEW Sandbox for API Mocking
		defaultClient = new ApiClient("https://3fe1c2ee-7113-4035-9e6d-53dad2fb2af3.mock.pstmn.io/projects.xro/2.0",null,null,null,null);
        projectApi = ProjectApi.getInstance(defaultClient);   
       
        // ADDED TO MANAGE RATE LIMITS while using SwaggerHub to mock APIs
        if (setUpIsDone) {
            return;
        }

        try {
            System.out.println("Sleep for 60 seconds");
            Thread.sleep(60);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        // do the setup
        setUpIsDone = true;
	}

	public void tearDown() {
		projectApi = null;
        defaultClient = null;
	}

	@Test
    public void getTasksTest() throws IOException {
        System.out.println("@Test - getTasksTest");
        UUID projectId = UUID.fromString("8138a266-fb42-49b2-a104-014b7045753d");  
        String taskIds = null;        
        int page = 1;
        int pageSize = 50;
        Tasks response = projectApi.getTasks(accessToken, xeroTenantId, projectId, page, pageSize, taskIds, null);
        
        assertThat(response.getPagination().getPage(), is(equalTo(1)));
        assertThat(response.getPagination().getItemCount(), is(equalTo(1)));
        assertThat(response.getPagination().getPageCount(), is(equalTo(1)));
        assertThat(response.getPagination().getPageSize(), is(equalTo(50)));
        assertThat(response.getItems().get(0).getTaskId(), is(equalTo(UUID.fromString("7be77337-feec-4458-bb1b-dbaa5a4aafce"))));
        assertThat(response.getItems().get(0).getName(), is(equalTo("Demolition")));
        assertThat(response.getItems().get(0).getRate().getCurrency(), is(equalTo(com.xero.models.project.CurrencyCode.AUD)));
        assertThat(response.getItems().get(0).getRate().getValue(), is(equalTo(20.0)));
        assertThat(response.getItems().get(0).getChargeType(), is(equalTo(com.xero.models.project.ChargeType.TIME)));
        assertThat(response.getItems().get(0).getEstimateMinutes(), is(equalTo(12000)));
        assertThat(response.getItems().get(0).getProjectId(), is(equalTo(UUID.fromString("b021e7cb-1903-4292-b48b-5b27b4271e3e"))));
        assertThat(response.getItems().get(0).getTotalMinutes(), is(equalTo(180)));
        assertThat(response.getItems().get(0).getTotalAmount().getCurrency(), is(equalTo(com.xero.models.project.CurrencyCode.AUD)));
        assertThat(response.getItems().get(0).getTotalAmount().getValue(), is(equalTo(60.0)));
        assertThat(response.getItems().get(0).getMinutesInvoiced(), is(equalTo(0)));
        assertThat(response.getItems().get(0).getMinutesToBeInvoiced(), is(equalTo(180)));
        assertThat(response.getItems().get(0).getFixedMinutes(), is(equalTo(0)));
        assertThat(response.getItems().get(0).getNonChargeableMinutes(), is(equalTo(0)));
        assertThat(response.getItems().get(0).getAmountInvoiced().getCurrency(), is(equalTo(com.xero.models.project.CurrencyCode.AUD)));
        assertThat(response.getItems().get(0).getAmountInvoiced().getValue(), is(equalTo(0.0)));        
        assertThat(response.getItems().get(0).getAmountToBeInvoiced().getCurrency(), is(equalTo(com.xero.models.project.CurrencyCode.AUD)));
        assertThat(response.getItems().get(0).getAmountToBeInvoiced().getValue(), is(equalTo(60.0)));
        assertThat(response.getItems().get(0).getStatus(), is(equalTo(com.xero.models.project.Task.StatusEnum.ACTIVE)));
        
       // System.out.println(response.toString());
    }

    @Test
    public void getTaskTest() throws IOException {
        System.out.println("@Test - getTaskTest");
        UUID projectId = UUID.fromString("8138a266-fb42-49b2-a104-014b7045753d");  
        UUID taskId = UUID.fromString("8138a266-fb42-49b2-a104-014b7045753d");  
        
        Task response = projectApi.getTask(accessToken, xeroTenantId, projectId, taskId);
        
        assertThat(response.getTaskId(), is(equalTo(UUID.fromString("7be77337-feec-4458-bb1b-dbaa5a4aafce"))));
        assertThat(response.getName(), is(equalTo("Demolition")));
        assertThat(response.getRate().getCurrency(), is(equalTo(com.xero.models.project.CurrencyCode.AUD)));
        assertThat(response.getRate().getValue(), is(equalTo(20.0)));
        assertThat(response.getChargeType(), is(equalTo(com.xero.models.project.ChargeType.TIME)));
        assertThat(response.getEstimateMinutes(), is(equalTo(12000)));
        assertThat(response.getProjectId(), is(equalTo(UUID.fromString("b021e7cb-1903-4292-b48b-5b27b4271e3e"))));
        assertThat(response.getTotalMinutes(), is(equalTo(300)));
        assertThat(response.getTotalAmount().getCurrency(), is(equalTo(com.xero.models.project.CurrencyCode.AUD)));
        assertThat(response.getTotalAmount().getValue(), is(equalTo(100.0)));
        assertThat(response.getMinutesInvoiced(), is(equalTo(0)));
        assertThat(response.getMinutesToBeInvoiced(), is(equalTo(300)));
        assertThat(response.getFixedMinutes(), is(equalTo(0)));
        assertThat(response.getNonChargeableMinutes(), is(equalTo(0)));
        assertThat(response.getAmountInvoiced().getCurrency(), is(equalTo(com.xero.models.project.CurrencyCode.AUD)));
        assertThat(response.getAmountInvoiced().getValue(), is(equalTo(0.0)));        
        assertThat(response.getAmountToBeInvoiced().getCurrency(), is(equalTo(com.xero.models.project.CurrencyCode.AUD)));
        assertThat(response.getAmountToBeInvoiced().getValue(), is(equalTo(100.0)));
        assertThat(response.getStatus(), is(equalTo(com.xero.models.project.Task.StatusEnum.ACTIVE)));
        
        //System.out.println(response.toString());
    }
}
