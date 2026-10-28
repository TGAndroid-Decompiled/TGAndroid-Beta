package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class zj implements org.telegram.ui.ActionBar.u6 {
    public final int f46285a;
    public final Object f46286b;

    public zj(Object obj, int i10) {
        this.f46285a = i10;
        this.f46286b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f46285a) {
            case 0:
                return org.telegram.ui.ActionBar.y6.I.q();
            case 1:
                return ((tp0) this.f46286b).S;
            default:
                return ((rc1) this.f46286b).f42957f.f44246a.a();
        }
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.f46285a) {
            case 0:
                org.telegram.ui.ActionBar.y6.q(f7, f10, i10, i11);
                return;
            case 1:
                org.telegram.ui.ActionBar.y6.q(f7, f10, i10, i11);
                return;
            default:
                ub1 ub1Var = ((rc1) this.f46286b).f42957f.f44246a;
                if (ub1Var != null) {
                    ub1Var.b(f7, f10, i10, i11);
                    return;
                } else {
                    org.telegram.ui.ActionBar.y6.q(f7, f10, i10, i11);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f46285a) {
            case 0:
                return org.telegram.ui.ActionBar.y6.f23690v3;
            case 1:
                return org.telegram.ui.ActionBar.y6.f23690v3;
            default:
                return org.telegram.ui.ActionBar.y6.f23690v3;
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f46285a) {
            case 0:
                return org.telegram.ui.ActionBar.y6.U0(str);
            case 1:
                return org.telegram.ui.ActionBar.y6.U0(str);
            default:
                return ((rc1) this.f46286b).f42957f.f44246a.d(str);
        }
    }

    @Override
    public final int e(int i10) {
        switch (this.f46285a) {
            case 0:
                return g(i10);
            case 1:
                return g(i10);
            default:
                return ((rc1) this.f46286b).f42957f.f44246a.g(i10);
        }
    }

    @Override
    public final boolean f() {
        switch (this.f46285a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((rc1) this.f46286b).f42957f.f44246a.f();
        }
    }

    @Override
    public final int g(int i10) {
        switch (this.f46285a) {
            case 0:
                return ((wn) this.f46286b).getThemedColor(i10);
            case 1:
                tp0 tp0Var = (tp0) this.f46286b;
                int indexOfKey = tp0Var.v.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return tp0Var.v.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.u6 u6Var = tp0Var.f43721s;
                if (u6Var != null) {
                    return u6Var.g(i10);
                }
                return org.telegram.ui.ActionBar.y6.x0(null, i10, false);
            default:
                return ((rc1) this.f46286b).f42957f.f44246a.g(i10);
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f46285a) {
            case 0:
                return null;
            case 1:
                tp0 tp0Var = (tp0) this.f46286b;
                if (str.equals("drawableMsgIn")) {
                    return tp0Var.f43722w;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return tp0Var.f43723x;
                }
                org.telegram.ui.ActionBar.u6 u6Var = tp0Var.f43721s;
                if (u6Var != null) {
                    return u6Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.y6.Q0(str);
            default:
                vc1 vc1Var = ((rc1) this.f46286b).f42957f;
                if (str.equals("drawableMsgOut")) {
                    return vc1Var.S;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    return vc1Var.T;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    return vc1Var.U;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    return vc1Var.V;
                }
                ub1 ub1Var = vc1Var.f44246a;
                if (ub1Var != null) {
                    return ub1Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.y6.Q0(str);
        }
    }

    @Override
    public final void h(int i10, int i11) {
        int i12 = this.f46285a;
    }

    @Override
    public final int i(int i10) {
        switch (this.f46285a) {
            case 0:
                return g(i10);
            case 1:
                return g(i10);
            default:
                return ((rc1) this.f46286b).f42957f.f44246a.i(i10);
        }
    }

    private final void j(int i10, int i11) {
    }

    private final void k(int i10, int i11) {
    }

    private final void l(int i10, int i11) {
    }
}
