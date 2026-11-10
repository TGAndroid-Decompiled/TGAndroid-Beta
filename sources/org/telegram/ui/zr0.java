package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;
public final class zr0 implements r0.m, org.telegram.ui.Components.u51, org.telegram.ui.Components.co0, org.telegram.ui.Components.lm0, org.telegram.ui.Components.bm0 {
    public final int f52522a;
    public final Object f52523b;

    public zr0(Object obj, int i7) {
        this.f52522a = i7;
        this.f52523b = obj;
    }

    @Override
    public void A(float f10) {
        Point point = org.telegram.messenger.g0.f22567q;
        if (point.x > point.y) {
            ((v91) this.f52523b).f50682v0.movePreviewFragment(f10);
        }
    }

    @Override
    public void C0() {
        ((StickersActivity) this.f52523b).o0();
    }

    @Override
    public void D() {
        int i7 = this.f52522a;
    }

    @Override
    public void O(org.telegram.ui.Cells.t2 t2Var) {
        z91 z91Var = ((v91) this.f52523b).f50682v0;
        HashSet hashSet = z91.f52342q1;
        z91Var.Q0(t2Var);
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        switch (this.f52522a) {
            case 0:
                cs0 cs0Var = (cs0) this.f52523b;
                i0.b g10 = k1Var.f54213a.g(519);
                cs0Var.f44796r = g10;
                cs0Var.d.setPadding(g10.f15122a, g10.f15123b, g10.f15124c, g10.d);
                cs0Var.f44787c.requestLayout();
                return r0.k1.f54212b;
            default:
                i81 i81Var = (i81) this.f52523b;
                i0.b g11 = k1Var.f54213a.g(519);
                i81Var.f46568n = g11;
                i81Var.f46562c.setPadding(g11.f15122a, g11.f15123b, g11.f15124c, g11.d);
                i81Var.f46560b.requestLayout();
                return r0.k1.f54212b;
        }
    }

    @Override
    public void W() {
        ((StickersActivity) this.f52523b).o0();
    }

    @Override
    public void a(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f52523b;
        np0 np0Var = secretMediaViewer.D;
        if (np0Var != null) {
            long U = np0Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.D.q0(f10 * ((float) U), false);
            }
            secretMediaViewer.D.h0();
        }
    }

    @Override
    public void d(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f52523b;
        np0 np0Var = secretMediaViewer.D;
        if (np0Var != null) {
            np0Var.g0();
            long U = secretMediaViewer.D.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.D.q0(f10 * ((float) U), false);
            }
        }
    }

    @Override
    public void finish() {
        Point point = org.telegram.messenger.g0.f22567q;
        if (point.x > point.y) {
            ((v91) this.f52523b).f50682v0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f52522a) {
            case 3:
                y51 y51Var = (y51) this.f52523b;
                return String.valueOf(Math.round((y51Var.f51900a.getProgress() * y51Var.f51901b) + 0));
            default:
                i61 i61Var = (i61) this.f52523b;
                int i7 = i61Var.d;
                return String.valueOf(Math.round((i61Var.f46515b.getProgress() * (i61Var.f46517e - i7)) + i7));
        }
    }

    @Override
    public void l(boolean z9, float f10) {
        switch (this.f52522a) {
            case 3:
                y51 y51Var = (y51) this.f52523b;
                ThemeActivity.d0(y51Var.f51903e, Math.round((y51Var.f51901b * f10) + 0), false);
                return;
            default:
                i61 i61Var = (i61) this.f52523b;
                ThemeActivity themeActivity = i61Var.f46520r;
                int i7 = i61Var.d;
                ThemeActivity.p0(themeActivity, Math.round(((i61Var.f46517e - i7) * f10) + i7));
                return;
        }
    }

    @Override
    public int q0() {
        switch (this.f52522a) {
            case 3:
                return ((y51) this.f52523b).f51901b;
            default:
                i61 i61Var = (i61) this.f52523b;
                return i61Var.f46517e - i61Var.d;
        }
    }

    private final void b() {
    }

    private final void c() {
    }
}
