package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tl0 implements RequestDelegate {
    public final int f41674a;
    public final fn0 f41675b;

    public tl0(fn0 fn0Var, int i10) {
        this.f41674a = i10;
        this.f41675b = fn0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41674a) {
            case 0:
                AndroidUtilities.runOnUIThread(new if0(this.f41675b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new he0(21, this.f41675b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new pl0(this.f41675b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new he0(20, this.f41675b, tLObject));
                return;
        }
    }
}
