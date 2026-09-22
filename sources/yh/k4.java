package yh;

import org.telegram.messenger.AndroidUtilities;
public final class k4 implements Runnable {
    public final int f47664a;
    public final ai.m0 f47665b;

    public k4(ai.m0 m0Var, int i10) {
        this.f47664a = i10;
        this.f47665b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f47664a) {
            case 0:
                this.f47665b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f47665b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new k4(this.f47665b, 3));
                return;
            default:
                this.f47665b.run(Boolean.FALSE, null);
                return;
        }
    }
}
