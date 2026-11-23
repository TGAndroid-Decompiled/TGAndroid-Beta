package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yi0 implements RequestDelegate {
    public final int f54193a;
    public final hk0 f54194b;

    public yi0(hk0 hk0Var, int i7) {
        this.f54193a = i7;
        this.f54194b = hk0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f54193a) {
            case 0:
                org.telegram.messenger.g0.g3(new mc0(this.f54194b, tL_error, tLObject, 12));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new ve0(12, this.f54194b, tL_error));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new ui0(this.f54194b, 5));
                return;
            default:
                org.telegram.messenger.g0.g3(new ve0(11, this.f54194b, tLObject));
                return;
        }
    }
}
