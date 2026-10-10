package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class x3 implements Runnable {
    public final int f53413a;
    public final Utilities.Callback2 f53414b;

    public x3(int i10, Utilities.Callback2 callback2) {
        this.f53413a = i10;
        this.f53414b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f53413a) {
            case 0:
                FileLog.d("StarsController.buy onCanceled");
                AndroidUtilities.runOnUIThread(new x3(1, this.f53414b));
                return;
            case 1:
                this.f53414b.run(Boolean.FALSE, null);
                return;
            case 2:
                this.f53414b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            default:
                this.f53414b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
        }
    }
}
