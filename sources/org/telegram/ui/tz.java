package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tz implements RequestDelegate {
    public final int f41845a;
    public final p00 f41846b;

    public tz(p00 p00Var, int i10) {
        this.f41845a = i10;
        this.f41846b = p00Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41845a) {
            case 0:
                AndroidUtilities.runOnUIThread(new nt(15, this.f41846b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new lq(this.f41846b, tL_error, tLObject, 6));
                return;
        }
    }
}
