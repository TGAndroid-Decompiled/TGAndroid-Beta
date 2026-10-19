package sg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v implements RequestDelegate {
    public final int f46443a;
    public final k0 f46444b;

    public v(k0 k0Var, int i10) {
        this.f46443a = i10;
        this.f46444b = k0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46443a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p2.b(17, this.f46444b, tLObject));
                return;
            case 1:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                k0 k0Var = this.f46444b;
                if (z10) {
                    AndroidUtilities.runOnUIThread(k0Var.H0);
                    return;
                } else {
                    k0Var.getClass();
                    return;
                }
            default:
                k0.V(this.f46444b, tLObject, tL_error);
                return;
        }
    }
}
