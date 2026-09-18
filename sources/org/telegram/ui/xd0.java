package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xd0 implements RequestDelegate {
    public final int f39434a;
    public final he0 f39435b;
    public final String f39436c;

    public xd0(he0 he0Var, String str, int i10) {
        this.f39434a = i10;
        this.f39435b = he0Var;
        this.f39436c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39434a) {
            case 0:
                AndroidUtilities.runOnUIThread(new zd0(this.f39435b, tL_error, this.f39436c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new zd0(this.f39435b, tL_error, tLObject, this.f39436c));
                return;
        }
    }
}
