package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class wj implements org.telegram.ui.ActionBar.g6 {
    public final int f43361a;
    public final Object f43362b;

    public wj(Object obj, int i10) {
        this.f43361a = i10;
        this.f43362b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f43361a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.I.q();
            case 1:
                return ((kp0) this.f43362b).S;
            default:
                return ((lc1) this.f43362b).f39197f.f40442a.a();
        }
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.f43361a) {
            case 0:
                org.telegram.ui.ActionBar.k6.q(f7, f10, i10, i11);
                return;
            case 1:
                org.telegram.ui.ActionBar.k6.q(f7, f10, i10, i11);
                return;
            default:
                pb1 pb1Var = ((lc1) this.f43362b).f39197f.f40442a;
                if (pb1Var != null) {
                    pb1Var.b(f7, f10, i10, i11);
                    return;
                } else {
                    org.telegram.ui.ActionBar.k6.q(f7, f10, i10, i11);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f43361a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.f21514v3;
            case 1:
                return org.telegram.ui.ActionBar.k6.f21514v3;
            default:
                return org.telegram.ui.ActionBar.k6.f21514v3;
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f43361a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.U0(str);
            case 1:
                return org.telegram.ui.ActionBar.k6.U0(str);
            default:
                return ((lc1) this.f43362b).f39197f.f40442a.d(str);
        }
    }

    @Override
    public final int e(int i10) {
        switch (this.f43361a) {
            case 0:
                return g(i10);
            case 1:
                return g(i10);
            default:
                return ((lc1) this.f43362b).f39197f.f40442a.g(i10);
        }
    }

    @Override
    public final boolean f() {
        switch (this.f43361a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((lc1) this.f43362b).f39197f.f40442a.f();
        }
    }

    @Override
    public final int g(int i10) {
        switch (this.f43361a) {
            case 0:
                return ((sn) this.f43362b).getThemedColor(i10);
            case 1:
                kp0 kp0Var = (kp0) this.f43362b;
                int indexOfKey = kp0Var.v.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return kp0Var.v.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.g6 g6Var = kp0Var.f39015s;
                if (g6Var != null) {
                    return g6Var.g(i10);
                }
                return org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            default:
                return ((lc1) this.f43362b).f39197f.f40442a.g(i10);
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f43361a) {
            case 0:
                return null;
            case 1:
                kp0 kp0Var = (kp0) this.f43362b;
                if (str.equals("drawableMsgIn")) {
                    return kp0Var.f39016w;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return kp0Var.f39017x;
                }
                org.telegram.ui.ActionBar.g6 g6Var = kp0Var.f39015s;
                if (g6Var != null) {
                    return g6Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.k6.Q0(str);
            default:
                pc1 pc1Var = ((lc1) this.f43362b).f39197f;
                if (str.equals("drawableMsgOut")) {
                    return pc1Var.S;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    return pc1Var.T;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    return pc1Var.U;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    return pc1Var.V;
                }
                pb1 pb1Var = pc1Var.f40442a;
                if (pb1Var != null) {
                    return pb1Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.k6.Q0(str);
        }
    }

    @Override
    public final void h(int i10, int i11) {
        int i12 = this.f43361a;
    }

    @Override
    public final int i(int i10) {
        switch (this.f43361a) {
            case 0:
                return g(i10);
            case 1:
                return g(i10);
            default:
                return ((lc1) this.f43362b).f39197f.f40442a.i(i10);
        }
    }

    private final void j(int i10, int i11) {
    }

    private final void k(int i10, int i11) {
    }

    private final void l(int i10, int i11) {
    }
}
