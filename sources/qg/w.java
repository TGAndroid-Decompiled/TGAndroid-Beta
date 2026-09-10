package qg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w implements RequestDelegate {
    public final int f40952a;
    public final k0 f40953b;

    public w(k0 k0Var, int i10) {
        this.f40952a = i10;
        this.f40953b = k0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40952a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.x1(9, this.f40953b, tLObject));
                return;
            case 1:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                k0 k0Var = this.f40953b;
                if (z10) {
                    AndroidUtilities.runOnUIThread(k0Var.H0);
                    return;
                } else {
                    k0Var.getClass();
                    return;
                }
            default:
                k0.U(this.f40953b, tLObject, tL_error);
                return;
        }
    }
}
