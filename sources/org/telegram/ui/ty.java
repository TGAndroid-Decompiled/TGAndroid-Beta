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
    public qy f41046a;
    public a5.a f41047b;
    public vw f41048c;
    public zw d;
    public s4.y f41049e;
    public sy f41050f;
    public int h;
    public yw f41051n;
    public org.telegram.ui.Components.bl0 f41052r;
    public int f41053s;
    public int v;
    public org.telegram.ui.Components.w00 f41054w;
    public tw f41055x;
    public org.telegram.ui.Components.dl0 f41056y;

    public ty(Context context, uy uyVar) {
        super(context);
        this.K = uyVar;
        this.I = new uw(this, 1);
        this.J = new uw(this, 2);
    }

    public static void a(ty tyVar, vw vwVar) {
        tyVar.f41048c = vwVar;
    }

    public static s4.y b(ty tyVar) {
        return tyVar.f41049e;
    }

    public static void c(ty tyVar, s4.y yVar) {
        tyVar.f41049e = yVar;
    }

    public static int d(ty tyVar) {
        return tyVar.v;
    }

    public static void e(ty tyVar, int i10) {
        tyVar.v = i10;
    }

    public static void f(ty tyVar, org.telegram.ui.Components.w00 w00Var) {
        tyVar.f41054w = w00Var;
    }

    public static sy g(ty tyVar) {
        return tyVar.f41050f;
    }

    public static void h(ty tyVar, sy syVar) {
        tyVar.f41050f = syVar;
    }

    public static void i(ty tyVar, tw twVar) {
        tyVar.f41055x = twVar;
    }

    public static void j(ty tyVar, org.telegram.ui.Components.dl0 dl0Var) {
        tyVar.f41056y = dl0Var;
    }

    public static void k(ty tyVar, org.telegram.ui.Components.bl0 bl0Var) {
        tyVar.f41052r = bl0Var;
    }

    public static void l(ty tyVar, int i10) {
        tyVar.f41053s = i10;
    }

    public static gg.m m(ty tyVar) {
        return tyVar.d;
    }

    public static void n(ty tyVar, zw zwVar) {
        tyVar.d = zwVar;
    }

    public static void o(ty tyVar, yw ywVar) {
        tyVar.f41051n = ywVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f41046a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f41053s;
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
                this.f41046a.setItemAnimator(this.f41055x);
                uwVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f41055x.k()) {
                    this.f41046a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(uwVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f7) {
        li.p pVar;
        ty tyVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            uy uyVar = this.K;
            if (uyVar.f41449g3 && (tyVar = uyVar.f41435e0[0]) == this) {
                uyVar.f41538z0.g(Math.abs(tyVar.getTranslationX()) / uyVar.f41435e0[0].getMeasuredWidth(), uyVar.f41435e0[1].h);
            }
            pVar = ((org.telegram.ui.ActionBar.n2) uyVar).glassEngine;
            pVar.g();
        }
    }

    @Override
    public void setTranslationY(float f7) {
        li.p pVar;
        if (getTranslationY() != f7) {
            pVar = ((org.telegram.ui.ActionBar.n2) this.K).glassEngine;
            pVar.g();
        }
        super.setTranslationY(f7);
    }
}
