package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ti0 implements RequestDelegate {
    public final int f50084a;
    public final bk0 f50085b;

    public ti0(bk0 bk0Var, int i7) {
        this.f50084a = i7;
        this.f50085b = bk0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50084a) {
            case 0:
                org.telegram.messenger.g0.h3(new mc0(this.f50085b, tL_error, tLObject, 12));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new zc0(21, this.f50085b, tL_error));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new pi0(this.f50085b, 5));
                return;
            default:
                org.telegram.messenger.g0.h3(new zc0(20, this.f50085b, tLObject));
                return;
        }
    }
}
