package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x0 extends AnimatorListenerAdapter {
    public final int f43190a;
    public final h4 f43191b;

    public x0(h4 h4Var, int i10) {
        this.f43191b = h4Var;
        this.f43190a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        h4 h4Var = this.f43191b;
        ArrayList arrayList = h4Var.f37675d0;
        if (h4Var.f37677f0.f21634f) {
            ArrayList arrayList2 = new ArrayList();
            h4Var.f37691u0[0].setBackgroundDrawable(null);
            l3[] l3VarArr = h4Var.f37691u0;
            l3 l3Var = l3VarArr[1];
            l3VarArr[1] = l3VarArr[0];
            l3VarArr[0] = l3Var;
            h4Var.f37679h0.i();
            h4Var.f37671a1.a(h4Var.f37691u0[0].getBackgroundColor(), true);
            h4Var.f37673b1.a(h4Var.f37691u0[1].getBackgroundColor(), true);
            u3 u3Var = h4Var.K;
            if (u3Var != null) {
                u3Var.y();
            }
            for (int size = arrayList.size() - 1; size > this.f43190a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            h4Var.P0.S(h4Var.f37691u0[0].f39061b);
            org.telegram.ui.Cells.k9 k9Var = h4Var.P0;
            k9Var.f22197z0 = h4Var.f37691u0[0].d;
            k9Var.f(true);
            h4Var.g0(false);
            h4Var.d0();
            h4Var.f37691u0[1].b();
            h4Var.f37691u0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList2.get(i10);
                i10++;
                if (obj instanceof x2) {
                    ((x2) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.y1.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            h4Var.S();
            h4Var.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView = h4Var.f37677f0;
        articleViewer$WindowView.f21634f = false;
        articleViewer$WindowView.d = false;
        h4Var.U0 = false;
    }
}
