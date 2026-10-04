package yh;

import org.telegram.messenger.AndroidUtilities;
public final class j4 implements Runnable {
    public final int f51471a;
    public final ai.m0 f51472b;

    public j4(ai.m0 m0Var, int i10) {
        this.f51471a = i10;
        this.f51472b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f51471a) {
            case 0:
                this.f51472b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f51472b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new j4(this.f51472b, 3));
                return;
            default:
                this.f51472b.run(Boolean.FALSE, null);
                return;
        }
    }
}
