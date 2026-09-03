package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class v91 extends AnimatorListenerAdapter {
    public final int f42072a;
    public final x91 f42073b;

    public v91(x91 x91Var, int i10) {
        this.f42072a = i10;
        this.f42073b = x91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42072a) {
            case 0:
                x91 x91Var = this.f42073b;
                x91Var.f42966b.setVisibility(4);
                wf.g gVar = x91Var.f42966b;
                gVar.G = false;
                wf.g gVar2 = x91Var.f42967c;
                gVar2.G = true;
                gVar.f49613v0 = 0;
                gVar2.f49613v0 = 0;
                Window window = x91Var.f42965a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                x91 x91Var2 = this.f42073b;
                wf.g gVar3 = x91Var2.f42967c;
                gVar3.setVisibility(4);
                wf.g gVar4 = x91Var2.f42966b;
                gVar4.f49613v0 = 0;
                gVar3.f49613v0 = 0;
                gVar4.G = true;
                gVar3.G = false;
                if (!(gVar4 instanceof wf.q)) {
                    gVar4.f49608r0 = true;
                    gVar4.x((gVar4.D0 * gVar4.f49587d0.f49635k) - wf.g.f49560h1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f49608r0 = false;
                    gVar4.d();
                }
                Window window2 = x91Var2.f42965a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                x91 x91Var3 = this.f42073b;
                x91Var3.f42966b.f49613v0 = 0;
                x91Var3.f42968e.setVisibility(8);
                return;
        }
    }
}
