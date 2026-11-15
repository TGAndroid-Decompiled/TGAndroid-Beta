package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class xw extends FrameLayout {
    public static final int M = 0;
    public org.telegram.ui.Components.xi0 E;
    public boolean F;
    public sv G;
    public jg.m H;
    public boolean I;
    public final cv J;
    public final cv K;
    public final yw L;
    public uw f53331a;
    public a8.xa f53332b;
    public dv f53333c;
    public hv d;
    public v4.y f53334e;
    public ww f53335f;
    public int h;
    public gv f53336n;
    public org.telegram.ui.Components.wi0 f53337r;
    public int f53338s;
    public int f53339w;
    public org.telegram.ui.Components.pz f53340x;
    public bv f53341y;

    public xw(Context context, yw ywVar) {
        super(context);
        this.L = ywVar;
        this.J = new cv(this, 1);
        this.K = new cv(this, 2);
    }

    public static void a(xw xwVar, dv dvVar) {
        xwVar.f53333c = dvVar;
    }

    public static v4.y b(xw xwVar) {
        return xwVar.f53334e;
    }

    public static void c(xw xwVar, v4.y yVar) {
        xwVar.f53334e = yVar;
    }

    public static int d(xw xwVar) {
        return xwVar.f53339w;
    }

    public static void e(xw xwVar, int i7) {
        xwVar.f53339w = i7;
    }

    public static void f(xw xwVar, org.telegram.ui.Components.pz pzVar) {
        xwVar.f53340x = pzVar;
    }

    public static ww g(xw xwVar) {
        return xwVar.f53335f;
    }

    public static void h(xw xwVar, ww wwVar) {
        xwVar.f53335f = wwVar;
    }

    public static void i(xw xwVar, bv bvVar) {
        xwVar.f53341y = bvVar;
    }

    public static void j(xw xwVar, org.telegram.ui.Components.xi0 xi0Var) {
        xwVar.E = xi0Var;
    }

    public static void k(xw xwVar, org.telegram.ui.Components.wi0 wi0Var) {
        xwVar.f53337r = wi0Var;
    }

    public static void l(xw xwVar, int i7) {
        xwVar.f53338s = i7;
    }

    public static jg.m m(xw xwVar) {
        return xwVar.d;
    }

    public static void n(xw xwVar, hv hvVar) {
        xwVar.d = hvVar;
    }

    public static void o(xw xwVar, gv gvVar) {
        xwVar.f53336n = gvVar;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ((FrameLayout.LayoutParams) this.f53331a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i7, i10);
    }

    public final boolean p() {
        int i7 = this.f53338s;
        if (i7 != 0 && i7 != 7 && i7 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.e2) this.L).isPaused;
        if (!z11) {
            cv cvVar = this.K;
            if (z10) {
                org.telegram.messenger.g0.r(cvVar);
                this.f53331a.setItemAnimator(this.f53341y);
                cvVar.run();
            } else if (this.I) {
            } else {
                this.I = true;
                if (!this.f53341y.k()) {
                    this.f53331a.setItemAnimator(null);
                }
                org.telegram.messenger.g0.i3(cvVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f10) {
        ri.q qVar;
        xw xwVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            yw ywVar = this.L;
            if (ywVar.j3 && (xwVar = ywVar.f53673f0[0]) == this) {
                ywVar.A0.g(Math.abs(xwVar.getTranslationX()) / ywVar.f53673f0[0].getMeasuredWidth(), ywVar.f53673f0[1].h);
            }
            qVar = ((org.telegram.ui.ActionBar.e2) ywVar).glassEngine;
            qVar.g();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        ri.q qVar;
        if (getTranslationY() != f10) {
            qVar = ((org.telegram.ui.ActionBar.e2) this.L).glassEngine;
            qVar.g();
        }
        super.setTranslationY(f10);
    }
}
