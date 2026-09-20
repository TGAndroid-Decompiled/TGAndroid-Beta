package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w4 implements RequestDelegate {
    public final int f48217a;
    public final u5 f48218b;

    public w4(u5 u5Var, int i10) {
        this.f48217a = i10;
        this.f48218b = u5Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48217a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a5(this.f48218b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new a5(this.f48218b, tLObject, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a5(this.f48218b, tLObject, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new a5(this.f48218b, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new a5(this.f48218b, tLObject, 4));
                return;
        }
    }
}
