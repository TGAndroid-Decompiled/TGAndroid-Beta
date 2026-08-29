package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xc implements RequestDelegate {
    public final int f44544a;
    public final hd f44545b;

    public xc(hd hdVar, int i10) {
        this.f44544a = i10;
        this.f44545b = hdVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44544a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(26, this.f44545b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new yc(this.f44545b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(24, this.f44545b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new u1(this.f44545b, tL_error, tLObject, 11));
                return;
        }
    }
}
