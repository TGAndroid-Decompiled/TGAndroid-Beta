package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class r90 extends bn {
    public boolean f51553vd;
    public final TLRPC.User f51554wd;
    public final TLRPC.User[] f51555xd;
    public final long f51556yd;

    public r90(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.f51554wd = user;
        this.f51555xd = userArr;
        this.f51556yd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f51553vd) {
            this.f51553vd = true;
            org.telegram.ui.Components.lc.b0(this).I(2131623990, org.telegram.messenger.hd.a0(null, null, 2131751727, org.telegram.messenger.p10.q(this.f51554wd)), org.telegram.messenger.g0.T2(org.telegram.messenger.hd.a0(null, null, 2131751728, org.telegram.messenger.p10.q(this.f51555xd[0])), new bi.e4(this, this.f51556yd, 28))).j();
        }
    }
}
