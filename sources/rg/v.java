package rg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.g2;
public final class v implements RequestDelegate {
    public final int f42827a;
    public final j0 f42828b;

    public v(j0 j0Var, int i10) {
        this.f42827a = i10;
        this.f42828b = j0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42827a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g2(15, this.f42828b, tLObject));
                return;
            case 1:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                j0 j0Var = this.f42828b;
                if (z10) {
                    AndroidUtilities.runOnUIThread(j0Var.H0);
                    return;
                } else {
                    j0Var.getClass();
                    return;
                }
            default:
                j0.U(this.f42828b, tLObject, tL_error);
                return;
        }
    }
}
