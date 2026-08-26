package org.telegram.ui.web;

public final class BotWebViewContainer$$ExternalSyntheticLambda20 implements Runnable {
    public final int $r8$classId;
    public final String[] f$0;
    public final int f$1;
    public final BotWebViewContainer.MyWebView f$2;

    public BotWebViewContainer$$ExternalSyntheticLambda20(String[] strArr, int i, BotWebViewContainer.MyWebView myWebView, int i2) {
        this.$r8$classId = i2;
        this.f$0 = strArr;
        this.f$1 = i;
        this.f$2 = myWebView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                BotWebViewContainer.lambda$onEventReceived$17(this.f$0, this.f$1, this.f$2);
                break;
            default:
                BotWebViewContainer.lambda$onEventReceived$25(this.f$0, this.f$1, this.f$2);
                break;
        }
    }
}
