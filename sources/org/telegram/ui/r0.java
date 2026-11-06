package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class r0 extends AnimatorListenerAdapter {
    public final int f49339a;
    public final int f49340b;
    public final Object f49341c;

    public r0(Object obj, int i7, int i10) {
        this.f49339a = i10;
        this.f49341c = obj;
        this.f49340b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49339a) {
            case 0:
                g4 g4Var = (g4) this.f49341c;
                g4Var.f45842u0[1].b();
                g4Var.f45842u0[1].setVisibility(8);
                g4Var.P0.S(g4Var.f45842u0[0].f47087b);
                org.telegram.ui.Cells.i9 i9Var = g4Var.P0;
                k3[] k3VarArr = g4Var.f45842u0;
                i9Var.f29324z0 = k3VarArr[0].d;
                int i7 = this.f49340b;
                k3VarArr[i7].setBackgroundDrawable(null);
                g4Var.f45842u0[i7].setLayerType(0, null);
                g4Var.f45843v0 = null;
                g4Var.f45828f0.f28840f = false;
                return;
            case 1:
                Activity activity = (Activity) this.f49341c;
                int i10 = this.f49340b;
                boolean z9 = false;
                org.telegram.messenger.g0.t3(activity, i10, false);
                if (org.telegram.messenger.g0.B(i10) >= 0.721f) {
                    z9 = true;
                }
                org.telegram.messenger.g0.m3(activity, z9);
                return;
            default:
                ((LaunchActivity) this.f49341c).D0(this.f49340b);
                return;
        }
    }
}
