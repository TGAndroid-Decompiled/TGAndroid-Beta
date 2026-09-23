package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class x0 extends AnimatorListenerAdapter {
    public final i4 f39136a;

    public x0(i4 i4Var) {
        this.f39136a = i4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        i4 i4Var = this.f39136a;
        v3 v3Var = i4Var.K;
        if (i4Var.f34007f0.e) {
            i4Var.f34021u0[0].setBackgroundDrawable(null);
            m3[] m3VarArr = i4Var.f34021u0;
            m3 m3Var = m3VarArr[1];
            m3VarArr[1] = m3VarArr[0];
            m3VarArr[0] = m3Var;
            i4Var.f34009h0.i();
            i4Var.Z0.a(i4Var.f34021u0[0].getBackgroundColor(), true);
            i4Var.f34002a1.a(i4Var.f34021u0[1].getBackgroundColor(), true);
            if (v3Var != null) {
                v3Var.m();
            }
            Object z10 = hg.c.z(1, i4Var.f34005d0);
            i4Var.O0.T(i4Var.f34021u0[0].f35130b);
            org.telegram.ui.Cells.r9 r9Var = i4Var.O0;
            r9Var.E0 = i4Var.f34021u0[0].d;
            r9Var.f(true);
            i4Var.i0(false);
            i4Var.f0();
            i4Var.f34021u0[1].b();
            i4Var.f34021u0[1].setVisibility(8);
            if (z10 instanceof z2) {
                ((z2) z10).a();
            }
            if (z10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.h2.o((TLRPC.WebPage) z10);
            }
        } else if (v3Var != null) {
            v3Var.release();
            i4Var.s();
        } else {
            i4Var.U();
            i4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = i4Var.f34007f0;
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        i4Var.T0 = false;
    }
}
