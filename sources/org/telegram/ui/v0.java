package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class v0 extends AnimatorListenerAdapter {
    public final int f52673a;
    public final g4 f52674b;

    public v0(g4 g4Var, int i7) {
        this.f52674b = g4Var;
        this.f52673a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g4 g4Var = this.f52674b;
        ArrayList arrayList = g4Var.f47953e0;
        if (g4Var.f47955g0.f30359f) {
            ArrayList arrayList2 = new ArrayList();
            g4Var.f47969v0[0].setBackgroundDrawable(null);
            k3[] k3VarArr = g4Var.f47969v0;
            k3 k3Var = k3VarArr[1];
            k3VarArr[1] = k3VarArr[0];
            k3VarArr[0] = k3Var;
            g4Var.f47957i0.i();
            g4Var.f47949b1.a(g4Var.f47969v0[0].getBackgroundColor(), true);
            g4Var.f47951c1.a(g4Var.f47969v0[1].getBackgroundColor(), true);
            t3 t3Var = g4Var.L;
            if (t3Var != null) {
                t3Var.z();
            }
            for (int size = arrayList.size() - 1; size > this.f52673a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            g4Var.Q0.S(g4Var.f47969v0[0].f49178b);
            org.telegram.ui.Cells.j9 j9Var = g4Var.Q0;
            j9Var.f30930z0 = g4Var.f47969v0[0].d;
            j9Var.f(true);
            g4Var.g0(false);
            g4Var.d0();
            g4Var.f47969v0[1].b();
            g4Var.f47969v0[1].setVisibility(8);
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
        ArticleViewer$WindowView articleViewer$WindowView = g4Var.f47955g0;
        articleViewer$WindowView.f30359f = false;
        articleViewer$WindowView.d = false;
        g4Var.V0 = false;
    }
}
