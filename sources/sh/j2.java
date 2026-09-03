package sh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n71;
public final class j2 implements RequestDelegate {
    public final int f47510a;
    public final k2 f47511b;

    public j2(k2 k2Var, int i10) {
        this.f47510a = i10;
        this.f47511b = k2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47510a) {
            case 0:
                p2 p2Var = this.f47511b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(p2Var.D).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new q1(p2Var, 17));
                return;
            default:
                AndroidUtilities.runOnUIThread(new n71(this.f47511b, tLObject, tL_error, 23));
                return;
        }
    }
}
