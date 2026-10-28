package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sn0 implements RequestDelegate {
    public final int f43364a;
    public final ro0 f43365b;

    public sn0(ro0 ro0Var, int i10) {
        this.f43364a = i10;
        this.f43365b = ro0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43364a) {
            case 0:
                AndroidUtilities.runOnUIThread(new am0(5, this.f43365b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new rn0(this.f43365b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ln0(this.f43365b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ln0(this.f43365b, tLObject, 0));
                return;
        }
    }
}
