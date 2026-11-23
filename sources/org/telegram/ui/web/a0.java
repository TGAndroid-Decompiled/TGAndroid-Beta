package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kc;
import org.telegram.ui.bn;
import org.telegram.ui.ox0;
public final class a0 extends bn {
    public boolean f53325vd;
    public final TLRPC.User f53326wd;
    public final long f53327xd;
    public final v0 f53328yd;

    public a0(v0 v0Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.f53328yd = v0Var;
        this.f53326wd = user;
        this.f53327xd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f53325vd) {
            this.f53325vd = true;
            kc.b0(this).I(2131623990, gd.a0(null, null, 2131751727, n10.q(this.f53326wd)), org.telegram.messenger.g0.T2(gd.a0(null, null, 2131751728, n10.q(this.f53328yd.V)), new ox0(this, this.f53327xd, 2))).j();
        }
    }
}
