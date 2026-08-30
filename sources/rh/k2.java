package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m71;
public final class k2 implements RequestDelegate {
    public final int f43579a;
    public final l2 f43580b;

    public k2(l2 l2Var, int i10) {
        this.f43579a = i10;
        this.f43580b = l2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43579a) {
            case 0:
                q2 q2Var = this.f43580b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(q2Var.D).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new r1(q2Var, 17));
                return;
            default:
                AndroidUtilities.runOnUIThread(new m71(this.f43580b, tLObject, tL_error, 23));
                return;
        }
    }
}
