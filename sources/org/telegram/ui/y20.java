package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class y20 implements Utilities.Callback2 {
    public final int f40359a;
    public final c60 f40360b;

    public y20(c60 c60Var, int i10) {
        this.f40359a = i10;
        this.f40360b = c60Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f40359a) {
            case 0:
                c60 c60Var = this.f40360b;
                if (updates != null) {
                    c60Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new p20(c60Var, 10));
                return;
            default:
                c60 c60Var2 = this.f40360b;
                if (updates != null) {
                    c60Var2.d.getMessagesController().processUpdates(updates, false);
                    return;
                } else {
                    c60Var2.getClass();
                    return;
                }
        }
    }
}
