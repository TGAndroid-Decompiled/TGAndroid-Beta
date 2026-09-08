package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er0;
import org.telegram.ui.es0;
public final class p implements RequestDelegate {
    public final int f47214a;
    public final Utilities.Callback f47215b;
    public final Utilities.Callback f47216c;

    public p(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f47214a = i10;
        this.f47215b = callback;
        this.f47216c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47214a) {
            case 0:
                AndroidUtilities.runOnUIThread(new er0(tL_error, this.f47215b, this.f47216c, 27));
                return;
            default:
                AndroidUtilities.runOnUIThread(new es0(tL_error, this.f47215b, tLObject, this.f47216c, 25));
                return;
        }
    }
}
