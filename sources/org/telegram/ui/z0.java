package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class z0 extends AnimatorListenerAdapter {
    public final l4 f43587a;

    public z0(l4 l4Var) {
        this.f43587a = l4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l4 l4Var = this.f43587a;
        x3 x3Var = l4Var.K;
        if (l4Var.f38769f0.e) {
            l4Var.f38783u0[0].setBackgroundDrawable(null);
            o3[] o3VarArr = l4Var.f38783u0;
            o3 o3Var = o3VarArr[1];
            o3VarArr[1] = o3VarArr[0];
            o3VarArr[0] = o3Var;
            l4Var.f38771h0.i();
            l4Var.Z0.a(l4Var.f38783u0[0].getBackgroundColor(), true);
            l4Var.f38764a1.a(l4Var.f38783u0[1].getBackgroundColor(), true);
            if (x3Var != null) {
                x3Var.m();
            }
            Object A = i2.e.A(1, l4Var.f38767d0);
            l4Var.O0.S(l4Var.f38783u0[0].f39757b);
            org.telegram.ui.Cells.n9 n9Var = l4Var.O0;
            n9Var.f22671z0 = l4Var.f38783u0[0].d;
            n9Var.f(true);
            l4Var.i0(false);
            l4Var.f0();
            l4Var.f38783u0[1].b();
            l4Var.f38783u0[1].setVisibility(8);
            if (A instanceof b3) {
                ((b3) A).a();
            }
            if (A instanceof TLRPC.WebPage) {
                org.telegram.ui.web.h2.o((TLRPC.WebPage) A);
            }
        } else if (x3Var != null) {
            x3Var.release();
            l4Var.s();
        } else {
            l4Var.U();
            l4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = l4Var.f38769f0;
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        l4Var.T0 = false;
    }
}
