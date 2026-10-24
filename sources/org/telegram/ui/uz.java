package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uz implements RequestDelegate {
    public final int f42511a;
    public final q00 f42512b;

    public uz(q00 q00Var, int i10) {
        this.f42511a = i10;
        this.f42512b = q00Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42511a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ot(15, this.f42512b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new lq(this.f42512b, tL_error, tLObject, 6));
                return;
        }
    }
}
