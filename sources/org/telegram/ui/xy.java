package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xy extends FrameLayout {
    public static final int L = 0;
    public boolean E;
    public qx F;
    public hg.m G;
    public boolean H;
    public final ax I;
    public final ax J;
    public final yy K;
    public uy f41980a;
    public a5.a f41981b;
    public bx f41982c;
    public fx d;
    public s4.y e;
    public wy f41983f;
    public int h;
    public ex f41984n;
    public org.telegram.ui.Components.pl0 f41985r;
    public int f41986s;
    public int v;
    public org.telegram.ui.Components.f10 f41987w;
    public zw f41988x;
    public org.telegram.ui.Components.rl0 f41989y;

    public xy(Context context, yy yyVar) {
        super(context);
        this.K = yyVar;
        this.I = new ax(this, 1);
        this.J = new ax(this, 2);
    }

    public static void a(xy xyVar, bx bxVar) {
        xyVar.f41982c = bxVar;
    }

    public static s4.y b(xy xyVar) {
        return xyVar.e;
    }

    public static void c(xy xyVar, s4.y yVar) {
        xyVar.e = yVar;
    }

    public static int d(xy xyVar) {
        return xyVar.v;
    }

    public static void e(xy xyVar, int i10) {
        xyVar.v = i10;
    }

    public static void f(xy xyVar, org.telegram.ui.Components.f10 f10Var) {
        xyVar.f41987w = f10Var;
    }

    public static wy g(xy xyVar) {
        return xyVar.f41983f;
    }

    public static void h(xy xyVar, wy wyVar) {
        xyVar.f41983f = wyVar;
    }

    public static void i(xy xyVar, zw zwVar) {
        xyVar.f41988x = zwVar;
    }

    public static void j(xy xyVar, org.telegram.ui.Components.rl0 rl0Var) {
        xyVar.f41989y = rl0Var;
    }

    public static void k(xy xyVar, org.telegram.ui.Components.pl0 pl0Var) {
        xyVar.f41985r = pl0Var;
    }

    public static void l(xy xyVar, int i10) {
        xyVar.f41986s = i10;
    }

    public static hg.m m(xy xyVar) {
        return xyVar.d;
    }

    public static void n(xy xyVar, fx fxVar) {
        xyVar.d = fxVar;
    }

    public static void o(xy xyVar, ex exVar) {
        xyVar.f41984n = exVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f41980a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f41986s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.m2) this.K).isPaused;
        if (!z11) {
            ax axVar = this.J;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(axVar);
                this.f41980a.setItemAnimator(this.f41988x);
                axVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f41988x.k()) {
                    this.f41980a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(axVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f7) {
        xy xyVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            yy yyVar = this.K;
            if (yyVar.f42339g3 && (xyVar = yyVar.f42325e0[0]) == this) {
                yyVar.f42430z0.g(Math.abs(xyVar.getTranslationX()) / yyVar.f42325e0[0].getMeasuredWidth(), yyVar.f42325e0[1].h);
            }
            yyVar.j3();
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
