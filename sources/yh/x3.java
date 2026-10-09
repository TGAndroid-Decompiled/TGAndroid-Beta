package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class x3 implements Runnable {
    public final int f53367a;
    public final Utilities.Callback2 f53368b;

    public x3(int i10, Utilities.Callback2 callback2) {
        this.f53367a = i10;
        this.f53368b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f53367a) {
            case 0:
                FileLog.d("StarsController.buy onCanceled");
                AndroidUtilities.runOnUIThread(new x3(1, this.f53368b));
                return;
            case 1:
                this.f53368b.run(Boolean.FALSE, null);
                return;
            case 2:
                this.f53368b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            default:
                this.f53368b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
        }
    }
}
