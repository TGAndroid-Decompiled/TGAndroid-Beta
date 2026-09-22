package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x4 implements RequestDelegate {
    public final int f47931a;
    public final u5 f47932b;

    public x4(u5 u5Var, int i10) {
        this.f47931a = i10;
        this.f47932b = u5Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47931a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b5(this.f47932b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new b5(this.f47932b, tLObject, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new b5(this.f47932b, tLObject, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new b5(this.f47932b, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new b5(this.f47932b, tLObject, 4));
                return;
        }
    }
}
