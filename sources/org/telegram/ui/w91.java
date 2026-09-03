package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class w91 extends AnimatorListenerAdapter {
    public final int f39322a;
    public final y91 f39323b;

    public w91(y91 y91Var, int i10) {
        this.f39322a = i10;
        this.f39323b = y91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39322a) {
            case 0:
                y91 y91Var = this.f39323b;
                y91Var.f40190b.setVisibility(4);
                vf.g gVar = y91Var.f40190b;
                gVar.G = false;
                vf.g gVar2 = y91Var.f40191c;
                gVar2.G = true;
                gVar.f45816v0 = 0;
                gVar2.f45816v0 = 0;
                Window window = y91Var.f40189a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                y91 y91Var2 = this.f39323b;
                vf.g gVar3 = y91Var2.f40191c;
                gVar3.setVisibility(4);
                vf.g gVar4 = y91Var2.f40190b;
                gVar4.f45816v0 = 0;
                gVar3.f45816v0 = 0;
                gVar4.G = true;
                gVar3.G = false;
                if (!(gVar4 instanceof vf.q)) {
                    gVar4.f45811r0 = true;
                    gVar4.x((gVar4.D0 * gVar4.f45791d0.f45836k) - vf.g.f45764h1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f45811r0 = false;
                    gVar4.d();
                }
                Window window2 = y91Var2.f40189a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                y91 y91Var3 = this.f39323b;
                y91Var3.f40190b.f45816v0 = 0;
                y91Var3.e.setVisibility(8);
                return;
        }
    }
}
