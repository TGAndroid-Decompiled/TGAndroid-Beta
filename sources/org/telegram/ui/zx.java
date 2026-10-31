package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class zx extends FrameLayout {
    public static final int L = 0;
    public org.telegram.ui.Components.wj0 D;
    public boolean E;
    public vw F;
    public zf.m G;
    public boolean H;
    public final gw I;
    public final gw J;
    public final ay K;
    public wx f44239a;
    public a5.a f44240b;
    public hw f44241c;
    public lw d;
    public s4.x e;
    public yx f44242f;
    public int h;
    public kw f44243n;
    public org.telegram.ui.Components.vj0 f44244r;
    public int f44245s;
    public int f44246w;
    public org.telegram.ui.Components.zz f44247x;
    public fw f44248y;

    public zx(Context context, ay ayVar) {
        super(context);
        this.K = ayVar;
        this.I = new gw(this, 1);
        this.J = new gw(this, 2);
    }

    public static void a(zx zxVar, hw hwVar) {
        zxVar.f44241c = hwVar;
    }

    public static s4.x b(zx zxVar) {
        return zxVar.e;
    }

    public static void c(zx zxVar, s4.x xVar) {
        zxVar.e = xVar;
    }

    public static int d(zx zxVar) {
        return zxVar.f44246w;
    }

    public static void e(zx zxVar, int i10) {
        zxVar.f44246w = i10;
    }

    public static void f(zx zxVar, org.telegram.ui.Components.zz zzVar) {
        zxVar.f44247x = zzVar;
    }

    public static yx g(zx zxVar) {
        return zxVar.f44242f;
    }

    public static void h(zx zxVar, yx yxVar) {
        zxVar.f44242f = yxVar;
    }

    public static void i(zx zxVar, fw fwVar) {
        zxVar.f44248y = fwVar;
    }

    public static void j(zx zxVar, org.telegram.ui.Components.wj0 wj0Var) {
        zxVar.D = wj0Var;
    }

    public static void k(zx zxVar, org.telegram.ui.Components.vj0 vj0Var) {
        zxVar.f44244r = vj0Var;
    }

    public static void l(zx zxVar, int i10) {
        zxVar.f44245s = i10;
    }

    public static zf.m m(zx zxVar) {
        return zxVar.d;
    }

    public static void n(zx zxVar, lw lwVar) {
        zxVar.d = lwVar;
    }

    public static void o(zx zxVar, kw kwVar) {
        zxVar.f44243n = kwVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f44239a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f44245s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.k2) this.K).isPaused;
        if (!z11) {
            gw gwVar = this.J;
            if (z10) {
                org.telegram.messenger.i0.r(gwVar);
                this.f44239a.setItemAnimator(this.f44248y);
                gwVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f44248y.k()) {
                    this.f44239a.setItemAnimator(null);
                }
                org.telegram.messenger.i0.h3(gwVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f7) {
        ei.r rVar;
        zx zxVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            ay ayVar = this.K;
            if (ayVar.f35813h3 && (zxVar = ayVar.f35794e0[0]) == this) {
                ayVar.f35900z0.g(Math.abs(zxVar.getTranslationX()) / ayVar.f35794e0[0].getMeasuredWidth(), ayVar.f35794e0[1].h);
            }
            rVar = ((org.telegram.ui.ActionBar.k2) ayVar).glassEngine;
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
