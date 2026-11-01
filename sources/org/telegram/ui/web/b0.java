package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.dd;
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.un;
public final class b0 extends un {
    public boolean f42793kd;
    public final TLRPC.User f42794ld;
    public final long f42795md;
    public final z0 f42796nd;

    public b0(z0 z0Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.f42796nd = z0Var;
        this.f42794ld = user;
        this.f42795md = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f42793kd) {
            this.f42793kd = true;
            cc.a0(this).I(2131623989, dd.a0(null, null, 2131751740, i20.p(this.f42794ld)), org.telegram.messenger.i0.T2(dd.a0(null, null, 2131751741, i20.p(this.f42796nd.U)), new bi.e(this, this.f42795md, 20))).j();
        }
    }
}
