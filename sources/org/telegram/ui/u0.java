package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class u0 extends AnimatorListenerAdapter {
    public final h4 f41978a;

    public u0(h4 h4Var) {
        this.f41978a = h4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h4 h4Var = this.f41978a;
        u3 u3Var = h4Var.K;
        if (h4Var.f37732f0.e) {
            h4Var.f37746u0[0].setBackgroundDrawable(null);
            l3[] l3VarArr = h4Var.f37746u0;
            l3 l3Var = l3VarArr[1];
            l3VarArr[1] = l3VarArr[0];
            l3VarArr[0] = l3Var;
            h4Var.f37734h0.i();
            h4Var.f37726a1.a(h4Var.f37746u0[0].getBackgroundColor(), true);
            h4Var.f37728b1.a(h4Var.f37746u0[1].getBackgroundColor(), true);
            if (u3Var != null) {
                u3Var.y();
            }
            Object v = i0.a.v(1, h4Var.f37730d0);
            h4Var.P0.S(h4Var.f37746u0[0].f39038b);
            org.telegram.ui.Cells.k9 k9Var = h4Var.P0;
            k9Var.f22196z0 = h4Var.f37746u0[0].d;
            k9Var.f(true);
            h4Var.g0(false);
            h4Var.d0();
            h4Var.f37746u0[1].b();
            h4Var.f37746u0[1].setVisibility(8);
            if (v instanceof x2) {
                ((x2) v).a();
            }
            if (v instanceof TLRPC.WebPage) {
                org.telegram.ui.web.y1.o((TLRPC.WebPage) v);
            }
        } else if (u3Var != null) {
            u3Var.release();
            h4Var.q();
        } else {
            h4Var.S();
            h4Var.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView = h4Var.f37732f0;
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        h4Var.U0 = false;
    }
}
