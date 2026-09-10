package xh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class c4 implements Runnable {
    public final int f45314a;
    public final Utilities.Callback2 f45315b;

    public c4(int i10, Utilities.Callback2 callback2) {
        this.f45314a = i10;
        this.f45315b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f45314a) {
            case 0:
                FileLog.d("StarsController.buy onCanceled");
                AndroidUtilities.runOnUIThread(new c4(1, this.f45315b));
                return;
            case 1:
                this.f45315b.run(Boolean.FALSE, null);
                return;
            case 2:
                this.f45315b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            default:
                this.f45315b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
        }
    }
}
