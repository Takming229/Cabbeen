package Page;

import org.openqa.selenium.By;

public class OC_B_SALE_APPLY extends BasePage {
    public OC_B_SALE_APPLY click_Sale(){//点击购销单
        findElement(By.cssSelector(".menu-group:nth-child(6) > .item:nth-child(2)")).click();
        return this;
    }
    public OC_B_SALE_APPLY Sale_apply(){//新增购销单
        click_Sale();
        findElement(By.id("actionADD")).click();
        findElementSendKeys(By.cssSelector("#CP_C_ORIG_ID .ark-input"),"卡宾中国生产石狮总仓");
        findElementSendKeys(By.cssSelector("#CP_C_DEST_ID .ark-input"),"SAP8073仓");
        findElementSendKeys(By.cssSelector(".PS_C_SKU_ECODE .ark-input"),"32031390120154");
        findElementSendKeys(By.cssSelector(".REMARK .ark-input"),"自动化跑的单据");
        findElementSendKeys(By.cssSelector(".QTY .ark-input"),"10");
        findElement(By.linkText("【保存】")).click();
        findElement(By.cssSelector("#actionSUBMIT")).click();
        findElement(By.cssSelector(".ark-btn:nth-child(2) > span")).click();
        return this;
    }
    public comm_SALE search_for(){//进入购销单页面
        click_Sale();
        return new comm_SALE();
    }

   public comm_SALE Oc_B_sale(){
        return new comm_SALE();
   }
}
