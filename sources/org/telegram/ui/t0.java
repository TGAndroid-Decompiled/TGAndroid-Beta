package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class t0 extends AnimatorListenerAdapter {
    public final g4 f51310a;

    public t0(g4 g4Var) {
        this.f51310a = g4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g4 g4Var = this.f51310a;
        if (g4Var.f47322g0.f29956f) {
            g4Var.f47336v0[0].setBackgroundDrawable(null);
            k3[] k3VarArr = g4Var.f47336v0;
            k3 k3Var = k3VarArr[1];
            k3VarArr[1] = k3VarArr[0];
            k3VarArr[0] = k3Var;
            g4Var.f47324i0.i();
            g4Var.f47316b1.a(g4Var.f47336v0[0].getBackgroundColor(), true);
            g4Var.f47318c1.a(g4Var.f47336v0[1].getBackgroundColor(), true);
            t3 t3Var = g4Var.L;
            if (t3Var != null) {
                t3Var.z();
            }
            Object g10 = r.b.g(1, g4Var.f47320e0);
            g4Var.Q0.S(g4Var.f47336v0[0].f48549b);
            org.telegram.ui.Cells.h9 h9Var = g4Var.Q0;
            h9Var.f30421z0 = g4Var.f47336v0[0].d;
            h9Var.f(true);
            g4Var.g0(false);
            g4Var.d0();
            g4Var.f47336v0[1].b();
            g4Var.f47336v0[1].setVisibility(8);
            if (g10 instanceof x2) {
                ((x2) g10).a();
            }
            if (g10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.v1.o((TLRPC.WebPage) g10);
            }
        } else {
            g4Var.S();
            g4Var.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView = g4Var.f47322g0;
        articleViewer$WindowView.f29956f = false;
        articleViewer$WindowView.d = false;
        g4Var.V0 = false;
    }
}
