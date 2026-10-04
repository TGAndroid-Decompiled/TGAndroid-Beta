package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r80;
public final class l4 implements Runnable {
    public final int f51577a;
    public final r80 f51578b;

    public l4(r80 r80Var, int i10) {
        this.f51577a = i10;
        this.f51578b = r80Var;
    }

    @Override
    public final void run() {
        switch (this.f51577a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l4(this.f51578b, 3));
                return;
            case 1:
                this.f51578b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f51578b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f51578b.run(Boolean.FALSE, null);
                return;
        }
    }
}
