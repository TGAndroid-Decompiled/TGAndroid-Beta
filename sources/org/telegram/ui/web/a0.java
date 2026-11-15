package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.hd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.an;
import org.telegram.ui.n31;
public final class a0 extends an {
    public boolean f52565ud;
    public final TLRPC.User f52566vd;
    public final long f52567wd;
    public final v0 f52568xd;

    public a0(v0 v0Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.f52568xd = v0Var;
        this.f52566vd = user;
        this.f52567wd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f52565ud) {
            this.f52565ud = true;
            cc.a0(this).I(2131623990, hd.a0(null, null, 2131751739, q10.p(this.f52566vd)), org.telegram.messenger.g0.U2(hd.a0(null, null, 2131751740, q10.p(this.f52568xd.V)), new n31(this, this.f52567wd, 1))).j();
        }
    }
}
