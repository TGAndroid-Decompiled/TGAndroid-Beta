package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class s0 extends AnimatorListenerAdapter {
    public final int f49314a;
    public final int f49315b;
    public final Object f49316c;

    public s0(Object obj, int i3, int i10) {
        this.f49314a = i10;
        this.f49316c = obj;
        this.f49315b = i3;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49314a) {
            case 0:
                i4 i4Var = (i4) this.f49316c;
                i4Var.f46100v0[1].b();
                i4Var.f46100v0[1].setVisibility(8);
                i4Var.Q0.S(i4Var.f46100v0[0].f47083b);
                org.telegram.ui.Cells.h9 h9Var = i4Var.Q0;
                l3[] l3VarArr = i4Var.f46100v0;
                h9Var.f29362z0 = l3VarArr[0].d;
                int i3 = this.f49315b;
                l3VarArr[i3].setBackgroundDrawable(null);
                i4Var.f46100v0[i3].setLayerType(0, null);
                i4Var.f46101w0 = null;
                i4Var.f46086g0.f28900f = false;
                return;
            case 1:
                Activity activity = (Activity) this.f49316c;
                int i10 = this.f49315b;
                boolean z10 = false;
                org.telegram.messenger.g0.t3(activity, i10, false);
                if (org.telegram.messenger.g0.B(i10) >= 0.721f) {
                    z10 = true;
                }
                org.telegram.messenger.g0.m3(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f49316c).D0(this.f49315b);
                return;
        }
    }
}
