package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class z91 extends AnimatorListenerAdapter {
    public final int f40091a;
    public final ba1 f40092b;

    public z91(ba1 ba1Var, int i10) {
        this.f40091a = i10;
        this.f40092b = ba1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40091a) {
            case 0:
                ba1 ba1Var = this.f40092b;
                ba1Var.f32035b.setVisibility(4);
                ig.g gVar = ba1Var.f32035b;
                gVar.J = false;
                ig.g gVar2 = ba1Var.f32036c;
                gVar2.J = true;
                gVar.f11160y0 = 0;
                gVar2.f11160y0 = 0;
                Window window = ba1Var.f32034a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                ba1 ba1Var2 = this.f40092b;
                ig.g gVar3 = ba1Var2.f32036c;
                gVar3.setVisibility(4);
                ig.g gVar4 = ba1Var2.f32035b;
                gVar4.f11160y0 = 0;
                gVar3.f11160y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof ig.q)) {
                    gVar4.f11153u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f11133g0.f11174k) - ig.g.f11102k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f11153u0 = false;
                    gVar4.d();
                }
                Window window2 = ba1Var2.f32034a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                ba1 ba1Var3 = this.f40092b;
                ba1Var3.f32035b.f11160y0 = 0;
                ba1Var3.e.setVisibility(8);
                return;
        }
    }
}
