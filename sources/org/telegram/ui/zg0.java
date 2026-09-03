package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zg0 implements RequestDelegate {
    public final int f43957a;
    public final qh0 f43958b;

    public zg0(qh0 qh0Var, int i10) {
        this.f43957a = i10;
        this.f43958b = qh0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43957a) {
            case 0:
                AndroidUtilities.runOnUIThread(new eh0(this.f43958b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ue0(8, this.f43958b, tL_error));
                return;
        }
    }
}
