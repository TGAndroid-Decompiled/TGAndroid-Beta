package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class ta0 extends un {
    public boolean f41780jd;
    public final TLRPC.User f41781kd;
    public final TLRPC.User[] f41782ld;
    public final long f41783md;

    public ta0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j10) {
        super(bundle);
        this.f41781kd = user;
        this.f41782ld = userArr;
        this.f41783md = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f41780jd) {
            this.f41780jd = true;
            org.telegram.ui.Components.cc.a0(this).I(2131623989, org.telegram.messenger.cd.a0(null, null, 2131751740, org.telegram.messenger.h20.p(this.f41781kd)), org.telegram.messenger.i0.T2(org.telegram.messenger.cd.a0(null, null, 2131751741, org.telegram.messenger.h20.p(this.f41782ld[0])), new bi.e(this, this.f41783md, 16))).j();
        }
    }
}
