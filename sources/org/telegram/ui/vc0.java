package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vc0 implements RequestDelegate {
    public final int f50455a;
    public final dd0 f50456b;
    public final Bundle f50457c;

    public vc0(dd0 dd0Var, Bundle bundle, int i3) {
        this.f50455a = i3;
        this.f50456b = dd0Var;
        this.f50457c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50455a) {
            case 0:
                dd0 dd0Var = this.f50456b;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new hc0(dd0Var, this.f50457c, tLObject, false, 4));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    org.telegram.messenger.g0.h3(new tb0(6, dd0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.v60(this.f50456b, tL_error, this.f50457c, tLObject, 25));
                return;
        }
    }
}
