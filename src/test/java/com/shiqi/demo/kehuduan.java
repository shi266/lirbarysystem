package com.shiqi.demo;

import org.springframework.web.servlet.View;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class kehuduan {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String a = "%7B%22orderId%22%3A%22%22%2C%22buyerId%22%3A%22%22%2C%22asins%22%3A%5B%7B%22asin%22%3A%22B09BNBMT8Y%22%2C%22scope%22%3A%22AsinTarget%22%2C%22sellers%22%3A%5B%5D%7D%5D%2C%22originalAsin%22%3A%22%22%2C%22additionalInformation%22%3A%22Greetings%2C%5Cn%5CnThis%20is%20about%20a%20violation%20of%20Amazon%20rules.%5Cn%5CnSeller%20name%3A%20FerilinsoDirect%5Cn%5CnThis%20product%20is%20%5C%22iPhone%2013%20Pro%20Max%20Camera%20Lens%20Protector%5C%22%20and%20should%20be%20categorized%20to%20the%20%5C%22Cell%20Phone%20Screen%20Protectors%5C%22.%5CnThe%20seller%20changed%20the%20product%20category%20to%20the%20%5C%22%20Laptop%20Screen%20Protectors%5C%22%20which%20is%20not%20the%20category%20the%20product%20should%20belong%20to.%5Cn%5CnPlease%20investigate.%22%2C%22detailReason%22%3A%22%22%2C%22formName%22%3A%22PDP_VIOLATES_AMZ_POLICIES_MIS_CAT%22%2C%22prohibitedKeyword%22%3A%22%22%2C%22textOrImageConcern%22%3A%22%22%2C%22errors%22%3A%7B%22describeIssueMissing%22%3Afalse%2C%22orderIdMissing%22%3Afalse%2C%22orderIdSelectedAsinMissing%22%3Afalse%2C%22asinMissing%22%3Afalse%2C%22sellersMissing%22%3A%5B%5D%2C%22scopeMissing%22%3A%5B%5D%2C%22originalAsinMissingError%22%3Afalse%2C%22originalAsinMatchesDuplicateError%22%3Afalse%2C%22textOrImageConcernError%22%3Afalse%2C%22prohibitedKeywordError%22%3Afalse%2C%22additionInfoError%22%3Afalse%7D%2C%22marketplaceId%22%3A%22ATVPDKIKX0DER%22%2C%22isTrustedSeller%22%3Afalse%2C%22isOtherUsecaseEnabled%22%3Atrue%7D";
        String decode = URLDecoder.decode(a,"UTF-8");
        System.out.println(decode);
        String c ="s";
        String b ="{\"orderId\":\"\",\"buyerId\":\"\",\"asins\":[{\"asin\":\""+c+"\",\"scope\":\"AsinTarget\",\"sellers\":[]}],\"originalAsin\":\"\",\"additionalInformation\":\""+c+"\",\"detailReason\":\""+c+"\",\"formName\":\""+c+"\",\"prohibitedKeyword\":\"\",\"textOrImageConcern\":\"\",\"errors\":{\"describeIssueMissing\":false,\"orderIdMissing\":false,\"orderIdSelectedAsinMissing\":false,\"asinMissing\":false,\"sellersMissing\":[],\"scopeMissing\":[],\"originalAsinMissingError\":false,\"originalAsinMatchesDuplicateError\":false,\"textOrImageConcernError\":false,\"prohibitedKeywordError\":false,\"additionInfoError\":false},\"marketplaceId\":\""+c+"\",\"isTrustedSeller\":false,\"isOtherUsecaseEnabled\":true}";
    }


}
