package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class rv0 implements r0.n, org.telegram.ui.Components.k81, org.telegram.ui.Components.xq0, org.telegram.ui.Components.gp0, org.telegram.ui.Components.vo0 {
    public final int f41254a;
    public final Object f41255b;

    public rv0(Object obj, int i10) {
        this.f41254a = i10;
        this.f41255b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        switch (this.f41254a) {
            case 0:
                uv0 uv0Var = (uv0) this.f41255b;
                i0.b g10 = k1Var.f45251a.g(519);
                uv0Var.f42526r = g10;
                uv0Var.d.setPadding(g10.f12315a, g10.f12316b, g10.f12317c, g10.d);
                uv0Var.f42518c.requestLayout();
                return r0.k1.f45250b;
            default:
                ed1 ed1Var = (ed1) this.f41255b;
                i0.b g11 = k1Var.f45251a.g(519);
                ed1Var.f36935n = g11;
                ed1Var.f36930c.setPadding(g11.f12315a, g11.f12316b, g11.f12317c, g11.d);
                ed1Var.f36928b.requestLayout();
                return r0.k1.f45250b;
        }
    }

    @Override
    public void H() {
        ((StickersActivity) this.f41255b).j0();
    }

    @Override
    public void L(float f7, boolean z10) {
        switch (this.f41254a) {
            case 3:
                pa1 pa1Var = (pa1) this.f41255b;
                ThemeActivity.Y(pa1Var.e, Math.round((pa1Var.f40441b * f7) + 0), false);
                return;
            default:
                ab1 ab1Var = (ab1) this.f41255b;
                ThemeActivity themeActivity = ab1Var.f35642n;
                int i10 = ab1Var.f35640c;
                ThemeActivity.k0(themeActivity, Math.round(((ab1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public int Y() {
        switch (this.f41254a) {
            case 3:
                return ((pa1) this.f41255b).f40441b;
            default:
                ab1 ab1Var = (ab1) this.f41255b;
                return ab1Var.d - ab1Var.f35640c;
        }
    }

    @Override
    public void a(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f41255b;
        t31 t31Var = secretMediaViewer.f34139y;
        if (t31Var != null) {
            long p5 = t31Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f34139y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f34139y.C();
        }
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f41255b;
        t31 t31Var = secretMediaViewer.f34139y;
        if (t31Var != null) {
            t31Var.B();
            long p5 = secretMediaViewer.f34139y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f34139y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void d(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((te1) this.f41255b).f41992t0.movePreviewFragment(f7);
        }
    }

    @Override
    public void e(org.telegram.ui.Cells.q2 q2Var) {
        ye1 ye1Var = ((te1) this.f41255b).f41992t0;
        HashSet hashSet = ye1.f43791q1;
        ye1Var.L0(q2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((te1) this.f41255b).f41992t0.finishPreviewFragment();
        }
    }

    @Override
    public void g0() {
        ((StickersActivity) this.f41255b).j0();
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f41254a) {
            case 3:
                pa1 pa1Var = (pa1) this.f41255b;
                return String.valueOf(Math.round((pa1Var.f40440a.getProgress() * pa1Var.f40441b) + 0));
            default:
                ab1 ab1Var = (ab1) this.f41255b;
                int i10 = ab1Var.f35640c;
                return String.valueOf(Math.round((ab1Var.f35639b.getProgress() * (ab1Var.d - i10)) + i10));
        }
    }

    @Override
    public void v() {
        int i10 = this.f41254a;
    }

    private final void c() {
    }

    private final void f() {
    }
}
