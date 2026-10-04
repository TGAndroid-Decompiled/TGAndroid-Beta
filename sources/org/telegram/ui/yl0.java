package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yl0 implements RequestDelegate {
    public final int f43264a;
    public final kn0 f43265b;

    public yl0(kn0 kn0Var, int i10) {
        this.f43264a = i10;
        this.f43265b = kn0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43264a) {
            case 0:
                AndroidUtilities.runOnUIThread(new nf0(this.f43265b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new wj0(7, this.f43265b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ul0(this.f43265b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wj0(6, this.f43265b, tLObject));
                return;
        }
    }
}
