package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sg0 implements RequestDelegate {
    public final int f41122a;
    public final kh0 f41123b;

    public sg0(kh0 kh0Var, int i10) {
        this.f41122a = i10;
        this.f41123b = kh0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41122a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xg0(this.f41123b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new b80(29, this.f41123b, tL_error));
                return;
        }
    }
}
