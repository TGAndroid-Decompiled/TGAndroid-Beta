package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tz implements RequestDelegate {
    public final int f41860a;
    public final p00 f41861b;

    public tz(p00 p00Var, int i10) {
        this.f41860a = i10;
        this.f41861b = p00Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41860a) {
            case 0:
                AndroidUtilities.runOnUIThread(new nt(15, this.f41861b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new lq(this.f41861b, tL_error, tLObject, 6));
                return;
        }
    }
}
