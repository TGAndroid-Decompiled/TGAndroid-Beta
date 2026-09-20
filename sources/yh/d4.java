package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class d4 implements Runnable {
    public final int f47339a;
    public final Utilities.Callback2 f47340b;

    public d4(int i10, Utilities.Callback2 callback2) {
        this.f47339a = i10;
        this.f47340b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f47339a) {
            case 0:
                FileLog.d("StarsController.buy onCanceled");
                AndroidUtilities.runOnUIThread(new d4(1, this.f47340b));
                return;
            case 1:
                this.f47340b.run(Boolean.FALSE, null);
                return;
            case 2:
                this.f47340b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            default:
                this.f47340b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
        }
    }
}
