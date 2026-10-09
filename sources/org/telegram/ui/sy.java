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
    public py f41790a;
    public a5.a f41791b;
    public ww f41792c;
    public ax d;
    public s4.z f41793e;
    public ry f41794f;
    public int h;
    public zw f41795n;
    public org.telegram.ui.Components.tl0 f41796r;
    public int f41797s;
    public int v;
    public org.telegram.ui.Components.j10 f41798w;
    public uw f41799x;
    public org.telegram.ui.Components.vl0 f41800y;

    public sy(Context context, ty tyVar) {
        super(context);
        this.K = tyVar;
        this.I = new vw(this, 1);
        this.J = new vw(this, 2);
    }

    public static void a(sy syVar, ww wwVar) {
        syVar.f41792c = wwVar;
    }

    public static s4.z b(sy syVar) {
        return syVar.f41793e;
    }

    public static void c(sy syVar, s4.z zVar) {
        syVar.f41793e = zVar;
    }

    public static int d(sy syVar) {
        return syVar.v;
    }

    public static void e(sy syVar, int i10) {
        syVar.v = i10;
    }

    public static void f(sy syVar, org.telegram.ui.Components.j10 j10Var) {
        syVar.f41798w = j10Var;
    }

    public static ry g(sy syVar) {
        return syVar.f41794f;
    }

    public static void h(sy syVar, ry ryVar) {
        syVar.f41794f = ryVar;
    }

    public static void i(sy syVar, uw uwVar) {
        syVar.f41799x = uwVar;
    }

    public static void j(sy syVar, org.telegram.ui.Components.vl0 vl0Var) {
        syVar.f41800y = vl0Var;
    }

    public static void k(sy syVar, org.telegram.ui.Components.tl0 tl0Var) {
        syVar.f41796r = tl0Var;
    }

    public static void l(sy syVar, int i10) {
        syVar.f41797s = i10;
    }

    public static gg.m m(sy syVar) {
        return syVar.d;
    }

    public static void n(sy syVar, ax axVar) {
        syVar.d = axVar;
    }

    public static void o(sy syVar, zw zwVar) {
        syVar.f41795n = zwVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f41790a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f41797s;
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
                this.f41790a.setItemAnimator(this.f41799x);
                vwVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f41799x.k()) {
                    this.f41790a.setItemAnimator(null);
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
            if (tyVar.f42188g3 && (syVar = tyVar.f42174e0[0]) == this) {
                tyVar.f42278z0.g(Math.abs(syVar.getTranslationX()) / tyVar.f42174e0[0].getMeasuredWidth(), tyVar.f42174e0[1].h);
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
