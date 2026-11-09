package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class r0 extends AnimatorListenerAdapter {
    public final int f49231a;
    public final int f49232b;
    public final Object f49233c;

    public r0(Object obj, int i7, int i10) {
        this.f49231a = i10;
        this.f49233c = obj;
        this.f49232b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49231a) {
            case 0:
                g4 g4Var = (g4) this.f49233c;
                g4Var.f45902u0[1].b();
                g4Var.f45902u0[1].setVisibility(8);
                g4Var.P0.S(g4Var.f45902u0[0].f47167b);
                org.telegram.ui.Cells.i9 i9Var = g4Var.P0;
                k3[] k3VarArr = g4Var.f45902u0;
                i9Var.f29331z0 = k3VarArr[0].d;
                int i7 = this.f49232b;
                k3VarArr[i7].setBackgroundDrawable(null);
                g4Var.f45902u0[i7].setLayerType(0, null);
                g4Var.f45903v0 = null;
                g4Var.f45888f0.f28847f = false;
                return;
            case 1:
                Activity activity = (Activity) this.f49233c;
                int i10 = this.f49232b;
                boolean z9 = false;
                org.telegram.messenger.g0.t3(activity, i10, false);
                if (org.telegram.messenger.g0.B(i10) >= 0.721f) {
                    z9 = true;
                }
                org.telegram.messenger.g0.m3(activity, z9);
                return;
            default:
                ((LaunchActivity) this.f49233c).D0(this.f49232b);
                return;
        }
    }
}
