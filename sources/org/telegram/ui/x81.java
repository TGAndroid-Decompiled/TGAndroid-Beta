package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class x81 extends AnimatorListenerAdapter {
    public final int f43173a;
    public final z81 f43174b;

    public x81(z81 z81Var, int i10) {
        this.f43173a = i10;
        this.f43174b = z81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43173a) {
            case 0:
                z81 z81Var = this.f43174b;
                z81Var.f43675b.setVisibility(4);
                jg.g gVar = z81Var.f43675b;
                gVar.J = false;
                jg.g gVar2 = z81Var.f43676c;
                gVar2.J = true;
                gVar.f14488y0 = 0;
                gVar2.f14488y0 = 0;
                Window window = z81Var.f43674a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                z81 z81Var2 = this.f43174b;
                jg.g gVar3 = z81Var2.f43676c;
                gVar3.setVisibility(4);
                jg.g gVar4 = z81Var2.f43675b;
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
                Window window2 = z81Var2.f43674a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                z81 z81Var3 = this.f43174b;
                z81Var3.f43675b.f14488y0 = 0;
                z81Var3.e.setVisibility(8);
                return;
        }
    }
}
