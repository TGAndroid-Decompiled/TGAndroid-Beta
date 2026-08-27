package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class wd0 implements RequestDelegate {

    public final int f43708a;

    public final yd0 f43709b;

    public final String f43710c;
    public final String d;

    public wd0(yd0 yd0Var, String str, String str2, int i10) {
        this.f43708a = i10;
        this.f43709b = yd0Var;
        this.f43710c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43708a) {
            case 0:
                AndroidUtilities.runOnUIThread(new td0(this.f43709b, tL_error, this.f43710c, this.d, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new td0(this.f43709b, tL_error, tLObject, this.f43710c, this.d));
                break;
        }
    }
}
