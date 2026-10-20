package sg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v implements RequestDelegate {
    public final int f46448a;
    public final k0 f46449b;

    public v(k0 k0Var, int i10) {
        this.f46448a = i10;
        this.f46449b = k0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46448a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p2.b(19, this.f46449b, tLObject));
                return;
            case 1:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                k0 k0Var = this.f46449b;
                if (z10) {
                    AndroidUtilities.runOnUIThread(k0Var.H0);
                    return;
                } else {
                    k0Var.getClass();
                    return;
                }
            default:
                k0.V(this.f46449b, tLObject, tL_error);
                return;
        }
    }
}
