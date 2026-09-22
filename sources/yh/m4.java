package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.o80;
public final class m4 implements Runnable {
    public final int f47778a;
    public final o80 f47779b;

    public m4(o80 o80Var, int i10) {
        this.f47778a = i10;
        this.f47779b = o80Var;
    }

    @Override
    public final void run() {
        switch (this.f47778a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m4(this.f47779b, 3));
                return;
            case 1:
                this.f47779b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            case 2:
                this.f47779b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
            default:
                this.f47779b.run(Boolean.FALSE, null);
                return;
        }
    }
}
