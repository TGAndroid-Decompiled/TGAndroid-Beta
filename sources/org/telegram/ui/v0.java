package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class v0 extends AnimatorListenerAdapter {
    public final int f52075a;
    public final g4 f52076b;

    public v0(g4 g4Var, int i7) {
        this.f52076b = g4Var;
        this.f52075a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g4 g4Var = this.f52076b;
        ArrayList arrayList = g4Var.f47310e0;
        if (g4Var.f47312g0.f29956f) {
            ArrayList arrayList2 = new ArrayList();
            g4Var.f47326v0[0].setBackgroundDrawable(null);
            k3[] k3VarArr = g4Var.f47326v0;
            k3 k3Var = k3VarArr[1];
            k3VarArr[1] = k3VarArr[0];
            k3VarArr[0] = k3Var;
            g4Var.f47314i0.i();
            g4Var.f47306b1.a(g4Var.f47326v0[0].getBackgroundColor(), true);
            g4Var.f47308c1.a(g4Var.f47326v0[1].getBackgroundColor(), true);
            t3 t3Var = g4Var.L;
            if (t3Var != null) {
                t3Var.z();
            }
            for (int size = arrayList.size() - 1; size > this.f52075a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            g4Var.Q0.S(g4Var.f47326v0[0].f48503b);
            org.telegram.ui.Cells.h9 h9Var = g4Var.Q0;
            h9Var.f30421z0 = g4Var.f47326v0[0].d;
            h9Var.f(true);
            g4Var.g0(false);
            g4Var.d0();
            g4Var.f47326v0[1].b();
            g4Var.f47326v0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj = arrayList2.get(i7);
                i7++;
                if (obj instanceof x2) {
                    ((x2) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.v1.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            g4Var.S();
            g4Var.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView = g4Var.f47312g0;
        articleViewer$WindowView.f29956f = false;
        articleViewer$WindowView.d = false;
        g4Var.V0 = false;
    }
}
