package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ry extends FrameLayout {
    public static final int L = 0;
    public boolean E;
    public kx F;
    public gg.m G;
    public boolean H;
    public final uw I;
    public final uw J;
    public final sy K;
    public oy f41564a;
    public a5.a f41565b;
    public vw f41566c;
    public zw d;
    public s4.z f41567e;
    public qy f41568f;
    public int h;
    public yw f41569n;
    public org.telegram.ui.Components.ul0 f41570r;
    public int f41571s;
    public int v;
    public org.telegram.ui.Components.k10 f41572w;
    public tw f41573x;
    public org.telegram.ui.Components.wl0 f41574y;

    public ry(Context context, sy syVar) {
        super(context);
        this.K = syVar;
        this.I = new uw(this, 1);
        this.J = new uw(this, 2);
    }

    public static void a(ry ryVar, vw vwVar) {
        ryVar.f41566c = vwVar;
    }

    public static s4.z b(ry ryVar) {
        return ryVar.f41567e;
    }

    public static void c(ry ryVar, s4.z zVar) {
        ryVar.f41567e = zVar;
    }

    public static int d(ry ryVar) {
        return ryVar.v;
    }

    public static void e(ry ryVar, int i10) {
        ryVar.v = i10;
    }

    public static void f(ry ryVar, org.telegram.ui.Components.k10 k10Var) {
        ryVar.f41572w = k10Var;
    }

    public static qy g(ry ryVar) {
        return ryVar.f41568f;
    }

    public static void h(ry ryVar, qy qyVar) {
        ryVar.f41568f = qyVar;
    }

    public static void i(ry ryVar, tw twVar) {
        ryVar.f41573x = twVar;
    }

    public static void j(ry ryVar, org.telegram.ui.Components.wl0 wl0Var) {
        ryVar.f41574y = wl0Var;
    }

    public static void k(ry ryVar, org.telegram.ui.Components.ul0 ul0Var) {
        ryVar.f41570r = ul0Var;
    }

    public static void l(ry ryVar, int i10) {
        ryVar.f41571s = i10;
    }

    public static gg.m m(ry ryVar) {
        return ryVar.d;
    }

    public static void n(ry ryVar, zw zwVar) {
        ryVar.d = zwVar;
    }

    public static void o(ry ryVar, yw ywVar) {
        ryVar.f41569n = ywVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f41564a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f41571s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.m2) this.K).isPaused;
        if (!z11) {
            uw uwVar = this.J;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(uwVar);
                this.f41564a.setItemAnimator(this.f41573x);
                uwVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f41573x.k()) {
                    this.f41564a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(uwVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f7) {
        ry ryVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            sy syVar = this.K;
            if (syVar.f41955g3 && (ryVar = syVar.f41941e0[0]) == this) {
                syVar.f42045z0.g(Math.abs(ryVar.getTranslationX()) / syVar.f41941e0[0].getMeasuredWidth(), syVar.f41941e0[1].h);
            }
            syVar.j3();
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
