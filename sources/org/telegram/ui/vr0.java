package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;
public final class vr0 implements r0.m, org.telegram.ui.Components.p51, org.telegram.ui.Components.co0, org.telegram.ui.Components.lm0, org.telegram.ui.Components.bm0 {
    public final int f50807a;
    public final Object f50808b;

    public vr0(Object obj, int i7) {
        this.f50807a = i7;
        this.f50808b = obj;
    }

    @Override
    public void A(float f10) {
        Point point = org.telegram.messenger.g0.f22537q;
        if (point.x > point.y) {
            ((r91) this.f50808b).f49415v0.movePreviewFragment(f10);
        }
    }

    @Override
    public void C0() {
        ((StickersActivity) this.f50808b).o0();
    }

    @Override
    public void D() {
        int i7 = this.f50807a;
    }

    @Override
    public void O(org.telegram.ui.Cells.t2 t2Var) {
        v91 v91Var = ((r91) this.f50808b).f49415v0;
        HashSet hashSet = v91.f50618q1;
        v91Var.Q0(t2Var);
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        switch (this.f50807a) {
            case 0:
                yr0 yr0Var = (yr0) this.f50808b;
                i0.b g10 = k1Var.f54084a.g(519);
                yr0Var.f52310r = g10;
                yr0Var.d.setPadding(g10.f15117a, g10.f15118b, g10.f15119c, g10.d);
                yr0Var.f52301c.requestLayout();
                return r0.k1.f54083b;
            default:
                f81 f81Var = (f81) this.f50808b;
                i0.b g11 = k1Var.f54084a.g(519);
                f81Var.f45561n = g11;
                f81Var.f45555c.setPadding(g11.f15117a, g11.f15118b, g11.f15119c, g11.d);
                f81Var.f45553b.requestLayout();
                return r0.k1.f54083b;
        }
    }

    @Override
    public void W() {
        ((StickersActivity) this.f50808b).o0();
    }

    @Override
    public void a(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f50808b;
        jp0 jp0Var = secretMediaViewer.D;
        if (jp0Var != null) {
            long U = jp0Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.D.q0(f10 * ((float) U), false);
            }
            secretMediaViewer.D.h0();
        }
    }

    @Override
    public void d(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f50808b;
        jp0 jp0Var = secretMediaViewer.D;
        if (jp0Var != null) {
            jp0Var.g0();
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
            ((r91) this.f50808b).f49415v0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f50807a) {
            case 3:
                w51 w51Var = (w51) this.f50808b;
                return String.valueOf(Math.round((w51Var.f50957a.getProgress() * w51Var.f50958b) + 0));
            default:
                g61 g61Var = (g61) this.f50808b;
                int i7 = g61Var.d;
                return String.valueOf(Math.round((g61Var.f45847b.getProgress() * (g61Var.f45849e - i7)) + i7));
        }
    }

    @Override
    public void l(boolean z9, float f10) {
        switch (this.f50807a) {
            case 3:
                w51 w51Var = (w51) this.f50808b;
                ThemeActivity.d0(w51Var.f50960e, Math.round((w51Var.f50958b * f10) + 0), false);
                return;
            default:
                g61 g61Var = (g61) this.f50808b;
                ThemeActivity themeActivity = g61Var.f45852r;
                int i7 = g61Var.d;
                ThemeActivity.p0(themeActivity, Math.round(((g61Var.f45849e - i7) * f10) + i7));
                return;
        }
    }

    @Override
    public int q0() {
        switch (this.f50807a) {
            case 3:
                return ((w51) this.f50808b).f50958b;
            default:
                g61 g61Var = (g61) this.f50808b;
                return g61Var.f45849e - g61Var.d;
        }
    }

    private final void b() {
    }

    private final void c() {
    }
}
