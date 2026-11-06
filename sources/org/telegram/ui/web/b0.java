package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.hd;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hc;
import org.telegram.ui.an;
import org.telegram.ui.p31;
public final class b0 extends an {
    public boolean f51089rd;
    public final TLRPC.User f51090sd;
    public final long f51091td;
    public final x0 f51092ud;

    public b0(x0 x0Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.f51092ud = x0Var;
        this.f51090sd = user;
        this.f51091td = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f51089rd) {
            this.f51089rd = true;
            hc.a0(this).I(2131623989, hd.a0(null, null, 2131751740, t10.p(this.f51090sd)), org.telegram.messenger.g0.U2(hd.a0(null, null, 2131751741, t10.p(this.f51092ud.U)), new p31(this, this.f51091td, 1))).j();
        }
    }
}
