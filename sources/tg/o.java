package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ds0;
public final class o implements RequestDelegate {
    public final int f48455a;
    public final Utilities.Callback f48456b;
    public final Utilities.Callback f48457c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f48455a = i10;
        this.f48456b = callback;
        this.f48457c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48455a) {
            case 0:
                AndroidUtilities.runOnUIThread(new pi.h(tL_error, this.f48456b, this.f48457c, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ds0(tL_error, this.f48456b, tLObject, this.f48457c, 26));
                return;
        }
    }
}
