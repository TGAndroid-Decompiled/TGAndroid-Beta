package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sb0 implements RequestDelegate {
    public final int f49727a;
    public final ub0 f49728b;
    public final String f49729c;
    public final String d;

    public sb0(ub0 ub0Var, String str, String str2, int i7) {
        this.f49727a = i7;
        this.f49728b = ub0Var;
        this.f49729c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49727a) {
            case 0:
                org.telegram.messenger.g0.h3(new pb0(this.f49728b, tL_error, this.f49729c, this.d, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new pb0(this.f49728b, tL_error, tLObject, this.f49729c, this.d));
                return;
        }
    }
}
