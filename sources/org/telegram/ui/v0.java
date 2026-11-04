package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;
public final class v0 extends AnimatorListenerAdapter {
    public final i4 f50356a;

    public v0(i4 i4Var) {
        this.f50356a = i4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        i4 i4Var = this.f50356a;
        u3 u3Var = i4Var.L;
        if (i4Var.f46086g0.f28899e) {
            i4Var.f46100v0[0].setBackgroundDrawable(null);
            l3[] l3VarArr = i4Var.f46100v0;
            l3 l3Var = l3VarArr[1];
            l3VarArr[1] = l3VarArr[0];
            l3VarArr[0] = l3Var;
            i4Var.f46088i0.i();
            i4Var.f46080b1.a(i4Var.f46100v0[0].getBackgroundColor(), true);
            i4Var.f46082c1.a(i4Var.f46100v0[1].getBackgroundColor(), true);
            if (u3Var != null) {
                u3Var.z();
            }
            Object o10 = org.telegram.ui.Cells.f1.o(1, i4Var.f46084e0);
            i4Var.Q0.S(i4Var.f46100v0[0].f47083b);
            org.telegram.ui.Cells.h9 h9Var = i4Var.Q0;
            h9Var.f29362z0 = i4Var.f46100v0[0].d;
            h9Var.f(true);
            i4Var.g0(false);
            i4Var.d0();
            i4Var.f46100v0[1].b();
            i4Var.f46100v0[1].setVisibility(8);
            if (o10 instanceof y2) {
                ((y2) o10).a();
            }
            if (o10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.u1.o((TLRPC.WebPage) o10);
            }
        } else if (u3Var != null) {
            u3Var.release();
            i4Var.q();
        } else {
            i4Var.S();
            i4Var.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView = i4Var.f46086g0;
        articleViewer$WindowView.f28899e = false;
        articleViewer$WindowView.d = false;
        i4Var.V0 = false;
    }
}
