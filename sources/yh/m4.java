package yh;

import org.telegram.messenger.AndroidUtilities;
public final class m4 implements Runnable {
    public final int f47455a;
    public final ai.m0 f47456b;

    public m4(ai.m0 m0Var, int i10) {
        this.f47455a = i10;
        this.f47456b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f47455a) {
            case 0:
                this.f47456b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f47456b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new m4(this.f47456b, 3));
                return;
            default:
                this.f47456b.run(Boolean.FALSE, null);
                return;
        }
    }
}
