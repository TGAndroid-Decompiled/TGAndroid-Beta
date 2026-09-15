package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class xo0 implements yf.a0, r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f39649a;
    public final aq0 f39650b;

    public xo0(aq0 aq0Var, int i10) {
        this.f39649a = i10;
        this.f39650b = aq0Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        aq0 aq0Var = this.f39650b;
        aq0Var.f31888b0 = defaultWindowInsets;
        lp0 lp0Var = aq0Var.h.f38066b;
        int i10 = defaultWindowInsets.f10588a;
        int paddingTop = lp0Var.getPaddingTop();
        i0.b bVar = aq0Var.f31888b0;
        lp0Var.setPadding(i10, paddingTop, bVar.f10590c, AndroidUtilities.dp(72.0f) + bVar.d);
        lp0 lp0Var2 = aq0Var.f31900n.f38066b;
        int i11 = aq0Var.f31888b0.f10588a;
        int paddingTop2 = lp0Var2.getPaddingTop();
        i0.b bVar2 = aq0Var.f31888b0;
        lp0Var2.setPadding(i11, paddingTop2, bVar2.f10590c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = aq0Var.P;
        i0.b bVar3 = aq0Var.f31888b0;
        frameLayout.setPadding(bVar3.f10588a, 0, bVar3.f10590c, bVar3.d);
        return r0.l1.f41854b;
    }

    @Override
    public void a(int i10) {
        int i11;
        aq0 aq0Var = this.f39650b;
        fh.d dVar = aq0Var.f31895g0;
        ArrayList arrayList = aq0Var.f31899k0;
        ah.h hVar = aq0Var.f31894f0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && hVar != null) {
            ArrayList arrayList2 = aq0Var.f31898j0;
            if (i12 >= 29 && dVar != null) {
                i11 = dVar.c(0, AndroidUtilities.dp(8.0f), arrayList2);
            } else {
                i11 = 0;
            }
            int a2 = yf.e0.a(arrayList2, i11, arrayList);
            int measuredWidth = aq0Var.d.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF = (RectF) arrayList.get(i13);
                float f7 = measuredWidth;
                rectF.left = w7.p.a(rectF.left, 0.0f, f7);
                rectF.top = Math.max(0.0f, rectF.top);
                rectF.right = w7.p.a(rectF.right, 0.0f, f7);
                rectF.bottom = Math.min(aq0Var.d.getHeight(), rectF.bottom);
            }
            hVar.g(a2, arrayList);
            if (hVar.e(aq0Var.f31897i0, aq0Var.d.getWidth(), aq0Var.d.getHeight())) {
                if (dVar != null) {
                    dVar.e();
                }
                Iterator it = aq0Var.f31891d0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39649a) {
            case 2:
                this.f39650b.finishFragment();
                return;
            default:
                this.f39650b.y0();
                return;
        }
    }
}
