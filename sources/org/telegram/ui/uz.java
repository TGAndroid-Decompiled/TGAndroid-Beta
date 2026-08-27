package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class uz implements RequestDelegate {

    public final int f43313a;

    public final q00 f43314b;

    public uz(q00 q00Var, int i10) {
        this.f43313a = i10;
        this.f43314b = q00Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43313a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.r61(22, this.f43314b, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new lq(this.f43314b, tL_error, tLObject, 6));
                break;
        }
    }
}
