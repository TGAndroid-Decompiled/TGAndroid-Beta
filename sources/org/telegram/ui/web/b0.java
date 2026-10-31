package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.un;
public final class b0 extends un {
    public boolean f42991jd;
    public final TLRPC.User f42992kd;
    public final long f42993ld;
    public final z0 f42994md;

    public b0(z0 z0Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.f42994md = z0Var;
        this.f42992kd = user;
        this.f42993ld = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f42991jd) {
            this.f42991jd = true;
            cc.a0(this).I(2131623989, cd.a0(null, null, 2131751740, h20.p(this.f42992kd)), org.telegram.messenger.i0.T2(cd.a0(null, null, 2131751741, h20.p(this.f42994md.U)), new bi.e(this, this.f42993ld, 20))).j();
        }
    }
}
