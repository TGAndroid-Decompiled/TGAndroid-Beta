package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class z0 extends AnimatorListenerAdapter {
    public final int f43750a;
    public final l4 f43751b;

    public z0(l4 l4Var, int i10) {
        this.f43751b = l4Var;
        this.f43750a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l4 l4Var = this.f43751b;
        ArrayList arrayList = l4Var.f38603a0;
        if (l4Var.f38605c0.f22511f) {
            ArrayList arrayList2 = new ArrayList();
            l4Var.f38619r0[0].setBackgroundDrawable(null);
            p3[] p3VarArr = l4Var.f38619r0;
            p3 p3Var = p3VarArr[1];
            p3VarArr[1] = p3VarArr[0];
            p3VarArr[0] = p3Var;
            l4Var.f38607e0.i();
            l4Var.W0.a(l4Var.f38619r0[0].getBackgroundColor(), true);
            l4Var.X0.a(l4Var.f38619r0[1].getBackgroundColor(), true);
            y3 y3Var = l4Var.H;
            if (y3Var != null) {
                y3Var.m();
            }
            for (int size = arrayList.size() - 1; size > this.f43750a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            l4Var.L0.T(l4Var.f38619r0[0].f39904b);
            org.telegram.ui.Cells.m9 m9Var = l4Var.L0;
            m9Var.E0 = l4Var.f38619r0[0].d;
            m9Var.f(true);
            l4Var.i0(false);
            l4Var.f0();
            l4Var.f38619r0[1].b();
            l4Var.f38619r0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList2.get(i10);
                i10++;
                if (obj instanceof b3) {
                    ((b3) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.h2.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            l4Var.U();
            l4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = l4Var.f38605c0;
        articleViewer$WindowView.f22511f = false;
        articleViewer$WindowView.d = false;
        l4Var.Q0 = false;
    }
}
