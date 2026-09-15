package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wn0 implements RequestDelegate {
    public final int f39267a;
    public final wo0 f39268b;

    public wn0(wo0 wo0Var, int i10) {
        this.f39267a = i10;
        this.f39268b = wo0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39267a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ml0(7, this.f39268b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new vn0(this.f39268b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new pn0(this.f39268b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new pn0(this.f39268b, tLObject, 0));
                return;
        }
    }
}
