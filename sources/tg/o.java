package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.fs0;
public final class o implements RequestDelegate {
    public final int f43479a;
    public final Utilities.Callback f43480b;
    public final Utilities.Callback f43481c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f43479a = i10;
        this.f43480b = callback;
        this.f43481c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43479a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cn0(tL_error, this.f43480b, this.f43481c, 29));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fs0(tL_error, this.f43480b, tLObject, this.f43481c, 25));
                return;
        }
    }
}
