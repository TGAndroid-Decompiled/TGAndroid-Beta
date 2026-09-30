package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.jr0;
public final class o implements RequestDelegate {
    public final int f43572a;
    public final Utilities.Callback f43573b;
    public final Utilities.Callback f43574c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f43572a = i10;
        this.f43573b = callback;
        this.f43574c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43572a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fn0(tL_error, this.f43573b, this.f43574c, 29));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jr0(tL_error, this.f43573b, tLObject, this.f43574c, 26));
                return;
        }
    }
}
