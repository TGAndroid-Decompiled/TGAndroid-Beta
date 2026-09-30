package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v4 implements RequestDelegate {
    public final int f48151a;
    public final t5 f48152b;

    public v4(t5 t5Var, int i10) {
        this.f48151a = i10;
        this.f48152b = t5Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48151a) {
            case 0:
                AndroidUtilities.runOnUIThread(new z4(this.f48152b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new z4(this.f48152b, tLObject, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new z4(this.f48152b, tLObject, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new z4(this.f48152b, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new z4(this.f48152b, tLObject, 4));
                return;
        }
    }
}
