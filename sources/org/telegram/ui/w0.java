package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class w0 extends AnimatorListenerAdapter {
    public final k4 f42882a;

    public w0(k4 k4Var) {
        this.f42882a = k4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k4 k4Var = this.f42882a;
        w3 w3Var = k4Var.K;
        if (k4Var.f38791f0.e) {
            k4Var.f38805u0[0].setBackgroundDrawable(null);
            n3[] n3VarArr = k4Var.f38805u0;
            n3 n3Var = n3VarArr[1];
            n3VarArr[1] = n3VarArr[0];
            n3VarArr[0] = n3Var;
            k4Var.f38793h0.i();
            k4Var.f38785a1.a(k4Var.f38805u0[0].getBackgroundColor(), true);
            k4Var.f38787b1.a(k4Var.f38805u0[1].getBackgroundColor(), true);
            if (w3Var != null) {
                w3Var.m();
            }
            Object A = i2.o1.A(1, k4Var.f38789d0);
            k4Var.P0.S(k4Var.f38805u0[0].f39752b);
            org.telegram.ui.Cells.o9 o9Var = k4Var.P0;
            o9Var.f22871z0 = k4Var.f38805u0[0].d;
            o9Var.f(true);
            k4Var.i0(false);
            k4Var.f0();
            k4Var.f38805u0[1].b();
            k4Var.f38805u0[1].setVisibility(8);
            if (A instanceof a3) {
                ((a3) A).a();
            }
            if (A instanceof TLRPC.WebPage) {
                org.telegram.ui.web.i2.o((TLRPC.WebPage) A);
            }
        } else if (w3Var != null) {
            w3Var.release();
            k4Var.s();
        } else {
            k4Var.U();
            k4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = k4Var.f38791f0;
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        k4Var.U0 = false;
    }
}
