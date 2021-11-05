package com.ebay.data;

import org.testng.annotations.DataProvider;


public class DataProviders {
    @DataProvider(name = "searchData")
    public Object[] getSearchData() {
        return new Object[]{"Java Books", "Selenium Books", "Macbook"};
    }

    @DataProvider(name = "credentials")
    public Object[][] getCredential() {
        return new Object[][]{{"demouser1", "Demopass01"}, {"demouser2", "Demopass02"}, {"demouser3", "Demopass03"}};
    }
}






