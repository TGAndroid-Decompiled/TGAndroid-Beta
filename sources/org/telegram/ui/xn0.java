package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xn0 implements RequestDelegate {
    public final int f42793a;
    public final xo0 f42794b;

    public xn0(xo0 xo0Var, int i10) {
        this.f42793a = i10;
        this.f42794b = xo0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42793a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ej0(13, this.f42794b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new wn0(this.f42794b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new qn0(this.f42794b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new qn0(this.f42794b, tLObject, 0));
                return;
        }
    }
}
