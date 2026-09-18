package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ty extends FrameLayout {
    public static final int L = 0;
    public boolean E;
    public mx F;
    public gg.m G;
    public boolean H;
    public final ww I;
    public final ww J;
    public final uy K;
    public qy f37826a;
    public a5.a f37827b;
    public xw f37828c;
    public bx d;
    public s4.y e;
    public sy f37829f;
    public int h;
    public ax f37830n;
    public org.telegram.ui.Components.zk0 f37831r;
    public int f37832s;
    public int v;
    public org.telegram.ui.Components.t00 f37833w;
    public vw f37834x;
    public org.telegram.ui.Components.bl0 f37835y;

    public ty(Context context, uy uyVar) {
        super(context);
        this.K = uyVar;
        this.I = new ww(this, 1);
        this.J = new ww(this, 2);
    }

    public static void a(ty tyVar, xw xwVar) {
        tyVar.f37828c = xwVar;
    }

    public static s4.y b(ty tyVar) {
        return tyVar.e;
    }

    public static void c(ty tyVar, s4.y yVar) {
        tyVar.e = yVar;
    }

    public static int d(ty tyVar) {
        return tyVar.v;
    }

    public static void e(ty tyVar, int i10) {
        tyVar.v = i10;
    }

    public static void f(ty tyVar, org.telegram.ui.Components.t00 t00Var) {
        tyVar.f37833w = t00Var;
    }

    public static sy g(ty tyVar) {
        return tyVar.f37829f;
    }

    public static void h(ty tyVar, sy syVar) {
        tyVar.f37829f = syVar;
    }

    public static void i(ty tyVar, vw vwVar) {
        tyVar.f37834x = vwVar;
    }

    public static void j(ty tyVar, org.telegram.ui.Components.bl0 bl0Var) {
        tyVar.f37835y = bl0Var;
    }

    public static void k(ty tyVar, org.telegram.ui.Components.zk0 zk0Var) {
        tyVar.f37831r = zk0Var;
    }

    public static void l(ty tyVar, int i10) {
        tyVar.f37832s = i10;
    }

    public static gg.m m(ty tyVar) {
        return tyVar.d;
    }

    public static void n(ty tyVar, bx bxVar) {
        tyVar.d = bxVar;
    }

    public static void o(ty tyVar, ax axVar) {
        tyVar.f37830n = axVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f37826a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f37832s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.n2) this.K).isPaused;
        if (!z11) {
            ww wwVar = this.J;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(wwVar);
                this.f37826a.setItemAnimator(this.f37834x);
                wwVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f37834x.k()) {
                    this.f37826a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(wwVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f7) {
        ty tyVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            uy uyVar = this.K;
            if (uyVar.f38163g3 && (tyVar = uyVar.f38149e0[0]) == this) {
                uyVar.f38253z0.g(Math.abs(tyVar.getTranslationX()) / uyVar.f38149e0[0].getMeasuredWidth(), uyVar.f38149e0[1].h);
            }
            uyVar.m3();
        }
    }

    @Override
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            this.K.m3();
        }
        super.setTranslationY(f7);
    }
}
