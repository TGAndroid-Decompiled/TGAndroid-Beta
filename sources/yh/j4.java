package yh;

import org.telegram.messenger.AndroidUtilities;
public final class j4 implements Runnable {
    public final int f47562a;
    public final ai.m0 f47563b;

    public j4(ai.m0 m0Var, int i10) {
        this.f47562a = i10;
        this.f47563b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f47562a) {
            case 0:
                this.f47563b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f47563b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new j4(this.f47563b, 3));
                return;
            default:
                this.f47563b.run(Boolean.FALSE, null);
                return;
        }
    }
}
