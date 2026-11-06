package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;
public final class wr0 implements r0.m, org.telegram.ui.Components.t51, org.telegram.ui.Components.co0, org.telegram.ui.Components.lm0, org.telegram.ui.Components.bm0 {
    public final int f51497a;
    public final Object f51498b;

    public wr0(Object obj, int i7) {
        this.f51497a = i7;
        this.f51498b = obj;
    }

    @Override
    public void A(float f10) {
        Point point = org.telegram.messenger.g0.f22537q;
        if (point.x > point.y) {
            ((r91) this.f51498b).f49435v0.movePreviewFragment(f10);
        }
    }

    @Override
    public void C0() {
        ((StickersActivity) this.f51498b).o0();
    }

    @Override
    public void D() {
        int i7 = this.f51497a;
    }

    @Override
    public void O(org.telegram.ui.Cells.t2 t2Var) {
        v91 v91Var = ((r91) this.f51498b).f49435v0;
        HashSet hashSet = v91.f50628q1;
        v91Var.Q0(t2Var);
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        switch (this.f51497a) {
            case 0:
                zr0 zr0Var = (zr0) this.f51498b;
                i0.b g10 = k1Var.f54109a.g(519);
                zr0Var.f52663r = g10;
                zr0Var.d.setPadding(g10.f15117a, g10.f15118b, g10.f15119c, g10.d);
                zr0Var.f52654c.requestLayout();
                return r0.k1.f54108b;
            default:
                f81 f81Var = (f81) this.f51498b;
                i0.b g11 = k1Var.f54109a.g(519);
                f81Var.f45566n = g11;
                f81Var.f45560c.setPadding(g11.f15117a, g11.f15118b, g11.f15119c, g11.d);
                f81Var.f45558b.requestLayout();
                return r0.k1.f54108b;
        }
    }

    @Override
    public void W() {
        ((StickersActivity) this.f51498b).o0();
    }

    @Override
    public void a(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f51498b;
        kp0 kp0Var = secretMediaViewer.D;
        if (kp0Var != null) {
            long U = kp0Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.D.q0(f10 * ((float) U), false);
            }
            secretMediaViewer.D.h0();
        }
    }

    @Override
    public void d(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f51498b;
        kp0 kp0Var = secretMediaViewer.D;
        if (kp0Var != null) {
            kp0Var.g0();
            long U = secretMediaViewer.D.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.D.q0(f10 * ((float) U), false);
            }
        }
    }

    @Override
    public void finish() {
        Point point = org.telegram.messenger.g0.f22537q;
        if (point.x > point.y) {
            ((r91) this.f51498b).f49435v0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f51497a) {
            case 3:
                w51 w51Var = (w51) this.f51498b;
                return String.valueOf(Math.round((w51Var.f50963a.getProgress() * w51Var.f50964b) + 0));
            default:
                g61 g61Var = (g61) this.f51498b;
                int i7 = g61Var.d;
                return String.valueOf(Math.round((g61Var.f45874b.getProgress() * (g61Var.f45876e - i7)) + i7));
        }
    }

    @Override
    public void l(boolean z9, float f10) {
        switch (this.f51497a) {
            case 3:
                w51 w51Var = (w51) this.f51498b;
                ThemeActivity.d0(w51Var.f50966e, Math.round((w51Var.f50964b * f10) + 0), false);
                return;
            default:
                g61 g61Var = (g61) this.f51498b;
                ThemeActivity themeActivity = g61Var.f45879r;
                int i7 = g61Var.d;
                ThemeActivity.p0(themeActivity, Math.round(((g61Var.f45876e - i7) * f10) + i7));
                return;
        }
    }

    @Override
    public int q0() {
        switch (this.f51497a) {
            case 3:
                return ((w51) this.f51498b).f50964b;
            default:
                g61 g61Var = (g61) this.f51498b;
                return g61Var.f45876e - g61Var.d;
        }
    }

    private final void b() {
    }

    private final void c() {
    }
}
