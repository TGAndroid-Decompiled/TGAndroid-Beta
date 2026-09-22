package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.en0;
import org.telegram.ui.fs0;
public final class o implements RequestDelegate {
    public final int f43500a;
    public final Utilities.Callback f43501b;
    public final Utilities.Callback f43502c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f43500a = i10;
        this.f43501b = callback;
        this.f43502c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43500a) {
            case 0:
                AndroidUtilities.runOnUIThread(new en0(tL_error, this.f43501b, this.f43502c, 29));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fs0(tL_error, this.f43501b, tLObject, this.f43502c, 25));
                return;
        }
    }
}
