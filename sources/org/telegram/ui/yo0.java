package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class yo0 implements yf.a0, r0.n, org.telegram.ui.ActionBar.z1 {
    public final int f44516a;
    public final cq0 f44517b;

    public yo0(cq0 cq0Var, int i10) {
        this.f44516a = i10;
        this.f44517b = cq0Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        cq0 cq0Var = this.f44517b;
        cq0Var.f36477b0 = defaultWindowInsets;
        np0 np0Var = cq0Var.h.f43579b;
        int i10 = defaultWindowInsets.f11574a;
        int paddingTop = np0Var.getPaddingTop();
        i0.b bVar = cq0Var.f36477b0;
        np0Var.setPadding(i10, paddingTop, bVar.f11576c, AndroidUtilities.dp(72.0f) + bVar.d);
        np0 np0Var2 = cq0Var.f36490n.f43579b;
        int i11 = cq0Var.f36477b0.f11574a;
        int paddingTop2 = np0Var2.getPaddingTop();
        i0.b bVar2 = cq0Var.f36477b0;
        np0Var2.setPadding(i11, paddingTop2, bVar2.f11576c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = cq0Var.P;
        i0.b bVar3 = cq0Var.f36477b0;
        frameLayout.setPadding(bVar3.f11574a, 0, bVar3.f11576c, bVar3.d);
        return r0.k1.f46991b;
    }

    @Override
    public void a(int i10) {
        int i11;
        cq0 cq0Var = this.f44517b;
        fh.d dVar = cq0Var.f36485g0;
        ArrayList arrayList = cq0Var.f36489k0;
        ah.h hVar = cq0Var.f36484f0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && hVar != null) {
            ArrayList arrayList2 = cq0Var.f36488j0;
            if (i12 >= 29 && dVar != null) {
                i11 = dVar.d(0, AndroidUtilities.dp(8.0f), arrayList2);
            } else {
                i11 = 0;
            }
            int a2 = yf.e0.a(arrayList2, i11, arrayList);
            int measuredWidth = cq0Var.d.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF = (RectF) arrayList.get(i13);
                float f7 = measuredWidth;
                rectF.left = w7.n.a(rectF.left, 0.0f, f7);
                rectF.top = Math.max(0.0f, rectF.top);
                rectF.right = w7.n.a(rectF.right, 0.0f, f7);
                rectF.bottom = Math.min(cq0Var.d.getHeight(), rectF.bottom);
            }
            hVar.g(a2, arrayList);
            if (hVar.e(cq0Var.f36487i0, cq0Var.d.getWidth(), cq0Var.d.getHeight())) {
                if (dVar != null) {
                    dVar.e();
                }
                Iterator it = cq0Var.f36480d0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f44516a) {
            case 2:
                this.f44517b.finishFragment();
                return;
            default:
                this.f44517b.y0();
                return;
        }
    }
}
