package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e80;
public final class m4 implements Runnable {
    public final int f47408a;
    public final e80 f47409b;

    public m4(e80 e80Var, int i10) {
        this.f47408a = i10;
        this.f47409b = e80Var;
    }

    @Override
    public final void run() {
        switch (this.f47408a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m4(this.f47409b, 3));
                return;
            case 1:
                this.f47409b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f47409b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f47409b.run(Boolean.FALSE, null);
                return;
        }
    }
}
