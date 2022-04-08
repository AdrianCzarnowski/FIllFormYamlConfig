package configuration.browsrer;

public class Browser {

    private BrowserModel chrome;

    public BrowserModel getChrome() {
        return chrome;
    }


    public Browser(BrowserModel chrome) {
        this.chrome = chrome;
    }
}
