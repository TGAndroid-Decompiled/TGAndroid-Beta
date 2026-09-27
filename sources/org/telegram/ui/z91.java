package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class z91 extends AnimatorListenerAdapter {
    public final int f40449a;
    public final ba1 f40450b;

    public z91(ba1 ba1Var, int i10) {
        this.f40449a = i10;
        this.f40450b = ba1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40449a) {
            case 0:
                ba1 ba1Var = this.f40450b;
                ba1Var.f32302b.setVisibility(4);
                ig.g gVar = ba1Var.f32302b;
                gVar.J = false;
                ig.g gVar2 = ba1Var.f32303c;
                gVar2.J = true;
                gVar.f11163y0 = 0;
                gVar2.f11163y0 = 0;
                Window window = ba1Var.f32301a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                ba1 ba1Var2 = this.f40450b;
                ig.g gVar3 = ba1Var2.f32303c;
                gVar3.setVisibility(4);
                ig.g gVar4 = ba1Var2.f32302b;
                gVar4.f11163y0 = 0;
                gVar3.f11163y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof ig.q)) {
                    gVar4.f11156u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f11136g0.f11177k) - ig.g.f11105k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f11156u0 = false;
                    gVar4.d();
                }
                Window window2 = ba1Var2.f32301a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                ba1 ba1Var3 = this.f40450b;
                ba1Var3.f32302b.f11163y0 = 0;
                ba1Var3.e.setVisibility(8);
                return;
        }
    }
}
