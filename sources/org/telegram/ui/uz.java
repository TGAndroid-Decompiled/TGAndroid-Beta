package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uz implements RequestDelegate {
    public final int f44143a;
    public final q00 f44144b;

    public uz(q00 q00Var, int i10) {
        this.f44143a = i10;
        this.f44144b = q00Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44143a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kz(3, this.f44144b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new pq(this.f44144b, tL_error, tLObject, 6));
                return;
        }
    }
}
