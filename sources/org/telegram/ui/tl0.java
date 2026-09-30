package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tl0 implements RequestDelegate {
    public final int f38259a;
    public final fn0 f38260b;

    public tl0(fn0 fn0Var, int i10) {
        this.f38259a = i10;
        this.f38260b = fn0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38259a) {
            case 0:
                AndroidUtilities.runOnUIThread(new jf0(this.f38260b, tL_error, tLObject, 10));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new sj0(9, this.f38260b, tL_error));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new pl0(this.f38260b, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new sj0(8, this.f38260b, tLObject));
                return;
        }
    }
}
