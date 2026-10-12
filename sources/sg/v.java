package sg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v implements RequestDelegate {
    public final int f45374a;
    public final j0 f45375b;

    public v(j0 j0Var, int i10) {
        this.f45374a = i10;
        this.f45375b = j0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45374a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s9.b(1, this.f45375b, tLObject));
                return;
            case 1:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                j0 j0Var = this.f45375b;
                if (z10) {
                    AndroidUtilities.runOnUIThread(j0Var.H0);
                    return;
                } else {
                    j0Var.getClass();
                    return;
                }
            default:
                j0.V(this.f45375b, tLObject, tL_error);
                return;
        }
    }
}
