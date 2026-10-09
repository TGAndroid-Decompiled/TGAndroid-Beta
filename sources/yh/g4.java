package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f90;
public final class g4 implements Runnable {
    public final int f52582a;
    public final f90 f52583b;

    public g4(f90 f90Var, int i10) {
        this.f52582a = i10;
        this.f52583b = f90Var;
    }

    @Override
    public final void run() {
        switch (this.f52582a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g4(this.f52583b, 3));
                return;
            case 1:
                this.f52583b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f52583b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f52583b.run(Boolean.FALSE, null);
                return;
        }
    }
}
