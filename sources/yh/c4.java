package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class c4 implements Runnable {
    public final int f47270a;
    public final Utilities.Callback2 f47271b;

    public c4(int i10, Utilities.Callback2 callback2) {
        this.f47270a = i10;
        this.f47271b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f47270a) {
            case 0:
                FileLog.d("StarsController.buy onCanceled");
                AndroidUtilities.runOnUIThread(new c4(1, this.f47271b));
                return;
            case 1:
                this.f47271b.run(Boolean.FALSE, null);
                return;
            case 2:
                this.f47271b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            default:
                this.f47271b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
        }
    }
}
