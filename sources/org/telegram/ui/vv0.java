package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class vv0 implements r0.o, org.telegram.ui.Components.j71, org.telegram.ui.Components.aq0, org.telegram.ui.Components.io0, org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.yn0 {
    public final int f39207a;
    public final Object f39208b;

    public vv0(Object obj, int i10) {
        this.f39207a = i10;
        this.f39208b = obj;
    }

    @Override
    public void B() {
        int i10 = this.f39207a;
    }

    @Override
    public Paint G(String str) {
        return ((fd1) this.f39208b).f34044f.f35179a.G(str);
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        switch (this.f39207a) {
            case 0:
                yv0 yv0Var = (yv0) this.f39208b;
                i0.b g10 = m1Var.f43154a.g(519);
                yv0Var.f40341r = g10;
                yv0Var.d.setPadding(g10.f7196a, g10.f7197b, g10.f7198c, g10.d);
                yv0Var.f40336c.requestLayout();
                return r0.m1.f43153b;
            default:
                yd1 yd1Var = (yd1) this.f39208b;
                i0.b g11 = m1Var.f43154a.g(519);
                yd1Var.f40241n = g11;
                yd1Var.f40239c.setPadding(g11.f7196a, g11.f7197b, g11.f7198c, g11.d);
                yd1Var.f40237b.requestLayout();
                return r0.m1.f43153b;
        }
    }

    @Override
    public void V() {
        ((StickersActivity) this.f39208b).j0();
    }

    @Override
    public void Y(float f10, boolean z4) {
        switch (this.f39207a) {
            case 3:
                jb1 jb1Var = (jb1) this.f39208b;
                ThemeActivity.Y(jb1Var.d, Math.round((jb1Var.f35162b * f10) + 0), false);
                return;
            default:
                ub1 ub1Var = (ub1) this.f39208b;
                ThemeActivity themeActivity = ub1Var.h;
                int i10 = ub1Var.f38769c;
                ThemeActivity.k0(themeActivity, Math.round(((ub1Var.d - i10) * f10) + i10));
                return;
        }
    }

    @Override
    public boolean a() {
        return ((fd1) this.f39208b).f34044f.f35179a.a();
    }

    @Override
    public void b(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39208b;
        o41 o41Var = secretMediaViewer.f32249y;
        if (o41Var != null) {
            long p10 = o41Var.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.f32249y.L(f10 * ((float) p10), false);
            }
            secretMediaViewer.f32249y.C();
        }
    }

    @Override
    public void d(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39208b;
        o41 o41Var = secretMediaViewer.f32249y;
        if (o41Var != null) {
            o41Var.B();
            long p10 = secretMediaViewer.f32249y.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.f32249y.L(f10 * ((float) p10), false);
            }
        }
    }

    @Override
    public int d0(int i10) {
        return ((fd1) this.f39208b).f34044f.f35179a.x0(i10);
    }

    @Override
    public void e(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((of1) this.f39208b).f36792q0.movePreviewFragment(f10);
        }
    }

    @Override
    public void f(org.telegram.ui.Cells.q2 q2Var) {
        sf1 sf1Var = ((of1) this.f39208b).f36792q0;
        HashSet hashSet = sf1.f38174k1;
        sf1Var.M0(q2Var);
    }

    @Override
    public int f1(int i10) {
        return ((fd1) this.f39208b).f34044f.f35179a.f1(i10);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((of1) this.f39208b).f36792q0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f39207a) {
            case 3:
                jb1 jb1Var = (jb1) this.f39208b;
                return String.valueOf(Math.round((jb1Var.f35161a.getProgress() * jb1Var.f35162b) + 0));
            default:
                ub1 ub1Var = (ub1) this.f39208b;
                int i10 = ub1Var.f38769c;
                return String.valueOf(Math.round((ub1Var.f38768b.getProgress() * (ub1Var.d - i10)) + i10));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        jd1 jd1Var = ((fd1) this.f39208b).f34044f;
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
        jc1 jc1Var = jd1Var.f35179a;
        if (jc1Var != null) {
            return jc1Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override
    public int j0() {
        switch (this.f39207a) {
            case 3:
                return ((jb1) this.f39208b).f35162b;
            default:
                ub1 ub1Var = (ub1) this.f39208b;
                return ub1Var.d - ub1Var.f38769c;
        }
    }

    @Override
    public void l(float f10, float f11, int i10, int i11) {
        jc1 jc1Var = ((fd1) this.f39208b).f34044f.f35179a;
        if (jc1Var != null) {
            jc1Var.l(f10, f11, i10, i11);
        } else {
            org.telegram.ui.ActionBar.j6.q(f10, f11, i10, i11);
        }
    }

    @Override
    public boolean m0() {
        return ((fd1) this.f39208b).f34044f.f35179a.m0();
    }

    @Override
    public void q0() {
        ((StickersActivity) this.f39208b).j0();
    }

    @Override
    public ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f20197v3;
    }

    @Override
    public int x0(int i10) {
        return ((fd1) this.f39208b).f34044f.f35179a.x0(i10);
    }

    private final void c() {
    }

    private final void g() {
    }

    @Override
    public void J0(int i10, int i11) {
    }
}
