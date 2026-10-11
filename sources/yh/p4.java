package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p4 implements RequestDelegate {
    public final int f53157a;
    public final n5 f53158b;

    public p4(n5 n5Var, int i10) {
        this.f53157a = i10;
        this.f53158b = n5Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53157a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t4(this.f53158b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new t4(this.f53158b, tLObject, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new t4(this.f53158b, tLObject, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new t4(this.f53158b, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t4(this.f53158b, tLObject, 4));
                return;
        }
    }
}
