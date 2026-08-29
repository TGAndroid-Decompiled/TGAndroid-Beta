package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.yw0;
public final class j2 implements RequestDelegate {
    public final int f45849a;
    public final k2 f45850b;

    public j2(k2 k2Var, int i10) {
        this.f45849a = i10;
        this.f45850b = k2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45849a) {
            case 0:
                p2 p2Var = this.f45850b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(p2Var.C).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new q1(p2Var, 17));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yw0(this.f45850b, tLObject, tL_error, 21));
                return;
        }
    }
}
