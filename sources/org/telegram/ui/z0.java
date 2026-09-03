package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class z0 extends AnimatorListenerAdapter {
    public final n4 f40368a;

    public z0(n4 n4Var) {
        this.f40368a = n4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n4 n4Var = this.f40368a;
        if (n4Var.f36361c0.f20767f) {
            n4Var.f36375r0[0].setBackgroundDrawable(null);
            r3[] r3VarArr = n4Var.f36375r0;
            r3 r3Var = r3VarArr[1];
            r3VarArr[1] = r3VarArr[0];
            r3VarArr[0] = r3Var;
            n4Var.f36363e0.i();
            n4Var.W0.a(n4Var.f36375r0[0].getBackgroundColor(), true);
            n4Var.X0.a(n4Var.f36375r0[1].getBackgroundColor(), true);
            a4 a4Var = n4Var.H;
            if (a4Var != null) {
                a4Var.m();
            }
            Object g10 = e2.c.g(1, n4Var.f36359a0);
            n4Var.L0.T(n4Var.f36375r0[0].f37684b);
            org.telegram.ui.Cells.l9 l9Var = n4Var.L0;
            l9Var.E0 = n4Var.f36375r0[0].d;
            l9Var.f(true);
            n4Var.i0(false);
            n4Var.f0();
            n4Var.f36375r0[1].b();
            n4Var.f36375r0[1].setVisibility(8);
            if (g10 instanceof d3) {
                ((d3) g10).a();
            }
            if (g10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.h2.o((TLRPC.WebPage) g10);
            }
        } else {
            n4Var.U();
            n4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = n4Var.f36361c0;
        articleViewer$WindowView.f20767f = false;
        articleViewer$WindowView.d = false;
        n4Var.Q0 = false;
    }
}
