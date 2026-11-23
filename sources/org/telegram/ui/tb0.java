package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tb0 implements RequestDelegate {
    public final int f52295a;
    public final ub0 f52296b;
    public final String f52297c;
    public final String d;

    public tb0(ub0 ub0Var, String str, String str2, int i7) {
        this.f52295a = i7;
        this.f52296b = ub0Var;
        this.f52297c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52295a) {
            case 0:
                org.telegram.messenger.g0.g3(new qb0(this.f52296b, tL_error, this.f52297c, this.d, tLObject));
                return;
            default:
                org.telegram.messenger.g0.g3(new qb0(this.f52296b, tL_error, tLObject, this.f52297c, this.d));
                return;
        }
    }
}
