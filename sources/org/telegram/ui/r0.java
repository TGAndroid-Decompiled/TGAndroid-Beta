package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f51564a;
    public final int f51565b;
    public final org.telegram.messenger.fs f51566c;

    public r0(org.telegram.messenger.fs fsVar, int i7, int i10) {
        this.f51564a = i10;
        this.f51566c = fsVar;
        this.f51565b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51564a) {
            case 0:
                g4 g4Var = (g4) this.f51566c;
                g4Var.f48084v0[1].b();
                g4Var.f48084v0[1].setVisibility(8);
                g4Var.Q0.S(g4Var.f48084v0[0].f49288b);
                org.telegram.ui.Cells.i9 i9Var = g4Var.Q0;
                k3[] k3VarArr = g4Var.f48084v0;
                i9Var.f30933z0 = k3VarArr[0].d;
                int i7 = this.f51565b;
                k3VarArr[i7].setBackgroundDrawable(null);
                g4Var.f48084v0[i7].setLayerType(0, null);
                g4Var.f48085w0 = null;
                g4Var.f48070g0.f30421f = false;
                return;
            default:
                ((LaunchActivity) this.f51566c).D0(this.f51565b);
                return;
        }
    }
}
