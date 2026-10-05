package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r80;
public final class m4 implements Runnable {
    public final int f51650a;
    public final r80 f51651b;

    public m4(r80 r80Var, int i10) {
        this.f51650a = i10;
        this.f51651b = r80Var;
    }

    @Override
    public final void run() {
        switch (this.f51650a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m4(this.f51651b, 3));
                return;
            case 1:
                this.f51651b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f51651b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f51651b.run(Boolean.FALSE, null);
                return;
        }
    }
}
