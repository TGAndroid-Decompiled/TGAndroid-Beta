package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class b4 implements Runnable {
    public final int f51712a;
    public final Utilities.Callback2 f51713b;

    public b4(int i10, Utilities.Callback2 callback2) {
        this.f51712a = i10;
        this.f51713b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f51712a) {
            case 0:
                FileLog.d("StarsController.buy onCanceled");
                AndroidUtilities.runOnUIThread(new b4(1, this.f51713b));
                return;
            case 1:
                this.f51713b.run(Boolean.FALSE, null);
                return;
            case 2:
                this.f51713b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            default:
                this.f51713b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
        }
    }
}
