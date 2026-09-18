package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class vy extends FrameLayout {
    public static final int L = 0;
    public boolean E;
    public ox F;
    public gg.m G;
    public boolean H;
    public final yw I;
    public final yw J;
    public final wy K;
    public sy f38527a;
    public a5.a f38528b;
    public zw f38529c;
    public dx d;
    public s4.y e;
    public uy f38530f;
    public int h;
    public cx f38531n;
    public org.telegram.ui.Components.pk0 f38532r;
    public int f38533s;
    public int v;
    public org.telegram.ui.Components.t00 f38534w;
    public xw f38535x;
    public org.telegram.ui.Components.rk0 f38536y;

    public vy(Context context, wy wyVar) {
        super(context);
        this.K = wyVar;
        this.I = new yw(this, 1);
        this.J = new yw(this, 2);
    }

    public static void a(vy vyVar, zw zwVar) {
        vyVar.f38529c = zwVar;
    }

    public static s4.y b(vy vyVar) {
        return vyVar.e;
    }

    public static void c(vy vyVar, s4.y yVar) {
        vyVar.e = yVar;
    }

    public static int d(vy vyVar) {
        return vyVar.v;
    }

    public static void e(vy vyVar, int i10) {
        vyVar.v = i10;
    }

    public static void f(vy vyVar, org.telegram.ui.Components.t00 t00Var) {
        vyVar.f38534w = t00Var;
    }

    public static uy g(vy vyVar) {
        return vyVar.f38530f;
    }

    public static void h(vy vyVar, uy uyVar) {
        vyVar.f38530f = uyVar;
    }

    public static void i(vy vyVar, xw xwVar) {
        vyVar.f38535x = xwVar;
    }

    public static void j(vy vyVar, org.telegram.ui.Components.rk0 rk0Var) {
        vyVar.f38536y = rk0Var;
    }

    public static void k(vy vyVar, org.telegram.ui.Components.pk0 pk0Var) {
        vyVar.f38532r = pk0Var;
    }

    public static void l(vy vyVar, int i10) {
        vyVar.f38533s = i10;
    }

    public static gg.m m(vy vyVar) {
        return vyVar.d;
    }

    public static void n(vy vyVar, dx dxVar) {
        vyVar.d = dxVar;
    }

    public static void o(vy vyVar, cx cxVar) {
        vyVar.f38531n = cxVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f38527a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f38533s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.o2) this.K).isPaused;
        if (!z11) {
            yw ywVar = this.J;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(ywVar);
                this.f38527a.setItemAnimator(this.f38535x);
                ywVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f38535x.k()) {
                    this.f38527a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(ywVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f7) {
        vy vyVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            wy wyVar = this.K;
            if (wyVar.f39235g3 && (vyVar = wyVar.f39221e0[0]) == this) {
                wyVar.f39325z0.g(Math.abs(vyVar.getTranslationX()) / wyVar.f39221e0[0].getMeasuredWidth(), wyVar.f39221e0[1].h);
            }
            wyVar.m3();
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
