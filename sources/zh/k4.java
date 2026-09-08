package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d80;
public final class k4 implements Runnable {
    public final int f52165a;
    public final d80 f52166b;

    public k4(d80 d80Var, int i10) {
        this.f52165a = i10;
        this.f52166b = d80Var;
    }

    @Override
    public final void run() {
        switch (this.f52165a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k4(this.f52166b, 3));
                return;
            case 1:
                this.f52166b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f52166b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f52166b.run(Boolean.FALSE, null);
                return;
        }
    }
}
