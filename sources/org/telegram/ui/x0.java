package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class x0 extends AnimatorListenerAdapter {
    public final k4 f41705a;

    public x0(k4 k4Var) {
        this.f41705a = k4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k4 k4Var = this.f41705a;
        x3 x3Var = k4Var.K;
        if (k4Var.f37543f0.e) {
            k4Var.f37557u0[0].setBackgroundDrawable(null);
            o3[] o3VarArr = k4Var.f37557u0;
            o3 o3Var = o3VarArr[1];
            o3VarArr[1] = o3VarArr[0];
            o3VarArr[0] = o3Var;
            k4Var.f37545h0.i();
            k4Var.Z0.a(k4Var.f37557u0[0].getBackgroundColor(), true);
            k4Var.f37538a1.a(k4Var.f37557u0[1].getBackgroundColor(), true);
            if (x3Var != null) {
                x3Var.m();
            }
            Object x10 = i2.d.x(1, k4Var.f37541d0);
            k4Var.O0.S(k4Var.f37557u0[0].f38847b);
            org.telegram.ui.Cells.o9 o9Var = k4Var.O0;
            o9Var.f21647z0 = k4Var.f37557u0[0].d;
            o9Var.f(true);
            k4Var.i0(false);
            k4Var.f0();
            k4Var.f37557u0[1].b();
            k4Var.f37557u0[1].setVisibility(8);
            if (x10 instanceof b3) {
                ((b3) x10).a();
            }
            if (x10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.h2.o((TLRPC.WebPage) x10);
            }
        } else if (x3Var != null) {
            x3Var.release();
            k4Var.s();
        } else {
            k4Var.U();
            k4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = k4Var.f37543f0;
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        k4Var.T0 = false;
    }
}
