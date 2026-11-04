package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class z31 extends AnimatorListenerAdapter {
    public final int f52523a;
    public final b41 f52524b;

    public z31(b41 b41Var, int i3) {
        this.f52523a = i3;
        this.f52524b = b41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52523a) {
            case 0:
                b41 b41Var = this.f52524b;
                b41Var.f43918b.setVisibility(4);
                mg.g gVar = b41Var.f43918b;
                gVar.K = false;
                mg.g gVar2 = b41Var.f43919c;
                gVar2.K = true;
                gVar.f19370z0 = 0;
                gVar2.f19370z0 = 0;
                Window window = b41Var.f43917a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                b41 b41Var2 = this.f52524b;
                mg.g gVar3 = b41Var2.f43919c;
                gVar3.setVisibility(4);
                mg.g gVar4 = b41Var2.f43918b;
                gVar4.f19370z0 = 0;
                gVar3.f19370z0 = 0;
                gVar4.K = true;
                gVar3.K = false;
                if (!(gVar4 instanceof mg.q)) {
                    gVar4.f19363v0 = true;
                    gVar4.x((gVar4.H0 * gVar4.f19344h0.f19385k) - mg.g.f19311l1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f19363v0 = false;
                    gVar4.d();
                }
                Window window2 = b41Var2.f43917a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                b41 b41Var3 = this.f52524b;
                b41Var3.f43918b.f19370z0 = 0;
                b41Var3.f43920e.setVisibility(8);
                return;
        }
    }
}
