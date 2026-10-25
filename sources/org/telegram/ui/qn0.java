package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qn0 implements RequestDelegate {
    public final int f42874a;
    public final po0 f42875b;

    public qn0(po0 po0Var, int i10) {
        this.f42874a = i10;
        this.f42875b = po0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42874a) {
            case 0:
                AndroidUtilities.runOnUIThread(new yl0(4, this.f42875b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new pn0(this.f42875b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new jn0(this.f42875b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jn0(this.f42875b, tLObject, 0));
                return;
        }
    }
}
