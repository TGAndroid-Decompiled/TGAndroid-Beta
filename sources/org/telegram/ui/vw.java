package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class vw extends FrameLayout {
    public static final int L = 0;
    public org.telegram.ui.Components.si0 D;
    public boolean E;
    public qv F;
    public jg.n G;
    public boolean H;
    public final bv I;
    public final bv J;
    public final ww K;
    public sw f50782a;
    public a8.wa f50783b;
    public cv f50784c;
    public gv d;
    public v4.y f50785e;
    public uw f50786f;
    public int h;
    public fv f50787n;
    public org.telegram.ui.Components.ri0 f50788r;
    public int f50789s;
    public int f50790w;
    public org.telegram.ui.Components.mz f50791x;
    public av f50792y;

    public vw(Context context, ww wwVar) {
        super(context);
        this.K = wwVar;
        this.I = new bv(this, 1);
        this.J = new bv(this, 2);
    }

    public static void a(vw vwVar, cv cvVar) {
        vwVar.f50784c = cvVar;
    }

    public static v4.y b(vw vwVar) {
        return vwVar.f50785e;
    }

    public static void c(vw vwVar, v4.y yVar) {
        vwVar.f50785e = yVar;
    }

    public static int d(vw vwVar) {
        return vwVar.f50790w;
    }

    public static void e(vw vwVar, int i7) {
        vwVar.f50790w = i7;
    }

    public static void f(vw vwVar, org.telegram.ui.Components.mz mzVar) {
        vwVar.f50791x = mzVar;
    }

    public static uw g(vw vwVar) {
        return vwVar.f50786f;
    }

    public static void h(vw vwVar, uw uwVar) {
        vwVar.f50786f = uwVar;
    }

    public static void i(vw vwVar, av avVar) {
        vwVar.f50792y = avVar;
    }

    public static void j(vw vwVar, org.telegram.ui.Components.si0 si0Var) {
        vwVar.D = si0Var;
    }

    public static void k(vw vwVar, org.telegram.ui.Components.ri0 ri0Var) {
        vwVar.f50788r = ri0Var;
    }

    public static void l(vw vwVar, int i7) {
        vwVar.f50789s = i7;
    }

    public static jg.n m(vw vwVar) {
        return vwVar.d;
    }

    public static void n(vw vwVar, gv gvVar) {
        vwVar.d = gvVar;
    }

    public static void o(vw vwVar, fv fvVar) {
        vwVar.f50787n = fvVar;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ((FrameLayout.LayoutParams) this.f50782a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i7, i10);
    }

    public final boolean p() {
        int i7 = this.f50789s;
        if (i7 != 0 && i7 != 7 && i7 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z9) {
        boolean z10;
        z10 = ((org.telegram.ui.ActionBar.f2) this.K).isPaused;
        if (!z10) {
            bv bvVar = this.J;
            if (z9) {
                org.telegram.messenger.g0.r(bvVar);
                this.f50782a.setItemAnimator(this.f50792y);
                bvVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f50792y.k()) {
                    this.f50782a.setItemAnimator(null);
                }
                org.telegram.messenger.g0.i3(bvVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f10) {
        oi.q qVar;
        vw vwVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            ww wwVar = this.K;
            if (wwVar.f51575h3 && (vwVar = wwVar.f51556e0[0]) == this) {
                wwVar.f51661z0.g(Math.abs(vwVar.getTranslationX()) / wwVar.f51556e0[0].getMeasuredWidth(), wwVar.f51556e0[1].h);
            }
            qVar = ((org.telegram.ui.ActionBar.f2) wwVar).glassEngine;
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
