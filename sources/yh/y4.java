package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y4 implements RequestDelegate {
    public final int f48024a;
    public final v5 f48025b;

    public y4(v5 v5Var, int i10) {
        this.f48024a = i10;
        this.f48025b = v5Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48024a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c5(this.f48025b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new c5(this.f48025b, tLObject, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new c5(this.f48025b, tLObject, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new c5(this.f48025b, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c5(this.f48025b, tLObject, 4));
                return;
        }
    }
}
