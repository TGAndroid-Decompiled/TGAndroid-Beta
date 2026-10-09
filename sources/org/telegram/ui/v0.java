package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class v0 extends AnimatorListenerAdapter {
    public final i4 f42592a;

    public v0(i4 i4Var) {
        this.f42592a = i4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        i4 i4Var = this.f42592a;
        v3 v3Var = i4Var.K;
        if (i4Var.f38501f0.f21751e) {
            i4Var.f38515u0[0].setBackgroundDrawable(null);
            m3[] m3VarArr = i4Var.f38515u0;
            m3 m3Var = m3VarArr[1];
            m3VarArr[1] = m3VarArr[0];
            m3VarArr[0] = m3Var;
            i4Var.f38503h0.i();
            i4Var.Z0.a(i4Var.f38515u0[0].getBackgroundColor(), true);
            i4Var.f38496a1.a(i4Var.f38515u0[1].getBackgroundColor(), true);
            if (v3Var != null) {
                v3Var.m();
            }
            Object x10 = hg.c.x(1, i4Var.f38499d0);
            i4Var.O0.S(i4Var.f38515u0[0].f39752b);
            org.telegram.ui.Cells.o9 o9Var = i4Var.O0;
            o9Var.f22619z0 = i4Var.f38515u0[0].d;
            o9Var.f(true);
            i4Var.i0(false);
            i4Var.f0();
            i4Var.f38515u0[1].b();
            i4Var.f38515u0[1].setVisibility(8);
            if (x10 instanceof z2) {
                ((z2) x10).a();
            }
            if (x10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.i2.o((TLRPC.WebPage) x10);
            }
        } else if (v3Var != null) {
            v3Var.release();
            i4Var.s();
        } else {
            i4Var.U();
            i4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = i4Var.f38501f0;
        articleViewer$WindowView.f21751e = false;
        articleViewer$WindowView.d = false;
        i4Var.T0 = false;
    }
}
