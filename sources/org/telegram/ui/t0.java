package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class t0 extends AnimatorListenerAdapter {
    public final g4 f49846a;

    public t0(g4 g4Var) {
        this.f49846a = g4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g4 g4Var = this.f49846a;
        if (g4Var.f45802f0.f28839f) {
            g4Var.f45816u0[0].setBackgroundDrawable(null);
            k3[] k3VarArr = g4Var.f45816u0;
            k3 k3Var = k3VarArr[1];
            k3VarArr[1] = k3VarArr[0];
            k3VarArr[0] = k3Var;
            g4Var.f45804h0.i();
            g4Var.f45796a1.a(g4Var.f45816u0[0].getBackgroundColor(), true);
            g4Var.f45798b1.a(g4Var.f45816u0[1].getBackgroundColor(), true);
            t3 t3Var = g4Var.K;
            if (t3Var != null) {
                t3Var.z();
            }
            Object k10 = org.telegram.ui.Cells.f1.k(1, g4Var.f45800d0);
            g4Var.P0.S(g4Var.f45816u0[0].f47065b);
            org.telegram.ui.Cells.i9 i9Var = g4Var.P0;
            i9Var.f29323z0 = g4Var.f45816u0[0].d;
            i9Var.f(true);
            g4Var.g0(false);
            g4Var.d0();
            g4Var.f45816u0[1].b();
            g4Var.f45816u0[1].setVisibility(8);
            if (k10 instanceof x2) {
                ((x2) k10).a();
            }
            if (k10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.w1.o((TLRPC.WebPage) k10);
            }
        } else {
            g4Var.S();
            g4Var.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView = g4Var.f45802f0;
        articleViewer$WindowView.f28839f = false;
        articleViewer$WindowView.d = false;
        g4Var.U0 = false;
    }
}
