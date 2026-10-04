package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zr0;
public final class o implements RequestDelegate {
    public final int f47070a;
    public final Utilities.Callback f47071b;
    public final Utilities.Callback f47072c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f47070a = i10;
        this.f47071b = callback;
        this.f47072c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47070a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(tL_error, this.f47071b, this.f47072c, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new zr0(tL_error, this.f47071b, tLObject, this.f47072c, 26));
                return;
        }
    }
}
