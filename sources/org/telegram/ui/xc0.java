package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xc0 implements RequestDelegate {
    public final int f53781a;
    public final hd0 f53782b;
    public final Bundle f53783c;

    public xc0(hd0 hd0Var, Bundle bundle, int i7) {
        this.f53781a = i7;
        this.f53782b = hd0Var;
        this.f53783c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53781a) {
            case 0:
                hd0 hd0Var = this.f53782b;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new mc0(hd0Var, this.f53783c, tLObject, 3));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    org.telegram.messenger.g0.g3(new o60(22, hd0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.n20(this.f53782b, tL_error, this.f53783c, tLObject));
                return;
        }
    }
}
