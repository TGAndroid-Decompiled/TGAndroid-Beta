package zh;

import org.telegram.messenger.AndroidUtilities;
public final class i4 implements Runnable {
    public final int f52062a;
    public final bi.f0 f52063b;

    public i4(bi.f0 f0Var, int i10) {
        this.f52062a = i10;
        this.f52063b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f52062a) {
            case 0:
                this.f52063b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f52063b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new i4(this.f52063b, 3));
                return;
            default:
                this.f52063b.run(Boolean.FALSE, null);
                return;
        }
    }
}
