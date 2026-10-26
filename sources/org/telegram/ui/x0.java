package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x0 extends AnimatorListenerAdapter {
    public final int f45604a;
    public final j4 f45605b;

    public x0(j4 j4Var, int i10) {
        this.f45605b = j4Var;
        this.f45604a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        j4 j4Var = this.f45605b;
        ArrayList arrayList = j4Var.f40433d0;
        if (j4Var.f40435f0.f23815f) {
            ArrayList arrayList2 = new ArrayList();
            j4Var.f40449u0[0].setBackgroundDrawable(null);
            m3[] m3VarArr = j4Var.f40449u0;
            m3 m3Var = m3VarArr[1];
            m3VarArr[1] = m3VarArr[0];
            m3VarArr[0] = m3Var;
            j4Var.f40437h0.i();
            j4Var.f40429a1.a(j4Var.f40449u0[0].getBackgroundColor(), true);
            j4Var.f40431b1.a(j4Var.f40449u0[1].getBackgroundColor(), true);
            v3 v3Var = j4Var.K;
            if (v3Var != null) {
                v3Var.m();
            }
            for (int size = arrayList.size() - 1; size > this.f45604a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            j4Var.P0.S(j4Var.f40449u0[0].f41443b);
            org.telegram.ui.Cells.s9 s9Var = j4Var.P0;
            s9Var.f25420z0 = j4Var.f40449u0[0].d;
            s9Var.f(true);
            j4Var.i0(false);
            j4Var.f0();
            j4Var.f40449u0[1].b();
            j4Var.f40449u0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList2.get(i10);
                i10++;
                if (obj instanceof y2) {
                    ((y2) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.h2.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            j4Var.U();
            j4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = j4Var.f40435f0;
        articleViewer$WindowView.f23815f = false;
        articleViewer$WindowView.d = false;
        j4Var.U0 = false;
    }
}
