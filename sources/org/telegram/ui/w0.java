package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class w0 extends AnimatorListenerAdapter {
    public final j4 f37662a;

    public w0(j4 j4Var) {
        this.f37662a = j4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        j4 j4Var = this.f37662a;
        if (j4Var.f33906f0.f18842f) {
            j4Var.f33920u0[0].setBackgroundDrawable(null);
            n3[] n3VarArr = j4Var.f33920u0;
            n3 n3Var = n3VarArr[1];
            n3VarArr[1] = n3VarArr[0];
            n3VarArr[0] = n3Var;
            j4Var.f33908h0.i();
            j4Var.Z0.a(j4Var.f33920u0[0].getBackgroundColor(), true);
            j4Var.f33901a1.a(j4Var.f33920u0[1].getBackgroundColor(), true);
            w3 w3Var = j4Var.K;
            if (w3Var != null) {
                w3Var.m();
            }
            Object z10 = hc.b.z(1, j4Var.f33904d0);
            j4Var.O0.T(j4Var.f33920u0[0].f35102b);
            org.telegram.ui.Cells.s9 s9Var = j4Var.O0;
            s9Var.E0 = j4Var.f33920u0[0].d;
            s9Var.f(true);
            j4Var.i0(false);
            j4Var.f0();
            j4Var.f33920u0[1].b();
            j4Var.f33920u0[1].setVisibility(8);
            if (z10 instanceof a3) {
                ((a3) z10).a();
            }
            if (z10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.k2.o((TLRPC.WebPage) z10);
            }
        } else {
            j4Var.U();
            j4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = j4Var.f33906f0;
        articleViewer$WindowView.f18842f = false;
        articleViewer$WindowView.d = false;
        j4Var.T0 = false;
    }
}
