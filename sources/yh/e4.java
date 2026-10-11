package yh;

import org.telegram.messenger.AndroidUtilities;
public final class e4 implements Runnable {
    public final int f52518a;
    public final qh.r f52519b;

    public e4(qh.r rVar, int i10) {
        this.f52518a = i10;
        this.f52519b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f52518a) {
            case 0:
                this.f52519b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f52519b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new e4(this.f52519b, 3));
                return;
            default:
                this.f52519b.run(Boolean.FALSE, null);
                return;
        }
    }
}
