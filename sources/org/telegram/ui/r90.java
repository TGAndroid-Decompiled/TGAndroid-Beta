package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class r90 extends cn {
    public boolean f49318td;
    public final TLRPC.User f49319ud;
    public final TLRPC.User[] f49320vd;
    public final long f49321wd;

    public r90(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.f49319ud = user;
        this.f49320vd = userArr;
        this.f49321wd = j3;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.f49318td) {
            this.f49318td = true;
            org.telegram.ui.Components.gc.a0(this).I(2131623989, org.telegram.messenger.id.a0(null, null, 2131751739, org.telegram.messenger.t10.p(this.f49319ud)), org.telegram.messenger.g0.U2(org.telegram.messenger.id.a0(null, null, 2131751740, org.telegram.messenger.t10.p(this.f49320vd[0])), new bi.r3(this, this.f49321wd, 27))).j();
        }
    }
}
