package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f50812a;
    public final int f50813b;
    public final org.telegram.messenger.is f50814c;

    public r0(org.telegram.messenger.is isVar, int i7, int i10) {
        this.f50812a = i10;
        this.f50814c = isVar;
        this.f50813b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50812a) {
            case 0:
                g4 g4Var = (g4) this.f50814c;
                g4Var.f47336v0[1].b();
                g4Var.f47336v0[1].setVisibility(8);
                g4Var.Q0.S(g4Var.f47336v0[0].f48549b);
                org.telegram.ui.Cells.h9 h9Var = g4Var.Q0;
                k3[] k3VarArr = g4Var.f47336v0;
                h9Var.f30421z0 = k3VarArr[0].d;
                int i7 = this.f50813b;
                k3VarArr[i7].setBackgroundDrawable(null);
                g4Var.f47336v0[i7].setLayerType(0, null);
                g4Var.f47337w0 = null;
                g4Var.f47322g0.f29956f = false;
                return;
            default:
                ((LaunchActivity) this.f50814c).D0(this.f50813b);
                return;
        }
    }
}
