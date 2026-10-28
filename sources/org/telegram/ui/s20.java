package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s20 implements Utilities.Callback2 {
    public final int f43225a;
    public final x50 f43226b;

    public s20(x50 x50Var, int i10) {
        this.f43225a = i10;
        this.f43226b = x50Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (this.f43225a) {
            case 0:
                x50 x50Var = this.f43226b;
                if (updates != null) {
                    x50Var.d.getMessagesController().lambda$processUpdates$379(updates, false);
                }
                AndroidUtilities.runOnUIThread(new j20(x50Var, 10));
                return;
            default:
                x50 x50Var2 = this.f43226b;
                if (updates != null) {
                    x50Var2.d.getMessagesController().lambda$processUpdates$379(updates, false);
                    return;
                } else {
                    x50Var2.getClass();
                    return;
                }
        }
    }
}
