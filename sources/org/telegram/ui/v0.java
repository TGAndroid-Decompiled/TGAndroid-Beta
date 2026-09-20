package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class v0 extends AnimatorListenerAdapter {
    public final h4 f38373a;

    public v0(h4 h4Var) {
        this.f38373a = h4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h4 h4Var = this.f38373a;
        if (h4Var.f34100f0.f19975f) {
            h4Var.f34114u0[0].setBackgroundDrawable(null);
            l3[] l3VarArr = h4Var.f34114u0;
            l3 l3Var = l3VarArr[1];
            l3VarArr[1] = l3VarArr[0];
            l3VarArr[0] = l3Var;
            h4Var.f34102h0.i();
            h4Var.Z0.a(h4Var.f34114u0[0].getBackgroundColor(), true);
            h4Var.f34095a1.a(h4Var.f34114u0[1].getBackgroundColor(), true);
            u3 u3Var = h4Var.K;
            if (u3Var != null) {
                u3Var.m();
            }
            Object x10 = hg.k0.x(1, h4Var.f34098d0);
            h4Var.O0.T(h4Var.f34114u0[0].f35287b);
            org.telegram.ui.Cells.r9 r9Var = h4Var.O0;
            r9Var.E0 = h4Var.f34114u0[0].d;
            r9Var.f(true);
            h4Var.i0(false);
            h4Var.f0();
            h4Var.f34114u0[1].b();
            h4Var.f34114u0[1].setVisibility(8);
            if (x10 instanceof y2) {
                ((y2) x10).a();
            }
            if (x10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.j2.o((TLRPC.WebPage) x10);
            }
        } else {
            h4Var.U();
            h4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = h4Var.f34100f0;
        articleViewer$WindowView.f19975f = false;
        articleViewer$WindowView.d = false;
        h4Var.T0 = false;
    }
}
