package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class qy extends FrameLayout {
    public static final int L = 0;
    public boolean E;
    public jx F;
    public gg.m G;
    public boolean H;
    public final tw I;
    public final tw J;
    public final ry K;
    public ny f36629a;
    public a5.a f36630b;
    public uw f36631c;
    public yw d;
    public s4.y e;
    public py f36632f;
    public int h;
    public xw f36633n;
    public org.telegram.ui.Components.pk0 f36634r;
    public int f36635s;
    public int v;
    public org.telegram.ui.Components.u00 f36636w;
    public sw f36637x;
    public org.telegram.ui.Components.rk0 f36638y;

    public qy(Context context, ry ryVar) {
        super(context);
        this.K = ryVar;
        this.I = new tw(this, 1);
        this.J = new tw(this, 2);
    }

    public static void a(qy qyVar, uw uwVar) {
        qyVar.f36631c = uwVar;
    }

    public static s4.y b(qy qyVar) {
        return qyVar.e;
    }

    public static void c(qy qyVar, s4.y yVar) {
        qyVar.e = yVar;
    }

    public static int d(qy qyVar) {
        return qyVar.v;
    }

    public static void e(qy qyVar, int i10) {
        qyVar.v = i10;
    }

    public static void f(qy qyVar, org.telegram.ui.Components.u00 u00Var) {
        qyVar.f36636w = u00Var;
    }

    public static py g(qy qyVar) {
        return qyVar.f36632f;
    }

    public static void h(qy qyVar, py pyVar) {
        qyVar.f36632f = pyVar;
    }

    public static void i(qy qyVar, sw swVar) {
        qyVar.f36637x = swVar;
    }

    public static void j(qy qyVar, org.telegram.ui.Components.rk0 rk0Var) {
        qyVar.f36638y = rk0Var;
    }

    public static void k(qy qyVar, org.telegram.ui.Components.pk0 pk0Var) {
        qyVar.f36634r = pk0Var;
    }

    public static void l(qy qyVar, int i10) {
        qyVar.f36635s = i10;
    }

    public static gg.m m(qy qyVar) {
        return qyVar.d;
    }

    public static void n(qy qyVar, yw ywVar) {
        qyVar.d = ywVar;
    }

    public static void o(qy qyVar, xw xwVar) {
        qyVar.f36633n = xwVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f36629a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f36635s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.n2) this.K).isPaused;
        if (!z11) {
            tw twVar = this.J;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(twVar);
                this.f36629a.setItemAnimator(this.f36637x);
                twVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f36637x.k()) {
                    this.f36629a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(twVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f7) {
        qy qyVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            ry ryVar = this.K;
            if (ryVar.f36992g3 && (qyVar = ryVar.f36978e0[0]) == this) {
                ryVar.f37082z0.g(Math.abs(qyVar.getTranslationX()) / ryVar.f36978e0[0].getMeasuredWidth(), ryVar.f36978e0[1].h);
            }
            ryVar.m3();
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
