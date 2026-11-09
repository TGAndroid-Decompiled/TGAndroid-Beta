package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class xw extends FrameLayout {
    public static final int L = 0;
    public org.telegram.ui.Components.ti0 D;
    public boolean E;
    public sv F;
    public jg.n G;
    public boolean H;
    public final dv I;
    public final dv J;
    public final yw K;
    public uw f51772a;
    public a8.wa f51773b;
    public ev f51774c;
    public iv d;
    public v4.y f51775e;
    public ww f51776f;
    public int h;
    public hv f51777n;
    public org.telegram.ui.Components.si0 f51778r;
    public int f51779s;
    public int f51780w;
    public org.telegram.ui.Components.mz f51781x;
    public cv f51782y;

    public xw(Context context, yw ywVar) {
        super(context);
        this.K = ywVar;
        this.I = new dv(this, 1);
        this.J = new dv(this, 2);
    }

    public static void a(xw xwVar, ev evVar) {
        xwVar.f51774c = evVar;
    }

    public static v4.y b(xw xwVar) {
        return xwVar.f51775e;
    }

    public static void c(xw xwVar, v4.y yVar) {
        xwVar.f51775e = yVar;
    }

    public static int d(xw xwVar) {
        return xwVar.f51780w;
    }

    public static void e(xw xwVar, int i7) {
        xwVar.f51780w = i7;
    }

    public static void f(xw xwVar, org.telegram.ui.Components.mz mzVar) {
        xwVar.f51781x = mzVar;
    }

    public static ww g(xw xwVar) {
        return xwVar.f51776f;
    }

    public static void h(xw xwVar, ww wwVar) {
        xwVar.f51776f = wwVar;
    }

    public static void i(xw xwVar, cv cvVar) {
        xwVar.f51782y = cvVar;
    }

    public static void j(xw xwVar, org.telegram.ui.Components.ti0 ti0Var) {
        xwVar.D = ti0Var;
    }

    public static void k(xw xwVar, org.telegram.ui.Components.si0 si0Var) {
        xwVar.f51778r = si0Var;
    }

    public static void l(xw xwVar, int i7) {
        xwVar.f51779s = i7;
    }

    public static jg.n m(xw xwVar) {
        return xwVar.d;
    }

    public static void n(xw xwVar, iv ivVar) {
        xwVar.d = ivVar;
    }

    public static void o(xw xwVar, hv hvVar) {
        xwVar.f51777n = hvVar;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ((FrameLayout.LayoutParams) this.f51772a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i7, i10);
    }

    public final boolean p() {
        int i7 = this.f51779s;
        if (i7 != 0 && i7 != 7 && i7 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z9) {
        boolean z10;
        z10 = ((org.telegram.ui.ActionBar.f2) this.K).isPaused;
        if (!z10) {
            dv dvVar = this.J;
            if (z9) {
                org.telegram.messenger.g0.r(dvVar);
                this.f51772a.setItemAnimator(this.f51782y);
                dvVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f51782y.k()) {
                    this.f51772a.setItemAnimator(null);
                }
                org.telegram.messenger.g0.i3(dvVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f10) {
        oi.q qVar;
        xw xwVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            yw ywVar = this.K;
            if (ywVar.f52255i3 && (xwVar = ywVar.f52231e0[0]) == this) {
                ywVar.f52337z0.g(Math.abs(xwVar.getTranslationX()) / ywVar.f52231e0[0].getMeasuredWidth(), ywVar.f52231e0[1].h);
            }
            qVar = ((org.telegram.ui.ActionBar.f2) ywVar).glassEngine;
            qVar.g();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        oi.q qVar;
        if (getTranslationY() != f10) {
            qVar = ((org.telegram.ui.ActionBar.f2) this.K).glassEngine;
            qVar.g();
        }
        super.setTranslationY(f10);
    }
}
