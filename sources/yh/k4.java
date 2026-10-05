package yh;

import org.telegram.messenger.AndroidUtilities;
public final class k4 implements Runnable {
    public final int f51540a;
    public final ai.m0 f51541b;

    public k4(ai.m0 m0Var, int i10) {
        this.f51540a = i10;
        this.f51541b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f51540a) {
            case 0:
                this.f51541b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f51541b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new k4(this.f51541b, 3));
                return;
            default:
                this.f51541b.run(Boolean.FALSE, null);
                return;
        }
    }
}
