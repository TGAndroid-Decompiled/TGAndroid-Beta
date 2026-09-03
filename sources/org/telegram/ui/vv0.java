package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class vv0 implements r0.o, org.telegram.ui.Components.k71, org.telegram.ui.Components.aq0, org.telegram.ui.Components.jo0, org.telegram.ui.ActionBar.g6, org.telegram.ui.Components.zn0 {
    public final int f42216a;
    public final Object f42217b;

    public vv0(Object obj, int i10) {
        this.f42216a = i10;
        this.f42217b = obj;
    }

    @Override
    public void A() {
        int i10 = this.f42216a;
    }

    @Override
    public int B0(int i10) {
        return ((fd1) this.f42217b).f36777f.f37961a.B0(i10);
    }

    @Override
    public Paint F(String str) {
        return ((fd1) this.f42217b).f36777f.f37961a.F(str);
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        switch (this.f42216a) {
            case 0:
                yv0 yv0Var = (yv0) this.f42217b;
                i0.b g10 = m1Var.f46483a.g(519);
                yv0Var.f43716r = g10;
                yv0Var.d.setPadding(g10.f7757a, g10.f7758b, g10.f7759c, g10.d);
                yv0Var.f43710c.requestLayout();
                return r0.m1.f46482b;
            default:
                zd1 zd1Var = (zd1) this.f42217b;
                i0.b g11 = m1Var.f46483a.g(519);
                zd1Var.f43930n = g11;
                zd1Var.f43927c.setPadding(g11.f7757a, g11.f7758b, g11.f7759c, g11.d);
                zd1Var.f43925b.requestLayout();
                return r0.m1.f46482b;
        }
    }

    @Override
    public void U() {
        ((StickersActivity) this.f42217b).j0();
    }

    @Override
    public void X(float f10, boolean z4) {
        switch (this.f42216a) {
            case 3:
                ib1 ib1Var = (ib1) this.f42217b;
                ThemeActivity.Y(ib1Var.d, Math.round((ib1Var.f37620b * f10) + 0), false);
                return;
            default:
                tb1 tb1Var = (tb1) this.f42217b;
                ThemeActivity themeActivity = tb1Var.h;
                int i10 = tb1Var.f41499c;
                ThemeActivity.k0(themeActivity, Math.round(((tb1Var.d - i10) * f10) + i10));
                return;
        }
    }

    @Override
    public int Z0(int i10) {
        return ((fd1) this.f42217b).f36777f.f37961a.Z0(i10);
    }

    @Override
    public boolean a() {
        return ((fd1) this.f42217b).f36777f.f37961a.a();
    }

    @Override
    public void b(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f42217b;
        o41 o41Var = secretMediaViewer.f34811y;
        if (o41Var != null) {
            long p10 = o41Var.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.f34811y.L(f10 * ((float) p10), false);
            }
            secretMediaViewer.f34811y.C();
        }
    }

    @Override
    public void d(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f42217b;
        o41 o41Var = secretMediaViewer.f34811y;
        if (o41Var != null) {
            o41Var.B();
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
            ((of1) this.f42217b).f39706q0.movePreviewFragment(f10);
        }
    }

    @Override
    public int e0(int i10) {
        return ((fd1) this.f42217b).f36777f.f37961a.B0(i10);
    }

    @Override
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        sf1 sf1Var = ((of1) this.f42217b).f39706q0;
        HashSet hashSet = sf1.f41187k1;
        sf1Var.M0(r2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((of1) this.f42217b).f39706q0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f42216a) {
            case 3:
                ib1 ib1Var = (ib1) this.f42217b;
                return String.valueOf(Math.round((ib1Var.f37619a.getProgress() * ib1Var.f37620b) + 0));
            default:
                tb1 tb1Var = (tb1) this.f42217b;
                int i10 = tb1Var.f41499c;
                return String.valueOf(Math.round((tb1Var.f41498b.getProgress() * (tb1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        jd1 jd1Var = ((fd1) this.f42217b).f36777f;
        if (str.equals("drawableMsgOut")) {
            return jd1Var.O;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return jd1Var.P;
        }
        if (str.equals("drawableMsgOutMedia")) {
            return jd1Var.Q;
        }
        if (str.equals("drawableMsgOutMediaSelected")) {
            return jd1Var.R;
        }
        ic1 ic1Var = jd1Var.f37961a;
        if (ic1Var != null) {
            return ic1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.k6.O0(str);
    }

    @Override
    public void l(float f10, float f11, int i10, int i11) {
        ic1 ic1Var = ((fd1) this.f42217b).f36777f.f37961a;
        if (ic1Var != null) {
            ic1Var.l(f10, f11, i10, i11);
        } else {
            org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
        }
    }

    @Override
    public int m0() {
        switch (this.f42216a) {
            case 3:
                return ((ib1) this.f42217b).f37620b;
            default:
                tb1 tb1Var = (tb1) this.f42217b;
                return tb1Var.d - tb1Var.f41499c;
        }
    }

    @Override
    public boolean o0() {
        return ((fd1) this.f42217b).f36777f.f37961a.o0();
    }

    @Override
    public void u0() {
        ((StickersActivity) this.f42217b).j0();
    }

    @Override
    public ColorFilter w() {
        return org.telegram.ui.ActionBar.k6.f21978v3;
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void J0(int i10, int i11) {
    }
}
