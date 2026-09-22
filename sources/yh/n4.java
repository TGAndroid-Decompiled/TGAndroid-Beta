package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d80;
public final class n4 implements Runnable {
    public final int f47473a;
    public final d80 f47474b;

    public n4(d80 d80Var, int i10) {
        this.f47473a = i10;
        this.f47474b = d80Var;
    }

    @Override
    public final void run() {
        switch (this.f47473a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n4(this.f47474b, 3));
                return;
            case 1:
                this.f47474b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f47474b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f47474b.run(Boolean.FALSE, null);
                return;
        }
    }
}
