package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rz implements RequestDelegate {
    public final int f43309a;
    public final o00 f43310b;

    public rz(o00 o00Var, int i10) {
        this.f43309a = i10;
        this.f43310b = o00Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43309a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sz(2, this.f43310b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new nq(this.f43310b, tL_error, tLObject, 6));
                return;
        }
    }
}
