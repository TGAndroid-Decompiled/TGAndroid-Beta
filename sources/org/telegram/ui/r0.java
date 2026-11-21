package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f51404a;
    public final int f51405b;
    public final org.telegram.messenger.fs f51406c;

    public r0(org.telegram.messenger.fs fsVar, int i7, int i10) {
        this.f51404a = i10;
        this.f51406c = fsVar;
        this.f51405b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51404a) {
            case 0:
                g4 g4Var = (g4) this.f51406c;
                g4Var.f47969v0[1].b();
                g4Var.f47969v0[1].setVisibility(8);
                g4Var.Q0.S(g4Var.f47969v0[0].f49178b);
                org.telegram.ui.Cells.j9 j9Var = g4Var.Q0;
                k3[] k3VarArr = g4Var.f47969v0;
                j9Var.f30930z0 = k3VarArr[0].d;
                int i7 = this.f51405b;
                k3VarArr[i7].setBackgroundDrawable(null);
                g4Var.f47969v0[i7].setLayerType(0, null);
                g4Var.f47970w0 = null;
                g4Var.f47955g0.f30359f = false;
                return;
            default:
                ((LaunchActivity) this.f51406c).D0(this.f51405b);
                return;
        }
    }
}
