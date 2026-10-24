package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class qv0 implements r0.n, org.telegram.ui.Components.k81, org.telegram.ui.Components.wq0, org.telegram.ui.Components.fp0, org.telegram.ui.Components.uo0 {
    public final int f40933a;
    public final Object f40934b;

    public qv0(Object obj, int i10) {
        this.f40933a = i10;
        this.f40934b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        switch (this.f40933a) {
            case 0:
                tv0 tv0Var = (tv0) this.f40934b;
                i0.b g10 = k1Var.f45250a.g(519);
                tv0Var.f42135r = g10;
                tv0Var.d.setPadding(g10.f12315a, g10.f12316b, g10.f12317c, g10.d);
                tv0Var.f42127c.requestLayout();
                return r0.k1.f45249b;
            default:
                dd1 dd1Var = (dd1) this.f40934b;
                i0.b g11 = k1Var.f45250a.g(519);
                dd1Var.f36597n = g11;
                dd1Var.f36592c.setPadding(g11.f12315a, g11.f12316b, g11.f12317c, g11.d);
                dd1Var.f36590b.requestLayout();
                return r0.k1.f45249b;
        }
    }

    @Override
    public void H() {
        ((StickersActivity) this.f40934b).j0();
    }

    @Override
    public void L(float f7, boolean z10) {
        switch (this.f40933a) {
            case 3:
                oa1 oa1Var = (oa1) this.f40934b;
                ThemeActivity.Y(oa1Var.e, Math.round((oa1Var.f40140b * f7) + 0), false);
                return;
            default:
                za1 za1Var = (za1) this.f40934b;
                ThemeActivity themeActivity = za1Var.f44053n;
                int i10 = za1Var.f44051c;
                ThemeActivity.k0(themeActivity, Math.round(((za1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public int Y() {
        switch (this.f40933a) {
            case 3:
                return ((oa1) this.f40934b).f40140b;
            default:
                za1 za1Var = (za1) this.f40934b;
                return za1Var.d - za1Var.f44051c;
        }
    }

    @Override
    public void a(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40934b;
        s31 s31Var = secretMediaViewer.f34141y;
        if (s31Var != null) {
            long p5 = s31Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f34141y.L(f7 * ((float) p5), false);
            }
            secretMediaViewer.f34141y.C();
        }
    }

    @Override
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40934b;
        s31 s31Var = secretMediaViewer.f34141y;
        if (s31Var != null) {
            s31Var.B();
            long p5 = secretMediaViewer.f34141y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.f34141y.L(f7 * ((float) p5), false);
            }
        }
    }

    @Override
    public void d(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((se1) this.f40934b).f41384t0.movePreviewFragment(f7);
        }
    }

    @Override
    public void e(org.telegram.ui.Cells.q2 q2Var) {
        xe1 xe1Var = ((se1) this.f40934b).f41384t0;
        HashSet hashSet = xe1.f43544q1;
        xe1Var.L0(q2Var);
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((se1) this.f40934b).f41384t0.finishPreviewFragment();
        }
    }

    @Override
    public void g0() {
        ((StickersActivity) this.f40934b).j0();
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f40933a) {
            case 3:
                oa1 oa1Var = (oa1) this.f40934b;
                return String.valueOf(Math.round((oa1Var.f40139a.getProgress() * oa1Var.f40140b) + 0));
            default:
                za1 za1Var = (za1) this.f40934b;
                int i10 = za1Var.f44051c;
                return String.valueOf(Math.round((za1Var.f44050b.getProgress() * (za1Var.d - i10)) + i10));
        }
    }

    @Override
    public void v() {
        int i10 = this.f40933a;
    }

    private final void c() {
    }

    private final void f() {
    }
}
