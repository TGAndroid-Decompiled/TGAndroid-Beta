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
    public ry f42611a;
    public a5.a f42612b;
    public yw f42613c;
    public cx d;
    public s4.z f42614e;
    public ty f42615f;
    public int h;
    public bx f42616n;
    public org.telegram.ui.Components.zl0 f42617r;
    public int f42618s;
    public int v;
    public org.telegram.ui.Components.m10 f42619w;
    public ww f42620x;
    public org.telegram.ui.Components.bm0 f42621y;

    public uy(Context context, vy vyVar) {
        super(context);
        this.K = vyVar;
        this.I = new xw(this, 1);
        this.J = new xw(this, 2);
    }

    public static void a(uy uyVar, yw ywVar) {
        uyVar.f42613c = ywVar;
    }

    public static s4.z b(uy uyVar) {
        return uyVar.f42614e;
    }

    public static void c(uy uyVar, s4.z zVar) {
        uyVar.f42614e = zVar;
    }

    public static int d(uy uyVar) {
        return uyVar.v;
    }

    public static void e(uy uyVar, int i10) {
        uyVar.v = i10;
    }

    public static void f(uy uyVar, org.telegram.ui.Components.m10 m10Var) {
        uyVar.f42619w = m10Var;
    }

    public static ty g(uy uyVar) {
        return uyVar.f42615f;
    }

    public static void h(uy uyVar, ty tyVar) {
        uyVar.f42615f = tyVar;
    }

    public static void i(uy uyVar, ww wwVar) {
        uyVar.f42620x = wwVar;
    }

    public static void j(uy uyVar, org.telegram.ui.Components.bm0 bm0Var) {
        uyVar.f42621y = bm0Var;
    }

    public static void k(uy uyVar, org.telegram.ui.Components.zl0 zl0Var) {
        uyVar.f42617r = zl0Var;
    }

    public static void l(uy uyVar, int i10) {
        uyVar.f42618s = i10;
    }

    public static gg.m m(uy uyVar) {
        return uyVar.d;
    }

    public static void n(uy uyVar, cx cxVar) {
        uyVar.d = cxVar;
    }

    public static void o(uy uyVar, bx bxVar) {
        uyVar.f42616n = bxVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f42611a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f42618s;
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
                this.f42611a.setItemAnimator(this.f42620x);
                xwVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f42620x.k()) {
                    this.f42611a.setItemAnimator(null);
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
            if (vyVar.f42917g3 && (uyVar = vyVar.f42903e0[0]) == this) {
                vyVar.f43007z0.g(Math.abs(uyVar.getTranslationX()) / vyVar.f42903e0[0].getMeasuredWidth(), vyVar.f42903e0[1].h);
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
