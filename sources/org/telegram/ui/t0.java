package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class t0 extends AnimatorListenerAdapter {
    public final g4 f52195a;

    public t0(g4 g4Var) {
        this.f52195a = g4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g4 g4Var = this.f52195a;
        if (g4Var.f48070g0.f30421f) {
            g4Var.f48084v0[0].setBackgroundDrawable(null);
            k3[] k3VarArr = g4Var.f48084v0;
            k3 k3Var = k3VarArr[1];
            k3VarArr[1] = k3VarArr[0];
            k3VarArr[0] = k3Var;
            g4Var.f48072i0.i();
            g4Var.f48064b1.a(g4Var.f48084v0[0].getBackgroundColor(), true);
            g4Var.f48066c1.a(g4Var.f48084v0[1].getBackgroundColor(), true);
            t3 t3Var = g4Var.L;
            if (t3Var != null) {
                t3Var.z();
            }
            Object g10 = p5.c.g(1, g4Var.f48068e0);
            g4Var.Q0.S(g4Var.f48084v0[0].f49288b);
            org.telegram.ui.Cells.i9 i9Var = g4Var.Q0;
            i9Var.f30933z0 = g4Var.f48084v0[0].d;
            i9Var.f(true);
            g4Var.g0(false);
            g4Var.d0();
            g4Var.f48084v0[1].b();
            g4Var.f48084v0[1].setVisibility(8);
            if (g10 instanceof x2) {
                ((x2) g10).a();
            }
            if (g10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.w1.o((TLRPC.WebPage) g10);
            }
        } else {
            g4Var.S();
            g4Var.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView = g4Var.f48070g0;
        articleViewer$WindowView.f30421f = false;
        articleViewer$WindowView.d = false;
        g4Var.V0 = false;
    }
}
