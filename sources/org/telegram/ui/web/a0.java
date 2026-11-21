package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.gd;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;
import org.telegram.ui.bn;
import org.telegram.ui.qx0;
public final class a0 extends bn {
    public boolean f53093vd;
    public final TLRPC.User f53094wd;
    public final long f53095xd;
    public final v0 f53096yd;

    public a0(v0 v0Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.f53096yd = v0Var;
        this.f53094wd = user;
        this.f53095xd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f53093vd) {
            this.f53093vd = true;
            lc.b0(this).I(2131623990, gd.a0(null, null, 2131751727, o10.q(this.f53094wd)), org.telegram.messenger.g0.T2(gd.a0(null, null, 2131751728, o10.q(this.f53096yd.V)), new qx0(this, this.f53095xd, 2))).j();
        }
    }
}
