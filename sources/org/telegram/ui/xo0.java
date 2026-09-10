package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class xo0 implements xf.b0, r0.n, org.telegram.ui.ActionBar.c2 {
    public final int f38785a;
    public final bq0 f38786b;

    public xo0(bq0 bq0Var, int i10) {
        this.f38785a = i10;
        this.f38786b = bq0Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        bq0 bq0Var = this.f38786b;
        bq0Var.f31340b0 = defaultWindowInsets;
        lp0 lp0Var = bq0Var.h.f37307b;
        int i10 = defaultWindowInsets.f10074a;
        int paddingTop = lp0Var.getPaddingTop();
        i0.c cVar = bq0Var.f31340b0;
        lp0Var.setPadding(i10, paddingTop, cVar.f10076c, AndroidUtilities.dp(72.0f) + cVar.d);
        lp0 lp0Var2 = bq0Var.f31352n.f37307b;
        int i11 = bq0Var.f31340b0.f10074a;
        int paddingTop2 = lp0Var2.getPaddingTop();
        i0.c cVar2 = bq0Var.f31340b0;
        lp0Var2.setPadding(i11, paddingTop2, cVar2.f10076c, AndroidUtilities.dp(72.0f) + cVar2.d);
        FrameLayout frameLayout = bq0Var.P;
        i0.c cVar3 = bq0Var.f31340b0;
        frameLayout.setPadding(cVar3.f10074a, 0, cVar3.f10076c, cVar3.d);
        return r0.l1.f41073b;
    }

    @Override
    public void b(int i10) {
        int i11;
        bq0 bq0Var = this.f38786b;
        eh.d dVar = bq0Var.f31347g0;
        ArrayList arrayList = bq0Var.f31351k0;
        zg.e eVar = bq0Var.f31346f0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && eVar != null) {
            ArrayList arrayList2 = bq0Var.f31350j0;
            if (i12 >= 29 && dVar != null) {
                i11 = dVar.d(0, AndroidUtilities.dp(8.0f), arrayList2);
            } else {
                i11 = 0;
            }
            int a2 = xf.f0.a(i11, arrayList2, arrayList);
            int measuredWidth = bq0Var.d.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF = (RectF) arrayList.get(i13);
                float f7 = measuredWidth;
                rectF.left = w7.q.a(rectF.left, 0.0f, f7);
                rectF.top = Math.max(0.0f, rectF.top);
                rectF.right = w7.q.a(rectF.right, 0.0f, f7);
                rectF.bottom = Math.min(bq0Var.d.getHeight(), rectF.bottom);
            }
            eVar.g(a2, arrayList);
            if (eVar.e(bq0Var.f31349i0, bq0Var.d.getWidth(), bq0Var.d.getHeight())) {
                if (dVar != null) {
                    dVar.e();
                }
                Iterator it = bq0Var.f31343d0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f38785a) {
            case 2:
                this.f38786b.finishFragment();
                return;
            default:
                this.f38786b.y0();
                return;
        }
    }
}
