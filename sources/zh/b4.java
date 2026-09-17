package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class b4 implements Runnable {
    public final int f51743a;
    public final Utilities.Callback2 f51744b;

    public b4(int i10, Utilities.Callback2 callback2) {
        this.f51743a = i10;
        this.f51744b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f51743a) {
            case 0:
                FileLog.d("StarsController.buy onCanceled");
                AndroidUtilities.runOnUIThread(new b4(1, this.f51744b));
                return;
            case 1:
                this.f51744b.run(Boolean.FALSE, null);
                return;
            case 2:
                this.f51744b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            default:
                this.f51744b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
        }
    }
}
