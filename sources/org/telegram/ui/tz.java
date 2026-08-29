package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tz implements RequestDelegate {
    public final int f43115a;
    public final p00 f43116b;

    public tz(p00 p00Var, int i10) {
        this.f43115a = i10;
        this.f43116b = p00Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43115a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.o(19, this.f43116b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new lq(this.f43116b, tL_error, tLObject, 6));
                return;
        }
    }
}
