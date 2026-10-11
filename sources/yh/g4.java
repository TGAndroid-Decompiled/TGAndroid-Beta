package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f90;
public final class g4 implements Runnable {
    public final int f52706a;
    public final f90 f52707b;

    public g4(f90 f90Var, int i10) {
        this.f52706a = i10;
        this.f52707b = f90Var;
    }

    @Override
    public final void run() {
        switch (this.f52706a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g4(this.f52707b, 3));
                return;
            case 1:
                this.f52707b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f52707b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f52707b.run(Boolean.FALSE, null);
                return;
        }
    }
}
