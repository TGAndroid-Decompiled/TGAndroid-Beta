package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sb0 implements RequestDelegate {
    public final int f49728a;
    public final ub0 f49729b;
    public final String f49730c;
    public final String d;

    public sb0(ub0 ub0Var, String str, String str2, int i7) {
        this.f49728a = i7;
        this.f49729b = ub0Var;
        this.f49730c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49728a) {
            case 0:
                org.telegram.messenger.g0.h3(new pb0(this.f49729b, tL_error, this.f49730c, this.d, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new pb0(this.f49729b, tL_error, tLObject, this.f49730c, this.d));
                return;
        }
    }
}
