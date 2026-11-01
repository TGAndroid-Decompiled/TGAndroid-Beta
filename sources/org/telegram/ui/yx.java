package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class yx extends FrameLayout {
    public static final int L = 0;
    public org.telegram.ui.Components.xj0 D;
    public boolean E;
    public uw F;
    public zf.m G;
    public boolean H;
    public final fw I;
    public final fw J;
    public final zx K;
    public vx f43733a;
    public a5.a f43734b;
    public gw f43735c;
    public kw d;
    public s4.x e;
    public xx f43736f;
    public int h;
    public jw f43737n;
    public org.telegram.ui.Components.wj0 f43738r;
    public int f43739s;
    public int f43740w;
    public org.telegram.ui.Components.zz f43741x;
    public ew f43742y;

    public yx(Context context, zx zxVar) {
        super(context);
        this.K = zxVar;
        this.I = new fw(this, 1);
        this.J = new fw(this, 2);
    }

    public static void a(yx yxVar, gw gwVar) {
        yxVar.f43735c = gwVar;
    }

    public static s4.x b(yx yxVar) {
        return yxVar.e;
    }

    public static void c(yx yxVar, s4.x xVar) {
        yxVar.e = xVar;
    }

    public static int d(yx yxVar) {
        return yxVar.f43740w;
    }

    public static void e(yx yxVar, int i10) {
        yxVar.f43740w = i10;
    }

    public static void f(yx yxVar, org.telegram.ui.Components.zz zzVar) {
        yxVar.f43741x = zzVar;
    }

    public static xx g(yx yxVar) {
        return yxVar.f43736f;
    }

    public static void h(yx yxVar, xx xxVar) {
        yxVar.f43736f = xxVar;
    }

    public static void i(yx yxVar, ew ewVar) {
        yxVar.f43742y = ewVar;
    }

    public static void j(yx yxVar, org.telegram.ui.Components.xj0 xj0Var) {
        yxVar.D = xj0Var;
    }

    public static void k(yx yxVar, org.telegram.ui.Components.wj0 wj0Var) {
        yxVar.f43738r = wj0Var;
    }

    public static void l(yx yxVar, int i10) {
        yxVar.f43739s = i10;
    }

    public static zf.m m(yx yxVar) {
        return yxVar.d;
    }

    public static void n(yx yxVar, kw kwVar) {
        yxVar.d = kwVar;
    }

    public static void o(yx yxVar, jw jwVar) {
        yxVar.f43737n = jwVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f43733a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f43739s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.k2) this.K).isPaused;
        if (!z11) {
            fw fwVar = this.J;
            if (z10) {
                org.telegram.messenger.i0.r(fwVar);
                this.f43733a.setItemAnimator(this.f43742y);
                fwVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f43742y.k()) {
                    this.f43733a.setItemAnimator(null);
                }
                org.telegram.messenger.i0.h3(fwVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f7) {
        ei.r rVar;
        yx yxVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            zx zxVar = this.K;
            if (zxVar.f44156h3 && (yxVar = zxVar.f44137e0[0]) == this) {
                zxVar.f44243z0.g(Math.abs(yxVar.getTranslationX()) / zxVar.f44137e0[0].getMeasuredWidth(), zxVar.f44137e0[1].h);
            }
            rVar = ((org.telegram.ui.ActionBar.k2) zxVar).glassEngine;
            rVar.g();
        }
    }

    @Override
    public void setTranslationY(float f7) {
        ei.r rVar;
        if (getTranslationY() != f7) {
            rVar = ((org.telegram.ui.ActionBar.k2) this.K).glassEngine;
            rVar.g();
        }
        super.setTranslationY(f7);
    }
}
