package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class w3 implements Runnable {
    public final int f51269a;
    public final Utilities.Callback2 f51270b;

    public w3(int i10, Utilities.Callback2 callback2) {
        this.f51269a = i10;
        this.f51270b = callback2;
    }

    @Override
    public final void run() {
        switch (this.f51269a) {
            case 0:
                FileLog.d("StarsController.buy onCanceled");
                AndroidUtilities.runOnUIThread(new w3(1, this.f51270b));
                return;
            case 1:
                this.f51270b.run(Boolean.FALSE, null);
                return;
            case 2:
                this.f51270b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                return;
            default:
                this.f51270b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                return;
        }
    }
}
