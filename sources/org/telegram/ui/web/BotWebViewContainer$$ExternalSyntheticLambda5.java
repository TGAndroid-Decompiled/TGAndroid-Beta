package org.telegram.ui.web;

public final class BotWebViewContainer$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final BotWebViewContainer f$0;

    public BotWebViewContainer$$ExternalSyntheticLambda5(BotWebViewContainer botWebViewContainer, int i) {
        this.$r8$classId = i;
        this.f$0 = botWebViewContainer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$reload$1();
                break;
            case 1:
                this.f$0.lambda$onEventReceived$46();
                break;
            case 2:
                this.f$0.lambda$onEventReceived$26();
                break;
            default:
                this.f$0.lambda$new$59();
                break;
        }
    }
}
