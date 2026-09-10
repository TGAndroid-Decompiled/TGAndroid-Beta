package xh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n80;
public final class l4 implements Runnable {
    public final int f45660a;
    public final n80 f45661b;

    public l4(n80 n80Var, int i10) {
        this.f45660a = i10;
        this.f45661b = n80Var;
    }

    @Override
    public final void run() {
        switch (this.f45660a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(this.f45661b, 3));
                return;
            case 1:
                this.f45661b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f45661b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f45661b.run(Boolean.FALSE, null);
                return;
        }
    }
}
