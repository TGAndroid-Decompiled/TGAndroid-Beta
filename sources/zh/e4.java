package zh;

import org.telegram.messenger.AndroidUtilities;
public final class e4 implements Runnable {
    public final int f50439a;
    public final rh.r f50440b;

    public e4(rh.r rVar, int i10) {
        this.f50439a = i10;
        this.f50440b = rVar;
    }

    @Override
    public final void run() {
        switch (this.f50439a) {
            case 0:
                this.f50440b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f50440b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new e4(this.f50440b, 3));
                return;
            default:
                this.f50440b.run(Boolean.FALSE, null);
                return;
        }
    }
}
