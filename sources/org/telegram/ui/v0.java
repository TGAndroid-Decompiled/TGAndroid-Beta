package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class v0 extends AnimatorListenerAdapter {
    public final i4 f41374a;

    public v0(i4 i4Var) {
        this.f41374a = i4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        i4 i4Var = this.f41374a;
        v3 v3Var = i4Var.K;
        if (i4Var.f37218f0.f21568e) {
            i4Var.f37232u0[0].setBackgroundDrawable(null);
            m3[] m3VarArr = i4Var.f37232u0;
            m3 m3Var = m3VarArr[1];
            m3VarArr[1] = m3VarArr[0];
            m3VarArr[0] = m3Var;
            i4Var.f37220h0.i();
            i4Var.Z0.a(i4Var.f37232u0[0].getBackgroundColor(), true);
            i4Var.f37213a1.a(i4Var.f37232u0[1].getBackgroundColor(), true);
            if (v3Var != null) {
                v3Var.m();
            }
            Object z10 = i2.g.z(1, i4Var.f37216d0);
            i4Var.O0.T(i4Var.f37232u0[0].f38551b);
            org.telegram.ui.Cells.q9 q9Var = i4Var.O0;
            q9Var.E0 = i4Var.f37232u0[0].d;
            q9Var.f(true);
            i4Var.i0(false);
            i4Var.f0();
            i4Var.f37232u0[1].b();
            i4Var.f37232u0[1].setVisibility(8);
            if (z10 instanceof z2) {
                ((z2) z10).a();
            }
            if (z10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.j2.o((TLRPC.WebPage) z10);
            }
        } else if (v3Var != null) {
            v3Var.release();
            i4Var.s();
        } else {
            i4Var.U();
            i4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = i4Var.f37218f0;
        articleViewer$WindowView.f21568e = false;
        articleViewer$WindowView.d = false;
        i4Var.T0 = false;
    }
}
