package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class yo0 implements yf.b0, r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f39857a;
    public final cq0 f39858b;

    public yo0(cq0 cq0Var, int i10) {
        this.f39857a = i10;
        this.f39858b = cq0Var;
    }

    @Override
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        cq0 cq0Var = this.f39858b;
        cq0Var.f32739b0 = defaultWindowInsets;
        np0 np0Var = cq0Var.h.f39204b;
        int i10 = defaultWindowInsets.f10591a;
        int paddingTop = np0Var.getPaddingTop();
        i0.b bVar = cq0Var.f32739b0;
        np0Var.setPadding(i10, paddingTop, bVar.f10593c, AndroidUtilities.dp(72.0f) + bVar.d);
        np0 np0Var2 = cq0Var.f32751n.f39204b;
        int i11 = cq0Var.f32739b0.f10591a;
        int paddingTop2 = np0Var2.getPaddingTop();
        i0.b bVar2 = cq0Var.f32739b0;
        np0Var2.setPadding(i11, paddingTop2, bVar2.f10593c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = cq0Var.P;
        i0.b bVar3 = cq0Var.f32739b0;
        frameLayout.setPadding(bVar3.f10591a, 0, bVar3.f10593c, bVar3.d);
        return r0.m1.f42108b;
    }

    @Override
    public void a(int i10) {
        int i11;
        cq0 cq0Var = this.f39858b;
        fh.d dVar = cq0Var.f32746g0;
        ArrayList arrayList = cq0Var.f32750k0;
        ah.i iVar = cq0Var.f32745f0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && iVar != null) {
            ArrayList arrayList2 = cq0Var.f32749j0;
            if (i12 >= 29 && dVar != null) {
                i11 = dVar.e(0, AndroidUtilities.dp(8.0f), arrayList2);
            } else {
                i11 = 0;
            }
            int a2 = yf.f0.a(arrayList2, i11, arrayList);
            int measuredWidth = cq0Var.d.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF = (RectF) arrayList.get(i13);
                float f7 = measuredWidth;
                rectF.left = w7.q.a(rectF.left, 0.0f, f7);
                rectF.top = Math.max(0.0f, rectF.top);
                rectF.right = w7.q.a(rectF.right, 0.0f, f7);
                rectF.bottom = Math.min(cq0Var.d.getHeight(), rectF.bottom);
            }
            iVar.g(a2, arrayList);
            if (iVar.e(cq0Var.f32748i0, cq0Var.d.getWidth(), cq0Var.d.getHeight())) {
                if (dVar != null) {
                    dVar.f();
                }
                Iterator it = cq0Var.f32742d0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39857a) {
            case 2:
                this.f39858b.finishFragment();
                return;
            default:
                this.f39858b.y0();
                return;
        }
    }
}
