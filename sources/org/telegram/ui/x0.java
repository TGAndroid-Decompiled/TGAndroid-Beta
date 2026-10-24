package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class x0 extends AnimatorListenerAdapter {
    public final k4 f43440a;

    public x0(k4 k4Var) {
        this.f43440a = k4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k4 k4Var = this.f43440a;
        if (k4Var.f38760f0.f22050f) {
            k4Var.f38774u0[0].setBackgroundDrawable(null);
            n3[] n3VarArr = k4Var.f38774u0;
            n3 n3Var = n3VarArr[1];
            n3VarArr[1] = n3VarArr[0];
            n3VarArr[0] = n3Var;
            k4Var.f38762h0.i();
            k4Var.f38754a1.a(k4Var.f38774u0[0].getBackgroundColor(), true);
            k4Var.f38756b1.a(k4Var.f38774u0[1].getBackgroundColor(), true);
            w3 w3Var = k4Var.K;
            if (w3Var != null) {
                w3Var.m();
            }
            Object A = i2.o1.A(1, k4Var.f38758d0);
            k4Var.P0.S(k4Var.f38774u0[0].f39702b);
            org.telegram.ui.Cells.o9 o9Var = k4Var.P0;
            o9Var.f22872z0 = k4Var.f38774u0[0].d;
            o9Var.f(true);
            k4Var.i0(false);
            k4Var.f0();
            k4Var.f38774u0[1].b();
            k4Var.f38774u0[1].setVisibility(8);
            if (A instanceof a3) {
                ((a3) A).a();
            }
            if (A instanceof TLRPC.WebPage) {
                org.telegram.ui.web.i2.o((TLRPC.WebPage) A);
            }
        } else {
            k4Var.U();
            k4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = k4Var.f38760f0;
        articleViewer$WindowView.f22050f = false;
        articleViewer$WindowView.d = false;
        k4Var.U0 = false;
    }
}
