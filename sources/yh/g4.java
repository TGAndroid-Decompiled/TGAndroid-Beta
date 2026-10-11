package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g90;
public final class g4 implements Runnable {
    public final int f52672a;
    public final g90 f52673b;

    public g4(g90 g90Var, int i10) {
        this.f52672a = i10;
        this.f52673b = g90Var;
    }

    @Override
    public final void run() {
        switch (this.f52672a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g4(this.f52673b, 3));
                return;
            case 1:
                this.f52673b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f52673b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f52673b.run(Boolean.FALSE, null);
                return;
        }
    }
}
