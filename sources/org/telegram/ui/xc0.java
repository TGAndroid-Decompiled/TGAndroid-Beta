package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xc0 implements RequestDelegate {
    public final int f53828a;
    public final gd0 f53829b;
    public final Bundle f53830c;

    public xc0(gd0 gd0Var, Bundle bundle, int i7) {
        this.f53828a = i7;
        this.f53829b = gd0Var;
        this.f53830c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53828a) {
            case 0:
                gd0 gd0Var = this.f53829b;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new mc0(gd0Var, this.f53830c, tLObject, 3));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    org.telegram.messenger.g0.g3(new h60(24, gd0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.q20(this.f53829b, tL_error, this.f53830c, tLObject));
                return;
        }
    }
}
