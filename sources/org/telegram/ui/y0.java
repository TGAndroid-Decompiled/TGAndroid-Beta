package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y0 extends AnimatorListenerAdapter {
    public final int f39686a;
    public final i4 f39687b;

    public y0(i4 i4Var, int i10) {
        this.f39687b = i4Var;
        this.f39686a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        i4 i4Var = this.f39687b;
        ArrayList arrayList = i4Var.f34005d0;
        if (i4Var.f34007f0.f19725f) {
            ArrayList arrayList2 = new ArrayList();
            i4Var.f34021u0[0].setBackgroundDrawable(null);
            m3[] m3VarArr = i4Var.f34021u0;
            m3 m3Var = m3VarArr[1];
            m3VarArr[1] = m3VarArr[0];
            m3VarArr[0] = m3Var;
            i4Var.f34009h0.i();
            i4Var.Z0.a(i4Var.f34021u0[0].getBackgroundColor(), true);
            i4Var.f34002a1.a(i4Var.f34021u0[1].getBackgroundColor(), true);
            v3 v3Var = i4Var.K;
            if (v3Var != null) {
                v3Var.m();
            }
            for (int size = arrayList.size() - 1; size > this.f39686a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            i4Var.O0.T(i4Var.f34021u0[0].f35130b);
            org.telegram.ui.Cells.r9 r9Var = i4Var.O0;
            r9Var.E0 = i4Var.f34021u0[0].d;
            r9Var.f(true);
            i4Var.i0(false);
            i4Var.f0();
            i4Var.f34021u0[1].b();
            i4Var.f34021u0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList2.get(i10);
                i10++;
                if (obj instanceof z2) {
                    ((z2) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.h2.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            i4Var.U();
            i4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = i4Var.f34007f0;
        articleViewer$WindowView.f19725f = false;
        articleViewer$WindowView.d = false;
        i4Var.T0 = false;
    }
}
