package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.q80;
public final class l4 implements Runnable {
    public final int f47659a;
    public final q80 f47660b;

    public l4(q80 q80Var, int i10) {
        this.f47659a = i10;
        this.f47660b = q80Var;
    }

    @Override
    public final void run() {
        switch (this.f47659a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(this.f47660b, 3));
                return;
            case 1:
                this.f47660b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f47660b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f47660b.run(Boolean.FALSE, null);
                return;
        }
    }
}
