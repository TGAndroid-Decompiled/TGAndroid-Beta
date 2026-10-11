package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class un0 implements RequestDelegate {
    public final int f42652a;
    public final uo0 f42653b;

    public un0(uo0 uo0Var, int i10) {
        this.f42652a = i10;
        this.f42653b = uo0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42652a) {
            case 0:
                AndroidUtilities.runOnUIThread(new uf0(20, this.f42653b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new tn0(this.f42653b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new nn0(this.f42653b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new nn0(this.f42653b, tLObject, 0));
                return;
        }
    }
}
