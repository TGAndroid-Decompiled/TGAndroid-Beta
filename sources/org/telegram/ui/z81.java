package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class z81 extends AnimatorListenerAdapter {
    public final int f43698a;
    public final b91 f43699b;

    public z81(b91 b91Var, int i10) {
        this.f43698a = i10;
        this.f43699b = b91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43698a) {
            case 0:
                b91 b91Var = this.f43699b;
                b91Var.f35605b.setVisibility(4);
                jg.g gVar = b91Var.f35605b;
                gVar.J = false;
                jg.g gVar2 = b91Var.f35606c;
                gVar2.J = true;
                gVar.f14483y0 = 0;
                gVar2.f14483y0 = 0;
                Window window = b91Var.f35604a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                b91 b91Var2 = this.f43699b;
                jg.g gVar3 = b91Var2.f35606c;
                gVar3.setVisibility(4);
                jg.g gVar4 = b91Var2.f35605b;
                gVar4.f14483y0 = 0;
                gVar3.f14483y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof jg.q)) {
                    gVar4.f14476u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f14456g0.f14497k) - jg.g.f14425k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f14476u0 = false;
                    gVar4.d();
                }
                Window window2 = b91Var2.f35604a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                b91 b91Var3 = this.f43699b;
                b91Var3.f35605b.f14483y0 = 0;
                b91Var3.e.setVisibility(8);
                return;
        }
    }
}
