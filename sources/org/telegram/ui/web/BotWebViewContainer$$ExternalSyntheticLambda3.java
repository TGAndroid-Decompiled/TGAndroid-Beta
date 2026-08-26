package org.telegram.ui.web;

public final class BotWebViewContainer$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final BotWebViewContainer f$0;
    public final String f$1;

    public BotWebViewContainer$$ExternalSyntheticLambda3(BotWebViewContainer botWebViewContainer, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = botWebViewContainer;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                BotWebViewContainer botWebViewContainer = this.f$0;
                botWebViewContainer.isPageLoaded = false;
                botWebViewContainer.lastClickMs = 0L;
                botWebViewContainer.hasUserPermissions = false;
                String str = this.f$1;
                botWebViewContainer.mUrl = str;
                botWebViewContainer.checkCreateWebView();
                BotWebViewContainer.MyWebView myWebView = botWebViewContainer.webView;
                if (myWebView != null) {
                    myWebView.onResume();
                    botWebViewContainer.webView.loadUrl(str);
                }
                break;
            default:
                BotWebViewContainer.MyWebView myWebView2 = this.f$0.webView;
                if (myWebView2 != null) {
                    myWebView2.evaluateJS(this.f$1);
                    break;
                }
                break;
        }
    }
}
