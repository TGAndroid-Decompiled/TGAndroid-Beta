package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y0 extends AnimatorListenerAdapter {
    public final int f44175a;
    public final i4 f44176b;

    public y0(i4 i4Var, int i10) {
        this.f44176b = i4Var;
        this.f44175a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        i4 i4Var = this.f44176b;
        ArrayList arrayList = i4Var.f38497d0;
        if (i4Var.f38499f0.f21752f) {
            ArrayList arrayList2 = new ArrayList();
            i4Var.f38513u0[0].setBackgroundDrawable(null);
            m3[] m3VarArr = i4Var.f38513u0;
            m3 m3Var = m3VarArr[1];
            m3VarArr[1] = m3VarArr[0];
            m3VarArr[0] = m3Var;
            i4Var.f38501h0.i();
            i4Var.Z0.a(i4Var.f38513u0[0].getBackgroundColor(), true);
            i4Var.f38494a1.a(i4Var.f38513u0[1].getBackgroundColor(), true);
            v3 v3Var = i4Var.K;
            if (v3Var != null) {
                v3Var.m();
            }
            for (int size = arrayList.size() - 1; size > this.f44175a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            i4Var.O0.S(i4Var.f38513u0[0].f39750b);
            org.telegram.ui.Cells.o9 o9Var = i4Var.O0;
            o9Var.f22619z0 = i4Var.f38513u0[0].d;
            o9Var.f(true);
            i4Var.i0(false);
            i4Var.f0();
            i4Var.f38513u0[1].b();
            i4Var.f38513u0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList2.get(i10);
                i10++;
                if (obj instanceof z2) {
                    ((z2) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.i2.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            i4Var.U();
            i4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = i4Var.f38499f0;
        articleViewer$WindowView.f21752f = false;
        articleViewer$WindowView.d = false;
        i4Var.T0 = false;
    }
}
