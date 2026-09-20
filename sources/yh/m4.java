package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l80;
public final class m4 implements Runnable {
    public final int f47757a;
    public final l80 f47758b;

    public m4(l80 l80Var, int i10) {
        this.f47757a = i10;
        this.f47758b = l80Var;
    }

    @Override
    public final void run() {
        switch (this.f47757a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m4(this.f47758b, 3));
                return;
            case 1:
                this.f47758b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f47758b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f47758b.run(Boolean.FALSE, null);
                return;
        }
    }
}
