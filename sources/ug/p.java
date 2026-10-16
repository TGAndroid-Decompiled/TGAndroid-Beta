package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.yw0;
public final class p implements RequestDelegate {
    public final int f46372a;
    public final Utilities.Callback f46373b;
    public final Utilities.Callback f46374c;

    public p(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f46372a = i10;
        this.f46373b = callback;
        this.f46374c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46372a) {
            case 0:
                AndroidUtilities.runOnUIThread(new pi.g(tL_error, this.f46373b, this.f46374c, 10));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yw0(tL_error, this.f46373b, tLObject, this.f46374c));
                return;
        }
    }
}
