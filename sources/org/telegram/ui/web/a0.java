package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;
import org.telegram.ui.bn;
import org.telegram.ui.qx0;
public final class a0 extends bn {
    public boolean f53060vd;
    public final TLRPC.User f53061wd;
    public final long f53062xd;
    public final v0 f53063yd;

    public a0(v0 v0Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.f53063yd = v0Var;
        this.f53061wd = user;
        this.f53062xd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f53060vd) {
            this.f53060vd = true;
            lc.b0(this).I(2131623990, hd.a0(null, null, 2131751727, p10.q(this.f53061wd)), org.telegram.messenger.g0.T2(hd.a0(null, null, 2131751728, p10.q(this.f53063yd.V)), new qx0(this, this.f53062xd, 2))).j();
        }
    }
}
