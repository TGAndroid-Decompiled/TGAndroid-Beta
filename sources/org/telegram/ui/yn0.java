package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yn0 implements RequestDelegate {
    public final int f39943a;
    public final yo0 f39944b;

    public yn0(yo0 yo0Var, int i10) {
        this.f39943a = i10;
        this.f39944b = yo0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39943a) {
            case 0:
                AndroidUtilities.runOnUIThread(new pl0(7, this.f39944b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new xn0(this.f39944b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new rn0(this.f39944b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new rn0(this.f39944b, tLObject, 0));
                return;
        }
    }
}
