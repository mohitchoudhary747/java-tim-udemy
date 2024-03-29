package udemy.java.filescheck;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateHtmlFile {
    public static void main(String[] args) throws IOException {
        System.out.println(getBannerHtmlFile());
        String directory="/Users/yukhit/Documents/JunkFiles/abc";
        String fileName="myBanner.html";
        File htmlFile=new File(directory+"/"+fileName);
        if(!Files.isDirectory(Paths.get(directory))){
            new File(directory).mkdir();
            System.out.println("created directory> "+directory);
        } else{
            System.out.println("Directory already there....");
        }
        BufferedWriter writer=new BufferedWriter(new FileWriter(htmlFile));
        writer.write(getBannerHtmlFile());
        writer.close();
    }

    public static String getBannerHtmlFile(){
        System.out.println("Creating an HTML File");
        String envName="QA";
        String tenantName="testdemo@automation.com";
        String domainName="qa.com";
        String domainId="20";
        String anyOther="other Info";
//        String tenantName=null;
        String mainScript="<script src=\"\"></script>";
        String revokeButton="";
        String head="<!DOCTYPE html>\n" +
                "<html lang=\"en-us\" prefix=\"og: http://ogp.me/ns#\">\n" +
                "\n" +
                "<head>\n" +
                "    <h1 style=\"color: brown;\">Banner Info:</h1>\n" +
                "    <div>Environment Name: "+envName+"</div>\n" +
                "    <div>Tenant Name : "+tenantName+"</div>\n" +
                "    <div>Domain Name: "+domainName+"</div>\n" +
                "    <div>Domain Id: "+domainId+"</div>\n" +
                "    <div>Any other Info: "+anyOther+"</div>\n" +
                "</br>\n" +
                "</br>\n" +
                "\n" +
                "\n" +
                "    <img srcset=\"https://onepagelove.imgix.net/2017/01/opl-big-19.jpg?auto=compress, https://onepagelove.imgix.net/2017/01/opl-big-19.jpg?auto=compress 2x\" src=\"https://onepagelove.imgix.net/2017/01/opl-big-19.jpg?auto=compress\" alt=\"LeadGen Website Screenshot\" data-pin-url=\"https://onepagelove.com/leadgen\" data-pin-description=\"'LeadGen' is a very impressive One Page HTML template that includes a powerful Landing Page builder. There are over 30 pre-made demos covering nearly every industry imaginable. This demo seen here is my favorite - the Product Landing Page. Huge value for money here at only twenty bucks!\">\n" +
                "\n" +
                "    <!-- Inject your securiti header here -->\n" +
                "</head>";

        String body="<body>\n" +
                "    <!-- Inject your securiti body code here -->\n" +
                "   \n" +
                revokeButton+
                "\n" +
                "    <!-- Inject your securiti revoke button here -->\n" +
                mainScript+
                "\n" +
                "</body>\n" +
                "\n" +
                "</html>";


        // ********* Returning the value *************
        return head+"\n"+body;
    }
}

