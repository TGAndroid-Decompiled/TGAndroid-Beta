package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class r90 extends bn {
    public boolean f51522vd;
    public final TLRPC.User f51523wd;
    public final TLRPC.User[] f51524xd;
    public final long f51525yd;

    public r90(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.f51523wd = user;
        this.f51524xd = userArr;
        this.f51525yd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f51522vd) {
            this.f51522vd = true;
            org.telegram.ui.Components.lc.b0(this).I(2131623990, org.telegram.messenger.hd.a0(null, null, 2131751727, org.telegram.messenger.p10.q(this.f51523wd)), org.telegram.messenger.g0.T2(org.telegram.messenger.hd.a0(null, null, 2131751728, org.telegram.messenger.p10.q(this.f51524xd[0])), new bi.c4(this, this.f51525yd, 28))).j();
        }
    }
}
