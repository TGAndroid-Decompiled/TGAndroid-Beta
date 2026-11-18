package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.gd;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;
import org.telegram.ui.bn;
import org.telegram.ui.qx0;
public final class a0 extends bn {
    public boolean f53050vd;
    public final TLRPC.User f53051wd;
    public final long f53052xd;
    public final v0 f53053yd;

    public a0(v0 v0Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.f53053yd = v0Var;
        this.f53051wd = user;
        this.f53052xd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f53050vd) {
            this.f53050vd = true;
            lc.b0(this).I(2131623990, gd.a0(null, null, 2131751728, o10.q(this.f53051wd)), org.telegram.messenger.g0.T2(gd.a0(null, null, 2131751729, o10.q(this.f53053yd.V)), new qx0(this, this.f53052xd, 2))).j();
        }
    }
}
