package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z20 implements Utilities.Callback2 {
    public final int f43794a;
    public final d60 f43795b;

    public z20(d60 d60Var, int i10) {
        this.f43794a = i10;
        this.f43795b = d60Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f43794a) {
            case 0:
                d60 d60Var = this.f43795b;
                if (updates != null) {
                    d60Var.d.getMessagesController().processUpdates(updates, false);
                }
                AndroidUtilities.runOnUIThread(new q20(d60Var, 10));
                return;
            default:
                d60 d60Var2 = this.f43795b;
                if (updates != null) {
                    d60Var2.d.getMessagesController().processUpdates(updates, false);
                    return;
                } else {
                    d60Var2.getClass();
                    return;
                }
        }
    }
}
