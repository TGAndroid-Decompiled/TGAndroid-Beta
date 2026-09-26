package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.jr0;
public final class o implements RequestDelegate {
    public final int f43463a;
    public final Utilities.Callback f43464b;
    public final Utilities.Callback f43465c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f43463a = i10;
        this.f43464b = callback;
        this.f43465c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43463a) {
            case 0:
                AndroidUtilities.runOnUIThread(new dn0(tL_error, this.f43464b, this.f43465c, 29));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jr0(tL_error, this.f43464b, tLObject, this.f43465c, 26));
                return;
        }
    }
}
