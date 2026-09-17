package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ty extends FrameLayout {
    public static final int L = 0;
    public boolean E;
    public mx F;
    public hg.m G;
    public boolean H;
    public final ww I;
    public final ww J;
    public final uy K;
    public qy f40886a;
    public a5.a f40887b;
    public xw f40888c;
    public bx d;
    public s4.y f40889e;
    public sy f40890f;
    public int h;
    public ax f40891n;
    public org.telegram.ui.Components.ok0 f40892r;
    public int f40893s;
    public int v;
    public org.telegram.ui.Components.t00 f40894w;
    public vw f40895x;
    public org.telegram.ui.Components.qk0 f40896y;

    public ty(Context context, uy uyVar) {
        super(context);
        this.K = uyVar;
        this.I = new ww(this, 1);
        this.J = new ww(this, 2);
    }

    public static void a(ty tyVar, xw xwVar) {
        tyVar.f40888c = xwVar;
    }

    public static s4.y b(ty tyVar) {
        return tyVar.f40889e;
    }

    public static void c(ty tyVar, s4.y yVar) {
        tyVar.f40889e = yVar;
    }

    public static int d(ty tyVar) {
        return tyVar.v;
    }

    public static void e(ty tyVar, int i10) {
        tyVar.v = i10;
    }

    public static void f(ty tyVar, org.telegram.ui.Components.t00 t00Var) {
        tyVar.f40894w = t00Var;
    }

    public static sy g(ty tyVar) {
        return tyVar.f40890f;
    }

    public static void h(ty tyVar, sy syVar) {
        tyVar.f40890f = syVar;
    }

    public static void i(ty tyVar, vw vwVar) {
        tyVar.f40895x = vwVar;
    }

    public static void j(ty tyVar, org.telegram.ui.Components.qk0 qk0Var) {
        tyVar.f40896y = qk0Var;
    }

    public static void k(ty tyVar, org.telegram.ui.Components.ok0 ok0Var) {
        tyVar.f40892r = ok0Var;
    }

    public static void l(ty tyVar, int i10) {
        tyVar.f40893s = i10;
    }

    public static hg.m m(ty tyVar) {
        return tyVar.d;
    }

    public static void n(ty tyVar, bx bxVar) {
        tyVar.d = bxVar;
    }

    public static void o(ty tyVar, ax axVar) {
        tyVar.f40891n = axVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f40886a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f40893s;
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
                this.f40886a.setItemAnimator(this.f40895x);
                wwVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f40895x.k()) {
                    this.f40886a.setItemAnimator(null);
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
            if (uyVar.f41301g3 && (tyVar = uyVar.f41287e0[0]) == this) {
                uyVar.f41392z0.g(Math.abs(tyVar.getTranslationX()) / uyVar.f41287e0[0].getMeasuredWidth(), uyVar.f41287e0[1].h);
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
