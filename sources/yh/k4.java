package yh;

import org.telegram.messenger.AndroidUtilities;
public final class k4 implements Runnable {
    public final int f47604a;
    public final ai.m0 f47605b;

    public k4(ai.m0 m0Var, int i10) {
        this.f47604a = i10;
        this.f47605b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f47604a) {
            case 0:
                this.f47605b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f47605b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new k4(this.f47605b, 3));
                return;
            default:
                this.f47605b.run(Boolean.FALSE, null);
                return;
        }
    }
}
