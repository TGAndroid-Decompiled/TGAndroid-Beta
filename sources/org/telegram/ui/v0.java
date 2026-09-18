package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class v0 extends AnimatorListenerAdapter {
    public final h4 f38255a;

    public v0(h4 h4Var) {
        this.f38255a = h4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h4 h4Var = this.f38255a;
        if (h4Var.f34159f0.f19767f) {
            h4Var.f34173u0[0].setBackgroundDrawable(null);
            l3[] l3VarArr = h4Var.f34173u0;
            l3 l3Var = l3VarArr[1];
            l3VarArr[1] = l3VarArr[0];
            l3VarArr[0] = l3Var;
            h4Var.f34161h0.i();
            h4Var.Z0.a(h4Var.f34173u0[0].getBackgroundColor(), true);
            h4Var.f34154a1.a(h4Var.f34173u0[1].getBackgroundColor(), true);
            u3 u3Var = h4Var.K;
            if (u3Var != null) {
                u3Var.m();
            }
            Object z10 = hg.k0.z(1, h4Var.f34157d0);
            h4Var.O0.T(h4Var.f34173u0[0].f35435b);
            org.telegram.ui.Cells.q9 q9Var = h4Var.O0;
            q9Var.E0 = h4Var.f34173u0[0].d;
            q9Var.f(true);
            h4Var.i0(false);
            h4Var.f0();
            h4Var.f34173u0[1].b();
            h4Var.f34173u0[1].setVisibility(8);
            if (z10 instanceof y2) {
                ((y2) z10).a();
            }
            if (z10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.i2.o((TLRPC.WebPage) z10);
            }
        } else {
            h4Var.U();
            h4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = h4Var.f34159f0;
        articleViewer$WindowView.f19767f = false;
        articleViewer$WindowView.d = false;
        h4Var.T0 = false;
    }
}
