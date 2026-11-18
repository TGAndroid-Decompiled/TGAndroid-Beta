package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f51390a;
    public final int f51391b;
    public final org.telegram.messenger.fs f51392c;

    public r0(org.telegram.messenger.fs fsVar, int i7, int i10) {
        this.f51390a = i10;
        this.f51392c = fsVar;
        this.f51391b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51390a) {
            case 0:
                g4 g4Var = (g4) this.f51392c;
                g4Var.f47935v0[1].b();
                g4Var.f47935v0[1].setVisibility(8);
                g4Var.Q0.S(g4Var.f47935v0[0].f49158b);
                org.telegram.ui.Cells.i9 i9Var = g4Var.Q0;
                k3[] k3VarArr = g4Var.f47935v0;
                i9Var.f30838z0 = k3VarArr[0].d;
                int i7 = this.f51391b;
                k3VarArr[i7].setBackgroundDrawable(null);
                g4Var.f47935v0[i7].setLayerType(0, null);
                g4Var.f47936w0 = null;
                g4Var.f47921g0.f30333f = false;
                return;
            default:
                ((LaunchActivity) this.f51392c).D0(this.f51391b);
                return;
        }
    }
}
