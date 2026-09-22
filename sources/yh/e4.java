package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class e4 implements Runnable {
    public final int f47059a;
    public final Utilities.Callback2 f47060b;

    public e4(int i10, Utilities.Callback2 callback2) {
        this.f47059a = i10;
        this.f47060b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f47059a) {
            case 0:
                FileLog.d("StarsController.buy onCanceled");
                AndroidUtilities.runOnUIThread(new e4(1, this.f47060b));
                return;
            case 1:
                this.f47060b.run(Boolean.FALSE, null);
                return;
            case 2:
                this.f47060b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            default:
                this.f47060b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
        }
    }
}
