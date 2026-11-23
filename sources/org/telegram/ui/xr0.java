package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;
public final class xr0 implements r0.m, org.telegram.ui.Components.j61, org.telegram.ui.Components.qo0, org.telegram.ui.Components.an0, org.telegram.ui.Components.qm0 {
    public final int f53945a;
    public final Object f53946b;

    public xr0(Object obj, int i7) {
        this.f53945a = i7;
        this.f53946b = obj;
    }

    @Override
    public void C() {
        int i7 = this.f53945a;
    }

    @Override
    public void D0() {
        ((StickersActivity) this.f53946b).o0();
    }

    @Override
    public void F(org.telegram.ui.Cells.u2 u2Var) {
        y91 y91Var = ((u91) this.f53946b).f52507w0;
        HashSet hashSet = y91.f54098s1;
        y91Var.Q0(u2Var);
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        switch (this.f53945a) {
            case 0:
                as0 as0Var = (as0) this.f53946b;
                i0.b g10 = l1Var.f56303a.g(519);
                as0Var.f45691r = g10;
                as0Var.d.setPadding(g10.f15917a, g10.f15918b, g10.f15919c, g10.d);
                as0Var.f45681c.requestLayout();
                return r0.l1.f56302b;
            default:
                i81 i81Var = (i81) this.f53946b;
                i0.b g11 = l1Var.f56303a.g(519);
                i81Var.f48687n = g11;
                i81Var.f48680c.setPadding(g11.f15917a, g11.f15918b, g11.f15919c, g11.d);
                i81Var.f48678b.requestLayout();
                return r0.l1.f56302b;
        }
    }

    @Override
    public void Q() {
        ((StickersActivity) this.f53946b).o0();
    }

    @Override
    public void a(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f53946b;
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
        Point point = org.telegram.messenger.g0.f24046q;
        if (point.x > point.y) {
            ((u91) this.f53946b).f52507w0.finishPreviewFragment();
        }
    }

    @Override
    public void g(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f53946b;
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
        switch (this.f53945a) {
            case 3:
                x51 x51Var = (x51) this.f53946b;
                return String.valueOf(Math.round((x51Var.f53640a.getProgress() * x51Var.f53641b) + 0));
            default:
                h61 h61Var = (h61) this.f53946b;
                int i7 = h61Var.d;
                return String.valueOf(Math.round((h61Var.f48249b.getProgress() * (h61Var.f48251e - i7)) + i7));
        }
    }

    @Override
    public void n(boolean z10, float f10) {
        switch (this.f53945a) {
            case 3:
                x51 x51Var = (x51) this.f53946b;
                ThemeActivity.d0(x51Var.f53643e, Math.round((x51Var.f53641b * f10) + 0), false);
                return;
            default:
                h61 h61Var = (h61) this.f53946b;
                ThemeActivity themeActivity = h61Var.f48254r;
                int i7 = h61Var.d;
                ThemeActivity.p0(themeActivity, Math.round(((h61Var.f48251e - i7) * f10) + i7));
                return;
        }
    }

    @Override
    public void o(float f10) {
        Point point = org.telegram.messenger.g0.f24046q;
        if (point.x > point.y) {
            ((u91) this.f53946b).f52507w0.movePreviewFragment(f10);
        }
    }

    @Override
    public int r0() {
        switch (this.f53945a) {
            case 3:
                return ((x51) this.f53946b).f53641b;
            default:
                h61 h61Var = (h61) this.f53946b;
                return h61Var.f48251e - h61Var.d;
        }
    }

    private final void b() {
    }

    private final void c() {
    }
}
