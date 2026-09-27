package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class so0 implements yf.a0, r0.n, org.telegram.ui.ActionBar.b2 {
    public final int f37538a;
    public final wp0 f37539b;

    public so0(wp0 wp0Var, int i10) {
        this.f37538a = i10;
        this.f37539b = wp0Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        wp0 wp0Var = this.f37539b;
        wp0Var.f39391b0 = defaultWindowInsets;
        hp0 hp0Var = wp0Var.h.f36790b;
        int i10 = defaultWindowInsets.f10579a;
        int paddingTop = hp0Var.getPaddingTop();
        i0.b bVar = wp0Var.f39391b0;
        hp0Var.setPadding(i10, paddingTop, bVar.f10581c, AndroidUtilities.dp(72.0f) + bVar.d);
        hp0 hp0Var2 = wp0Var.f39403n.f36790b;
        int i11 = wp0Var.f39391b0.f10579a;
        int paddingTop2 = hp0Var2.getPaddingTop();
        i0.b bVar2 = wp0Var.f39391b0;
        hp0Var2.setPadding(i11, paddingTop2, bVar2.f10581c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = wp0Var.P;
        i0.b bVar3 = wp0Var.f39391b0;
        frameLayout.setPadding(bVar3.f10579a, 0, bVar3.f10581c, bVar3.d);
        return r0.l1.f42184b;
    }

    @Override
    public void a(int i10) {
        int i11;
        wp0 wp0Var = this.f37539b;
        fh.d dVar = wp0Var.f39398g0;
        ArrayList arrayList = wp0Var.f39402k0;
        ah.i iVar = wp0Var.f39397f0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && iVar != null) {
            ArrayList arrayList2 = wp0Var.f39401j0;
            if (i12 >= 29 && dVar != null) {
                i11 = dVar.e(0, AndroidUtilities.dp(8.0f), arrayList2);
            } else {
                i11 = 0;
            }
            int a2 = yf.e0.a(arrayList2, i11, arrayList);
            int measuredWidth = wp0Var.d.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF = (RectF) arrayList.get(i13);
                float f7 = measuredWidth;
                rectF.left = w7.q.a(rectF.left, 0.0f, f7);
                rectF.top = Math.max(0.0f, rectF.top);
                rectF.right = w7.q.a(rectF.right, 0.0f, f7);
                rectF.bottom = Math.min(wp0Var.d.getHeight(), rectF.bottom);
            }
            iVar.g(a2, arrayList);
            if (iVar.e(wp0Var.f39400i0, wp0Var.d.getWidth(), wp0Var.d.getHeight())) {
                if (dVar != null) {
                    dVar.f();
                }
                Iterator it = wp0Var.f39394d0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f37538a) {
            case 2:
                this.f37539b.finishFragment();
                return;
            default:
                this.f37539b.y0();
                return;
        }
    }
}
