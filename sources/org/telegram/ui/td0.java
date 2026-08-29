package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class td0 implements RequestDelegate {
    public final int f42657a;
    public final ud0 f42658b;
    public final String f42659c;
    public final String d;

    public td0(ud0 ud0Var, String str, String str2, int i10) {
        this.f42657a = i10;
        this.f42658b = ud0Var;
        this.f42659c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42657a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qd0(this.f42658b, tL_error, this.f42659c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new qd0(this.f42658b, tL_error, tLObject, this.f42659c, this.d));
                return;
        }
    }
}
