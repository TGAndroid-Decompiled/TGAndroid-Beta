package vg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oy0;
import sg.g2;
public final class p implements RequestDelegate {
    public final int f50275a;
    public final Utilities.Callback f50276b;
    public final Utilities.Callback f50277c;

    public p(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f50275a = i10;
        this.f50276b = callback;
        this.f50277c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50275a) {
            case 0:
                AndroidUtilities.runOnUIThread(new oy0(tL_error, this.f50276b, this.f50277c, 22));
                return;
            default:
                AndroidUtilities.runOnUIThread(new g2(tL_error, this.f50276b, tLObject, this.f50277c, 3));
                return;
        }
    }
}
