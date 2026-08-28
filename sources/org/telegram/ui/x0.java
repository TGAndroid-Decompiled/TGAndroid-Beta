package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class x0 extends AnimatorListenerAdapter {
    public final l4 f44298a;

    public x0(l4 l4Var) {
        this.f44298a = l4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l4 l4Var = this.f44298a;
        y3 y3Var = l4Var.G;
        if (l4Var.f40012b0.f24020e) {
            l4Var.f40026q0[0].setBackgroundDrawable(null);
            p3[] p3VarArr = l4Var.f40026q0;
            p3 p3Var = p3VarArr[1];
            p3VarArr[1] = p3VarArr[0];
            p3VarArr[0] = p3Var;
            l4Var.f40014d0.i();
            l4Var.V0.a(l4Var.f40026q0[0].getBackgroundColor(), true);
            l4Var.W0.a(l4Var.f40026q0[1].getBackgroundColor(), true);
            if (y3Var != null) {
                y3Var.m();
            }
            Object k10 = e2.c.k(1, l4Var.Z);
            l4Var.K0.T(l4Var.f40026q0[0].f41320b);
            org.telegram.ui.Cells.n9 n9Var = l4Var.K0;
            n9Var.E0 = l4Var.f40026q0[0].d;
            n9Var.f(true);
            l4Var.i0(false);
            l4Var.f0();
            l4Var.f40026q0[1].b();
            l4Var.f40026q0[1].setVisibility(8);
            if (k10 instanceof c3) {
                ((c3) k10).a();
            }
            if (k10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.d2.o((TLRPC.WebPage) k10);
            }
        } else if (y3Var != null) {
            y3Var.release();
            l4Var.s();
        } else {
            l4Var.U();
            l4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = l4Var.f40012b0;
        articleViewer$WindowView.f24020e = false;
        articleViewer$WindowView.d = false;
        l4Var.P0 = false;
    }
}
