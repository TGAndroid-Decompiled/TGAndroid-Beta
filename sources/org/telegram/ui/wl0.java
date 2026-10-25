package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wl0 implements RequestDelegate {
    public final int f45516a;
    public final in0 f45517b;

    public wl0(in0 in0Var, int i10) {
        this.f45516a = i10;
        this.f45517b = in0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45516a) {
            case 0:
                AndroidUtilities.runOnUIThread(new oe0(this.f45517b, tL_error, tLObject, 13));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new yl0(1, this.f45517b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new sl0(this.f45517b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yl0(0, this.f45517b, tLObject));
                return;
        }
    }
}
