package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wd0 implements RequestDelegate {
    public final int f41938a;
    public final ge0 f41939b;
    public final String f41940c;

    public wd0(ge0 ge0Var, String str, int i10) {
        this.f41938a = i10;
        this.f41939b = ge0Var;
        this.f41940c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41938a) {
            case 0:
                AndroidUtilities.runOnUIThread(new yd0(this.f41939b, tL_error, this.f41940c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yd0(this.f41939b, tL_error, tLObject, this.f41940c));
                return;
        }
    }
}
