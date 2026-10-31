package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;
public final class z01 implements org.telegram.ui.Components.v61, org.telegram.ui.Components.ep0, org.telegram.ui.Components.mn0, r0.m, org.telegram.ui.Components.cn0 {
    public final int f43966a;
    public final Object f43967b;

    public z01(Object obj, int i10) {
        this.f43966a = i10;
        this.f43967b = obj;
    }

    @Override
    public void B0() {
        ((StickersActivity) this.f43967b).n0();
    }

    @Override
    public void C() {
        int i10 = this.f43966a;
    }

    @Override
    public void L(org.telegram.ui.Cells.v2 v2Var) {
        pb1 pb1Var = ((lb1) this.f43967b).f39169v0;
        HashSet hashSet = pb1.f40565q1;
        pb1Var.P0(v2Var);
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        x91 x91Var = (x91) this.f43967b;
        i0.c g10 = j1Var.f46132a.g(519);
        x91Var.f43517n = g10;
        x91Var.f43512c.setPadding(g10.f7765a, g10.f7766b, g10.f7767c, g10.d);
        x91Var.f43510b.requestLayout();
        return r0.j1.f46131b;
    }

    @Override
    public void V() {
        ((StickersActivity) this.f43967b).n0();
    }

    @Override
    public void a(float f7) {
        Point point = org.telegram.messenger.i0.f16026q;
        if (point.x > point.y) {
            ((lb1) this.f43967b).f39169v0.movePreviewFragment(f7);
        }
    }

    @Override
    public void c(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f43967b;
        uq0 uq0Var = secretMediaViewer.D;
        if (uq0Var != null) {
            long U = uq0Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.D.q0(f7 * ((float) U), false);
            }
            secretMediaViewer.D.h0();
        }
    }

    @Override
    public void d(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f43967b;
        uq0 uq0Var = secretMediaViewer.D;
        if (uq0Var != null) {
            uq0Var.g0();
            long U = secretMediaViewer.D.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.D.q0(f7 * ((float) U), false);
            }
        }
    }

    @Override
    public void finish() {
        Point point = org.telegram.messenger.i0.f16026q;
        if (point.x > point.y) {
            ((lb1) this.f43967b).f39169v0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f43966a) {
            case 2:
                o71 o71Var = (o71) this.f43967b;
                return String.valueOf(Math.round((o71Var.f40166a.getProgress() * o71Var.f40167b) + 0));
            default:
                y71 y71Var = (y71) this.f43967b;
                int i10 = y71Var.d;
                return String.valueOf(Math.round((y71Var.f43752b.getProgress() * (y71Var.e - i10)) + i10));
        }
    }

    @Override
    public void k(boolean z10, float f7) {
        switch (this.f43966a) {
            case 2:
                o71 o71Var = (o71) this.f43967b;
                ThemeActivity.c0(o71Var.e, Math.round((o71Var.f40167b * f7) + 0), false);
                return;
            default:
                y71 y71Var = (y71) this.f43967b;
                ThemeActivity themeActivity = y71Var.f43756r;
                int i10 = y71Var.d;
                ThemeActivity.o0(themeActivity, Math.round(((y71Var.e - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public int p0() {
        switch (this.f43966a) {
            case 2:
                return ((o71) this.f43967b).f40167b;
            default:
                y71 y71Var = (y71) this.f43967b;
                return y71Var.e - y71Var.d;
        }
    }

    private final void b() {
    }

    private final void e() {
    }
}
