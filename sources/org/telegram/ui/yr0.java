package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;
public final class yr0 implements r0.m, org.telegram.ui.Components.j61, org.telegram.ui.Components.qo0, org.telegram.ui.Components.zm0, org.telegram.ui.Components.pm0 {
    public final int f54235a;
    public final Object f54236b;

    public yr0(Object obj, int i7) {
        this.f54235a = i7;
        this.f54236b = obj;
    }

    @Override
    public void C() {
        int i7 = this.f54235a;
    }

    @Override
    public void D0() {
        ((StickersActivity) this.f54236b).o0();
    }

    @Override
    public void F(org.telegram.ui.Cells.u2 u2Var) {
        y91 y91Var = ((u91) this.f54236b).f52495w0;
        HashSet hashSet = y91.f54074s1;
        y91Var.Q0(u2Var);
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        switch (this.f54235a) {
            case 0:
                bs0 bs0Var = (bs0) this.f54236b;
                i0.b g10 = l1Var.f56268a.g(519);
                bs0Var.f46291r = g10;
                bs0Var.d.setPadding(g10.f15883a, g10.f15884b, g10.f15885c, g10.d);
                bs0Var.f46281c.requestLayout();
                return r0.l1.f56267b;
            default:
                i81 i81Var = (i81) this.f54236b;
                i0.b g11 = l1Var.f56268a.g(519);
                i81Var.f48659n = g11;
                i81Var.f48652c.setPadding(g11.f15883a, g11.f15884b, g11.f15885c, g11.d);
                i81Var.f48650b.requestLayout();
                return r0.l1.f56267b;
        }
    }

    @Override
    public void Q() {
        ((StickersActivity) this.f54236b).o0();
    }

    @Override
    public void a(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f54236b;
        mp0 mp0Var = secretMediaViewer.E;
        if (mp0Var != null) {
            long U = mp0Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.q0(f10 * ((float) U), false);
            }
            secretMediaViewer.E.h0();
        }
    }

    @Override
    public void finish() {
        Point point = org.telegram.messenger.g0.f24010q;
        if (point.x > point.y) {
            ((u91) this.f54236b).f52495w0.finishPreviewFragment();
        }
    }

    @Override
    public void g(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f54236b;
        mp0 mp0Var = secretMediaViewer.E;
        if (mp0Var != null) {
            mp0Var.g0();
            long U = secretMediaViewer.E.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.q0(f10 * ((float) U), false);
            }
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f54235a) {
            case 3:
                x51 x51Var = (x51) this.f54236b;
                return String.valueOf(Math.round((x51Var.f53562a.getProgress() * x51Var.f53563b) + 0));
            default:
                h61 h61Var = (h61) this.f54236b;
                int i7 = h61Var.d;
                return String.valueOf(Math.round((h61Var.f48212b.getProgress() * (h61Var.f48214e - i7)) + i7));
        }
    }

    @Override
    public void n(boolean z10, float f10) {
        switch (this.f54235a) {
            case 3:
                x51 x51Var = (x51) this.f54236b;
                ThemeActivity.d0(x51Var.f53565e, Math.round((x51Var.f53563b * f10) + 0), false);
                return;
            default:
                h61 h61Var = (h61) this.f54236b;
                ThemeActivity themeActivity = h61Var.f48217r;
                int i7 = h61Var.d;
                ThemeActivity.p0(themeActivity, Math.round(((h61Var.f48214e - i7) * f10) + i7));
                return;
        }
    }

    @Override
    public void o(float f10) {
        Point point = org.telegram.messenger.g0.f24010q;
        if (point.x > point.y) {
            ((u91) this.f54236b).f52495w0.movePreviewFragment(f10);
        }
    }

    @Override
    public int r0() {
        switch (this.f54235a) {
            case 3:
                return ((x51) this.f54236b).f53563b;
            default:
                h61 h61Var = (h61) this.f54236b;
                return h61Var.f48214e - h61Var.d;
        }
    }

    private final void b() {
    }

    private final void c() {
    }
}
