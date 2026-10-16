package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class y0 extends AnimatorListenerAdapter {
    public final k4 f41697a;

    public y0(k4 k4Var) {
        this.f41697a = k4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k4 k4Var = this.f41697a;
        if (k4Var.f37264f0.f20568f) {
            k4Var.f37278u0[0].setBackgroundDrawable(null);
            o3[] o3VarArr = k4Var.f37278u0;
            o3 o3Var = o3VarArr[1];
            o3VarArr[1] = o3VarArr[0];
            o3VarArr[0] = o3Var;
            k4Var.f37266h0.i();
            k4Var.Z0.a(k4Var.f37278u0[0].getBackgroundColor(), true);
            k4Var.f37259a1.a(k4Var.f37278u0[1].getBackgroundColor(), true);
            x3 x3Var = k4Var.K;
            if (x3Var != null) {
                x3Var.m();
            }
            Object A = i2.d.A(1, k4Var.f37262d0);
            k4Var.O0.S(k4Var.f37278u0[0].f38529b);
            org.telegram.ui.Cells.o9 o9Var = k4Var.O0;
            o9Var.f21364z0 = k4Var.f37278u0[0].d;
            o9Var.f(true);
            k4Var.i0(false);
            k4Var.f0();
            k4Var.f37278u0[1].b();
            k4Var.f37278u0[1].setVisibility(8);
            if (A instanceof b3) {
                ((b3) A).a();
            }
            if (A instanceof TLRPC.WebPage) {
                org.telegram.ui.web.i2.o((TLRPC.WebPage) A);
            }
        } else {
            k4Var.U();
            k4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = k4Var.f37264f0;
        articleViewer$WindowView.f20568f = false;
        articleViewer$WindowView.d = false;
        k4Var.T0 = false;
    }
}
