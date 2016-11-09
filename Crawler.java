import java.util.regex.Pattern;

import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.url.WebURL;

public class Crawler extends WebCrawler {

	@Override
	public boolean shouldVisit(Page referringPage, WebURL url) {
		boolean test = Pattern.matches("https://yourstory.com/\\d\\d\\d\\d/\\d\\d/.+", url.getURL().toLowerCase());
		return !test;
	}

	@Override
	public void visit(Page page) {
		String url = page.getWebURL().getURL();
		System.out.println("URL not matching format: " + url);

	}

}
