package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sb0 implements RequestDelegate {
    public final int f49713a;
    public final ub0 f49714b;
    public final String f49715c;
    public final String d;

    public sb0(ub0 ub0Var, String str, String str2, int i7) {
        this.f49713a = i7;
        this.f49714b = ub0Var;
        this.f49715c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49713a) {
            case 0:
                org.telegram.messenger.g0.h3(new pb0(this.f49714b, tL_error, this.f49715c, this.d, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new pb0(this.f49714b, tL_error, tLObject, this.f49715c, this.d));
                return;
        }
    }
}
