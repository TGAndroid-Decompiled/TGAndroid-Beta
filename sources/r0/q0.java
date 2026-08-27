package r0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import j$.util.Objects;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.i6;

public final class q0 implements View.OnApplyWindowInsetsListener {

    public final yg.e f46627a;

    public m1 f46628b;

    public q0(ViewGroup viewGroup, yg.e eVar) {
        m1 m1VarB;
        this.f46627a = eVar;
        m1 m1VarF = j0.f(viewGroup);
        if (m1VarF != null) {
            int i10 = Build.VERSION.SDK_INT;
            m1VarB = (i10 >= 34 ? new b1(m1VarF) : i10 >= 30 ? new a1(m1VarF) : i10 >= 29 ? new z0(m1VarF) : new y0(m1VarF)).b();
        } else {
            m1VarB = null;
        }
        this.f46628b = m1VarB;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f46628b = m1.h(view, windowInsets);
            return r0.i(view, windowInsets);
        }
        m1 m1VarH = m1.h(view, windowInsets);
        j1 j1Var = m1VarH.f46619a;
        if (this.f46628b == null) {
            this.f46628b = j0.f(view);
        }
        if (this.f46628b == null) {
            this.f46628b = m1VarH;
            return r0.i(view, windowInsets);
        }
        b8.a aVarJ = r0.j(view);
        if (aVarJ != null && Objects.equals((m1) aVarJ.f2040a, m1VarH)) {
            return r0.i(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        m1 m1Var = this.f46628b;
        int i10 = 1;
        while (i10 <= 512) {
            i0.c cVarF = j1Var.f(i10);
            i0.c cVarF2 = m1Var.f46619a.f(i10);
            int i11 = cVarF.f10489a;
            int i12 = cVarF.d;
            int i13 = cVarF.f10491c;
            int i14 = cVarF.f10490b;
            int i15 = cVarF2.f10489a;
            int i16 = cVarF2.d;
            int i17 = cVarF2.f10491c;
            int i18 = cVarF2.f10490b;
            boolean z10 = i11 > i15 || i14 > i18 || i13 > i17 || i12 > i16;
            if (z10 != (i11 < i15 || i14 < i18 || i13 < i17 || i12 < i16)) {
                if (z10) {
                    iArr[0] = iArr[0] | i10;
                } else {
                    iArr2[0] = iArr2[0] | i10;
                }
            }
            i10 <<= 1;
            iArr = iArr;
        }
        int i19 = iArr[0];
        int i20 = iArr2[0];
        int i21 = i19 | i20;
        if (i21 == 0) {
            this.f46628b = m1VarH;
            return r0.i(view, windowInsets);
        }
        m1 m1Var2 = this.f46628b;
        if ((i19 & 8) != 0) {
            interpolator = r0.f46630e;
        } else if ((i20 & 8) != 0) {
            interpolator = r0.f46631f;
        } else if ((i19 & 519) != 0) {
            interpolator = r0.f46632g;
        } else {
            interpolator = (i20 & 519) != 0 ? r0.h : null;
        }
        w0 w0Var = new w0(i21, (i21 & 8) != 0 ? 160L : 250L, interpolator);
        w0Var.f46646a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(w0Var.f46646a.a());
        i0.c cVarF3 = j1Var.f(i21);
        i0.c cVarF4 = m1Var2.f46619a.f(i21);
        int iMin = Math.min(cVarF3.f10489a, cVarF4.f10489a);
        int i22 = cVarF3.f10490b;
        int i23 = cVarF4.f10490b;
        int iMin2 = Math.min(i22, i23);
        int i24 = cVarF3.f10491c;
        int i25 = cVarF4.f10491c;
        int iMin3 = Math.min(i24, i25);
        int i26 = cVarF3.d;
        int i27 = cVarF4.d;
        i0.c cVarB = i0.c.b(iMin, iMin2, iMin3, Math.min(i26, i27));
        i0.c cVarB2 = i0.c.b(Math.max(cVarF3.f10489a, cVarF4.f10489a), Math.max(i22, i23), Math.max(i24, i25), Math.max(i26, i27));
        int i28 = 18;
        i6 i6Var = new i6(cVarB, cVarB2, false, i28);
        r0.f(view, m1VarH, false);
        duration.addUpdateListener(new p0(w0Var, m1VarH, m1Var2, i21, view));
        duration.addListener(new fk0(w0Var, view, i28));
        q.a(view, new bf.e(view, w0Var, i6Var, duration, false, 8));
        this.f46628b = m1VarH;
        return r0.i(view, windowInsets);
    }
}
