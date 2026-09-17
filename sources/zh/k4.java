package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d80;
public final class k4 implements Runnable {
    public final int f52166a;
    public final d80 f52167b;

    public k4(d80 d80Var, int i10) {
        this.f52166a = i10;
        this.f52167b = d80Var;
    }

    @Override
    public final void run() {
        switch (this.f52166a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k4(this.f52167b, 3));
                return;
            case 1:
                this.f52167b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f52167b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f52167b.run(Boolean.FALSE, null);
                return;
        }
    }
}
