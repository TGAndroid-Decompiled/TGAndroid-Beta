package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class v0 extends AnimatorListenerAdapter {
    public final int f50460a;
    public final g4 f50461b;

    public v0(g4 g4Var, int i7) {
        this.f50461b = g4Var;
        this.f50460a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g4 g4Var = this.f50461b;
        ArrayList arrayList = g4Var.f45803d0;
        if (g4Var.f45805f0.f28843f) {
            ArrayList arrayList2 = new ArrayList();
            g4Var.f45819u0[0].setBackgroundDrawable(null);
            k3[] k3VarArr = g4Var.f45819u0;
            k3 k3Var = k3VarArr[1];
            k3VarArr[1] = k3VarArr[0];
            k3VarArr[0] = k3Var;
            g4Var.f45807h0.i();
            g4Var.f45799a1.a(g4Var.f45819u0[0].getBackgroundColor(), true);
            g4Var.f45801b1.a(g4Var.f45819u0[1].getBackgroundColor(), true);
            t3 t3Var = g4Var.K;
            if (t3Var != null) {
                t3Var.z();
            }
            for (int size = arrayList.size() - 1; size > this.f50460a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            g4Var.P0.S(g4Var.f45819u0[0].f47085b);
            org.telegram.ui.Cells.i9 i9Var = g4Var.P0;
            i9Var.f29327z0 = g4Var.f45819u0[0].d;
            i9Var.f(true);
            g4Var.g0(false);
            g4Var.d0();
            g4Var.f45819u0[1].b();
            g4Var.f45819u0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj = arrayList2.get(i7);
                i7++;
                if (obj instanceof x2) {
                    ((x2) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.w1.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            g4Var.S();
            g4Var.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView = g4Var.f45805f0;
        articleViewer$WindowView.f28843f = false;
        articleViewer$WindowView.d = false;
        g4Var.U0 = false;
    }
}
