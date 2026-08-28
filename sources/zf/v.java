package zf;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v implements RequestDelegate {
    public final int f50729a;
    public final j0 f50730b;

    public v(j0 j0Var, int i9) {
        this.f50729a = i9;
        this.f50730b = j0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50729a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xf.o0(9, this.f50730b, tLObject));
                return;
            case 1:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                j0 j0Var = this.f50730b;
                if (z10) {
                    AndroidUtilities.runOnUIThread(j0Var.D0);
                    return;
                } else {
                    j0Var.getClass();
                    return;
                }
            default:
                j0.T(this.f50730b, tLObject, tL_error);
                return;
        }
    }
}
