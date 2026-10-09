package rg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v implements RequestDelegate {
    public final int f47470a;
    public final j0 f47471b;

    public v(j0 j0Var, int i10) {
        this.f47470a = i10;
        this.f47471b = j0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47470a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.w1(15, this.f47471b, tLObject));
                return;
            case 1:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                j0 j0Var = this.f47471b;
                if (z10) {
                    AndroidUtilities.runOnUIThread(j0Var.H0);
                    return;
                } else {
                    j0Var.getClass();
                    return;
                }
            default:
                j0.V(this.f47471b, tLObject, tL_error);
                return;
        }
    }
}
