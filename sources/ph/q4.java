package ph;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
public final class q4 implements org.telegram.ui.ActionBar.f6 {
    public PorterDuffColorFilter f42244a;
    public final org.telegram.ui.ActionBar.f6 f42245b;

    public q4(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f42245b = f6Var;
    }

    @Override
    public final Paint G(String str) {
        return this.f42245b.G(str);
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    @Override
    public final int d0(int i10) {
        return x0(i10);
    }

    @Override
    public final int f1(int i10) {
        return x0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public final void l(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f10, f11, i10, i11);
    }

    @Override
    public final boolean m0() {
        return false;
    }

    @Override
    public final ColorFilter x() {
        if (this.f42244a == null) {
            this.f42244a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        return this.f42244a;
    }

    @Override
    public final int x0(int i10) {
        if (i10 == org.telegram.ui.ActionBar.j6.G8) {
            return -14145495;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.E8) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.f19952h5) {
            return -14737633;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.f19987j5) {
            return -592138;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.f20131r5) {
            return -8553091;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.He) {
            return -16777216;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.Ke) {
            return -1610612736;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.Ne || i10 == org.telegram.ui.ActionBar.j6.Re || i10 == org.telegram.ui.ActionBar.j6.Me) {
            return -9539985;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.G6) {
            return -1;
        }
        int i11 = org.telegram.ui.ActionBar.j6.Mh;
        if (i10 == i11) {
            return -11754001;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.f19971i6) {
            return 536870911;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.Fh || i10 == org.telegram.ui.ActionBar.j6.Eh || i10 == org.telegram.ui.ActionBar.j6.Gh) {
            return -1;
        }
        if (i10 == org.telegram.ui.ActionBar.j6.Hh) {
            return 352321535;
        }
        if (i10 != org.telegram.ui.ActionBar.j6.Je && i10 != i11) {
            if (i10 == org.telegram.ui.ActionBar.j6.Ie) {
                return 780633991;
            }
            if (i10 == org.telegram.ui.ActionBar.j6.f19827a7) {
                return -15921907;
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.f42245b;
            if (f6Var != null) {
                return f6Var.x0(i10);
            }
            return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        return -7895161;
    }

    @Override
    public final void J0(int i10, int i11) {
    }
}
