package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yi0 implements RequestDelegate {
    public final int f54214a;
    public final hk0 f54215b;

    public yi0(hk0 hk0Var, int i7) {
        this.f54214a = i7;
        this.f54215b = hk0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f54214a) {
            case 0:
                org.telegram.messenger.g0.g3(new lc0(this.f54215b, tL_error, tLObject, 12));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new ve0(12, this.f54215b, tL_error));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new ui0(this.f54215b, 5));
                return;
            default:
                org.telegram.messenger.g0.g3(new ve0(11, this.f54215b, tLObject));
                return;
        }
    }
}
