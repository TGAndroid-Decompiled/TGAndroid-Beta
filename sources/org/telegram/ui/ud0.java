package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ud0 implements RequestDelegate {
    public final int f42391a;
    public final wd0 f42392b;
    public final String f42393c;
    public final String d;

    public ud0(wd0 wd0Var, String str, String str2, int i10) {
        this.f42391a = i10;
        this.f42392b = wd0Var;
        this.f42393c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42391a) {
            case 0:
                AndroidUtilities.runOnUIThread(new rd0(this.f42392b, tL_error, this.f42393c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new rd0(this.f42392b, tL_error, tLObject, this.f42393c, this.d));
                return;
        }
    }
}
