package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wc0 implements RequestDelegate {
    public final int f53075a;
    public final gd0 f53076b;
    public final Bundle f53077c;

    public wc0(gd0 gd0Var, Bundle bundle, int i7) {
        this.f53075a = i7;
        this.f53076b = gd0Var;
        this.f53077c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53075a) {
            case 0:
                gd0 gd0Var = this.f53076b;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new lc0(gd0Var, this.f53077c, tLObject, 3));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    org.telegram.messenger.g0.g3(new n60(22, gd0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20(this.f53076b, tL_error, this.f53077c, tLObject));
                return;
        }
    }
}
