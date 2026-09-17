package zh;

import org.telegram.messenger.AndroidUtilities;
public final class i4 implements Runnable {
    public final int f52032a;
    public final bi.f0 f52033b;

    public i4(bi.f0 f0Var, int i10) {
        this.f52032a = i10;
        this.f52033b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f52032a) {
            case 0:
                this.f52033b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f52033b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new i4(this.f52033b, 3));
                return;
            default:
                this.f52033b.run(Boolean.FALSE, null);
                return;
        }
    }
}
