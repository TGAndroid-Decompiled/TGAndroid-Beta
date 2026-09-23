package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.yr0;
public final class q implements RequestDelegate {
    public final int f43158a;
    public final Utilities.Callback f43159b;
    public final Utilities.Callback f43160c;

    public q(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f43158a = i10;
        this.f43159b = callback;
        this.f43160c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43158a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fr0(tL_error, this.f43159b, this.f43160c, 26));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yr0(tL_error, this.f43159b, tLObject, this.f43160c, 25));
                return;
        }
    }
}
