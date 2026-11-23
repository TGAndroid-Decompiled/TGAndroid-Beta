package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wc0 implements RequestDelegate {
    public final int f53293a;
    public final gd0 f53294b;
    public final Bundle f53295c;

    public wc0(gd0 gd0Var, Bundle bundle, int i7) {
        this.f53293a = i7;
        this.f53294b = gd0Var;
        this.f53295c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53293a) {
            case 0:
                gd0 gd0Var = this.f53294b;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new lc0(gd0Var, this.f53295c, tLObject, 3));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    org.telegram.messenger.g0.g3(new i50(28, gd0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.xz(this.f53294b, tL_error, this.f53295c, tLObject, 27));
                return;
        }
    }
}
