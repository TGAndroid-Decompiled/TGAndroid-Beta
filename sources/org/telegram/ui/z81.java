package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class z81 extends AnimatorListenerAdapter {
    public final int f43689a;
    public final b91 f43690b;

    public z81(b91 b91Var, int i10) {
        this.f43689a = i10;
        this.f43690b = b91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43689a) {
            case 0:
                b91 b91Var = this.f43690b;
                b91Var.f35589b.setVisibility(4);
                jg.g gVar = b91Var.f35589b;
                gVar.J = false;
                jg.g gVar2 = b91Var.f35590c;
                gVar2.J = true;
                gVar.f14488y0 = 0;
                gVar2.f14488y0 = 0;
                Window window = b91Var.f35588a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                b91 b91Var2 = this.f43690b;
                jg.g gVar3 = b91Var2.f35590c;
                gVar3.setVisibility(4);
                jg.g gVar4 = b91Var2.f35589b;
                gVar4.f14488y0 = 0;
                gVar3.f14488y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof jg.q)) {
                    gVar4.f14481u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f14461g0.f14502k) - jg.g.f14430k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f14481u0 = false;
                    gVar4.d();
                }
                Window window2 = b91Var2.f35588a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                b91 b91Var3 = this.f43690b;
                b91Var3.f35589b.f14488y0 = 0;
                b91Var3.e.setVisibility(8);
                return;
        }
    }
}
