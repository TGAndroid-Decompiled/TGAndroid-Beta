package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ss0;
public final class p implements RequestDelegate {
    public final int f46373a;
    public final Utilities.Callback f46374b;
    public final Utilities.Callback f46375c;

    public p(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f46373a = i10;
        this.f46374b = callback;
        this.f46375c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46373a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.webrtc.i(tL_error, this.f46374b, this.f46375c, 10));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ss0((Object) tL_error, (Object) this.f46374b, tLObject, (Object) this.f46375c, 25));
                return;
        }
    }
}
