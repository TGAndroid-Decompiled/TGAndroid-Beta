package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class uv0 implements r0.n, org.telegram.ui.Components.t81, org.telegram.ui.Components.br0, org.telegram.ui.Components.kp0, org.telegram.ui.Components.zo0 {
    public final int f44537a;
    public final Object f44538b;

    public uv0(Object obj, int i10) {
        this.f44537a = i10;
        this.f44538b = obj;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        switch (this.f44537a) {
            case 0:
                xv0 xv0Var = (xv0) this.f44538b;
                i0.b g7 = k1Var.f47115a.g(519);
                xv0Var.f45880r = g7;
                xv0Var.d.setPadding(g7.f13450a, g7.f13451b, g7.f13452c, g7.d);
                xv0Var.f45872c.requestLayout();
                return r0.k1.f47114b;
            default:
                id1 id1Var = (id1) this.f44538b;
                i0.b g10 = k1Var.f47115a.g(519);
                id1Var.f40221n = g10;
                id1Var.f40216c.setPadding(g10.f13450a, g10.f13451b, g10.f13452c, g10.d);
                id1Var.f40214b.requestLayout();
                return r0.k1.f47114b;
        }
    }

    @Override
    public void R() {
        ((StickersActivity) this.f44538b).k0();
    }

    @Override
    public void U(float f7, boolean z10) {
        switch (this.f44537a) {
            case 3:
                ra1 ra1Var = (ra1) this.f44538b;
                ThemeActivity.Z(ra1Var.e, Math.round((ra1Var.f43085b * f7) + 0), false);
                return;
            default:
                cb1 cb1Var = (cb1) this.f44538b;
                ThemeActivity themeActivity = cb1Var.f38419n;
                int i10 = cb1Var.f38417c;
                ThemeActivity.l0(themeActivity, Math.round(((cb1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public void a(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((we1) this.f44538b).f45139v0.movePreviewFragment(f7);
        }
    }

    @Override
    public void c(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f44538b;
        u31 u31Var = secretMediaViewer.f36202y;
        if (u31Var != null) {
            long p10 = u31Var.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.f36202y.L(f7 * ((float) p10), false);
            }
            secretMediaViewer.f36202y.C();
        }
    }

    @Override
    public void d(org.telegram.ui.Cells.p2 p2Var) {
        af1 af1Var = ((we1) this.f44538b).f45139v0;
        HashSet hashSet = af1.f37730q1;
        af1Var.M0(p2Var);
    }

    @Override
    public void f(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f44538b;
        u31 u31Var = secretMediaViewer.f36202y;
        if (u31Var != null) {
            u31Var.B();
            long p10 = secretMediaViewer.f36202y.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.f36202y.L(f7 * ((float) p10), false);
            }
        }
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((we1) this.f44538b).f45139v0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f44537a) {
            case 3:
                ra1 ra1Var = (ra1) this.f44538b;
                return String.valueOf(Math.round((ra1Var.f43084a.getProgress() * ra1Var.f43085b) + 0));
            default:
                cb1 cb1Var = (cb1) this.f44538b;
                int i10 = cb1Var.f38417c;
                return String.valueOf(Math.round((cb1Var.f38416b.getProgress() * (cb1Var.d - i10)) + i10));
        }
    }

    @Override
    public int k0() {
        switch (this.f44537a) {
            case 3:
                return ((ra1) this.f44538b).f43085b;
            default:
                cb1 cb1Var = (cb1) this.f44538b;
                return cb1Var.d - cb1Var.f38417c;
        }
    }

    @Override
    public void v0() {
        ((StickersActivity) this.f44538b).k0();
    }

    @Override
    public void y() {
        int i10 = this.f44537a;
    }

    private final void b() {
    }

    private final void e() {
    }
}
