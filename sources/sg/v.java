package sg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v implements RequestDelegate {
    public final int f46324a;
    public final k0 f46325b;

    public v(k0 k0Var, int i10) {
        this.f46324a = i10;
        this.f46325b = k0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46324a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g1(18, this.f46325b, tLObject));
                return;
            case 1:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                k0 k0Var = this.f46325b;
                if (z10) {
                    AndroidUtilities.runOnUIThread(k0Var.H0);
                    return;
                } else {
                    k0Var.getClass();
                    return;
                }
            default:
                k0.U(this.f46325b, tLObject, tL_error);
                return;
        }
    }
}
