package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class qv0 implements r0.o, org.telegram.ui.Components.l71, org.telegram.ui.Components.bq0, org.telegram.ui.Components.ko0, org.telegram.ui.ActionBar.g6, org.telegram.ui.Components.ao0 {
    public final int f40704a;
    public final Object f40705b;

    public qv0(Object obj, int i10) {
        this.f40704a = i10;
        this.f40705b = obj;
    }

    @Override
    public void A() {
        int i10 = this.f40704a;
    }

    @Override
    public int B0(int i10) {
        return ((ad1) this.f40705b).f35137f.f36486a.B0(i10);
    }

    @Override
    public Paint F(String str) {
        return ((ad1) this.f40705b).f35137f.f36486a.F(str);
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        switch (this.f40704a) {
            case 0:
                tv0 tv0Var = (tv0) this.f40705b;
                i0.b g10 = m1Var.f46452a.g(519);
                tv0Var.f41723r = g10;
                tv0Var.d.setPadding(g10.f7757a, g10.f7758b, g10.f7759c, g10.d);
                tv0Var.f41717c.requestLayout();
                return r0.m1.f46451b;
            default:
                ud1 ud1Var = (ud1) this.f40705b;
                i0.b g11 = m1Var.f46452a.g(519);
                ud1Var.f41905n = g11;
                ud1Var.f41902c.setPadding(g11.f7757a, g11.f7758b, g11.f7759c, g11.d);
                ud1Var.f41900b.requestLayout();
                return r0.m1.f46451b;
        }
    }

    @Override
    public void U() {
        ((StickersActivity) this.f40705b).j0();
    }

    @Override
    public void X(float f10, boolean z4) {
        switch (this.f40704a) {
            case 3:
                cb1 cb1Var = (cb1) this.f40705b;
                ThemeActivity.Y(cb1Var.d, Math.round((cb1Var.f35762b * f10) + 0), false);
                return;
            default:
                nb1 nb1Var = (nb1) this.f40705b;
                ThemeActivity themeActivity = nb1Var.h;
                int i10 = nb1Var.f39375c;
                ThemeActivity.k0(themeActivity, Math.round(((nb1Var.d - i10) * f10) + i10));
                return;
        }
    }

    @Override
    public int Z0(int i10) {
        return ((ad1) this.f40705b).f35137f.f36486a.Z0(i10);
    }

    @Override
    public boolean a() {
        return ((ad1) this.f40705b).f35137f.f36486a.a();
    }

    @Override
    public void b(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40705b;
        j41 j41Var = secretMediaViewer.f34811y;
        if (j41Var != null) {
            long p10 = j41Var.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.f34811y.L(f10 * ((float) p10), false);
            }
            secretMediaViewer.f34811y.C();
        }
    }

    @Override
    public void d(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40705b;
        j41 j41Var = secretMediaViewer.f34811y;
        if (j41Var != null) {
            j41Var.B();
            long p10 = secretMediaViewer.f34811y.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.f34811y.L(f10 * ((float) p10), false);
            }
        }
    }

    @Override
    public void e(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((if1) this.f40705b).f37849q0.movePreviewFragment(f10);
        }
    }

    @Override
    public int e0(int i10) {
        return ((ad1) this.f40705b).f35137f.f36486a.B0(i10);
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        mf1 mf1Var = ((if1) this.f40705b).f37849q0;
        HashSet hashSet = mf1.f39101k1;
        mf1Var.M0(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((if1) this.f40705b).f37849q0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f40704a) {
            case 3:
                cb1 cb1Var = (cb1) this.f40705b;
                return String.valueOf(Math.round((cb1Var.f35761a.getProgress() * cb1Var.f35762b) + 0));
            default:
                nb1 nb1Var = (nb1) this.f40705b;
                int i10 = nb1Var.f39375c;
                return String.valueOf(Math.round((nb1Var.f39374b.getProgress() * (nb1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        ed1 ed1Var = ((ad1) this.f40705b).f35137f;
        if (str.equals("drawableMsgOut")) {
            return ed1Var.O;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return ed1Var.P;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return ed1Var.Q;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return ed1Var.R;
        }
        dc1 dc1Var = ed1Var.f36486a;
        if (dc1Var != null) {
            return dc1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.k6.O0(str);
    }

    @Override
    public void l(float f10, float f11, int i10, int i11) {
        dc1 dc1Var = ((ad1) this.f40705b).f35137f.f36486a;
        if (dc1Var != null) {
            dc1Var.l(f10, f11, i10, i11);
        } else {
            org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
        }
    }

    @Override
    public int m0() {
        switch (this.f40704a) {
            case 3:
                return ((cb1) this.f40705b).f35762b;
            default:
                nb1 nb1Var = (nb1) this.f40705b;
                return nb1Var.d - nb1Var.f39375c;
        }
    }

    @Override
    public boolean o0() {
        return ((ad1) this.f40705b).f35137f.f36486a.o0();
    }

    @Override
    public void u0() {
        ((StickersActivity) this.f40705b).j0();
    }

    @Override
    public ColorFilter w() {
        return org.telegram.ui.ActionBar.k6.f21976v3;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void J0(int i10, int i11) {
    }
}
