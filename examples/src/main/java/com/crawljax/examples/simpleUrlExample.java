// package com.crawljax.examples;

// import com.crawljax.browser.EmbeddedBrowser;
// import com.crawljax.core.CrawljaxRunner;
// import com.crawljax.core.configuration.*;
// import com.crawljax.core.state.Identification;
// import com.crawljax.plugins.crawloverview.CrawlOverview;
// import com.crawljax.plugins.webscarabwrapper.WebScarabWrapper;
// import com.crawljax.plugins.aji.JSModifyProxyPlugin;
// import com.crawljax.plugins.events.Eventable;
// import com.crawljax.plugins.events.EventsPlugin;
// import com.crawljax.plugins.events.EventType;

// public class EventExtractionExample {
//     public static void main(String[] args) {
//         // Configure Crawljax
//         CrawljaxConfiguration config = new CrawljaxConfiguration();

//         config.setBrowserConfig(new BrowserConfiguration(EmbeddedBrowser.BrowserType.CHROME_HEADLESS));

//         config.setCrawlRules(new CrawlRules());

//         config.setUrl("http://example.com"); // Set the starting URL of the web application

//         // Add plugins if needed
//         config.addPlugin(new CrawlOverview());
//         config.addPlugin(new WebScarabWrapper());
//         config.addPlugin(new JSModifyProxyPlugin());

//         // Set maximum crawl depth
//         config.setMaximumDepth(3);

//         // Set maximum number of states/edges to crawl
//         config.setMaximumStates(1000);
//         config.setMaximumEdges(10000);

//         // Set output directory for reports and screenshots
//         config.setOutputDirectory("./crawljax-output");

//         // Add events to be extracted
//         Eventable event1 = new Eventable(new Identification(Identification.How.cssSelector, "#myElement"), EventType.click);
//         Eventable event2 = new Eventable(new Identification(Identification.How.cssSelector, "#anotherElement"), EventType.hover);
        
//         // Add events to the EventsPlugin
//         config.addPlugin(new EventsPlugin(event1, event2));

//         try {
//             // Create Crawljax instance and run the crawler
//             CrawljaxRunner crawljax = new CrawljaxRunner(config);
//             crawljax.call();
            
//             // Extract the captured events
//             EventsPlugin eventsPlugin = crawljax.getPlugins().get(EventsPlugin.class);
//             List<Eventable> capturedEvents = eventsPlugin.getEvents();
            
//             // Process the captured events
//             for (Eventable event : capturedEvents) {
//                 System.out.println("Event: " + event);
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }
