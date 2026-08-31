package qh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
public final class q4 implements org.telegram.ui.ActionBar.g6 {
    public PorterDuffColorFilter f45911a;
    public final org.telegram.ui.ActionBar.g6 f45912b;

    public q4(org.telegram.ui.ActionBar.g6 g6Var) {
        this.f45912b = g6Var;
    }

    @Override
    public final int B0(int i10) {
        if (i10 == org.telegram.ui.ActionBar.k6.G8) {
            return -14145495;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.E8) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.f21731h5) {
            return -14737633;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.f21766j5) {
            return -592138;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.f21911r5) {
            return -8553091;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.He) {
            return -16777216;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.Ke) {
            return -1610612736;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.Ne || i10 == org.telegram.ui.ActionBar.k6.Re || i10 == org.telegram.ui.ActionBar.k6.Me) {
            return -9539985;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.G6) {
            return -1;
        }
        int i11 = org.telegram.ui.ActionBar.k6.Mh;
        if (i10 == i11) {
            return -11754001;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.f21750i6) {
            return 536870911;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.Fh || i10 == org.telegram.ui.ActionBar.k6.Eh || i10 == org.telegram.ui.ActionBar.k6.Gh) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.k6.Hh) {
            return 352321535;
        }
        if (i10 != org.telegram.ui.ActionBar.k6.Je && i10 != i11) {
            if (i10 == org.telegram.ui.ActionBar.k6.Ie) {
                return 780633991;
            }
            if (i10 == org.telegram.ui.ActionBar.k6.f21605a7) {
                return -15921907;
            }
            org.telegram.ui.ActionBar.g6 g6Var = this.f45912b;
            if (g6Var != null) {
                return g6Var.B0(i10);
            }
            return org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        }
        return -7895161;
    }

    @Override
    public final Paint F(String str) {
        return this.f45912b.F(str);
    }

    @Override
    public final int Z0(int i10) {
        return B0(i10);
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.k6.I.q();
    }

    @Override
    public final int e0(int i10) {
        return B0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public final void l(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
    }

    @Override
    public final boolean o0() {
        return false;
    }

    @Override
    public final ColorFilter w() {
        if (this.f45911a == null) {
            this.f45911a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        return this.f45911a;
    }

    @Override
    public final void J0(int i10, int i11) {
    }
}
