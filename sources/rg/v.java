package rg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.f2;
public final class v implements RequestDelegate {
    public final int f47594a;
    public final j0 f47595b;

    public v(j0 j0Var, int i10) {
        this.f47594a = i10;
        this.f47595b = j0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47594a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f2(17, this.f47595b, tLObject));
                return;
            case 1:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                j0 j0Var = this.f47595b;
                if (z10) {
                    AndroidUtilities.runOnUIThread(j0Var.H0);
                    return;
                } else {
                    j0Var.getClass();
                    return;
                }
            default:
                j0.V(this.f47595b, tLObject, tL_error);
                return;
        }
    }
}
