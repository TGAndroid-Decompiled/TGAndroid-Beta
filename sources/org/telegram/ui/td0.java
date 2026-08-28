package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class td0 implements RequestDelegate {
    public final int f42965a;
    public final vd0 f42966b;
    public final String f42967c;
    public final String d;

    public td0(vd0 vd0Var, String str, String str2, int i9) {
        this.f42965a = i9;
        this.f42966b = vd0Var;
        this.f42967c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42965a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qd0(this.f42966b, tL_error, this.f42967c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new qd0(this.f42966b, tL_error, tLObject, this.f42967c, this.d));
                return;
        }
    }
}
