package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ty extends FrameLayout {
    public static final int L = 0;
    public boolean E;
    public kx F;
    public gg.m G;
    public boolean H;
    public final uw I;
    public final uw J;
    public final uy K;
    public qy f40983a;
    public a5.a f40984b;
    public vw f40985c;
    public zw d;
    public s4.y f40986e;
    public sy f40987f;
    public int h;
    public yw f40988n;
    public org.telegram.ui.Components.bl0 f40989r;
    public int f40990s;
    public int v;
    public org.telegram.ui.Components.w00 f40991w;
    public tw f40992x;
    public org.telegram.ui.Components.dl0 f40993y;

    public ty(Context context, uy uyVar) {
        super(context);
        this.K = uyVar;
        this.I = new uw(this, 1);
        this.J = new uw(this, 2);
    }

    public static void a(ty tyVar, vw vwVar) {
        tyVar.f40985c = vwVar;
    }

    public static s4.y b(ty tyVar) {
        return tyVar.f40986e;
    }

    public static void c(ty tyVar, s4.y yVar) {
        tyVar.f40986e = yVar;
    }

    public static int d(ty tyVar) {
        return tyVar.v;
    }

    public static void e(ty tyVar, int i10) {
        tyVar.v = i10;
    }

    public static void f(ty tyVar, org.telegram.ui.Components.w00 w00Var) {
        tyVar.f40991w = w00Var;
    }

    public static sy g(ty tyVar) {
        return tyVar.f40987f;
    }

    public static void h(ty tyVar, sy syVar) {
        tyVar.f40987f = syVar;
    }

    public static void i(ty tyVar, tw twVar) {
        tyVar.f40992x = twVar;
    }

    public static void j(ty tyVar, org.telegram.ui.Components.dl0 dl0Var) {
        tyVar.f40993y = dl0Var;
    }

    public static void k(ty tyVar, org.telegram.ui.Components.bl0 bl0Var) {
        tyVar.f40989r = bl0Var;
    }

    public static void l(ty tyVar, int i10) {
        tyVar.f40990s = i10;
    }

    public static gg.m m(ty tyVar) {
        return tyVar.d;
    }

    public static void n(ty tyVar, zw zwVar) {
        tyVar.d = zwVar;
    }

    public static void o(ty tyVar, yw ywVar) {
        tyVar.f40988n = ywVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f40983a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f40990s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.n2) this.K).isPaused;
        if (!z11) {
            uw uwVar = this.J;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(uwVar);
                this.f40983a.setItemAnimator(this.f40992x);
                uwVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f40992x.k()) {
                    this.f40983a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(uwVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f7) {
        li.m mVar;
        ty tyVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            uy uyVar = this.K;
            if (uyVar.f41406g3 && (tyVar = uyVar.f41392e0[0]) == this) {
                uyVar.f41495z0.g(Math.abs(tyVar.getTranslationX()) / uyVar.f41392e0[0].getMeasuredWidth(), uyVar.f41392e0[1].h);
            }
            mVar = ((org.telegram.ui.ActionBar.n2) uyVar).glassEngine;
            mVar.g();
        }
    }

    @Override
    public void setTranslationY(float f7) {
        li.m mVar;
        if (getTranslationY() != f7) {
            mVar = ((org.telegram.ui.ActionBar.n2) this.K).glassEngine;
            mVar.g();
        }
        super.setTranslationY(f7);
    }
}
