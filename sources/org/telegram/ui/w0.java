package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class w0 extends AnimatorListenerAdapter {
    public final int f50646a;
    public final i4 f50647b;

    public w0(i4 i4Var, int i3) {
        this.f50647b = i4Var;
        this.f50646a = i3;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        i4 i4Var = this.f50647b;
        ArrayList arrayList = i4Var.f46084e0;
        if (i4Var.f46086g0.f28900f) {
            ArrayList arrayList2 = new ArrayList();
            i4Var.f46100v0[0].setBackgroundDrawable(null);
            l3[] l3VarArr = i4Var.f46100v0;
            l3 l3Var = l3VarArr[1];
            l3VarArr[1] = l3VarArr[0];
            l3VarArr[0] = l3Var;
            i4Var.f46088i0.i();
            i4Var.f46080b1.a(i4Var.f46100v0[0].getBackgroundColor(), true);
            i4Var.f46082c1.a(i4Var.f46100v0[1].getBackgroundColor(), true);
            u3 u3Var = i4Var.L;
            if (u3Var != null) {
                u3Var.z();
            }
            for (int size = arrayList.size() - 1; size > this.f50646a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            i4Var.Q0.S(i4Var.f46100v0[0].f47083b);
            org.telegram.ui.Cells.h9 h9Var = i4Var.Q0;
            h9Var.f29362z0 = i4Var.f46100v0[0].d;
            h9Var.f(true);
            i4Var.g0(false);
            i4Var.d0();
            i4Var.f46100v0[1].b();
            i4Var.f46100v0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList2.get(i3);
                i3++;
                if (obj instanceof y2) {
                    ((y2) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.u1.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            i4Var.S();
            i4Var.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView = i4Var.f46086g0;
        articleViewer$WindowView.f28900f = false;
        articleViewer$WindowView.d = false;
        i4Var.V0 = false;
    }
}
