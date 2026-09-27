package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.q80;
public final class l4 implements Runnable {
    public final int f47736a;
    public final q80 f47737b;

    public l4(q80 q80Var, int i10) {
        this.f47736a = i10;
        this.f47737b = q80Var;
    }

    @Override
    public final void run() {
        switch (this.f47736a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(this.f47737b, 3));
                return;
            case 1:
                this.f47737b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f47737b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f47737b.run(Boolean.FALSE, null);
                return;
        }
    }
}
