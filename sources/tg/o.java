package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.gs0;
public final class o implements RequestDelegate {
    public final int f48623a;
    public final Utilities.Callback f48624b;
    public final Utilities.Callback f48625c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f48623a = i10;
        this.f48624b = callback;
        this.f48625c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48623a) {
            case 0:
                AndroidUtilities.runOnUIThread(new pi.i(tL_error, this.f48624b, this.f48625c, 6));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gs0(tL_error, this.f48624b, tLObject, this.f48625c, 26));
                return;
        }
    }
}
