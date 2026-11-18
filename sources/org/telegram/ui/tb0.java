package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tb0 implements RequestDelegate {
    public final int f52241a;
    public final ub0 f52242b;
    public final String f52243c;
    public final String d;

    public tb0(ub0 ub0Var, String str, String str2, int i7) {
        this.f52241a = i7;
        this.f52242b = ub0Var;
        this.f52243c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52241a) {
            case 0:
                org.telegram.messenger.g0.g3(new qb0(this.f52242b, tL_error, this.f52243c, this.d, tLObject));
                return;
            default:
                org.telegram.messenger.g0.g3(new qb0(this.f52242b, tL_error, tLObject, this.f52243c, this.d));
                return;
        }
    }
}
