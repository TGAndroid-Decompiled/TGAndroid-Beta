package xh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v4 implements RequestDelegate {
    public final int f46174a;
    public final v5 f46175b;

    public v4(v5 v5Var, int i10) {
        this.f46174a = i10;
        this.f46175b = v5Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46174a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a5(this.f46175b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new a5(this.f46175b, tLObject, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a5(this.f46175b, tLObject, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new a5(this.f46175b, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new a5(this.f46175b, tLObject, 4));
                return;
        }
    }
}
