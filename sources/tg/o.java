package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zr0;
public final class o implements RequestDelegate {
    public final int f47069a;
    public final Utilities.Callback f47070b;
    public final Utilities.Callback f47071c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f47069a = i10;
        this.f47070b = callback;
        this.f47071c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47069a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(tL_error, this.f47070b, this.f47071c, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new zr0(tL_error, this.f47070b, tLObject, this.f47071c, 26));
                return;
        }
    }
}
