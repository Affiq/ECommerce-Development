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
import com.xero.models.payrolluk.*;
import com.xero.models.payrolluk.Benefit.CalculationTypeEnum;
import com.xero.models.payrolluk.Benefit.CategoryEnum;

import java.io.File;
import java.net.URL;

import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

import org.threeten.bp.*;
import org.threeten.bp.temporal.ChronoUnit;
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

public class PayrollUkApiPayslipsTest {

	ApiClient defaultClient; 
    PayrollUkApi payrollUkApi;
     
	String accessToken;
    String xeroTenantId; 
	
	@Before
	public void setUp() {
		// Set Access Token and Tenant Id
        accessToken = "123";
        xeroTenantId = "xyz";
        
        // Init projectApi client
        // NEW Sandbox for API Mocking
		defaultClient = new ApiClient("https://ba3fd247-8fc6-4d7c-bcd1-bdbea4ea1803.mock.pstmn.io/payroll.xro/2.0",null,null,null,null);
        payrollUkApi = PayrollUkApi.getInstance(defaultClient);   
       
	}

	public void tearDown() {
		payrollUkApi = null;
        defaultClient = null;
	}

    @Test
    public void getPayslipsTest() throws IOException {
        System.out.println("@Test UK Payroll - getPayslipsTest");
       
        UUID payRunId = UUID.fromString("cdfb8371-0b21-4b8a-8903-1024df6c391e");
        Payslips response = payrollUkApi.getPaySlips(accessToken, xeroTenantId, payRunId, 1);
        
        assertThat(response.getPaySlips().get(0).getPaySlipID(),is(equalTo(UUID.fromString("ed3fb9b3-e9a1-44fa-a224-8be49facbbe8"))));
        assertThat(response.getPaySlips().get(0).getEmployeeID(),is(equalTo(UUID.fromString("aad6b292-7b94-408b-93f6-e489867e3fb0"))));
        assertThat(response.getPaySlips().get(0).getPayRunID(),is(equalTo(UUID.fromString("e0a59d82-6229-4be4-9d66-49891b4d933e"))));
        assertThat(response.getPaySlips().get(0).getFirstName(),is(equalTo("Mike")));
        assertThat(response.getPaySlips().get(0).getLastName(),is(equalTo("Johnpitragibigson")));
        assertThat(response.getPaySlips().get(0).getTotalEarnings(),is(equalTo(480.77)));
        assertThat(response.getPaySlips().get(0).getGrossEarnings(),is(equalTo(480.77)));
        assertThat(response.getPaySlips().get(0).getTotalPay(),is(equalTo(386.54)));
        assertThat(response.getPaySlips().get(0).getTotalEmployerTaxes(),is(equalTo(0.0)));
        assertThat(response.getPaySlips().get(0).getTotalEmployeeTaxes(),is(equalTo(94.23)));
        assertThat(response.getPaySlips().get(0).getTotalDeductions(),is(equalTo(9.62)));
        assertThat(response.getPaySlips().get(0).getTotalReimbursements(),is(equalTo(0.0)));
        assertThat(response.getPaySlips().get(0).getTotalCourtOrders(),is(equalTo(0.0)));
        assertThat(response.getPaySlips().get(0).getTotalBenefits(),is(equalTo(9.62)));
        assertThat(response.getPaySlips().get(0).getEarningsLines().get(0).getEarningsLineID(),is(equalTo(UUID.fromString("87f5b43a-cf51-4b74-92de-94c819e82d27"))));
        assertThat(response.getPaySlips().get(0).getEarningsLines().get(0).getEarningsRateID(),is(equalTo(UUID.fromString("87f5b43a-cf51-4b74-92de-94c819e82d27"))));
        assertThat(response.getPaySlips().get(0).getEarningsLines().get(0).getDisplayName(),is(equalTo("Regular Hours")));
        assertThat(response.getPaySlips().get(0).getEarningsLines().get(0).getRatePerUnit(),is(equalTo(12.019231)));
        assertThat(response.getPaySlips().get(0).getEarningsLines().get(0).getNumberOfUnits(),is(equalTo(40.0)));
        assertThat(response.getPaySlips().get(0).getEarningsLines().get(0).getAmount(),is(equalTo(480.77)));
        assertThat(response.getPaySlips().get(0).getEarningsLines().get(0).getIsLinkedToTimesheet(),is(equalTo(false)));     
        assertThat(response.getPaySlips().get(0).getLeaveAccrualLines().get(0).getLeaveTypeID(),is(equalTo(UUID.fromString("ed08dffe-788e-4b24-9630-f0fa2f4d164c"))));
        assertThat(response.getPaySlips().get(0).getLeaveAccrualLines().get(0).getNumberOfUnits(),is(equalTo(0.0)));
        assertThat(response.getPaySlips().get(0).getPaymentLines().get(0).getPaymentLineID(),is(equalTo(UUID.fromString("08ceb312-07af-4ce0-ae9a-176532f07009"))));
        assertThat(response.getPaySlips().get(0).getPaymentLines().get(0).getAmount(),is(equalTo(384.3)));
        assertThat(response.getPaySlips().get(0).getEmployeeTaxLines().get(0).getTaxLineID(),is(equalTo(UUID.fromString("e7dc717a-4399-4702-9e15-adb87e568dc9"))));
        assertThat(response.getPaySlips().get(0).getEmployeeTaxLines().get(0).getDescription(),is(equalTo("PAYE")));
        assertThat(response.getPaySlips().get(0).getEmployeeTaxLines().get(0).getAmount(),is(equalTo(48.6)));
        assertThat(response.getPaySlips().get(0).getEmployeeTaxLines().get(0).getGlobalTaxTypeID(),is(equalTo("1")));
        assertThat(response.getPaySlips().get(0).getEmployeeTaxLines().get(0).getManualAdjustment(),is(equalTo(false)));
        
        //System.out.println(response.toString());
    }
}
