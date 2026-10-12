package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.j90;
public final class g4 implements Runnable {
    public final int f52809a;
    public final j90 f52810b;

    public g4(j90 j90Var, int i10) {
        this.f52809a = i10;
        this.f52810b = j90Var;
    }

    @Override
    public final void run() {
        switch (this.f52809a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g4(this.f52810b, 3));
                return;
            case 1:
                this.f52810b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f52810b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f52810b.run(Boolean.FALSE, null);
                return;
        }
    }
}
