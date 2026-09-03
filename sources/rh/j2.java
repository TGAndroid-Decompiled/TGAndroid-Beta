package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m71;
public final class j2 implements RequestDelegate {
    public final int f43631a;
    public final k2 f43632b;

    public j2(k2 k2Var, int i10) {
        this.f43631a = i10;
        this.f43632b = k2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43631a) {
            case 0:
                p2 p2Var = this.f43632b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(p2Var.D).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new q1(p2Var, 17));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m71(this.f43632b, tLObject, tL_error, 22));
                return;
        }
    }
}
