package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ul0 implements RequestDelegate {
    public final int f38498a;
    public final gn0 f38499b;

    public ul0(gn0 gn0Var, int i10) {
        this.f38498a = i10;
        this.f38499b = gn0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38498a) {
            case 0:
                AndroidUtilities.runOnUIThread(new jf0(this.f38499b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new sj0(9, this.f38499b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ql0(this.f38499b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new sj0(8, this.f38499b, tLObject));
                return;
        }
    }
}
