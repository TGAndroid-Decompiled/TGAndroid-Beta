package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wl0 implements RequestDelegate {
    public final int f39054a;
    public final in0 f39055b;

    public wl0(in0 in0Var, int i10) {
        this.f39054a = i10;
        this.f39055b = in0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39054a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kf0(this.f39055b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gl0(4, this.f39055b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new rl0(this.f39055b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gl0(3, this.f39055b, tLObject));
                return;
        }
    }
}
