package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xl0 implements RequestDelegate {
    public final int f39683a;
    public final jn0 f39684b;

    public xl0(jn0 jn0Var, int i10) {
        this.f39683a = i10;
        this.f39684b = jn0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39683a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mf0(this.f39684b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new jl0(5, this.f39684b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new tl0(this.f39684b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jl0(4, this.f39684b, tLObject));
                return;
        }
    }
}
