package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zr0;
public final class o implements RequestDelegate {
    public final int f47085a;
    public final Utilities.Callback f47086b;
    public final Utilities.Callback f47087c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f47085a = i10;
        this.f47086b = callback;
        this.f47087c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47085a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q(tL_error, this.f47086b, this.f47087c, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new zr0(tL_error, this.f47086b, tLObject, this.f47087c, 26));
                return;
        }
    }
}
