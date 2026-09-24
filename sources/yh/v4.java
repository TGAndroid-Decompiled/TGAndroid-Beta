package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v4 implements RequestDelegate {
    public final int f48138a;
    public final t5 f48139b;

    public v4(t5 t5Var, int i10) {
        this.f48138a = i10;
        this.f48139b = t5Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48138a) {
            case 0:
                AndroidUtilities.runOnUIThread(new z4(this.f48139b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new z4(this.f48139b, tLObject, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new z4(this.f48139b, tLObject, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new z4(this.f48139b, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new z4(this.f48139b, tLObject, 4));
                return;
        }
    }
}
