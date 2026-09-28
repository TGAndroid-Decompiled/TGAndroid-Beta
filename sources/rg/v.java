package rg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v implements RequestDelegate {
    public final int f42782a;
    public final j0 f42783b;

    public v(j0 j0Var, int i10) {
        this.f42782a = i10;
        this.f42783b = j0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42782a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.o1(17, this.f42783b, tLObject));
                return;
            case 1:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                j0 j0Var = this.f42783b;
                if (z10) {
                    AndroidUtilities.runOnUIThread(j0Var.H0);
                    return;
                } else {
                    j0Var.getClass();
                    return;
                }
            default:
                j0.U(this.f42783b, tLObject, tL_error);
                return;
        }
    }
}
