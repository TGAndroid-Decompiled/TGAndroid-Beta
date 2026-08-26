package org.telegram.ui.web;

import org.telegram.messenger.browser.Browser;

public final class BotWebViewContainer$MyWebView$2$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final BotWebViewContainer.MyWebView.AnonymousClass2 f$0;

    public BotWebViewContainer$MyWebView$2$$ExternalSyntheticLambda2(BotWebViewContainer.MyWebView.AnonymousClass2 anonymousClass2, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                BotWebViewContainer.MyWebView myWebView = BotWebViewContainer.MyWebView.this;
                BotWebViewContainer botWebViewContainer = myWebView.botWebViewContainer;
                if (botWebViewContainer != null) {
                    myWebView.errorShown = false;
                    botWebViewContainer.onErrorShown(null, false);
                }
                break;
            case 1:
                BotWebViewContainer.MyWebView myWebView2 = BotWebViewContainer.MyWebView.this;
                BotWebViewContainer botWebViewContainer2 = myWebView2.botWebViewContainer;
                if (botWebViewContainer2 != null) {
                    botWebViewContainer2.onURLChanged(!myWebView2.canGoBack(), !myWebView2.canGoForward());
                }
                break;
            default:
                Browser.openUrl(BotWebViewContainer.MyWebView.this.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
        }
    }
}
