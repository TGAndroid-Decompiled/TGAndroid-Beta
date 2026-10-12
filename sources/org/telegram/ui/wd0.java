package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wd0 implements RequestDelegate {
    public final int f43138a;
    public final ge0 f43139b;
    public final String f43140c;

    public wd0(ge0 ge0Var, String str, int i10) {
        this.f43138a = i10;
        this.f43139b = ge0Var;
        this.f43140c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43138a) {
            case 0:
                AndroidUtilities.runOnUIThread(new yd0(this.f43139b, tL_error, this.f43140c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yd0(this.f43139b, tL_error, tLObject, this.f43140c));
                return;
        }
    }
}
