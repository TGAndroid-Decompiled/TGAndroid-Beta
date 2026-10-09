package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p4 implements RequestDelegate {
    public final int f53036a;
    public final m5 f53037b;

    public p4(m5 m5Var, int i10) {
        this.f53036a = i10;
        this.f53037b = m5Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53036a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t4(this.f53037b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new t4(this.f53037b, tLObject, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new t4(this.f53037b, tLObject, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new t4(this.f53037b, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t4(this.f53037b, tLObject, 4));
                return;
        }
    }
}
