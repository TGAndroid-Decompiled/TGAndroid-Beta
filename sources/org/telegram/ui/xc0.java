package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xc0 implements RequestDelegate {
    public final int f51834a;
    public final gd0 f51835b;
    public final Bundle f51836c;

    public xc0(gd0 gd0Var, Bundle bundle, int i7) {
        this.f51834a = i7;
        this.f51835b = gd0Var;
        this.f51836c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51834a) {
            case 0:
                gd0 gd0Var = this.f51835b;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new mc0(gd0Var, this.f51836c, tLObject, 3));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    org.telegram.messenger.g0.h3(new zc0(1, gd0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0(this.f51835b, tL_error, this.f51836c, tLObject, 19));
                return;
        }
    }
}
