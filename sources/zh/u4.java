package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u4 implements RequestDelegate {
    public final int f52721a;
    public final s5 f52722b;

    public u4(s5 s5Var, int i10) {
        this.f52721a = i10;
        this.f52722b = s5Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52721a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y4(this.f52722b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new y4(this.f52722b, tLObject, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new y4(this.f52722b, tLObject, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new y4(this.f52722b, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new y4(this.f52722b, tLObject, 4));
                return;
        }
    }
}
