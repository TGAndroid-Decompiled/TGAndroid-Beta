package rg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v implements RequestDelegate {
    public final int f42796a;
    public final j0 f42797b;

    public v(j0 j0Var, int i10) {
        this.f42796a = i10;
        this.f42797b = j0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42796a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g1(18, this.f42797b, tLObject));
                return;
            case 1:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                j0 j0Var = this.f42797b;
                if (z10) {
                    AndroidUtilities.runOnUIThread(j0Var.H0);
                    return;
                } else {
                    j0Var.getClass();
                    return;
                }
            default:
                j0.U(this.f42797b, tLObject, tL_error);
                return;
        }
    }
}
