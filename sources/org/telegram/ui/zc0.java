package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zc0 implements RequestDelegate {
    public final int f52496a;
    public final id0 f52497b;
    public final Bundle f52498c;

    public zc0(id0 id0Var, Bundle bundle, int i7) {
        this.f52496a = i7;
        this.f52497b = id0Var;
        this.f52498c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52496a) {
            case 0:
                id0 id0Var = this.f52497b;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new oc0(id0Var, this.f52498c, tLObject, 3));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    org.telegram.messenger.g0.h3(new bd0(1, id0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ln0(this.f52497b, tL_error, this.f52498c, tLObject, 19));
                return;
        }
    }
}
