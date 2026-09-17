package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.hs0;
public final class q implements RequestDelegate {
    public final int f43230a;
    public final Utilities.Callback f43231b;
    public final Utilities.Callback f43232c;

    public q(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f43230a = i10;
        this.f43231b = callback;
        this.f43232c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43230a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gr0(tL_error, this.f43231b, this.f43232c, 26));
                return;
            default:
                AndroidUtilities.runOnUIThread(new hs0(tL_error, this.f43231b, tLObject, this.f43232c, 25));
                return;
        }
    }
}
