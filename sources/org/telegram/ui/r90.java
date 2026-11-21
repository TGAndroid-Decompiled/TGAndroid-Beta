package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class r90 extends bn {
    public boolean f51518vd;
    public final TLRPC.User f51519wd;
    public final TLRPC.User[] f51520xd;
    public final long f51521yd;

    public r90(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.f51519wd = user;
        this.f51520xd = userArr;
        this.f51521yd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f51518vd) {
            this.f51518vd = true;
            org.telegram.ui.Components.lc.b0(this).I(2131623990, org.telegram.messenger.gd.a0(null, null, 2131751727, org.telegram.messenger.o10.q(this.f51519wd)), org.telegram.messenger.g0.T2(org.telegram.messenger.gd.a0(null, null, 2131751728, org.telegram.messenger.o10.q(this.f51520xd[0])), new bi.c4(this, this.f51521yd, 28))).j();
        }
    }
}
