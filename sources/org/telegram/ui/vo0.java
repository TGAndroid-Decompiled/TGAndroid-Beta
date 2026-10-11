package org.telegram.ui;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
public final class vo0 implements yf.a0, r0.n, org.telegram.ui.ActionBar.z1 {
    public final int f43097a;
    public final zp0 f43098b;

    public vo0(zp0 zp0Var, int i10) {
        this.f43097a = i10;
        this.f43098b = zp0Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        zp0 zp0Var = this.f43098b;
        zp0Var.f45039b0 = defaultWindowInsets;
        kp0 kp0Var = zp0Var.h.f42223b;
        int i10 = defaultWindowInsets.f11575a;
        int paddingTop = kp0Var.getPaddingTop();
        i0.b bVar = zp0Var.f45039b0;
        kp0Var.setPadding(i10, paddingTop, bVar.f11577c, AndroidUtilities.dp(72.0f) + bVar.d);
        kp0 kp0Var2 = zp0Var.f45052n.f42223b;
        int i11 = zp0Var.f45039b0.f11575a;
        int paddingTop2 = kp0Var2.getPaddingTop();
        i0.b bVar2 = zp0Var.f45039b0;
        kp0Var2.setPadding(i11, paddingTop2, bVar2.f11577c, AndroidUtilities.dp(72.0f) + bVar2.d);
        FrameLayout frameLayout = zp0Var.P;
        i0.b bVar3 = zp0Var.f45039b0;
        frameLayout.setPadding(bVar3.f11575a, 0, bVar3.f11577c, bVar3.d);
        return r0.k1.f46866b;
    }

    @Override
    public void a(int i10) {
        int i11;
        zp0 zp0Var = this.f43098b;
        fh.d dVar = zp0Var.f45047g0;
        ArrayList arrayList = zp0Var.f45051k0;
        ah.h hVar = zp0Var.f45046f0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && hVar != null) {
            ArrayList arrayList2 = zp0Var.f45050j0;
            if (i12 >= 29 && dVar != null) {
                i11 = dVar.c(0, AndroidUtilities.dp(8.0f), arrayList2);
            } else {
                i11 = 0;
            }
            int a2 = yf.e0.a(arrayList2, i11, arrayList);
            int measuredWidth = zp0Var.d.getMeasuredWidth();
            for (int i13 = 0; i13 < a2; i13++) {
                RectF rectF = (RectF) arrayList.get(i13);
                float f7 = measuredWidth;
                rectF.left = w7.o.a(rectF.left, 0.0f, f7);
                rectF.top = Math.max(0.0f, rectF.top);
                rectF.right = w7.o.a(rectF.right, 0.0f, f7);
                rectF.bottom = Math.min(zp0Var.d.getHeight(), rectF.bottom);
            }
            hVar.g(a2, arrayList);
            if (hVar.e(zp0Var.f45049i0, zp0Var.d.getWidth(), zp0Var.d.getHeight())) {
                if (dVar != null) {
                    dVar.e();
                }
                Iterator it = zp0Var.f45042d0.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f43097a) {
            case 2:
                this.f43098b.finishFragment();
                return;
            default:
                this.f43098b.y0();
                return;
        }
    }
}
