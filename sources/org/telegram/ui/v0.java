package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class v0 extends AnimatorListenerAdapter {
    public final h4 f42846a;

    public v0(h4 h4Var) {
        this.f42846a = h4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h4 h4Var = this.f42846a;
        if (h4Var.f38305f0.f21780f) {
            h4Var.f38319u0[0].setBackgroundDrawable(null);
            l3[] l3VarArr = h4Var.f38319u0;
            l3 l3Var = l3VarArr[1];
            l3VarArr[1] = l3VarArr[0];
            l3VarArr[0] = l3Var;
            h4Var.f38307h0.i();
            h4Var.Z0.a(h4Var.f38319u0[0].getBackgroundColor(), true);
            h4Var.f38300a1.a(h4Var.f38319u0[1].getBackgroundColor(), true);
            u3 u3Var = h4Var.K;
            if (u3Var != null) {
                u3Var.m();
            }
            Object x10 = hg.c.x(1, h4Var.f38303d0);
            h4Var.O0.S(h4Var.f38319u0[0].f39530b);
            org.telegram.ui.Cells.o9 o9Var = h4Var.O0;
            o9Var.f22647z0 = h4Var.f38319u0[0].d;
            o9Var.f(true);
            h4Var.i0(false);
            h4Var.f0();
            h4Var.f38319u0[1].b();
            h4Var.f38319u0[1].setVisibility(8);
            if (x10 instanceof y2) {
                ((y2) x10).a();
            }
            if (x10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.i2.o((TLRPC.WebPage) x10);
            }
        } else {
            h4Var.U();
            h4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = h4Var.f38305f0;
        articleViewer$WindowView.f21780f = false;
        articleViewer$WindowView.d = false;
        h4Var.T0 = false;
    }
}
