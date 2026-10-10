package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class sy extends FrameLayout {
    public static final int L = 0;
    public boolean E;
    public lx F;
    public gg.m G;
    public boolean H;
    public final vw I;
    public final vw J;
    public final ty K;
    public py f41834a;
    public a5.a f41835b;
    public ww f41836c;
    public ax d;
    public s4.z f41837e;
    public ry f41838f;
    public int h;
    public zw f41839n;
    public org.telegram.ui.Components.ul0 f41840r;
    public int f41841s;
    public int v;
    public org.telegram.ui.Components.k10 f41842w;
    public uw f41843x;
    public org.telegram.ui.Components.wl0 f41844y;

    public sy(Context context, ty tyVar) {
        super(context);
        this.K = tyVar;
        this.I = new vw(this, 1);
        this.J = new vw(this, 2);
    }

    public static void a(sy syVar, ww wwVar) {
        syVar.f41836c = wwVar;
    }

    public static s4.z b(sy syVar) {
        return syVar.f41837e;
    }

    public static void c(sy syVar, s4.z zVar) {
        syVar.f41837e = zVar;
    }

    public static int d(sy syVar) {
        return syVar.v;
    }

    public static void e(sy syVar, int i10) {
        syVar.v = i10;
    }

    public static void f(sy syVar, org.telegram.ui.Components.k10 k10Var) {
        syVar.f41842w = k10Var;
    }

    public static ry g(sy syVar) {
        return syVar.f41838f;
    }

    public static void h(sy syVar, ry ryVar) {
        syVar.f41838f = ryVar;
    }

    public static void i(sy syVar, uw uwVar) {
        syVar.f41843x = uwVar;
    }

    public static void j(sy syVar, org.telegram.ui.Components.wl0 wl0Var) {
        syVar.f41844y = wl0Var;
    }

    public static void k(sy syVar, org.telegram.ui.Components.ul0 ul0Var) {
        syVar.f41840r = ul0Var;
    }

    public static void l(sy syVar, int i10) {
        syVar.f41841s = i10;
    }

    public static gg.m m(sy syVar) {
        return syVar.d;
    }

    public static void n(sy syVar, ax axVar) {
        syVar.d = axVar;
    }

    public static void o(sy syVar, zw zwVar) {
        syVar.f41839n = zwVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f41834a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f41841s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.n2) this.K).isPaused;
        if (!z11) {
            vw vwVar = this.J;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(vwVar);
                this.f41834a.setItemAnimator(this.f41843x);
                vwVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f41843x.k()) {
                    this.f41834a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(vwVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f7) {
        sy syVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            ty tyVar = this.K;
            if (tyVar.f42232g3 && (syVar = tyVar.f42218e0[0]) == this) {
                tyVar.f42322z0.g(Math.abs(syVar.getTranslationX()) / tyVar.f42218e0[0].getMeasuredWidth(), tyVar.f42218e0[1].h);
            }
            tyVar.j3();
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
