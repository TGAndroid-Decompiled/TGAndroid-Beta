package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.hd;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hc;
import org.telegram.ui.an;
import org.telegram.ui.p31;
public final class b0 extends an {
    public boolean f51094rd;
    public final TLRPC.User f51095sd;
    public final long f51096td;
    public final x0 f51097ud;

    public b0(x0 x0Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.f51097ud = x0Var;
        this.f51095sd = user;
        this.f51096td = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f51094rd) {
            this.f51094rd = true;
            hc.a0(this).I(2131623989, hd.a0(null, null, 2131751740, t10.p(this.f51095sd)), org.telegram.messenger.g0.U2(hd.a0(null, null, 2131751741, t10.p(this.f51097ud.U)), new p31(this, this.f51096td, 1))).j();
        }
    }
}
