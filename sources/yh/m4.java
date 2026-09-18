package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m80;
public final class m4 implements Runnable {
    public final int f47715a;
    public final m80 f47716b;

    public m4(m80 m80Var, int i10) {
        this.f47715a = i10;
        this.f47716b = m80Var;
    }

    @Override
    public final void run() {
        switch (this.f47715a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m4(this.f47716b, 3));
                return;
            case 1:
                this.f47716b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f47716b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f47716b.run(Boolean.FALSE, null);
                return;
        }
    }
}
