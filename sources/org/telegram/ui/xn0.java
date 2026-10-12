package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xn0 implements RequestDelegate {
    public final int f44050a;
    public final xo0 f44051b;

    public xn0(xo0 xo0Var, int i10) {
        this.f44050a = i10;
        this.f44051b = xo0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44050a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cg0(19, this.f44051b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new wn0(this.f44051b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new qn0(this.f44051b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new qn0(this.f44051b, tLObject, 0));
                return;
        }
    }
}
