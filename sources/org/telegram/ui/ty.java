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
    public qy f40990a;
    public a5.a f40991b;
    public vw f40992c;
    public zw d;
    public s4.y f40993e;
    public sy f40994f;
    public int h;
    public yw f40995n;
    public org.telegram.ui.Components.bl0 f40996r;
    public int f40997s;
    public int v;
    public org.telegram.ui.Components.w00 f40998w;
    public tw f40999x;
    public org.telegram.ui.Components.dl0 f41000y;

    public ty(Context context, uy uyVar) {
        super(context);
        this.K = uyVar;
        this.I = new uw(this, 1);
        this.J = new uw(this, 2);
    }

    public static void a(ty tyVar, vw vwVar) {
        tyVar.f40992c = vwVar;
    }

    public static s4.y b(ty tyVar) {
        return tyVar.f40993e;
    }

    public static void c(ty tyVar, s4.y yVar) {
        tyVar.f40993e = yVar;
    }

    public static int d(ty tyVar) {
        return tyVar.v;
    }

    public static void e(ty tyVar, int i10) {
        tyVar.v = i10;
    }

    public static void f(ty tyVar, org.telegram.ui.Components.w00 w00Var) {
        tyVar.f40998w = w00Var;
    }

    public static sy g(ty tyVar) {
        return tyVar.f40994f;
    }

    public static void h(ty tyVar, sy syVar) {
        tyVar.f40994f = syVar;
    }

    public static void i(ty tyVar, tw twVar) {
        tyVar.f40999x = twVar;
    }

    public static void j(ty tyVar, org.telegram.ui.Components.dl0 dl0Var) {
        tyVar.f41000y = dl0Var;
    }

    public static void k(ty tyVar, org.telegram.ui.Components.bl0 bl0Var) {
        tyVar.f40996r = bl0Var;
    }

    public static void l(ty tyVar, int i10) {
        tyVar.f40997s = i10;
    }

    public static gg.m m(ty tyVar) {
        return tyVar.d;
    }

    public static void n(ty tyVar, zw zwVar) {
        tyVar.d = zwVar;
    }

    public static void o(ty tyVar, yw ywVar) {
        tyVar.f40995n = ywVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f40990a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f40997s;
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
                this.f40990a.setItemAnimator(this.f40999x);
                uwVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f40999x.k()) {
                    this.f40990a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(uwVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f7) {
        li.n nVar;
        ty tyVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            uy uyVar = this.K;
            if (uyVar.f41414g3 && (tyVar = uyVar.f41400e0[0]) == this) {
                uyVar.f41503z0.g(Math.abs(tyVar.getTranslationX()) / uyVar.f41400e0[0].getMeasuredWidth(), uyVar.f41400e0[1].h);
            }
            nVar = ((org.telegram.ui.ActionBar.n2) uyVar).glassEngine;
            nVar.g();
        }
    }

    @Override
    public void setTranslationY(float f7) {
        li.n nVar;
        if (getTranslationY() != f7) {
            nVar = ((org.telegram.ui.ActionBar.n2) this.K).glassEngine;
            nVar.g();
        }
        super.setTranslationY(f7);
    }
}
