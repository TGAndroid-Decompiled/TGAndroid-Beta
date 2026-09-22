package yh;

import org.telegram.messenger.AndroidUtilities;
public final class l4 implements Runnable {
    public final int f47359a;
    public final ai.m0 f47360b;

    public l4(ai.m0 m0Var, int i10) {
        this.f47359a = i10;
        this.f47360b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f47359a) {
            case 0:
                this.f47360b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f47360b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new l4(this.f47360b, 3));
                return;
            default:
                this.f47360b.run(Boolean.FALSE, null);
                return;
        }
    }
}
