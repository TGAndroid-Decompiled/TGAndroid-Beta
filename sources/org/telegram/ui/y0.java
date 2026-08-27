package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

public final class y0 extends AnimatorListenerAdapter {

    public final m4 f44652a;

    public y0(m4 m4Var) {
        this.f44652a = m4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m4 m4Var = this.f44652a;
        z3 z3Var = m4Var.G;
        if (m4Var.f40333b0.f24027e) {
            m4Var.f40347q0[0].setBackgroundDrawable(null);
            q3[] q3VarArr = m4Var.f40347q0;
            q3 q3Var = q3VarArr[1];
            q3VarArr[1] = q3VarArr[0];
            q3VarArr[0] = q3Var;
            m4Var.f40335d0.i();
            m4Var.V0.a(m4Var.f40347q0[0].getBackgroundColor(), true);
            m4Var.W0.a(m4Var.f40347q0[1].getBackgroundColor(), true);
            if (z3Var != null) {
                z3Var.m();
            }
            Object objK = com.google.android.recaptcha.internal.a.k(1, m4Var.Z);
            m4Var.K0.T(m4Var.f40347q0[0].f41496b);
            org.telegram.ui.Cells.j9 j9Var = m4Var.K0;
            j9Var.E0 = m4Var.f40347q0[0].d;
            j9Var.f(true);
            m4Var.i0(false);
            m4Var.f0();
            m4Var.f40347q0[1].b();
            m4Var.f40347q0[1].setVisibility(8);
            if (objK instanceof d3) {
                ((d3) objK).a();
            }
            if (objK instanceof TLRPC.WebPage) {
                org.telegram.ui.web.e2.o((TLRPC.WebPage) objK);
            }
        } else if (z3Var != null) {
            z3Var.release();
            m4Var.s();
        } else {
            m4Var.U();
            m4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = m4Var.f40333b0;
        articleViewer$WindowView.f24027e = false;
        articleViewer$WindowView.d = false;
        m4Var.P0 = false;
    }
}
