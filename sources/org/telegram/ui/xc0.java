package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xc0 implements RequestDelegate {
    public final int f53748a;
    public final gd0 f53749b;
    public final Bundle f53750c;

    public xc0(gd0 gd0Var, Bundle bundle, int i7) {
        this.f53748a = i7;
        this.f53749b = gd0Var;
        this.f53750c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53748a) {
            case 0:
                gd0 gd0Var = this.f53749b;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new mc0(gd0Var, this.f53750c, tLObject, 3));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    org.telegram.messenger.g0.g3(new o60(22, gd0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.q20(this.f53749b, tL_error, this.f53750c, tLObject));
                return;
        }
    }
}
