package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xn0 implements RequestDelegate {
    public final int f44045a;
    public final xo0 f44046b;

    public xn0(xo0 xo0Var, int i10) {
        this.f44045a = i10;
        this.f44046b = xo0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44045a) {
            case 0:
                AndroidUtilities.runOnUIThread(new og0(18, this.f44046b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new wn0(this.f44046b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new qn0(this.f44046b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new qn0(this.f44046b, tLObject, 0));
                return;
        }
    }
}
