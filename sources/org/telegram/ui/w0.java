package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class w0 extends AnimatorListenerAdapter {
    public final i4 f43017a;

    public w0(i4 i4Var) {
        this.f43017a = i4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        i4 i4Var = this.f43017a;
        if (i4Var.f38647f0.f21518f) {
            i4Var.f38661u0[0].setBackgroundDrawable(null);
            m3[] m3VarArr = i4Var.f38661u0;
            m3 m3Var = m3VarArr[1];
            m3VarArr[1] = m3VarArr[0];
            m3VarArr[0] = m3Var;
            i4Var.f38649h0.i();
            i4Var.Z0.a(i4Var.f38661u0[0].getBackgroundColor(), true);
            i4Var.f38642a1.a(i4Var.f38661u0[1].getBackgroundColor(), true);
            v3 v3Var = i4Var.K;
            if (v3Var != null) {
                v3Var.m();
            }
            Object A = hg.c.A(1, i4Var.f38645d0);
            i4Var.O0.S(i4Var.f38661u0[0].f39892b);
            org.telegram.ui.Cells.o9 o9Var = i4Var.O0;
            o9Var.f22382z0 = i4Var.f38661u0[0].d;
            o9Var.f(true);
            i4Var.i0(false);
            i4Var.f0();
            i4Var.f38661u0[1].b();
            i4Var.f38661u0[1].setVisibility(8);
            if (A instanceof z2) {
                ((z2) A).a();
            }
            if (A instanceof TLRPC.WebPage) {
                org.telegram.ui.web.h2.o((TLRPC.WebPage) A);
            }
        } else {
            i4Var.U();
            i4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = i4Var.f38647f0;
        articleViewer$WindowView.f21518f = false;
        articleViewer$WindowView.d = false;
        i4Var.T0 = false;
    }
}
