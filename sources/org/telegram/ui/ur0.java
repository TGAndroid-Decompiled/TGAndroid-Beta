package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;
public final class ur0 implements r0.m, org.telegram.ui.Components.v51, org.telegram.ui.Components.fo0, org.telegram.ui.Components.pm0, org.telegram.ui.Components.fm0 {
    public final int f52014a;
    public final Object f52015b;

    public ur0(Object obj, int i7) {
        this.f52014a = i7;
        this.f52015b = obj;
    }

    @Override
    public void A(float f10) {
        Point point = org.telegram.messenger.g0.f23611q;
        if (point.x > point.y) {
            ((q91) this.f52015b).f50530w0.movePreviewFragment(f10);
        }
    }

    @Override
    public void C() {
        int i7 = this.f52014a;
    }

    @Override
    public void D(org.telegram.ui.Cells.t2 t2Var) {
        u91 u91Var = ((q91) this.f52015b).f50530w0;
        HashSet hashSet = u91.f51834r1;
        u91Var.Q0(t2Var);
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        switch (this.f52014a) {
            case 0:
                xr0 xr0Var = (xr0) this.f52015b;
                i0.c g10 = k1Var.f55682a.g(519);
                xr0Var.f53306r = g10;
                xr0Var.d.setPadding(g10.f15574a, g10.f15575b, g10.f15576c, g10.d);
                xr0Var.f53296c.requestLayout();
                return r0.k1.f55681b;
            default:
                e81 e81Var = (e81) this.f52015b;
                i0.c g11 = k1Var.f55682a.g(519);
                e81Var.f46631n = g11;
                e81Var.f46624c.setPadding(g11.f15574a, g11.f15575b, g11.f15576c, g11.d);
                e81Var.f46622b.requestLayout();
                return r0.k1.f55681b;
        }
    }

    @Override
    public void W() {
        ((StickersActivity) this.f52015b).o0();
    }

    @Override
    public void e(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f52015b;
        ip0 ip0Var = secretMediaViewer.E;
        if (ip0Var != null) {
            long U = ip0Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.q0(f10 * ((float) U), false);
            }
            secretMediaViewer.E.h0();
        }
    }

    @Override
    public void finish() {
        Point point = org.telegram.messenger.g0.f23611q;
        if (point.x > point.y) {
            ((q91) this.f52015b).f50530w0.finishPreviewFragment();
        }
    }

    @Override
    public void g(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f52015b;
        ip0 ip0Var = secretMediaViewer.E;
        if (ip0Var != null) {
            ip0Var.g0();
            long U = secretMediaViewer.E.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.q0(f10 * ((float) U), false);
            }
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f52014a) {
            case 3:
                t51 t51Var = (t51) this.f52015b;
                return String.valueOf(Math.round((t51Var.f51385a.getProgress() * t51Var.f51386b) + 0));
            default:
                d61 d61Var = (d61) this.f52015b;
                int i7 = d61Var.d;
                return String.valueOf(Math.round((d61Var.f46288b.getProgress() * (d61Var.f46290e - i7)) + i7));
        }
    }

    @Override
    public void l(boolean z10, float f10) {
        switch (this.f52014a) {
            case 3:
                t51 t51Var = (t51) this.f52015b;
                ThemeActivity.d0(t51Var.f51388e, Math.round((t51Var.f51386b * f10) + 0), false);
                return;
            default:
                d61 d61Var = (d61) this.f52015b;
                ThemeActivity themeActivity = d61Var.f46293r;
                int i7 = d61Var.d;
                ThemeActivity.p0(themeActivity, Math.round(((d61Var.f46290e - i7) * f10) + i7));
                return;
        }
    }

    @Override
    public int p0() {
        switch (this.f52014a) {
            case 3:
                return ((t51) this.f52015b).f51386b;
            default:
                d61 d61Var = (d61) this.f52015b;
                return d61Var.f46290e - d61Var.d;
        }
    }

    @Override
    public void x0() {
        ((StickersActivity) this.f52015b).o0();
    }

    private final void a() {
    }

    private final void b() {
    }
}
