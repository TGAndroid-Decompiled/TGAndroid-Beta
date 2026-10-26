package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sg0 implements RequestDelegate {
    public final int f43503a;
    public final jh0 f43504b;

    public sg0(jh0 jh0Var, int i10) {
        this.f43503a = i10;
        this.f43504b = jh0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43503a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xg0(this.f43504b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wb0(16, this.f43504b, tL_error));
                return;
        }
    }
}
