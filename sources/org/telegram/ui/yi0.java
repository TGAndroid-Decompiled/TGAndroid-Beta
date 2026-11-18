package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yi0 implements RequestDelegate {
    public final int f54173a;
    public final hk0 f54174b;

    public yi0(hk0 hk0Var, int i7) {
        this.f54173a = i7;
        this.f54174b = hk0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f54173a) {
            case 0:
                org.telegram.messenger.g0.g3(new mc0(this.f54174b, tL_error, tLObject, 12));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new we0(12, this.f54174b, tL_error));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new ui0(this.f54174b, 5));
                return;
            default:
                org.telegram.messenger.g0.g3(new we0(11, this.f54174b, tLObject));
                return;
        }
    }
}
