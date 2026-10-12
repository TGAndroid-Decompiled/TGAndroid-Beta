package zh;

import org.telegram.messenger.AndroidUtilities;
public final class e4 implements Runnable {
    public final int f50438a;
    public final rh.s f50439b;

    public e4(rh.s sVar, int i10) {
        this.f50438a = i10;
        this.f50439b = sVar;
    }

    @Override
    public final void run() {
        switch (this.f50438a) {
            case 0:
                this.f50439b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f50439b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new e4(this.f50439b, 3));
                return;
            default:
                this.f50439b.run(Boolean.FALSE, null);
                return;
        }
    }
}
