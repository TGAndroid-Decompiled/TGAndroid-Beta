package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g90;
public final class g4 implements Runnable {
    public final int f52626a;
    public final g90 f52627b;

    public g4(g90 g90Var, int i10) {
        this.f52626a = i10;
        this.f52627b = g90Var;
    }

    @Override
    public final void run() {
        switch (this.f52626a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g4(this.f52627b, 3));
                return;
            case 1:
                this.f52627b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f52627b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f52627b.run(Boolean.FALSE, null);
                return;
        }
    }
}
