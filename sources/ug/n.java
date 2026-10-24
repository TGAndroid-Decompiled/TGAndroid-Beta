package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ey0;
public final class n implements RequestDelegate {
    public final int f48177a;
    public final Utilities.Callback f48178b;
    public final Utilities.Callback f48179c;

    public n(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f48177a = i10;
        this.f48178b = callback;
        this.f48179c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48177a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ey0(tL_error, this.f48178b, this.f48179c, 25));
                return;
            default:
                AndroidUtilities.runOnUIThread(new si.o(tL_error, this.f48178b, tLObject, this.f48179c, 1));
                return;
        }
    }
}
