package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ug0 implements RequestDelegate {
    public final int f44019a;
    public final lh0 f44020b;

    public ug0(lh0 lh0Var, int i10) {
        this.f44019a = i10;
        this.f44020b = lh0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44019a) {
            case 0:
                AndroidUtilities.runOnUIThread(new zg0(this.f44020b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new kb0(17, this.f44020b, tL_error));
                return;
        }
    }
}
