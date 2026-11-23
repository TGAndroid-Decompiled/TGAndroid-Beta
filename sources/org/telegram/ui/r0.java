package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f51374a;
    public final int f51375b;
    public final org.telegram.messenger.gs f51376c;

    public r0(org.telegram.messenger.gs gsVar, int i7, int i10) {
        this.f51374a = i10;
        this.f51376c = gsVar;
        this.f51375b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51374a) {
            case 0:
                g4 g4Var = (g4) this.f51376c;
                g4Var.f47920v0[1].b();
                g4Var.f47920v0[1].setVisibility(8);
                g4Var.Q0.S(g4Var.f47920v0[0].f49136b);
                org.telegram.ui.Cells.j9 j9Var = g4Var.Q0;
                k3[] k3VarArr = g4Var.f47920v0;
                j9Var.f30899z0 = k3VarArr[0].d;
                int i7 = this.f51375b;
                k3VarArr[i7].setBackgroundDrawable(null);
                g4Var.f47920v0[i7].setLayerType(0, null);
                g4Var.f47921w0 = null;
                g4Var.f47906g0.f30328f = false;
                return;
            default:
                ((LaunchActivity) this.f51376c).D0(this.f51375b);
                return;
        }
    }
}
