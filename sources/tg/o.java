package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.en0;
import org.telegram.ui.zr0;
public final class o implements RequestDelegate {
    public final int f43510a;
    public final Utilities.Callback f43511b;
    public final Utilities.Callback f43512c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f43510a = i10;
        this.f43511b = callback;
        this.f43512c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43510a) {
            case 0:
                AndroidUtilities.runOnUIThread(new en0(tL_error, this.f43511b, this.f43512c, 29));
                return;
            default:
                AndroidUtilities.runOnUIThread(new zr0(tL_error, this.f43511b, tLObject, this.f43512c, 26));
                return;
        }
    }
}
