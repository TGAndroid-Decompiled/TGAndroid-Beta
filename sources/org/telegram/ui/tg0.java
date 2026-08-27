package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class tg0 implements RequestDelegate {

    public final int f42937a;

    public final kh0 f42938b;

    public tg0(kh0 kh0Var, int i10) {
        this.f42937a = i10;
        this.f42938b = kh0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42937a) {
            case 0:
                AndroidUtilities.runOnUIThread(new yg0(this.f42938b, tL_error, tLObject, 0));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ff0(4, this.f42938b, tL_error));
                break;
        }
    }
}
