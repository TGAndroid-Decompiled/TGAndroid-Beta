package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
public final class yt extends org.telegram.ui.Components.qw0 {
    public final jb.m J;

    public yt(Context context, long j3, jb.m mVar) {
        super(context);
        this.J = mVar;
        this.f39006a = new RectF();
        this.f39010f = 0.0f;
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true);
        this.f39012r = m6Var;
        org.telegram.ui.Components.m6 m6Var2 = new org.telegram.ui.Components.m6(false, true, false);
        this.f39013s = m6Var2;
        m6Var.setCallback(this);
        m6Var2.setCallback(this);
        this.f39011n = Long.valueOf(j3);
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        a9Var.f33433p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.I0(this);
        if (j3 == Long.MAX_VALUE) {
            this.f39014w = org.telegram.messenger.gd.N0(2131752635, null);
            a9Var.g(14);
            imageReceiver.j0(null, a9Var, null);
            return;
        }
        String H = org.telegram.messenger.n5.H(imageReceiver, a9Var, org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).g2(j3));
        this.f39014w = H;
        this.f39014w = org.telegram.messenger.j6.m(H, null, false, null, 0);
    }

    @Override
    public final void b() {
        jb.m mVar = this.J;
        y6 y6Var = (y6) mVar.f17465c;
        y6Var.f54241a0.dismiss();
        Bundle bundle = new Bundle();
        long j3 = ((s6) mVar.f17464b).f51980a;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        y6Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
