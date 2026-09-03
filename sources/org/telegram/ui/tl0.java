package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tl0 implements RequestDelegate {
    public final int f38548a;
    public final fn0 f38549b;

    public tl0(fn0 fn0Var, int i10) {
        this.f38548a = i10;
        this.f38549b = fn0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38548a) {
            case 0:
                AndroidUtilities.runOnUIThread(new jf0(this.f38549b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ie0(21, this.f38549b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new pl0(this.f38549b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ie0(20, this.f38549b, tLObject));
                return;
        }
    }
}
