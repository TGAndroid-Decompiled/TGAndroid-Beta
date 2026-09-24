package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.wr0;
public final class o implements RequestDelegate {
    public final int f43450a;
    public final Utilities.Callback f43451b;
    public final Utilities.Callback f43452c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f43450a = i10;
        this.f43451b = callback;
        this.f43452c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43450a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cn0(tL_error, this.f43451b, this.f43452c, 29));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wr0(tL_error, this.f43451b, tLObject, this.f43452c, 25));
                return;
        }
    }
}
