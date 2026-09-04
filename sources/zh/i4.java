package zh;

import org.telegram.messenger.AndroidUtilities;
public final class i4 implements Runnable {
    public final int f52031a;
    public final bi.f0 f52032b;

    public i4(bi.f0 f0Var, int i10) {
        this.f52031a = i10;
        this.f52032b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f52031a) {
            case 0:
                this.f52032b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 1:
                this.f52032b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new i4(this.f52032b, 3));
                return;
            default:
                this.f52032b.run(Boolean.FALSE, null);
                return;
        }
    }
}
