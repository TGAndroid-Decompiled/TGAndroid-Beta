package xh;

import org.telegram.messenger.AndroidUtilities;
public final class j4 implements Runnable {
    public final int f45594a;
    public final bi.k6 f45595b;

    public j4(bi.k6 k6Var, int i10) {
        this.f45594a = i10;
        this.f45595b = k6Var;
    }

    @Override
    public final void run() {
        switch (this.f45594a) {
            case 0:
                this.f45595b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f45595b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new j4(this.f45595b, 3));
                return;
            default:
                this.f45595b.run(Boolean.FALSE, null);
                return;
        }
    }
}
