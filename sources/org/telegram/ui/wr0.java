package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;
public final class wr0 implements r0.m, org.telegram.ui.Components.u51, org.telegram.ui.Components.co0, org.telegram.ui.Components.lm0, org.telegram.ui.Components.bm0 {
    public final int f51502a;
    public final Object f51503b;

    public wr0(Object obj, int i7) {
        this.f51502a = i7;
        this.f51503b = obj;
    }

    @Override
    public void A(float f10) {
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.x > point.y) {
            ((s91) this.f51503b).f49702v0.movePreviewFragment(f10);
        }
    }

    @Override
    public void C0() {
        ((StickersActivity) this.f51503b).o0();
    }

    @Override
    public void D() {
        int i7 = this.f51502a;
    }

    @Override
    public void O(org.telegram.ui.Cells.t2 t2Var) {
        w91 w91Var = ((s91) this.f51503b).f49702v0;
        HashSet hashSet = w91.f50991q1;
        w91Var.Q0(t2Var);
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        switch (this.f51502a) {
            case 0:
                zr0 zr0Var = (zr0) this.f51503b;
                i0.b g10 = k1Var.f54201a.g(519);
                zr0Var.f52665r = g10;
                zr0Var.d.setPadding(g10.f15120a, g10.f15121b, g10.f15122c, g10.d);
                zr0Var.f52656c.requestLayout();
                return r0.k1.f54200b;
            default:
                g81 g81Var = (g81) this.f51503b;
                i0.b g11 = k1Var.f54201a.g(519);
                g81Var.f45910n = g11;
                g81Var.f45904c.setPadding(g11.f15120a, g11.f15121b, g11.f15122c, g11.d);
                g81Var.f45902b.requestLayout();
                return r0.k1.f54200b;
        }
    }

    @Override
    public void W() {
        ((StickersActivity) this.f51503b).o0();
    }

    @Override
    public void a(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f51503b;
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
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f51503b;
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
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.x > point.y) {
            ((s91) this.f51503b).f49702v0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f51502a) {
            case 3:
                w51 w51Var = (w51) this.f51503b;
                return String.valueOf(Math.round((w51Var.f50906a.getProgress() * w51Var.f50907b) + 0));
            default:
                g61 g61Var = (g61) this.f51503b;
                int i7 = g61Var.d;
                return String.valueOf(Math.round((g61Var.f45850b.getProgress() * (g61Var.f45852e - i7)) + i7));
        }
    }

    @Override
    public void l(boolean z9, float f10) {
        switch (this.f51502a) {
            case 3:
                w51 w51Var = (w51) this.f51503b;
                ThemeActivity.d0(w51Var.f50909e, Math.round((w51Var.f50907b * f10) + 0), false);
                return;
            default:
                g61 g61Var = (g61) this.f51503b;
                ThemeActivity themeActivity = g61Var.f45855r;
                int i7 = g61Var.d;
                ThemeActivity.p0(themeActivity, Math.round(((g61Var.f45852e - i7) * f10) + i7));
                return;
        }
    }

    @Override
    public int q0() {
        switch (this.f51502a) {
            case 3:
                return ((w51) this.f51503b).f50907b;
            default:
                g61 g61Var = (g61) this.f51503b;
                return g61Var.f45852e - g61Var.d;
        }
    }

    private final void b() {
    }

    private final void c() {
    }
}
