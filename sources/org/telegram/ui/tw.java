package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class tw extends FrameLayout {
    public static final int M = 0;
    public org.telegram.ui.Components.wi0 E;
    public boolean F;
    public nv G;
    public kg.m H;
    public boolean I;
    public final yu J;
    public final yu K;
    public final uw L;
    public pw f49897a;
    public b8.kg f49898b;
    public zu f49899c;
    public dv d;
    public u4.y f49900e;
    public sw f49901f;
    public int h;
    public cv f49902n;
    public org.telegram.ui.Components.vi0 f49903r;
    public int f49904s;
    public int f49905w;
    public org.telegram.ui.Components.iz f49906x;
    public xu f49907y;

    public tw(Context context, uw uwVar) {
        super(context);
        this.L = uwVar;
        this.J = new yu(this, 1);
        this.K = new yu(this, 2);
    }

    public static void a(tw twVar, zu zuVar) {
        twVar.f49899c = zuVar;
    }

    public static u4.y b(tw twVar) {
        return twVar.f49900e;
    }

    public static void c(tw twVar, u4.y yVar) {
        twVar.f49900e = yVar;
    }

    public static int d(tw twVar) {
        return twVar.f49905w;
    }

    public static void e(tw twVar, int i3) {
        twVar.f49905w = i3;
    }

    public static void f(tw twVar, org.telegram.ui.Components.iz izVar) {
        twVar.f49906x = izVar;
    }

    public static sw g(tw twVar) {
        return twVar.f49901f;
    }

    public static void h(tw twVar, sw swVar) {
        twVar.f49901f = swVar;
    }

    public static void i(tw twVar, xu xuVar) {
        twVar.f49907y = xuVar;
    }

    public static void j(tw twVar, org.telegram.ui.Components.wi0 wi0Var) {
        twVar.E = wi0Var;
    }

    public static void k(tw twVar, org.telegram.ui.Components.vi0 vi0Var) {
        twVar.f49903r = vi0Var;
    }

    public static void l(tw twVar, int i3) {
        twVar.f49904s = i3;
    }

    public static kg.m m(tw twVar) {
        return twVar.d;
    }

    public static void n(tw twVar, dv dvVar) {
        twVar.d = dvVar;
    }

    public static void o(tw twVar, cv cvVar) {
        twVar.f49902n = cvVar;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        ((FrameLayout.LayoutParams) this.f49897a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i3, i10);
    }

    public final boolean p() {
        int i3 = this.f49904s;
        if (i3 != 0 && i3 != 7 && i3 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.d2) this.L).isPaused;
        if (!z11) {
            yu yuVar = this.K;
            if (z10) {
                org.telegram.messenger.g0.r(yuVar);
                this.f49897a.setItemAnimator(this.f49907y);
                yuVar.run();
            } else if (this.I) {
            } else {
                this.I = true;
                if (!this.f49907y.k()) {
                    this.f49897a.setItemAnimator(null);
                }
                org.telegram.messenger.g0.i3(yuVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f10) {
        pi.q qVar;
        tw twVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            uw uwVar = this.L;
            if (uwVar.i3 && (twVar = uwVar.f50230f0[0]) == this) {
                uwVar.A0.g(Math.abs(twVar.getTranslationX()) / uwVar.f50230f0[0].getMeasuredWidth(), uwVar.f50230f0[1].h);
            }
            qVar = ((org.telegram.ui.ActionBar.d2) uwVar).glassEngine;
            qVar.g();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        pi.q qVar;
        if (getTranslationY() != f10) {
            qVar = ((org.telegram.ui.ActionBar.d2) this.L).glassEngine;
            qVar.g();
        }
        super.setTranslationY(f10);
    }
}
