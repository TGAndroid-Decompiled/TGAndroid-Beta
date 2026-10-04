package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class w0 extends AnimatorListenerAdapter {
    public final i4 f41872a;

    public w0(i4 i4Var) {
        this.f41872a = i4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        i4 i4Var = this.f41872a;
        if (i4Var.f37261f0.f21747f) {
            i4Var.f37275u0[0].setBackgroundDrawable(null);
            m3[] m3VarArr = i4Var.f37275u0;
            m3 m3Var = m3VarArr[1];
            m3VarArr[1] = m3VarArr[0];
            m3VarArr[0] = m3Var;
            i4Var.f37263h0.i();
            i4Var.Z0.a(i4Var.f37275u0[0].getBackgroundColor(), true);
            i4Var.f37256a1.a(i4Var.f37275u0[1].getBackgroundColor(), true);
            v3 v3Var = i4Var.K;
            if (v3Var != null) {
                v3Var.m();
            }
            Object w10 = hg.k0.w(1, i4Var.f37259d0);
            i4Var.O0.T(i4Var.f37275u0[0].f38394b);
            org.telegram.ui.Cells.q9 q9Var = i4Var.O0;
            q9Var.E0 = i4Var.f37275u0[0].d;
            q9Var.f(true);
            i4Var.i0(false);
            i4Var.f0();
            i4Var.f37275u0[1].b();
            i4Var.f37275u0[1].setVisibility(8);
            if (w10 instanceof z2) {
                ((z2) w10).a();
            }
            if (w10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.j2.o((TLRPC.WebPage) w10);
            }
        } else {
            i4Var.U();
            i4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = i4Var.f37261f0;
        articleViewer$WindowView.f21747f = false;
        articleViewer$WindowView.d = false;
        i4Var.T0 = false;
    }
}
