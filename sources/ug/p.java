package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er0;
import org.telegram.ui.es0;
public final class p implements RequestDelegate {
    public final int f47187a;
    public final Utilities.Callback f47188b;
    public final Utilities.Callback f47189c;

    public p(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f47187a = i10;
        this.f47188b = callback;
        this.f47189c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47187a) {
            case 0:
                AndroidUtilities.runOnUIThread(new er0(tL_error, this.f47188b, this.f47189c, 27));
                return;
            default:
                AndroidUtilities.runOnUIThread(new es0(tL_error, this.f47188b, tLObject, this.f47189c, 25));
                return;
        }
    }
}
