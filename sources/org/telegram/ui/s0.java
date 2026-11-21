package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class s0 extends AnimatorListenerAdapter {
    public final g4 f51796a;

    public s0(g4 g4Var) {
        this.f51796a = g4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g4 g4Var = this.f51796a;
        t3 t3Var = g4Var.L;
        if (g4Var.f47955g0.f30358e) {
            g4Var.f47969v0[0].setBackgroundDrawable(null);
            k3[] k3VarArr = g4Var.f47969v0;
            k3 k3Var = k3VarArr[1];
            k3VarArr[1] = k3VarArr[0];
            k3VarArr[0] = k3Var;
            g4Var.f47957i0.i();
            g4Var.f47949b1.a(g4Var.f47969v0[0].getBackgroundColor(), true);
            g4Var.f47951c1.a(g4Var.f47969v0[1].getBackgroundColor(), true);
            if (t3Var != null) {
                t3Var.z();
            }
            Object g10 = p5.c.g(1, g4Var.f47953e0);
            g4Var.Q0.S(g4Var.f47969v0[0].f49178b);
            org.telegram.ui.Cells.j9 j9Var = g4Var.Q0;
            j9Var.f30930z0 = g4Var.f47969v0[0].d;
            j9Var.f(true);
            g4Var.g0(false);
            g4Var.d0();
            g4Var.f47969v0[1].b();
            g4Var.f47969v0[1].setVisibility(8);
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
        ArticleViewer$WindowView articleViewer$WindowView = g4Var.f47955g0;
        articleViewer$WindowView.f30358e = false;
        articleViewer$WindowView.d = false;
        g4Var.V0 = false;
    }
}
