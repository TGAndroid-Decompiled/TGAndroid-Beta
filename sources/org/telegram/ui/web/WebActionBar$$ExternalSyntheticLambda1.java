package org.telegram.ui.web;

public final class WebActionBar$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final WebActionBar f$0;

    public WebActionBar$$ExternalSyntheticLambda1(WebActionBar webActionBar, int i) {
        this.$r8$classId = i;
        this.f$0 = webActionBar;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$3();
                break;
            case 1:
                this.f$0.showAddressKeyboard();
                break;
            default:
                this.f$0.lambda$new$11();
                break;
        }
    }
}
