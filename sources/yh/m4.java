package yh;

import org.telegram.messenger.AndroidUtilities;
public final class m4 implements Runnable {
    public final int f47478a;
    public final ai.m0 f47479b;

    public m4(ai.m0 m0Var, int i10) {
        this.f47478a = i10;
        this.f47479b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f47478a) {
            case 0:
                this.f47479b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f47479b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new m4(this.f47479b, 3));
                return;
            default:
                this.f47479b.run(Boolean.FALSE, null);
                return;
        }
    }
}
