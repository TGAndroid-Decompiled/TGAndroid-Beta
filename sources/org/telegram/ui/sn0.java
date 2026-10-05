package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sn0 implements RequestDelegate {
    public final int f40553a;
    public final so0 f40554b;

    public sn0(so0 so0Var, int i10) {
        this.f40553a = i10;
        this.f40554b = so0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40553a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wj0(10, this.f40554b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new rn0(this.f40554b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ln0(this.f40554b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ln0(this.f40554b, tLObject, 0));
                return;
        }
    }
}
