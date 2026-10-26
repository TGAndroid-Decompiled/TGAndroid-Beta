package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class v0 extends AnimatorListenerAdapter {
    public final j4 f44560a;

    public v0(j4 j4Var) {
        this.f44560a = j4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        j4 j4Var = this.f44560a;
        if (j4Var.f40435f0.f23815f) {
            j4Var.f40449u0[0].setBackgroundDrawable(null);
            m3[] m3VarArr = j4Var.f40449u0;
            m3 m3Var = m3VarArr[1];
            m3VarArr[1] = m3VarArr[0];
            m3VarArr[0] = m3Var;
            j4Var.f40437h0.i();
            j4Var.f40429a1.a(j4Var.f40449u0[0].getBackgroundColor(), true);
            j4Var.f40431b1.a(j4Var.f40449u0[1].getBackgroundColor(), true);
            v3 v3Var = j4Var.K;
            if (v3Var != null) {
                v3Var.m();
            }
            Object y3 = ic.a.y(1, j4Var.f40433d0);
            j4Var.P0.S(j4Var.f40449u0[0].f41443b);
            org.telegram.ui.Cells.s9 s9Var = j4Var.P0;
            s9Var.f25420z0 = j4Var.f40449u0[0].d;
            s9Var.f(true);
            j4Var.i0(false);
            j4Var.f0();
            j4Var.f40449u0[1].b();
            j4Var.f40449u0[1].setVisibility(8);
            if (y3 instanceof y2) {
                ((y2) y3).a();
            }
            if (y3 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.h2.o((TLRPC.WebPage) y3);
            }
        } else {
            j4Var.U();
            j4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = j4Var.f40435f0;
        articleViewer$WindowView.f23815f = false;
        articleViewer$WindowView.d = false;
        j4Var.U0 = false;
    }
}
