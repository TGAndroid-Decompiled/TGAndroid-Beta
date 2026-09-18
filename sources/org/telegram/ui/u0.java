package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class u0 extends AnimatorListenerAdapter {
    public final h4 f37841a;

    public u0(h4 h4Var) {
        this.f37841a = h4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h4 h4Var = this.f37841a;
        u3 u3Var = h4Var.K;
        if (h4Var.f34060f0.e) {
            h4Var.f34074u0[0].setBackgroundDrawable(null);
            l3[] l3VarArr = h4Var.f34074u0;
            l3 l3Var = l3VarArr[1];
            l3VarArr[1] = l3VarArr[0];
            l3VarArr[0] = l3Var;
            h4Var.f34062h0.i();
            h4Var.Z0.a(h4Var.f34074u0[0].getBackgroundColor(), true);
            h4Var.f34055a1.a(h4Var.f34074u0[1].getBackgroundColor(), true);
            if (u3Var != null) {
                u3Var.m();
            }
            Object v = hg.k0.v(1, h4Var.f34058d0);
            h4Var.O0.T(h4Var.f34074u0[0].f35224b);
            org.telegram.ui.Cells.q9 q9Var = h4Var.O0;
            q9Var.E0 = h4Var.f34074u0[0].d;
            q9Var.f(true);
            h4Var.i0(false);
            h4Var.f0();
            h4Var.f34074u0[1].b();
            h4Var.f34074u0[1].setVisibility(8);
            if (v instanceof y2) {
                ((y2) v).a();
            }
            if (v instanceof TLRPC.WebPage) {
                org.telegram.ui.web.j2.o((TLRPC.WebPage) v);
            }
        } else if (u3Var != null) {
            u3Var.release();
            h4Var.s();
        } else {
            h4Var.U();
            h4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = h4Var.f34060f0;
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        h4Var.T0 = false;
    }
}
