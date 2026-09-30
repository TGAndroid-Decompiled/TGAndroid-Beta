package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r80;
public final class l4 implements Runnable {
    public final int f47767a;
    public final r80 f47768b;

    public l4(r80 r80Var, int i10) {
        this.f47767a = i10;
        this.f47768b = r80Var;
    }

    @Override
    public final void run() {
        switch (this.f47767a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(this.f47768b, 3));
                return;
            case 1:
                this.f47768b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f47768b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f47768b.run(Boolean.FALSE, null);
                return;
        }
    }
}
