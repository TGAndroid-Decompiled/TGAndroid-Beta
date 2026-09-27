package yh;

import org.telegram.messenger.AndroidUtilities;
public final class j4 implements Runnable {
    public final int f47618a;
    public final ai.m0 f47619b;

    public j4(ai.m0 m0Var, int i10) {
        this.f47618a = i10;
        this.f47619b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f47618a) {
            case 0:
                this.f47619b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f47619b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new j4(this.f47619b, 3));
                return;
            default:
                this.f47619b.run(Boolean.FALSE, null);
                return;
        }
    }
}
