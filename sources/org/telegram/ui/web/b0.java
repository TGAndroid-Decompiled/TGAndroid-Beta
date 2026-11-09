package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.id;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hc;
import org.telegram.ui.cn;
import org.telegram.ui.q31;
public final class b0 extends cn {
    public boolean f51082td;
    public final TLRPC.User f51083ud;
    public final long f51084vd;
    public final x0 f51085wd;

    public b0(x0 x0Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.f51085wd = x0Var;
        this.f51083ud = user;
        this.f51084vd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f51082td) {
            this.f51082td = true;
            hc.a0(this).I(2131623989, id.a0(null, null, 2131751739, t10.p(this.f51083ud)), org.telegram.messenger.g0.U2(id.a0(null, null, 2131751740, t10.p(this.f51085wd.U)), new q31(this, this.f51084vd, 1))).j();
        }
    }
}
