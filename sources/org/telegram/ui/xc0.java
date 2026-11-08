package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xc0 implements RequestDelegate {
    public final int f51827a;
    public final gd0 f51828b;
    public final Bundle f51829c;

    public xc0(gd0 gd0Var, Bundle bundle, int i7) {
        this.f51827a = i7;
        this.f51828b = gd0Var;
        this.f51829c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51827a) {
            case 0:
                gd0 gd0Var = this.f51828b;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new mc0(gd0Var, this.f51829c, tLObject, 3));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    org.telegram.messenger.g0.h3(new zc0(1, gd0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0(this.f51828b, tL_error, this.f51829c, tLObject, 19));
                return;
        }
    }
}
