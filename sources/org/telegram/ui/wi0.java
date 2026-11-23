package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wi0 implements RequestDelegate {
    public final int f53693a;
    public final fk0 f53694b;

    public wi0(fk0 fk0Var, int i7) {
        this.f53693a = i7;
        this.f53694b = fk0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53693a) {
            case 0:
                org.telegram.messenger.g0.g3(new lc0(this.f53694b, tL_error, tLObject, 12));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new bd0(18, this.f53694b, tL_error));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new si0(this.f53694b, 5));
                return;
            default:
                org.telegram.messenger.g0.g3(new bd0(17, this.f53694b, tLObject));
                return;
        }
    }
}
