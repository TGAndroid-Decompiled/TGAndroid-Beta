package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sb0 implements RequestDelegate {
    public final int f52045a;
    public final tb0 f52046b;
    public final String f52047c;
    public final String d;

    public sb0(tb0 tb0Var, String str, String str2, int i7) {
        this.f52045a = i7;
        this.f52046b = tb0Var;
        this.f52047c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52045a) {
            case 0:
                org.telegram.messenger.g0.g3(new pb0(this.f52046b, tL_error, this.f52047c, this.d, tLObject));
                return;
            default:
                org.telegram.messenger.g0.g3(new pb0(this.f52046b, tL_error, tLObject, this.f52047c, this.d));
                return;
        }
    }
}
