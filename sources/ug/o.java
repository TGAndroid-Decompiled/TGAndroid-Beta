package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.by0;
public final class o implements RequestDelegate {
    public final int f47736a;
    public final Utilities.Callback f47737b;
    public final Utilities.Callback f47738c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f47736a = i10;
        this.f47737b = callback;
        this.f47738c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47736a) {
            case 0:
                AndroidUtilities.runOnUIThread(new by0(tL_error, this.f47737b, this.f47738c, 25));
                return;
            default:
                AndroidUtilities.runOnUIThread(new si.o(tL_error, this.f47737b, tLObject, this.f47738c, 1));
                return;
        }
    }
}
