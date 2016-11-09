import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.parser.HtmlParseData;
import edu.uci.ics.crawler4j.url.WebURL;


// https://yourstory.com/(year)/(month)/(slug)
public class Crawler extends WebCrawler{
	
	/*private final static Pattern FILTERS = Pattern.compile(".*(\\.(css|js|gif|jpg"
            + "|png|mp3|mp3|zip|gz))$");*/
	//List<String> linkParts = new ArrayList<String>();

	@Override
    public boolean shouldVisit(Page referringPage, WebURL url) {
		boolean test = Pattern.matches("https://yourstory.com/\\d\\d\\d\\d/\\d\\d/.+", url.getURL().toLowerCase());
        return !test;
	}
	
	
	
	@Override
    public void visit(Page page) {
        String url = page.getWebURL().getURL();
        System.out.println("URL not matching format: " + url);

       /* if (page.getParseData() instanceof HtmlParseData) {
            HtmlParseData htmlParseData = (HtmlParseData) page.getParseData();
            String text = htmlParseData.getText();
            String html = htmlParseData.getHtml();
            Set<WebURL> links = htmlParseData.getOutgoingUrls();

            System.out.println("Text length: " + text.length());
            System.out.println("Html length: " + html.length());
            System.out.println("Number of outgoing links: " + links.size());
        }*/
   }
	
}
