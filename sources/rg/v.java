package rg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.f2;
public final class v implements RequestDelegate {
    public final int f47560a;
    public final j0 f47561b;

    public v(j0 j0Var, int i10) {
        this.f47560a = i10;
        this.f47561b = j0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47560a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f2(17, this.f47561b, tLObject));
                return;
            case 1:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                j0 j0Var = this.f47561b;
                if (z10) {
                    AndroidUtilities.runOnUIThread(j0Var.H0);
                    return;
                } else {
                    j0Var.getClass();
                    return;
                }
            default:
                j0.V(this.f47561b, tLObject, tL_error);
                return;
        }
    }
}
