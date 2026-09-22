package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xn0 implements RequestDelegate {
    public final int f39657a;
    public final xo0 f39658b;

    public xn0(xo0 xo0Var, int i10) {
        this.f39657a = i10;
        this.f39658b = xo0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39657a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fj0(13, this.f39658b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new wn0(this.f39658b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new qn0(this.f39658b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new qn0(this.f39658b, tLObject, 0));
                return;
        }
    }
}
