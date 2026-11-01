package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class sa0 extends un {
    public boolean f41297kd;
    public final TLRPC.User f41298ld;
    public final TLRPC.User[] f41299md;
    public final long f41300nd;

    public sa0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j10) {
        super(bundle);
        this.f41298ld = user;
        this.f41299md = userArr;
        this.f41300nd = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f41297kd) {
            this.f41297kd = true;
            org.telegram.ui.Components.cc.a0(this).I(2131623989, org.telegram.messenger.dd.a0(null, null, 2131751740, org.telegram.messenger.i20.p(this.f41298ld)), org.telegram.messenger.i0.T2(org.telegram.messenger.dd.a0(null, null, 2131751741, org.telegram.messenger.i20.p(this.f41299md[0])), new bi.e(this, this.f41300nd, 16))).j();
        }
    }
}
