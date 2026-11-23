package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;
public final class wr0 implements r0.m, org.telegram.ui.Components.k61, org.telegram.ui.Components.po0, org.telegram.ui.Components.zm0, org.telegram.ui.Components.pm0 {
    public final int f53746a;
    public final Object f53747b;

    public wr0(Object obj, int i7) {
        this.f53746a = i7;
        this.f53747b = obj;
    }

    @Override
    public void K() {
        ((StickersActivity) this.f53747b).o0();
    }

    @Override
    public int a0() {
        switch (this.f53746a) {
            case 3:
                return ((v51) this.f53747b).f52822b;
            default:
                f61 f61Var = (f61) this.f53747b;
                return f61Var.f47705e - f61Var.d;
        }
    }

    @Override
    public void e(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f53747b;
        kp0 kp0Var = secretMediaViewer.E;
        if (kp0Var != null) {
            long U = kp0Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.q0(f10 * ((float) U), false);
            }
            secretMediaViewer.E.h0();
        }
    }

    @Override
    public void finish() {
        Point point = org.telegram.messenger.g0.f24226q;
        if (point.x > point.y) {
            ((s91) this.f53747b).f52027w0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f53746a) {
            case 3:
                v51 v51Var = (v51) this.f53747b;
                return String.valueOf(Math.round((v51Var.f52821a.getProgress() * v51Var.f52822b) + 0));
            default:
                f61 f61Var = (f61) this.f53747b;
                int i7 = f61Var.d;
                return String.valueOf(Math.round((f61Var.f47703b.getProgress() * (f61Var.f47705e - i7)) + i7));
        }
    }

    @Override
    public void h(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f53747b;
        kp0 kp0Var = secretMediaViewer.E;
        if (kp0Var != null) {
            kp0Var.g0();
            long U = secretMediaViewer.E.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.q0(f10 * ((float) U), false);
            }
        }
    }

    @Override
    public void j(boolean z10, float f10) {
        switch (this.f53746a) {
            case 3:
                v51 v51Var = (v51) this.f53747b;
                ThemeActivity.d0(v51Var.f52824e, Math.round((v51Var.f52822b * f10) + 0), false);
                return;
            default:
                f61 f61Var = (f61) this.f53747b;
                ThemeActivity themeActivity = f61Var.f47708r;
                int i7 = f61Var.d;
                ThemeActivity.p0(themeActivity, Math.round(((f61Var.f47705e - i7) * f10) + i7));
                return;
        }
    }

    @Override
    public void l0() {
        ((StickersActivity) this.f53747b).o0();
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        switch (this.f53746a) {
            case 0:
                zr0 zr0Var = (zr0) this.f53747b;
                i0.b g10 = l1Var.f56381a.g(519);
                zr0Var.f54707r = g10;
                zr0Var.d.setPadding(g10.f15978a, g10.f15979b, g10.f15980c, g10.d);
                zr0Var.f54697c.requestLayout();
                return r0.l1.f56380b;
            default:
                g81 g81Var = (g81) this.f53747b;
                i0.b g11 = l1Var.f56381a.g(519);
                g81Var.f48181n = g11;
                g81Var.f48174c.setPadding(g11.f15978a, g11.f15979b, g11.f15980c, g11.d);
                g81Var.f48172b.requestLayout();
                return r0.l1.f56380b;
        }
    }

    @Override
    public void v(float f10) {
        Point point = org.telegram.messenger.g0.f24226q;
        if (point.x > point.y) {
            ((s91) this.f53747b).f52027w0.movePreviewFragment(f10);
        }
    }

    @Override
    public void w() {
        int i7 = this.f53746a;
    }

    @Override
    public void y(org.telegram.ui.Cells.u2 u2Var) {
        w91 w91Var = ((s91) this.f53747b).f52027w0;
        HashSet hashSet = w91.f53215s1;
        w91Var.Q0(u2Var);
    }

    private final void a() {
    }

    private final void b() {
    }
}
