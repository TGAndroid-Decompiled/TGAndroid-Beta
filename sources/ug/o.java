package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ay0;
public final class o implements RequestDelegate {
    public final int f47781a;
    public final Utilities.Callback f47782b;
    public final Utilities.Callback f47783c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f47781a = i10;
        this.f47782b = callback;
        this.f47783c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47781a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ay0(tL_error, this.f47782b, this.f47783c, 25));
                return;
            default:
                AndroidUtilities.runOnUIThread(new si.p(tL_error, this.f47782b, tLObject, this.f47783c, 1));
                return;
        }
    }
}
