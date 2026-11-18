package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f51350a;
    public final int f51351b;
    public final org.telegram.messenger.fs f51352c;

    public r0(org.telegram.messenger.fs fsVar, int i7, int i10) {
        this.f51350a = i10;
        this.f51352c = fsVar;
        this.f51351b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51350a) {
            case 0:
                g4 g4Var = (g4) this.f51352c;
                g4Var.f47899v0[1].b();
                g4Var.f47899v0[1].setVisibility(8);
                g4Var.Q0.S(g4Var.f47899v0[0].f49135b);
                org.telegram.ui.Cells.j9 j9Var = g4Var.Q0;
                k3[] k3VarArr = g4Var.f47899v0;
                j9Var.f30902z0 = k3VarArr[0].d;
                int i7 = this.f51351b;
                k3VarArr[i7].setBackgroundDrawable(null);
                g4Var.f47899v0[i7].setLayerType(0, null);
                g4Var.f47900w0 = null;
                g4Var.f47885g0.f30331f = false;
                return;
            default:
                ((LaunchActivity) this.f51352c).D0(this.f51351b);
                return;
        }
    }
}
