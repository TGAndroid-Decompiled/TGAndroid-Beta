package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class r90 extends bn {
    public boolean f51529vd;
    public final TLRPC.User f51530wd;
    public final TLRPC.User[] f51531xd;
    public final long f51532yd;

    public r90(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.f51530wd = user;
        this.f51531xd = userArr;
        this.f51532yd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f51529vd) {
            this.f51529vd = true;
            org.telegram.ui.Components.lc.b0(this).I(2131623990, org.telegram.messenger.gd.a0(null, null, 2131751728, org.telegram.messenger.o10.q(this.f51530wd)), org.telegram.messenger.g0.T2(org.telegram.messenger.gd.a0(null, null, 2131751729, org.telegram.messenger.o10.q(this.f51531xd[0])), new bi.y3(this, this.f51532yd, 28))).j();
        }
    }
}
