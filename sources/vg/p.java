package vg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ny0;
import sg.h2;
public final class p implements RequestDelegate {
    public final int f50237a;
    public final Utilities.Callback f50238b;
    public final Utilities.Callback f50239c;

    public p(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f50237a = i10;
        this.f50238b = callback;
        this.f50239c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50237a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ny0(tL_error, this.f50238b, this.f50239c, 22));
                return;
            default:
                AndroidUtilities.runOnUIThread(new h2(tL_error, this.f50238b, tLObject, this.f50239c, 3));
                return;
        }
    }
}
