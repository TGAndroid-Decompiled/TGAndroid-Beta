package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
public final class zt extends org.telegram.ui.Components.rw0 {
    public final k8.a J;

    public zt(Context context, long j3, k8.a aVar) {
        super(context);
        this.J = aVar;
        this.f39312a = new RectF();
        this.f39316f = 0.0f;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true);
        this.f39318r = n6Var;
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(false, true, false);
        this.f39319s = n6Var2;
        n6Var.setCallback(this);
        n6Var2.setCallback(this);
        this.f39317n = Long.valueOf(j3);
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.f33779p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.H0(this);
        if (j3 == Long.MAX_VALUE) {
            this.f39320w = org.telegram.messenger.hd.N0(2131752635, null);
            b9Var.g(14);
            imageReceiver.i0(null, b9Var, null);
            return;
        }
        String H = org.telegram.messenger.n5.H(imageReceiver, b9Var, org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24932t0).g2(j3));
        this.f39320w = H;
        this.f39320w = org.telegram.messenger.j6.m(H, null, false, null, 0);
    }

    @Override
    public final void b() {
        k8.a aVar = this.J;
        x6 x6Var = (x6) aVar.f18178c;
        x6Var.f53571a0.dismiss();
        Bundle bundle = new Bundle();
        long j3 = ((r6) aVar.f18177b).f51495a;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        x6Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
