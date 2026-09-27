package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class z0 extends AnimatorListenerAdapter {
    public final int f40362a;
    public final j4 f40363b;

    public z0(j4 j4Var, int i10) {
        this.f40363b = j4Var;
        this.f40362a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        j4 j4Var = this.f40363b;
        ArrayList arrayList = j4Var.f34611d0;
        if (j4Var.f34613f0.f19981f) {
            ArrayList arrayList2 = new ArrayList();
            j4Var.f34627u0[0].setBackgroundDrawable(null);
            n3[] n3VarArr = j4Var.f34627u0;
            n3 n3Var = n3VarArr[1];
            n3VarArr[1] = n3VarArr[0];
            n3VarArr[0] = n3Var;
            j4Var.f34615h0.i();
            j4Var.Z0.a(j4Var.f34627u0[0].getBackgroundColor(), true);
            j4Var.f34608a1.a(j4Var.f34627u0[1].getBackgroundColor(), true);
            w3 w3Var = j4Var.K;
            if (w3Var != null) {
                w3Var.m();
            }
            for (int size = arrayList.size() - 1; size > this.f40362a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            j4Var.O0.T(j4Var.f34627u0[0].f35795b);
            org.telegram.ui.Cells.q9 q9Var = j4Var.O0;
            q9Var.E0 = j4Var.f34627u0[0].d;
            q9Var.f(true);
            j4Var.i0(false);
            j4Var.f0();
            j4Var.f34627u0[1].b();
            j4Var.f34627u0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList2.get(i10);
                i10++;
                if (obj instanceof a3) {
                    ((a3) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.j2.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            j4Var.U();
            j4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = j4Var.f34613f0;
        articleViewer$WindowView.f19981f = false;
        articleViewer$WindowView.d = false;
        j4Var.T0 = false;
    }
}
