package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wc0 implements RequestDelegate {
    public final int f52545a;
    public final ed0 f52546b;
    public final Bundle f52547c;

    public wc0(ed0 ed0Var, Bundle bundle, int i7) {
        this.f52545a = i7;
        this.f52546b = ed0Var;
        this.f52547c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52545a) {
            case 0:
                ed0 ed0Var = this.f52546b;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new lc0(ed0Var, this.f52547c, tLObject, 3));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    org.telegram.messenger.g0.h3(new g50(27, ed0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u80(this.f52546b, tL_error, this.f52547c, tLObject, 23));
                return;
        }
    }
}
