package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cy0;
public final class o implements RequestDelegate {
    public final int f47744a;
    public final Utilities.Callback f47745b;
    public final Utilities.Callback f47746c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f47744a = i10;
        this.f47745b = callback;
        this.f47746c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47744a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cy0(tL_error, this.f47745b, this.f47746c, 25));
                return;
            default:
                AndroidUtilities.runOnUIThread(new si.o(tL_error, this.f47745b, tLObject, this.f47746c, 1));
                return;
        }
    }
}
