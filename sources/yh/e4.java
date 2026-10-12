package yh;

import org.telegram.messenger.AndroidUtilities;
public final class e4 implements Runnable {
    public final int f52661a;
    public final qh.r f52662b;

    public e4(qh.r rVar, int i10) {
        this.f52661a = i10;
        this.f52662b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f52661a) {
            case 0:
                this.f52662b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f52662b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new e4(this.f52662b, 3));
                return;
            default:
                this.f52662b.run(Boolean.FALSE, null);
                return;
        }
    }
}
