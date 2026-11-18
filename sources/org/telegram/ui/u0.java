package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class u0 extends AnimatorListenerAdapter {
    public final g4 f52401a;

    public u0(g4 g4Var) {
        this.f52401a = g4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g4 g4Var = this.f52401a;
        t3 t3Var = g4Var.L;
        if (g4Var.f47921g0.f30332e) {
            g4Var.f47935v0[0].setBackgroundDrawable(null);
            k3[] k3VarArr = g4Var.f47935v0;
            k3 k3Var = k3VarArr[1];
            k3VarArr[1] = k3VarArr[0];
            k3VarArr[0] = k3Var;
            g4Var.f47923i0.i();
            g4Var.f47915b1.a(g4Var.f47935v0[0].getBackgroundColor(), true);
            g4Var.f47917c1.a(g4Var.f47935v0[1].getBackgroundColor(), true);
            if (t3Var != null) {
                t3Var.z();
            }
            Object g10 = p5.c.g(1, g4Var.f47919e0);
            g4Var.Q0.S(g4Var.f47935v0[0].f49158b);
            org.telegram.ui.Cells.i9 i9Var = g4Var.Q0;
            i9Var.f30838z0 = g4Var.f47935v0[0].d;
            i9Var.f(true);
            g4Var.g0(false);
            g4Var.d0();
            g4Var.f47935v0[1].b();
            g4Var.f47935v0[1].setVisibility(8);
            if (g10 instanceof x2) {
                ((x2) g10).a();
            }
            if (g10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.v1.o((TLRPC.WebPage) g10);
            }
        } else if (t3Var != null) {
            t3Var.release();
            g4Var.q();
        } else {
            g4Var.S();
            g4Var.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView = g4Var.f47921g0;
        articleViewer$WindowView.f30332e = false;
        articleViewer$WindowView.d = false;
        g4Var.V0 = false;
    }
}
