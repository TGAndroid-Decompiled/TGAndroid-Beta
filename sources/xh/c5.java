package xh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tx0;
public final class c5 implements RequestDelegate {
    public final int f45316a;
    public final Utilities.Callback f45317b;

    public c5(int i10, Utilities.Callback callback) {
        this.f45316a = i10;
        this.f45317b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45316a) {
            case 0:
                AndroidUtilities.runOnUIThread(new tx0(tLObject, this.f45317b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yg.q(13, this.f45317b, tL_error));
                return;
        }
    }
}
