package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x0 extends AnimatorListenerAdapter {
    public final int f39287a;
    public final h4 f39288b;

    public x0(h4 h4Var, int i10) {
        this.f39288b = h4Var;
        this.f39287a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h4 h4Var = this.f39288b;
        ArrayList arrayList = h4Var.f34058d0;
        if (h4Var.f34060f0.f19943f) {
            ArrayList arrayList2 = new ArrayList();
            h4Var.f34074u0[0].setBackgroundDrawable(null);
            l3[] l3VarArr = h4Var.f34074u0;
            l3 l3Var = l3VarArr[1];
            l3VarArr[1] = l3VarArr[0];
            l3VarArr[0] = l3Var;
            h4Var.f34062h0.i();
            h4Var.Z0.a(h4Var.f34074u0[0].getBackgroundColor(), true);
            h4Var.f34055a1.a(h4Var.f34074u0[1].getBackgroundColor(), true);
            u3 u3Var = h4Var.K;
            if (u3Var != null) {
                u3Var.m();
            }
            for (int size = arrayList.size() - 1; size > this.f39287a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            h4Var.O0.T(h4Var.f34074u0[0].f35224b);
            org.telegram.ui.Cells.q9 q9Var = h4Var.O0;
            q9Var.E0 = h4Var.f34074u0[0].d;
            q9Var.f(true);
            h4Var.i0(false);
            h4Var.f0();
            h4Var.f34074u0[1].b();
            h4Var.f34074u0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList2.get(i10);
                i10++;
                if (obj instanceof y2) {
                    ((y2) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.j2.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            h4Var.U();
            h4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = h4Var.f34060f0;
        articleViewer$WindowView.f19943f = false;
        articleViewer$WindowView.d = false;
        h4Var.T0 = false;
    }
}
