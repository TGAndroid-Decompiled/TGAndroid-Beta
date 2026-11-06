package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
public final class vt extends org.telegram.ui.Components.fw0 {
    public final m4.d0 I;

    public vt(Context context, long j3, m4.d0 d0Var) {
        super(context);
        this.I = d0Var;
        this.f33697a = new RectF();
        this.f33701f = 0.0f;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.f33703r = i6Var;
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, true, false);
        this.f33704s = i6Var2;
        i6Var.setCallback(this);
        i6Var2.setCallback(this);
        this.f33702n = Long.valueOf(j3);
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        w8Var.f39905p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.H0(this);
        if (j3 == Long.MAX_VALUE) {
            this.f33705w = org.telegram.messenger.hd.M0(2131752647, null);
            w8Var.g(14);
            imageReceiver.i0(null, w8Var, null);
            return;
        }
        String H = org.telegram.messenger.m5.H(imageReceiver, w8Var, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).e2(j3));
        this.f33705w = H;
        this.f33705w = org.telegram.messenger.i6.m(H, null, false, null, 0);
    }

    @Override
    public final void b() {
        m4.d0 d0Var = this.I;
        y6 y6Var = (y6) d0Var.f19609b;
        y6Var.Z.dismiss();
        Bundle bundle = new Bundle();
        long j3 = ((s6) d0Var.f19608a).f49640a;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        y6Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
