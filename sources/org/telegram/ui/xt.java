package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
public final class xt extends org.telegram.ui.Components.iw0 {
    public final k8.a J;

    public xt(Context context, long j3, k8.a aVar) {
        super(context);
        this.J = aVar;
        this.f35733a = new RectF();
        this.f35737f = 0.0f;
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.f35739r = g6Var;
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(false, true, false);
        this.f35740s = g6Var2;
        g6Var.setCallback(this);
        g6Var2.setCallback(this);
        this.f35738n = Long.valueOf(j3);
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        t8Var.f39598p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.H0(this);
        if (j3 == Long.MAX_VALUE) {
            this.f35741w = org.telegram.messenger.hd.M0(2131752647, null);
            t8Var.g(14);
            imageReceiver.i0(null, t8Var, null);
            return;
        }
        String H = org.telegram.messenger.m5.H(imageReceiver, t8Var, org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).e2(j3));
        this.f35741w = H;
        this.f35741w = org.telegram.messenger.j6.m(H, null, false, null, 0);
    }

    @Override
    public final void b() {
        k8.a aVar = this.J;
        y6 y6Var = (y6) aVar.f17789c;
        y6Var.f53439a0.dismiss();
        Bundle bundle = new Bundle();
        long j3 = ((s6) aVar.f17788b).f51112a;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        y6Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
