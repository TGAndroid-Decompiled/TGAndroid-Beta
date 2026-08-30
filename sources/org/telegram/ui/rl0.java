package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rl0 implements RequestDelegate {
    public final int f38080a;
    public final dn0 f38081b;

    public rl0(dn0 dn0Var, int i10) {
        this.f38080a = i10;
        this.f38081b = dn0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38080a) {
            case 0:
                AndroidUtilities.runOnUIThread(new hf0(this.f38081b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new fe0(22, this.f38081b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new nl0(this.f38081b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fe0(21, this.f38081b, tLObject));
                return;
        }
    }
}
