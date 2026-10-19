package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class y0 extends AnimatorListenerAdapter {
    public final l4 f43307a;

    public y0(l4 l4Var) {
        this.f43307a = l4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l4 l4Var = this.f43307a;
        if (l4Var.f38760f0.f21930f) {
            l4Var.f38774u0[0].setBackgroundDrawable(null);
            o3[] o3VarArr = l4Var.f38774u0;
            o3 o3Var = o3VarArr[1];
            o3VarArr[1] = o3VarArr[0];
            o3VarArr[0] = o3Var;
            l4Var.f38762h0.i();
            l4Var.Z0.a(l4Var.f38774u0[0].getBackgroundColor(), true);
            l4Var.f38755a1.a(l4Var.f38774u0[1].getBackgroundColor(), true);
            x3 x3Var = l4Var.K;
            if (x3Var != null) {
                x3Var.m();
            }
            Object A = i2.e.A(1, l4Var.f38758d0);
            l4Var.O0.S(l4Var.f38774u0[0].f39748b);
            org.telegram.ui.Cells.n9 n9Var = l4Var.O0;
            n9Var.f22666z0 = l4Var.f38774u0[0].d;
            n9Var.f(true);
            l4Var.i0(false);
            l4Var.f0();
            l4Var.f38774u0[1].b();
            l4Var.f38774u0[1].setVisibility(8);
            if (A instanceof b3) {
                ((b3) A).a();
            }
            if (A instanceof TLRPC.WebPage) {
                org.telegram.ui.web.h2.o((TLRPC.WebPage) A);
            }
        } else {
            l4Var.U();
            l4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = l4Var.f38760f0;
        articleViewer$WindowView.f21930f = false;
        articleViewer$WindowView.d = false;
        l4Var.T0 = false;
    }
}
