package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class uy extends FrameLayout {
    public static final int L = 0;
    public boolean E;
    public nx F;
    public gg.m G;
    public boolean H;
    public final xw I;
    public final xw J;
    public final vy K;
    public ry f42613a;
    public a5.a f42614b;
    public yw f42615c;
    public cx d;
    public s4.z f42616e;
    public ty f42617f;
    public int h;
    public bx f42618n;
    public org.telegram.ui.Components.zl0 f42619r;
    public int f42620s;
    public int v;
    public org.telegram.ui.Components.m10 f42621w;
    public ww f42622x;
    public org.telegram.ui.Components.bm0 f42623y;

    public uy(Context context, vy vyVar) {
        super(context);
        this.K = vyVar;
        this.I = new xw(this, 1);
        this.J = new xw(this, 2);
    }

    public static void a(uy uyVar, yw ywVar) {
        uyVar.f42615c = ywVar;
    }

    public static s4.z b(uy uyVar) {
        return uyVar.f42616e;
    }

    public static void c(uy uyVar, s4.z zVar) {
        uyVar.f42616e = zVar;
    }

    public static int d(uy uyVar) {
        return uyVar.v;
    }

    public static void e(uy uyVar, int i10) {
        uyVar.v = i10;
    }

    public static void f(uy uyVar, org.telegram.ui.Components.m10 m10Var) {
        uyVar.f42621w = m10Var;
    }

    public static ty g(uy uyVar) {
        return uyVar.f42617f;
    }

    public static void h(uy uyVar, ty tyVar) {
        uyVar.f42617f = tyVar;
    }

    public static void i(uy uyVar, ww wwVar) {
        uyVar.f42622x = wwVar;
    }

    public static void j(uy uyVar, org.telegram.ui.Components.bm0 bm0Var) {
        uyVar.f42623y = bm0Var;
    }

    public static void k(uy uyVar, org.telegram.ui.Components.zl0 zl0Var) {
        uyVar.f42619r = zl0Var;
    }

    public static void l(uy uyVar, int i10) {
        uyVar.f42620s = i10;
    }

    public static gg.m m(uy uyVar) {
        return uyVar.d;
    }

    public static void n(uy uyVar, cx cxVar) {
        uyVar.d = cxVar;
    }

    public static void o(uy uyVar, bx bxVar) {
        uyVar.f42618n = bxVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f42613a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f42620s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.m2) this.K).isPaused;
        if (!z11) {
            xw xwVar = this.J;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(xwVar);
                this.f42613a.setItemAnimator(this.f42622x);
                xwVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f42622x.k()) {
                    this.f42613a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(xwVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f7) {
        uy uyVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            vy vyVar = this.K;
            if (vyVar.f42919g3 && (uyVar = vyVar.f42905e0[0]) == this) {
                vyVar.f43009z0.g(Math.abs(uyVar.getTranslationX()) / vyVar.f42905e0[0].getMeasuredWidth(), vyVar.f42905e0[1].h);
            }
            vyVar.j3();
        }
    }

    @Override
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            this.K.j3();
        }
        super.setTranslationY(f7);
    }
}
