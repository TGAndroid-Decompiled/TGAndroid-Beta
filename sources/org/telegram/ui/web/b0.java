package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.id;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hc;
import org.telegram.ui.an;
import org.telegram.ui.p31;
public final class b0 extends an {
    public boolean f51101rd;
    public final TLRPC.User f51102sd;
    public final long f51103td;
    public final x0 f51104ud;

    public b0(x0 x0Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.f51104ud = x0Var;
        this.f51102sd = user;
        this.f51103td = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f51101rd) {
            this.f51101rd = true;
            hc.a0(this).I(2131623989, id.a0(null, null, 2131751740, t10.p(this.f51102sd)), org.telegram.messenger.g0.U2(id.a0(null, null, 2131751741, t10.p(this.f51104ud.U)), new p31(this, this.f51103td, 1))).j();
        }
    }
}
