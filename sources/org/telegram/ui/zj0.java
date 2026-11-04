package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zj0 implements RequestDelegate {
    public final int f52688a;
    public final dl0 f52689b;

    public zj0(dl0 dl0Var, int i3) {
        this.f52688a = i3;
        this.f52689b = dl0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52688a) {
            case 0:
                org.telegram.messenger.g0.h3(new ck0(this.f52689b, tLObject, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new tb0(28, this.f52689b, tL_error));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ck0(this.f52689b, tLObject, 2));
                return;
            default:
                org.telegram.messenger.g0.h3(new gk0(this.f52689b, tL_error, tLObject, 0));
                return;
        }
    }
}
