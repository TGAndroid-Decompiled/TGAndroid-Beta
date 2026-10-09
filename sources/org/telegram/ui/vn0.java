package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vn0 implements RequestDelegate {
    public final int f42907a;
    public final vo0 f42908b;

    public vn0(vo0 vo0Var, int i10) {
        this.f42907a = i10;
        this.f42908b = vo0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42907a) {
            case 0:
                AndroidUtilities.runOnUIThread(new tf0(21, this.f42908b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new un0(this.f42908b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new on0(this.f42908b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new on0(this.f42908b, tLObject, 0));
                return;
        }
    }
}
