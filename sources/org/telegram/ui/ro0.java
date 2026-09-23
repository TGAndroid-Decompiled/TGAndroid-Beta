package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class ro0 implements yf.a0, r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f36902a;
    public final up0 f36903b;

    public ro0(up0 up0Var, int i10) {
        this.f36902a = i10;
        this.f36903b = up0Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        up0 up0Var = this.f36903b;
        up0Var.f38146b0 = defaultWindowInsets;
        fp0 fp0Var = up0Var.h.f35921b;
        int i10 = defaultWindowInsets.f10576a;
        int paddingTop = fp0Var.getPaddingTop();
        i0.b bVar = up0Var.f38146b0;
        fp0Var.setPadding(i10, paddingTop, bVar.f10578c, AndroidUtilities.dp(72.0f) + bVar.d);
        fp0 fp0Var2 = up0Var.f38158n.f35921b;
        int i11 = up0Var.f38146b0.f10576a;
        int paddingTop2 = fp0Var2.getPaddingTop();
        i0.b bVar2 = up0Var.f38146b0;
        fp0Var2.setPadding(i11, paddingTop2, bVar2.f10578c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = up0Var.P;
        i0.b bVar3 = up0Var.f38146b0;
        frameLayout.setPadding(bVar3.f10576a, 0, bVar3.f10578c, bVar3.d);
        return r0.l1.f41806b;
    }

    @Override
    public void a(int i10) {
        int i11;
        up0 up0Var = this.f36903b;
        fh.d dVar = up0Var.f38153g0;
        ArrayList arrayList = up0Var.f38157k0;
        ah.h hVar = up0Var.f38152f0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && hVar != null) {
            ArrayList arrayList2 = up0Var.f38156j0;
            if (i12 >= 29 && dVar != null) {
                i11 = dVar.c(0, AndroidUtilities.dp(8.0f), arrayList2);
            } else {
                i11 = 0;
            }
            int a2 = yf.e0.a(arrayList2, i11, arrayList);
            int measuredWidth = up0Var.d.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF = (RectF) arrayList.get(i13);
                float f7 = measuredWidth;
                rectF.left = w7.p.a(rectF.left, 0.0f, f7);
                rectF.top = Math.max(0.0f, rectF.top);
                rectF.right = w7.p.a(rectF.right, 0.0f, f7);
                rectF.bottom = Math.min(up0Var.d.getHeight(), rectF.bottom);
            }
            hVar.g(a2, arrayList);
            if (hVar.e(up0Var.f38155i0, up0Var.d.getWidth(), up0Var.d.getHeight())) {
                if (dVar != null) {
                    dVar.e();
                }
                Iterator it = up0Var.f38149d0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36902a) {
            case 2:
                this.f36903b.finishFragment();
                return;
            default:
                this.f36903b.y0();
                return;
        }
    }
}
