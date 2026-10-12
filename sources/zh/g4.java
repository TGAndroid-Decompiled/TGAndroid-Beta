package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d90;
public final class g4 implements Runnable {
    public final int f50579a;
    public final d90 f50580b;

    public g4(d90 d90Var, int i10) {
        this.f50579a = i10;
        this.f50580b = d90Var;
    }

    @Override
    public final void run() {
        switch (this.f50579a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g4(this.f50580b, 3));
                return;
            case 1:
                this.f50580b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f50580b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f50580b.run(Boolean.FALSE, null);
                return;
        }
    }
}
