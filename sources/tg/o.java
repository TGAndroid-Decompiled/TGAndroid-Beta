package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ds0;
public final class o implements RequestDelegate {
    public final int f48489a;
    public final Utilities.Callback f48490b;
    public final Utilities.Callback f48491c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f48489a = i10;
        this.f48490b = callback;
        this.f48491c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48489a) {
            case 0:
                AndroidUtilities.runOnUIThread(new pi.h(tL_error, this.f48490b, this.f48491c, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ds0(tL_error, this.f48490b, tLObject, this.f48491c, 26));
                return;
        }
    }
}
