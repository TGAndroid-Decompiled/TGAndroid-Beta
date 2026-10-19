package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class x81 extends AnimatorListenerAdapter {
    public final int f43164a;
    public final z81 f43165b;

    public x81(z81 z81Var, int i10) {
        this.f43164a = i10;
        this.f43165b = z81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43164a) {
            case 0:
                z81 z81Var = this.f43165b;
                z81Var.f43670b.setVisibility(4);
                jg.g gVar = z81Var.f43670b;
                gVar.J = false;
                jg.g gVar2 = z81Var.f43671c;
                gVar2.J = true;
                gVar.f14490y0 = 0;
                gVar2.f14490y0 = 0;
                Window window = z81Var.f43669a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                z81 z81Var2 = this.f43165b;
                jg.g gVar3 = z81Var2.f43671c;
                gVar3.setVisibility(4);
                jg.g gVar4 = z81Var2.f43670b;
                gVar4.f14490y0 = 0;
                gVar3.f14490y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof jg.q)) {
                    gVar4.f14483u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f14463g0.f14504k) - jg.g.f14432k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f14483u0 = false;
                    gVar4.d();
                }
                Window window2 = z81Var2.f43669a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                z81 z81Var3 = this.f43165b;
                z81Var3.f43670b.f14490y0 = 0;
                z81Var3.e.setVisibility(8);
                return;
        }
    }
}
