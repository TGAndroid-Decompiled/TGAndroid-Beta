package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class z0 extends AnimatorListenerAdapter {
    public final int f44021a;
    public final k4 f44022b;

    public z0(k4 k4Var, int i10) {
        this.f44022b = k4Var;
        this.f44021a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k4 k4Var = this.f44022b;
        ArrayList arrayList = k4Var.f38789d0;
        if (k4Var.f38791f0.f22049f) {
            ArrayList arrayList2 = new ArrayList();
            k4Var.f38805u0[0].setBackgroundDrawable(null);
            n3[] n3VarArr = k4Var.f38805u0;
            n3 n3Var = n3VarArr[1];
            n3VarArr[1] = n3VarArr[0];
            n3VarArr[0] = n3Var;
            k4Var.f38793h0.i();
            k4Var.f38785a1.a(k4Var.f38805u0[0].getBackgroundColor(), true);
            k4Var.f38787b1.a(k4Var.f38805u0[1].getBackgroundColor(), true);
            w3 w3Var = k4Var.K;
            if (w3Var != null) {
                w3Var.m();
            }
            for (int size = arrayList.size() - 1; size > this.f44021a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            k4Var.P0.S(k4Var.f38805u0[0].f39752b);
            org.telegram.ui.Cells.o9 o9Var = k4Var.P0;
            o9Var.f22871z0 = k4Var.f38805u0[0].d;
            o9Var.f(true);
            k4Var.i0(false);
            k4Var.f0();
            k4Var.f38805u0[1].b();
            k4Var.f38805u0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList2.get(i10);
                i10++;
                if (obj instanceof a3) {
                    ((a3) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.i2.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            k4Var.U();
            k4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = k4Var.f38791f0;
        articleViewer$WindowView.f22049f = false;
        articleViewer$WindowView.d = false;
        k4Var.U0 = false;
    }
}
