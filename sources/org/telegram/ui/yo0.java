package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class yo0 implements yf.b0, r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f43201a;
    public final bq0 f43202b;

    public yo0(bq0 bq0Var, int i10) {
        this.f43201a = i10;
        this.f43202b = bq0Var;
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        bq0 bq0Var = this.f43202b;
        bq0Var.f34887b0 = defaultWindowInsets;
        mp0 mp0Var = bq0Var.h.f41628b;
        int i10 = defaultWindowInsets.f11451a;
        int paddingTop = mp0Var.getPaddingTop();
        i0.c cVar = bq0Var.f34887b0;
        mp0Var.setPadding(i10, paddingTop, cVar.f11453c, AndroidUtilities.dp(72.0f) + cVar.d);
        mp0 mp0Var2 = bq0Var.f34900n.f41628b;
        int i11 = bq0Var.f34887b0.f11451a;
        int paddingTop2 = mp0Var2.getPaddingTop();
        i0.c cVar2 = bq0Var.f34887b0;
        mp0Var2.setPadding(i11, paddingTop2, cVar2.f11453c, AndroidUtilities.dp(72.0f) + cVar2.d);
        FrameLayout frameLayout = bq0Var.P;
        i0.c cVar3 = bq0Var.f34887b0;
        frameLayout.setPadding(cVar3.f11451a, 0, cVar3.f11453c, cVar3.d);
        return r0.l1.f44738b;
    }

    @Override
    public void a(int i10) {
        int i11;
        bq0 bq0Var = this.f43202b;
        gh.d dVar = bq0Var.f34895g0;
        ArrayList arrayList = bq0Var.f34899k0;
        bh.f fVar = bq0Var.f34894f0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && fVar != null) {
            ArrayList arrayList2 = bq0Var.f34898j0;
            if (i12 >= 29 && dVar != null) {
                i11 = dVar.c(0, AndroidUtilities.dp(8.0f), arrayList2);
            } else {
                i11 = 0;
            }
            int a2 = yf.f0.a(i11, arrayList2, arrayList);
            int measuredWidth = bq0Var.d.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF = (RectF) arrayList.get(i13);
                float f7 = measuredWidth;
                rectF.left = w7.p.a(rectF.left, 0.0f, f7);
                rectF.top = Math.max(0.0f, rectF.top);
                rectF.right = w7.p.a(rectF.right, 0.0f, f7);
                rectF.bottom = Math.min(bq0Var.d.getHeight(), rectF.bottom);
            }
            fVar.g(a2, arrayList);
            if (fVar.e(bq0Var.f34897i0, bq0Var.d.getWidth(), bq0Var.d.getHeight())) {
                if (dVar != null) {
                    dVar.d();
                }
                Iterator it = bq0Var.f34890d0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f43201a) {
            case 2:
                this.f43202b.finishFragment();
                return;
            default:
                this.f43202b.y0();
                return;
        }
    }
}
