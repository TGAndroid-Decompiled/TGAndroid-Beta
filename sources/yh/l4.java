package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.q80;
public final class l4 implements Runnable {
    public final int f47661a;
    public final q80 f47662b;

    public l4(q80 q80Var, int i10) {
        this.f47661a = i10;
        this.f47662b = q80Var;
    }

    @Override
    public final void run() {
        switch (this.f47661a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(this.f47662b, 3));
                return;
            case 1:
                this.f47662b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f47662b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f47662b.run(Boolean.FALSE, null);
                return;
        }
    }
}
