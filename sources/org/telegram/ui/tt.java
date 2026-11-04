package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
public final class tt extends org.telegram.ui.Components.ew0 {
    public final m2.t J;

    public tt(Context context, long j10, m2.t tVar) {
        super(context);
        this.J = tVar;
        this.f33480a = new RectF();
        this.f33484f = 0.0f;
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.f33486r = g6Var;
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(false, true, false);
        this.f33487s = g6Var2;
        g6Var.setCallback(this);
        g6Var2.setCallback(this);
        this.f33485n = Long.valueOf(j10);
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.f38691p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.H0(this);
        if (j10 == Long.MAX_VALUE) {
            this.f33488w = org.telegram.messenger.bd.M0(2131752647, null);
            u8Var.g(14);
            imageReceiver.i0(null, u8Var, null);
            return;
        }
        String H = org.telegram.messenger.m5.H(imageReceiver, u8Var, org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).e2(j10));
        this.f33488w = H;
        this.f33488w = org.telegram.messenger.i6.m(H, null, false, null, 0);
    }

    @Override
    public final void b() {
        m2.t tVar = this.J;
        z6 z6Var = (z6) tVar.f19007c;
        z6Var.f52546a0.dismiss();
        Bundle bundle = new Bundle();
        long j10 = ((t6) tVar.f19006b).f49713a;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        z6Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
