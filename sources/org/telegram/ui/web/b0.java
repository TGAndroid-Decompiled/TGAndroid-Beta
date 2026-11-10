package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.id;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.cn;
import org.telegram.ui.r31;
public final class b0 extends cn {
    public boolean f51036td;
    public final TLRPC.User f51037ud;
    public final long f51038vd;
    public final x0 f51039wd;

    public b0(x0 x0Var, Bundle bundle, TLRPC.User user, long j3) {
        super(bundle);
        this.f51039wd = x0Var;
        this.f51037ud = user;
        this.f51038vd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f51036td) {
            this.f51036td = true;
            gc.a0(this).I(2131623989, id.a0(null, null, 2131751739, t10.p(this.f51037ud)), org.telegram.messenger.g0.U2(id.a0(null, null, 2131751740, t10.p(this.f51039wd.U)), new r31(this, this.f51038vd, 1))).j();
        }
    }
}
