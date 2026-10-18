package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ay0;
public final class o implements RequestDelegate {
    public final int f47734a;
    public final Utilities.Callback f47735b;
    public final Utilities.Callback f47736c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f47734a = i10;
        this.f47735b = callback;
        this.f47736c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47734a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ay0(tL_error, this.f47735b, this.f47736c, 25));
                return;
            default:
                AndroidUtilities.runOnUIThread(new si.o(tL_error, this.f47735b, tLObject, this.f47736c, 1));
                return;
        }
    }
}
