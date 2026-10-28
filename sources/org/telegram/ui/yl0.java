package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yl0 implements RequestDelegate {
    public final int f46047a;
    public final kn0 f46048b;

    public yl0(kn0 kn0Var, int i10) {
        this.f46047a = i10;
        this.f46048b = kn0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46047a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ne0(this.f46048b, tL_error, tLObject, false, 14));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new am0(2, this.f46048b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ul0(this.f46048b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new am0(1, this.f46048b, tLObject));
                return;
        }
    }
}
