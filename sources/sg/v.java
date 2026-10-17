package sg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v implements RequestDelegate {
    public final int f46466a;
    public final j0 f46467b;

    public v(j0 j0Var, int i10) {
        this.f46466a = i10;
        this.f46467b = j0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46466a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p2.b(17, this.f46467b, tLObject));
                return;
            case 1:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                j0 j0Var = this.f46467b;
                if (z10) {
                    AndroidUtilities.runOnUIThread(j0Var.H0);
                    return;
                } else {
                    j0Var.getClass();
                    return;
                }
            default:
                j0.V(this.f46467b, tLObject, tL_error);
                return;
        }
    }
}
