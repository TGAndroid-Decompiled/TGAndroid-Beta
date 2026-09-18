package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class zo0 implements yf.a0, r0.n, org.telegram.ui.ActionBar.b2 {
    public final int f40296a;
    public final cq0 f40297b;

    public zo0(cq0 cq0Var, int i10) {
        this.f40296a = i10;
        this.f40297b = cq0Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        cq0 cq0Var = this.f40297b;
        cq0Var.f32854b0 = defaultWindowInsets;
        np0 np0Var = cq0Var.h.f39135b;
        int i10 = defaultWindowInsets.f10591a;
        int paddingTop = np0Var.getPaddingTop();
        i0.b bVar = cq0Var.f32854b0;
        np0Var.setPadding(i10, paddingTop, bVar.f10593c, AndroidUtilities.dp(72.0f) + bVar.d);
        np0 np0Var2 = cq0Var.f32866n.f39135b;
        int i11 = cq0Var.f32854b0.f10591a;
        int paddingTop2 = np0Var2.getPaddingTop();
        i0.b bVar2 = cq0Var.f32854b0;
        np0Var2.setPadding(i11, paddingTop2, bVar2.f10593c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = cq0Var.P;
        i0.b bVar3 = cq0Var.f32854b0;
        frameLayout.setPadding(bVar3.f10591a, 0, bVar3.f10593c, bVar3.d);
        return r0.l1.f41881b;
    }

    @Override
    public void a(int i10) {
        int i11;
        cq0 cq0Var = this.f40297b;
        fh.d dVar = cq0Var.f32861g0;
        ArrayList arrayList = cq0Var.f32865k0;
        ah.i iVar = cq0Var.f32860f0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && iVar != null) {
            ArrayList arrayList2 = cq0Var.f32864j0;
            if (i12 >= 29 && dVar != null) {
                i11 = dVar.c(0, AndroidUtilities.dp(8.0f), arrayList2);
            } else {
                i11 = 0;
            }
            int a2 = yf.e0.a(arrayList2, i11, arrayList);
            int measuredWidth = cq0Var.d.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF = (RectF) arrayList.get(i13);
                float f7 = measuredWidth;
                rectF.left = w7.p.a(rectF.left, 0.0f, f7);
                rectF.top = Math.max(0.0f, rectF.top);
                rectF.right = w7.p.a(rectF.right, 0.0f, f7);
                rectF.bottom = Math.min(cq0Var.d.getHeight(), rectF.bottom);
            }
            iVar.g(a2, arrayList);
            if (iVar.e(cq0Var.f32863i0, cq0Var.d.getWidth(), cq0Var.d.getHeight())) {
                if (dVar != null) {
                    dVar.e();
                }
                Iterator it = cq0Var.f32857d0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f40296a) {
            case 2:
                this.f40297b.finishFragment();
                return;
            default:
                this.f40297b.y0();
                return;
        }
    }
}
