package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.fs0;
public final class q implements RequestDelegate {
    public final int f43207a;
    public final Utilities.Callback f43208b;
    public final Utilities.Callback f43209c;

    public q(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f43207a = i10;
        this.f43208b = callback;
        this.f43209c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43207a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fr0(tL_error, this.f43208b, this.f43209c, 26));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fs0(tL_error, this.f43208b, tLObject, this.f43209c, 25));
                return;
        }
    }
}
