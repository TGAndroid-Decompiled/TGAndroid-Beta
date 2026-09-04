package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u4 implements RequestDelegate {
    public final int f52690a;
    public final s5 f52691b;

    public u4(s5 s5Var, int i10) {
        this.f52690a = i10;
        this.f52691b = s5Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52690a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y4(this.f52691b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new y4(this.f52691b, tLObject, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new y4(this.f52691b, tLObject, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new y4(this.f52691b, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new y4(this.f52691b, tLObject, 4));
                return;
        }
    }
}
