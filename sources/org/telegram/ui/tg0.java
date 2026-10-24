package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tg0 implements RequestDelegate {
    public final int f42047a;
    public final lh0 f42048b;

    public tg0(lh0 lh0Var, int i10) {
        this.f42047a = i10;
        this.f42048b = lh0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42047a) {
            case 0:
                AndroidUtilities.runOnUIThread(new yg0(this.f42048b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new f80(29, this.f42048b, tL_error));
                return;
        }
    }
}
