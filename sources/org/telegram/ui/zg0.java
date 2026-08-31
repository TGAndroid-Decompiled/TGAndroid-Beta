package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zg0 implements RequestDelegate {
    public final int f43933a;
    public final qh0 f43934b;

    public zg0(qh0 qh0Var, int i10) {
        this.f43933a = i10;
        this.f43934b = qh0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43933a) {
            case 0:
                AndroidUtilities.runOnUIThread(new eh0(this.f43934b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new he0(9, this.f43934b, tL_error));
                return;
        }
    }
}
