package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rj0 implements RequestDelegate {
    public final int f43074a;
    public final zj0 f43075b;

    public rj0(zj0 zj0Var, int i10) {
        this.f43074a = i10;
        this.f43075b = zj0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43074a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kb0(23, this.f43075b, tLObject));
                return;
            default:
                boolean z10 = tLObject instanceof TLRPC.Updates;
                zj0 zj0Var = this.f43075b;
                if (z10) {
                    zj0Var.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    zj0Var.getClass();
                    return;
                }
        }
    }
}
