package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class xj implements org.telegram.ui.ActionBar.u6 {
    public final int f45778a;
    public final Object f45779b;

    public xj(Object obj, int i10) {
        this.f45778a = i10;
        this.f45779b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f45778a) {
            case 0:
                return org.telegram.ui.ActionBar.y6.I.q();
            case 1:
                return ((rp0) this.f45779b).S;
            default:
                return ((pc1) this.f45779b).f42461f.f43733a.a();
        }
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.f45778a) {
            case 0:
                org.telegram.ui.ActionBar.y6.q(f7, f10, i10, i11);
                return;
            case 1:
                org.telegram.ui.ActionBar.y6.q(f7, f10, i10, i11);
                return;
            default:
                sb1 sb1Var = ((pc1) this.f45779b).f42461f.f43733a;
                if (sb1Var != null) {
                    sb1Var.b(f7, f10, i10, i11);
                    return;
                } else {
                    org.telegram.ui.ActionBar.y6.q(f7, f10, i10, i11);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f45778a) {
            case 0:
                return org.telegram.ui.ActionBar.y6.f23687v3;
            case 1:
                return org.telegram.ui.ActionBar.y6.f23687v3;
            default:
                return org.telegram.ui.ActionBar.y6.f23687v3;
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f45778a) {
            case 0:
                return org.telegram.ui.ActionBar.y6.U0(str);
            case 1:
                return org.telegram.ui.ActionBar.y6.U0(str);
            default:
                return ((pc1) this.f45779b).f42461f.f43733a.d(str);
        }
    }

    @Override
    public final int e(int i10) {
        switch (this.f45778a) {
            case 0:
                return g(i10);
            case 1:
                return g(i10);
            default:
                return ((pc1) this.f45779b).f42461f.f43733a.g(i10);
        }
    }

    @Override
    public final boolean f() {
        switch (this.f45778a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((pc1) this.f45779b).f42461f.f43733a.f();
        }
    }

    @Override
    public final int g(int i10) {
        switch (this.f45778a) {
            case 0:
                return ((un) this.f45779b).getThemedColor(i10);
            case 1:
                rp0 rp0Var = (rp0) this.f45779b;
                int indexOfKey = rp0Var.v.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return rp0Var.v.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.u6 u6Var = rp0Var.f43232s;
                if (u6Var != null) {
                    return u6Var.g(i10);
                }
                return org.telegram.ui.ActionBar.y6.x0(null, i10, false);
            default:
                return ((pc1) this.f45779b).f42461f.f43733a.g(i10);
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f45778a) {
            case 0:
                return null;
            case 1:
                rp0 rp0Var = (rp0) this.f45779b;
                if (str.equals("drawableMsgIn")) {
                    return rp0Var.f43233w;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return rp0Var.f43234x;
                }
                org.telegram.ui.ActionBar.u6 u6Var = rp0Var.f43232s;
                if (u6Var != null) {
                    return u6Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.y6.Q0(str);
            default:
                tc1 tc1Var = ((pc1) this.f45779b).f42461f;
                if (str.equals("drawableMsgOut")) {
                    return tc1Var.S;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    return tc1Var.T;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    return tc1Var.U;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    return tc1Var.V;
                }
                sb1 sb1Var = tc1Var.f43733a;
                if (sb1Var != null) {
                    return sb1Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.y6.Q0(str);
        }
    }

    @Override
    public final void h(int i10, int i11) {
        int i12 = this.f45778a;
    }

    @Override
    public final int i(int i10) {
        switch (this.f45778a) {
            case 0:
                return g(i10);
            case 1:
                return g(i10);
            default:
                return ((pc1) this.f45779b).f42461f.f43733a.i(i10);
        }
    }

    private final void j(int i10, int i11) {
    }

    private final void k(int i10, int i11) {
    }

    private final void l(int i10, int i11) {
    }
}
