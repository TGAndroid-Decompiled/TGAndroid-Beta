package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yg0 implements RequestDelegate {
    public final int f40518a;
    public final ph0 f40519b;

    public yg0(ph0 ph0Var, int i10) {
        this.f40518a = i10;
        this.f40519b = ph0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40518a) {
            case 0:
                AndroidUtilities.runOnUIThread(new dh0(this.f40519b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fe0(10, this.f40519b, tL_error));
                return;
        }
    }
}
