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
    public uw f53335a;
    public a8.xa f53336b;
    public dv f53337c;
    public hv d;
    public v4.y f53338e;
    public ww f53339f;
    public int h;
    public gv f53340n;
    public org.telegram.ui.Components.wi0 f53341r;
    public int f53342s;
    public int f53343w;
    public org.telegram.ui.Components.pz f53344x;
    public bv f53345y;

    public xw(Context context, yw ywVar) {
        super(context);
        this.L = ywVar;
        this.J = new cv(this, 1);
        this.K = new cv(this, 2);
    }

    public static void a(xw xwVar, dv dvVar) {
        xwVar.f53337c = dvVar;
    }

    public static v4.y b(xw xwVar) {
        return xwVar.f53338e;
    }

    public static void c(xw xwVar, v4.y yVar) {
        xwVar.f53338e = yVar;
    }

    public static int d(xw xwVar) {
        return xwVar.f53343w;
    }

    public static void e(xw xwVar, int i7) {
        xwVar.f53343w = i7;
    }

    public static void f(xw xwVar, org.telegram.ui.Components.pz pzVar) {
        xwVar.f53344x = pzVar;
    }

    public static ww g(xw xwVar) {
        return xwVar.f53339f;
    }

    public static void h(xw xwVar, ww wwVar) {
        xwVar.f53339f = wwVar;
    }

    public static void i(xw xwVar, bv bvVar) {
        xwVar.f53345y = bvVar;
    }

    public static void j(xw xwVar, org.telegram.ui.Components.xi0 xi0Var) {
        xwVar.E = xi0Var;
    }

    public static void k(xw xwVar, org.telegram.ui.Components.wi0 wi0Var) {
        xwVar.f53341r = wi0Var;
    }

    public static void l(xw xwVar, int i7) {
        xwVar.f53342s = i7;
    }

    public static jg.m m(xw xwVar) {
        return xwVar.d;
    }

    public static void n(xw xwVar, hv hvVar) {
        xwVar.d = hvVar;
    }

    public static void o(xw xwVar, gv gvVar) {
        xwVar.f53340n = gvVar;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ((FrameLayout.LayoutParams) this.f53335a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i7, i10);
    }

    public final boolean p() {
        int i7 = this.f53342s;
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
                this.f53335a.setItemAnimator(this.f53345y);
                cvVar.run();
            } else if (this.I) {
            } else {
                this.I = true;
                if (!this.f53345y.k()) {
                    this.f53335a.setItemAnimator(null);
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
            if (ywVar.j3 && (xwVar = ywVar.f53638f0[0]) == this) {
                ywVar.A0.g(Math.abs(xwVar.getTranslationX()) / ywVar.f53638f0[0].getMeasuredWidth(), ywVar.f53638f0[1].h);
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
