package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class wj implements org.telegram.ui.ActionBar.g6 {
    public final int f43381a;
    public final Object f43382b;

    public wj(Object obj, int i10) {
        this.f43381a = i10;
        this.f43382b = obj;
    }

    @Override
    public final boolean a() {
        switch (this.f43381a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.I.q();
            case 1:
                return ((lp0) this.f43382b).S;
            default:
                return ((mc1) this.f43382b).f39473f.f40713a.a();
        }
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.f43381a) {
            case 0:
                org.telegram.ui.ActionBar.k6.q(f7, f10, i10, i11);
                return;
            case 1:
                org.telegram.ui.ActionBar.k6.q(f7, f10, i10, i11);
                return;
            default:
                qb1 qb1Var = ((mc1) this.f43382b).f39473f.f40713a;
                if (qb1Var != null) {
                    qb1Var.b(f7, f10, i10, i11);
                    return;
                } else {
                    org.telegram.ui.ActionBar.k6.q(f7, f10, i10, i11);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f43381a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.f21513v3;
            case 1:
                return org.telegram.ui.ActionBar.k6.f21513v3;
            default:
                return org.telegram.ui.ActionBar.k6.f21513v3;
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f43381a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.U0(str);
            case 1:
                return org.telegram.ui.ActionBar.k6.U0(str);
            default:
                return ((mc1) this.f43382b).f39473f.f40713a.d(str);
        }
    }

    @Override
    public final int e(int i10) {
        switch (this.f43381a) {
            case 0:
                return g(i10);
            case 1:
                return g(i10);
            default:
                return ((mc1) this.f43382b).f39473f.f40713a.g(i10);
        }
    }

    @Override
    public final boolean f() {
        switch (this.f43381a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((mc1) this.f43382b).f39473f.f40713a.f();
        }
    }

    @Override
    public final int g(int i10) {
        switch (this.f43381a) {
            case 0:
                return ((sn) this.f43382b).getThemedColor(i10);
            case 1:
                lp0 lp0Var = (lp0) this.f43382b;
                int indexOfKey = lp0Var.v.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return lp0Var.v.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.g6 g6Var = lp0Var.f39307s;
                if (g6Var != null) {
                    return g6Var.g(i10);
                }
                return org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            default:
                return ((mc1) this.f43382b).f39473f.f40713a.g(i10);
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f43381a) {
            case 0:
                return null;
            case 1:
                lp0 lp0Var = (lp0) this.f43382b;
                if (str.equals("drawableMsgIn")) {
                    return lp0Var.f39308w;
                }
                if (str.equals("drawableMsgInSelected")) {
                    return lp0Var.f39309x;
                }
                org.telegram.ui.ActionBar.g6 g6Var = lp0Var.f39307s;
                if (g6Var != null) {
                    return g6Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.k6.Q0(str);
            default:
                qc1 qc1Var = ((mc1) this.f43382b).f39473f;
                if (str.equals("drawableMsgOut")) {
                    return qc1Var.S;
                }
                if (str.equals("drawableMsgOutSelected")) {
                    return qc1Var.T;
                }
                if (str.equals("drawableMsgOutMedia")) {
                    return qc1Var.U;
                }
                if (str.equals("drawableMsgOutMediaSelected")) {
                    return qc1Var.V;
                }
                qb1 qb1Var = qc1Var.f40713a;
                if (qb1Var != null) {
                    return qb1Var.getDrawable(str);
                }
                return org.telegram.ui.ActionBar.k6.Q0(str);
        }
    }

    @Override
    public final void h(int i10, int i11) {
        int i12 = this.f43381a;
    }

    @Override
    public final int i(int i10) {
        switch (this.f43381a) {
            case 0:
                return g(i10);
            case 1:
                return g(i10);
            default:
                return ((mc1) this.f43382b).f39473f.f40713a.i(i10);
        }
    }

    private final void j(int i10, int i11) {
    }

    private final void k(int i10, int i11) {
    }

    private final void l(int i10, int i11) {
    }
}
