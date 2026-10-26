package vg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ny0;
import sg.h2;
public final class p implements RequestDelegate {
    public final int f50240a;
    public final Utilities.Callback f50241b;
    public final Utilities.Callback f50242c;

    public p(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f50240a = i10;
        this.f50241b = callback;
        this.f50242c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50240a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ny0(tL_error, this.f50241b, this.f50242c, 22));
                return;
            default:
                AndroidUtilities.runOnUIThread(new h2(tL_error, this.f50241b, tLObject, this.f50242c, 3));
                return;
        }
    }
}
