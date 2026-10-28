package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class wv0 implements r0.n, org.telegram.ui.Components.u81, org.telegram.ui.Components.cr0, org.telegram.ui.Components.lp0, org.telegram.ui.Components.ap0 {
    public final int f45408a;
    public final Object f45409b;

    public wv0(Object obj, int i10) {
        this.f45408a = i10;
        this.f45409b = obj;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        switch (this.f45408a) {
            case 0:
                zv0 zv0Var = (zv0) this.f45409b;
                i0.b g7 = k1Var.f47153a.g(519);
                zv0Var.f46387r = g7;
                zv0Var.d.setPadding(g7.f13449a, g7.f13450b, g7.f13451c, g7.d);
                zv0Var.f46379c.requestLayout();
                return r0.k1.f47152b;
            default:
                kd1 kd1Var = (kd1) this.f45409b;
                i0.b g10 = k1Var.f47153a.g(519);
                kd1Var.f40747n = g10;
                kd1Var.f40742c.setPadding(g10.f13449a, g10.f13450b, g10.f13451c, g10.d);
                kd1Var.f40740b.requestLayout();
                return r0.k1.f47152b;
        }
    }

    @Override
    public void R() {
        ((StickersActivity) this.f45409b).k0();
    }

    @Override
    public void U(float f7, boolean z10) {
        switch (this.f45408a) {
            case 3:
                ta1 ta1Var = (ta1) this.f45409b;
                ThemeActivity.Z(ta1Var.e, Math.round((ta1Var.f43588b * f7) + 0), false);
                return;
            default:
                eb1 eb1Var = (eb1) this.f45409b;
                ThemeActivity themeActivity = eb1Var.f38833n;
                int i10 = eb1Var.f38831c;
                ThemeActivity.l0(themeActivity, Math.round(((eb1Var.d - i10) * f7) + i10));
                return;
        }
    }

    @Override
    public void a(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ye1) this.f45409b).f46003v0.movePreviewFragment(f7);
        }
    }

    @Override
    public void c(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f45409b;
        x31 x31Var = secretMediaViewer.f36229y;
        if (x31Var != null) {
            long p10 = x31Var.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.f36229y.L(f7 * ((float) p10), false);
            }
            secretMediaViewer.f36229y.C();
        }
    }

    @Override
    public void d(org.telegram.ui.Cells.p2 p2Var) {
        cf1 cf1Var = ((ye1) this.f45409b).f46003v0;
        HashSet hashSet = cf1.f38287q1;
        cf1Var.M0(p2Var);
    }

    @Override
    public void f(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f45409b;
        x31 x31Var = secretMediaViewer.f36229y;
        if (x31Var != null) {
            x31Var.B();
            long p10 = secretMediaViewer.f36229y.p();
            if (p10 != -9223372036854775807L) {
                secretMediaViewer.f36229y.L(f7 * ((float) p10), false);
            }
        }
    }

    @Override
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ye1) this.f45409b).f46003v0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f45408a) {
            case 3:
                ta1 ta1Var = (ta1) this.f45409b;
                return String.valueOf(Math.round((ta1Var.f43587a.getProgress() * ta1Var.f43588b) + 0));
            default:
                eb1 eb1Var = (eb1) this.f45409b;
                int i10 = eb1Var.f38831c;
                return String.valueOf(Math.round((eb1Var.f38830b.getProgress() * (eb1Var.d - i10)) + i10));
        }
    }

    @Override
    public int k0() {
        switch (this.f45408a) {
            case 3:
                return ((ta1) this.f45409b).f43588b;
            default:
                eb1 eb1Var = (eb1) this.f45409b;
                return eb1Var.d - eb1Var.f38831c;
        }
    }

    @Override
    public void v0() {
        ((StickersActivity) this.f45409b).k0();
    }

    @Override
    public void y() {
        int i10 = this.f45408a;
    }

    private final void b() {
    }

    private final void e() {
    }
}
