package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qn0 implements RequestDelegate {
    public final int f42877a;
    public final po0 f42878b;

    public qn0(po0 po0Var, int i10) {
        this.f42877a = i10;
        this.f42878b = po0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42877a) {
            case 0:
                AndroidUtilities.runOnUIThread(new yl0(4, this.f42878b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new pn0(this.f42878b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new jn0(this.f42878b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jn0(this.f42878b, tLObject, 0));
                return;
        }
    }
}
