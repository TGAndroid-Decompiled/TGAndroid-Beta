package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uz implements RequestDelegate {
    public final int f42544a;
    public final q00 f42545b;

    public uz(q00 q00Var, int i10) {
        this.f42544a = i10;
        this.f42545b = q00Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42544a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ot(15, this.f42545b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new lq(this.f42545b, tL_error, tLObject, 6));
                return;
        }
    }
}
