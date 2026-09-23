package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w4 implements RequestDelegate {
    public final int f47864a;
    public final t5 f47865b;

    public w4(t5 t5Var, int i10) {
        this.f47864a = i10;
        this.f47865b = t5Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47864a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a5(this.f47865b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new a5(this.f47865b, tLObject, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a5(this.f47865b, tLObject, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new a5(this.f47865b, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new a5(this.f47865b, tLObject, 4));
                return;
        }
    }
}
