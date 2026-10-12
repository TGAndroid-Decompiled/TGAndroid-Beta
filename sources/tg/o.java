package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.gs0;
public final class o implements RequestDelegate {
    public final int f48596a;
    public final Utilities.Callback f48597b;
    public final Utilities.Callback f48598c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f48596a = i10;
        this.f48597b = callback;
        this.f48598c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48596a) {
            case 0:
                AndroidUtilities.runOnUIThread(new pi.h(tL_error, this.f48597b, this.f48598c, 7));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gs0(tL_error, this.f48597b, tLObject, this.f48598c, 26));
                return;
        }
    }
}
