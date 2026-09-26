package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p80;
public final class l4 implements Runnable {
    public final int f47658a;
    public final p80 f47659b;

    public l4(p80 p80Var, int i10) {
        this.f47658a = i10;
        this.f47659b = p80Var;
    }

    @Override
    public final void run() {
        switch (this.f47658a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(this.f47659b, 3));
                return;
            case 1:
                this.f47659b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f47659b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f47659b.run(Boolean.FALSE, null);
                return;
        }
    }
}
