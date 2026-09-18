package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.fs0;
public final class o implements RequestDelegate {
    public final int f43435a;
    public final Utilities.Callback f43436b;
    public final Utilities.Callback f43437c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f43435a = i10;
        this.f43436b = callback;
        this.f43437c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43435a) {
            case 0:
                AndroidUtilities.runOnUIThread(new dn0(tL_error, this.f43436b, this.f43437c, 29));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fs0(tL_error, this.f43436b, tLObject, this.f43437c, 25));
                return;
        }
    }
}
