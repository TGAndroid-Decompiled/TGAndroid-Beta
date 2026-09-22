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
    public qy f37905a;
    public a5.a f37906b;
    public xw f37907c;
    public bx d;
    public s4.y e;
    public sy f37908f;
    public int h;
    public ax f37909n;
    public org.telegram.ui.Components.bl0 f37910r;
    public int f37911s;
    public int v;
    public org.telegram.ui.Components.t00 f37912w;
    public vw f37913x;
    public org.telegram.ui.Components.dl0 f37914y;

    public ty(Context context, uy uyVar) {
        super(context);
        this.K = uyVar;
        this.I = new ww(this, 1);
        this.J = new ww(this, 2);
    }

    public static void a(ty tyVar, xw xwVar) {
        tyVar.f37907c = xwVar;
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
        tyVar.f37912w = t00Var;
    }

    public static sy g(ty tyVar) {
        return tyVar.f37908f;
    }

    public static void h(ty tyVar, sy syVar) {
        tyVar.f37908f = syVar;
    }

    public static void i(ty tyVar, vw vwVar) {
        tyVar.f37913x = vwVar;
    }

    public static void j(ty tyVar, org.telegram.ui.Components.dl0 dl0Var) {
        tyVar.f37914y = dl0Var;
    }

    public static void k(ty tyVar, org.telegram.ui.Components.bl0 bl0Var) {
        tyVar.f37910r = bl0Var;
    }

    public static void l(ty tyVar, int i10) {
        tyVar.f37911s = i10;
    }

    public static gg.m m(ty tyVar) {
        return tyVar.d;
    }

    public static void n(ty tyVar, bx bxVar) {
        tyVar.d = bxVar;
    }

    public static void o(ty tyVar, ax axVar) {
        tyVar.f37909n = axVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f37905a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f37911s;
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
                this.f37905a.setItemAnimator(this.f37913x);
                wwVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f37913x.k()) {
                    this.f37905a.setItemAnimator(null);
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
            if (uyVar.f38291g3 && (tyVar = uyVar.f38277e0[0]) == this) {
                uyVar.f38381z0.g(Math.abs(tyVar.getTranslationX()) / uyVar.f38277e0[0].getMeasuredWidth(), uyVar.f38277e0[1].h);
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
