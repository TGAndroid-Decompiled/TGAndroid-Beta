package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
public final class yu extends org.telegram.ui.Components.jx0 {
    public final m4.c I;

    public yu(Context context, long j10, m4.c cVar) {
        super(context);
        this.I = cVar;
        this.f27510a = new RectF();
        this.f27513f = 0.0f;
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.f27515r = e6Var;
        org.telegram.ui.Components.e6 e6Var2 = new org.telegram.ui.Components.e6(false, true, false);
        this.f27516s = e6Var2;
        e6Var.setCallback(this);
        e6Var2.setCallback(this);
        this.f27514n = Long.valueOf(j10);
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.f29871p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.H0(this);
        if (j10 == Long.MAX_VALUE) {
            this.f27517w = org.telegram.messenger.cd.L0(2131752647, null);
            r8Var.g(14);
            imageReceiver.i0(null, r8Var, null);
            return;
        }
        String H = org.telegram.messenger.o5.H(imageReceiver, r8Var, org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).d2(j10));
        this.f27517w = H;
        this.f27517w = org.telegram.messenger.k6.m(H, null, false, null, 0);
    }

    @Override
    public final void b() {
        m4.c cVar = this.I;
        y6 y6Var = (y6) cVar.f12706c;
        y6Var.Z.dismiss();
        Bundle bundle = new Bundle();
        long j10 = ((s6) cVar.f12705b).f41380a;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        y6Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
