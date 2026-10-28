package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ud0 implements RequestDelegate {
    public final int f43991a;
    public final wd0 f43992b;
    public final String f43993c;
    public final String d;

    public ud0(wd0 wd0Var, String str, String str2, int i10) {
        this.f43991a = i10;
        this.f43992b = wd0Var;
        this.f43993c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43991a) {
            case 0:
                AndroidUtilities.runOnUIThread(new rd0(this.f43992b, tL_error, this.f43993c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new rd0(this.f43992b, tL_error, tLObject, this.f43993c, this.d));
                return;
        }
    }
}
