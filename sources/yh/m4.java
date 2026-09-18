package yh;

import org.telegram.messenger.AndroidUtilities;
public final class m4 implements Runnable {
    public final int f47483a;
    public final ai.m0 f47484b;

    public m4(ai.m0 m0Var, int i10) {
        this.f47483a = i10;
        this.f47484b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f47483a) {
            case 0:
                this.f47484b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f47484b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new m4(this.f47484b, 3));
                return;
            default:
                this.f47484b.run(Boolean.FALSE, null);
                return;
        }
    }
}
