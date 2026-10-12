package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wd0 implements RequestDelegate {
    public final int f43140a;
    public final ge0 f43141b;
    public final String f43142c;

    public wd0(ge0 ge0Var, String str, int i10) {
        this.f43140a = i10;
        this.f43141b = ge0Var;
        this.f43142c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43140a) {
            case 0:
                AndroidUtilities.runOnUIThread(new yd0(this.f43141b, tL_error, this.f43142c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yd0(this.f43141b, tL_error, tLObject, this.f43142c));
                return;
        }
    }
}
