package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class y0 extends AnimatorListenerAdapter {
    public final j4 f40074a;

    public y0(j4 j4Var) {
        this.f40074a = j4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        j4 j4Var = this.f40074a;
        w3 w3Var = j4Var.K;
        if (j4Var.f34613f0.e) {
            j4Var.f34627u0[0].setBackgroundDrawable(null);
            n3[] n3VarArr = j4Var.f34627u0;
            n3 n3Var = n3VarArr[1];
            n3VarArr[1] = n3VarArr[0];
            n3VarArr[0] = n3Var;
            j4Var.f34615h0.i();
            j4Var.Z0.a(j4Var.f34627u0[0].getBackgroundColor(), true);
            j4Var.f34608a1.a(j4Var.f34627u0[1].getBackgroundColor(), true);
            if (w3Var != null) {
                w3Var.m();
            }
            Object x10 = hg.k0.x(1, j4Var.f34611d0);
            j4Var.O0.T(j4Var.f34627u0[0].f35795b);
            org.telegram.ui.Cells.q9 q9Var = j4Var.O0;
            q9Var.E0 = j4Var.f34627u0[0].d;
            q9Var.f(true);
            j4Var.i0(false);
            j4Var.f0();
            j4Var.f34627u0[1].b();
            j4Var.f34627u0[1].setVisibility(8);
            if (x10 instanceof a3) {
                ((a3) x10).a();
            }
            if (x10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.j2.o((TLRPC.WebPage) x10);
            }
        } else if (w3Var != null) {
            w3Var.release();
            j4Var.s();
        } else {
            j4Var.U();
            j4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = j4Var.f34613f0;
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        j4Var.T0 = false;
    }
}
