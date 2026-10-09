package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.rr0;
public final class o implements RequestDelegate {
    public final int f48382a;
    public final Utilities.Callback f48383b;
    public final Utilities.Callback f48384c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f48382a = i10;
        this.f48383b = callback;
        this.f48384c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48382a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(tL_error, this.f48383b, this.f48384c, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new rr0(tL_error, this.f48383b, tLObject, this.f48384c, 26));
                return;
        }
    }
}
