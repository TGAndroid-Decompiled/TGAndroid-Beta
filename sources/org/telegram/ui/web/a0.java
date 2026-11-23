package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;
import org.telegram.ui.bn;
import org.telegram.ui.qx0;
public final class a0 extends bn {
    public boolean f53097vd;
    public final TLRPC.User f53098wd;
    public final long f53099xd;
    public final v0 f53100yd;

    public a0(v0 v0Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.f53100yd = v0Var;
        this.f53098wd = user;
        this.f53099xd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f53097vd) {
            this.f53097vd = true;
            lc.b0(this).I(2131623990, hd.a0(null, null, 2131751727, p10.q(this.f53098wd)), org.telegram.messenger.g0.T2(hd.a0(null, null, 2131751728, p10.q(this.f53100yd.V)), new qx0(this, this.f53099xd, 2))).j();
        }
    }
}
