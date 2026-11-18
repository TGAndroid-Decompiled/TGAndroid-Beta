package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;
public final class xr0 implements r0.m, org.telegram.ui.Components.g61, org.telegram.ui.Components.oo0, org.telegram.ui.Components.xm0, org.telegram.ui.Components.nm0 {
    public final int f53924a;
    public final Object f53925b;

    public xr0(Object obj, int i7) {
        this.f53924a = i7;
        this.f53925b = obj;
    }

    @Override
    public void C() {
        int i7 = this.f53924a;
    }

    @Override
    public void D0() {
        ((StickersActivity) this.f53925b).o0();
    }

    @Override
    public void F(org.telegram.ui.Cells.t2 t2Var) {
        y91 y91Var = ((u91) this.f53925b).f52498w0;
        HashSet hashSet = y91.f54108s1;
        y91Var.Q0(t2Var);
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        switch (this.f53924a) {
            case 0:
                as0 as0Var = (as0) this.f53925b;
                i0.b g10 = l1Var.f56258a.g(519);
                as0Var.f45661r = g10;
                as0Var.d.setPadding(g10.f15892a, g10.f15893b, g10.f15894c, g10.d);
                as0Var.f45651c.requestLayout();
                return r0.l1.f56257b;
            default:
                i81 i81Var = (i81) this.f53925b;
                i0.b g11 = l1Var.f56258a.g(519);
                i81Var.f48648n = g11;
                i81Var.f48641c.setPadding(g11.f15892a, g11.f15893b, g11.f15894c, g11.d);
                i81Var.f48639b.requestLayout();
                return r0.l1.f56257b;
        }
    }

    @Override
    public void Q() {
        ((StickersActivity) this.f53925b).o0();
    }

    @Override
    public void a(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f53925b;
        lp0 lp0Var = secretMediaViewer.E;
        if (lp0Var != null) {
            long U = lp0Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.q0(f10 * ((float) U), false);
            }
            secretMediaViewer.E.h0();
        }
    }

    @Override
    public void finish() {
        Point point = org.telegram.messenger.g0.f24121q;
        if (point.x > point.y) {
            ((u91) this.f53925b).f52498w0.finishPreviewFragment();
        }
    }

    @Override
    public void g(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f53925b;
        lp0 lp0Var = secretMediaViewer.E;
        if (lp0Var != null) {
            lp0Var.g0();
            long U = secretMediaViewer.E.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.q0(f10 * ((float) U), false);
            }
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f53924a) {
            case 3:
                x51 x51Var = (x51) this.f53925b;
                return String.valueOf(Math.round((x51Var.f53644a.getProgress() * x51Var.f53645b) + 0));
            default:
                h61 h61Var = (h61) this.f53925b;
                int i7 = h61Var.d;
                return String.valueOf(Math.round((h61Var.f48241b.getProgress() * (h61Var.f48243e - i7)) + i7));
        }
    }

    @Override
    public void n(boolean z10, float f10) {
        switch (this.f53924a) {
            case 3:
                x51 x51Var = (x51) this.f53925b;
                ThemeActivity.d0(x51Var.f53647e, Math.round((x51Var.f53645b * f10) + 0), false);
                return;
            default:
                h61 h61Var = (h61) this.f53925b;
                ThemeActivity themeActivity = h61Var.f48246r;
                int i7 = h61Var.d;
                ThemeActivity.p0(themeActivity, Math.round(((h61Var.f48243e - i7) * f10) + i7));
                return;
        }
    }

    @Override
    public void o(float f10) {
        Point point = org.telegram.messenger.g0.f24121q;
        if (point.x > point.y) {
            ((u91) this.f53925b).f52498w0.movePreviewFragment(f10);
        }
    }

    @Override
    public int r0() {
        switch (this.f53924a) {
            case 3:
                return ((x51) this.f53925b).f53645b;
            default:
                h61 h61Var = (h61) this.f53925b;
                return h61Var.f48243e - h61Var.d;
        }
    }

    private final void b() {
    }

    private final void c() {
    }
}
