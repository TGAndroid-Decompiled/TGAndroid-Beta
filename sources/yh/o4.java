package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d80;
public final class o4 implements Runnable {
    public final int f47600a;
    public final d80 f47601b;

    public o4(d80 d80Var, int i10) {
        this.f47600a = i10;
        this.f47601b = d80Var;
    }

    @Override
    public final void run() {
        switch (this.f47600a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o4(this.f47601b, 3));
                return;
            case 1:
                this.f47601b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f47601b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f47601b.run(Boolean.FALSE, null);
                return;
        }
    }
}
