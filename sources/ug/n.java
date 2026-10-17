package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ay0;
public final class n implements RequestDelegate {
    public final int f47753a;
    public final Utilities.Callback f47754b;
    public final Utilities.Callback f47755c;

    public n(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f47753a = i10;
        this.f47754b = callback;
        this.f47755c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47753a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ay0(tL_error, this.f47754b, this.f47755c, 25));
                return;
            default:
                AndroidUtilities.runOnUIThread(new si.p(tL_error, this.f47754b, tLObject, this.f47755c, 1));
                return;
        }
    }
}
