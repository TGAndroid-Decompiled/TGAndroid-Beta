package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rn0 implements RequestDelegate {
    public final int f37162a;
    public final ro0 f37163b;

    public rn0(ro0 ro0Var, int i10) {
        this.f37162a = i10;
        this.f37163b = ro0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37162a) {
            case 0:
                AndroidUtilities.runOnUIThread(new jl0(8, this.f37163b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new qn0(this.f37163b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new kn0(this.f37163b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new kn0(this.f37163b, tLObject, 0));
                return;
        }
    }
}
