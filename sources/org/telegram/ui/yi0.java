package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yi0 implements RequestDelegate {
    public final int f54219a;
    public final hk0 f54220b;

    public yi0(hk0 hk0Var, int i7) {
        this.f54219a = i7;
        this.f54220b = hk0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f54219a) {
            case 0:
                org.telegram.messenger.g0.g3(new mc0(this.f54220b, tL_error, tLObject, 12));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new fe0(14, this.f54220b, tL_error));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new ui0(this.f54220b, 5));
                return;
            default:
                org.telegram.messenger.g0.g3(new fe0(13, this.f54220b, tLObject));
                return;
        }
    }
}
