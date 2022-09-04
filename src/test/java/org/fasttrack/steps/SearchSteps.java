package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SearchSteps extends BaseSteps{

    @Step
    public void searchForKeyword(String keyword){
        homePage.setSearchField(keyword);
        homePage.clickSearchButton();
    }

    @Step
    public void findProductWithNameInListAndOpen(String productName){
        Assert.assertTrue(searchResultsPage.findProductInGridAndOpen(productName));
    }
    @Step
    public void navigateToProductName(String productName){
        searchForKeyword(productName);
        findProductWithNameInListAndOpen(productName);
    }
    @Step
    public void findProductInListAndOpen (String productName) {
        Assert.assertTrue(searchResultsPage.findProductAndOpen(productName));
    }
    @Step
    public void navigateToProductNameInList (String productName){
        searchForKeyword(productName);
        findProductInListAndOpen(productName);
    }

}
