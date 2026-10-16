package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c90;
public final class g4 implements Runnable {
    public final int f50580a;
    public final c90 f50581b;

    public g4(c90 c90Var, int i10) {
        this.f50580a = i10;
        this.f50581b = c90Var;
    }

    @Override
    public final void run() {
        switch (this.f50580a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g4(this.f50581b, 3));
                return;
            case 1:
                this.f50581b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f50581b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f50581b.run(Boolean.FALSE, null);
                return;
        }
    }
}
