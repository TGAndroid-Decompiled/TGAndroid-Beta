package org.telegram.ui.web;

import android.os.Bundle;
import org.telegram.messenger.bd;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fc;
import org.telegram.ui.f31;
import org.telegram.ui.wm;
public final class b0 extends wm {
    public boolean f50814sd;
    public final TLRPC.User f50815td;
    public final long f50816ud;
    public final w0 f50817vd;

    public b0(w0 w0Var, Bundle bundle, TLRPC.User user, long j10) {
        super(bundle);
        this.f50817vd = w0Var;
        this.f50815td = user;
        this.f50816ud = j10;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f50814sd) {
            this.f50814sd = true;
            fc.a0(this).I(2131623989, bd.a0(null, null, 2131751740, l10.p(this.f50815td)), org.telegram.messenger.g0.U2(bd.a0(null, null, 2131751741, l10.p(this.f50817vd.V)), new f31(this, this.f50816ud, 1))).j();
        }
    }
}
