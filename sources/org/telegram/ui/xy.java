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
    public uy f41679a;
    public a5.a f41680b;
    public bx f41681c;
    public fx d;
    public s4.y e;
    public wy f41682f;
    public int h;
    public ex f41683n;
    public org.telegram.ui.Components.pl0 f41684r;
    public int f41685s;
    public int v;
    public org.telegram.ui.Components.f10 f41686w;
    public zw f41687x;
    public org.telegram.ui.Components.rl0 f41688y;

    public xy(Context context, yy yyVar) {
        super(context);
        this.K = yyVar;
        this.I = new ax(this, 1);
        this.J = new ax(this, 2);
    }

    public static void a(xy xyVar, bx bxVar) {
        xyVar.f41681c = bxVar;
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
        xyVar.f41686w = f10Var;
    }

    public static wy g(xy xyVar) {
        return xyVar.f41682f;
    }

    public static void h(xy xyVar, wy wyVar) {
        xyVar.f41682f = wyVar;
    }

    public static void i(xy xyVar, zw zwVar) {
        xyVar.f41687x = zwVar;
    }

    public static void j(xy xyVar, org.telegram.ui.Components.rl0 rl0Var) {
        xyVar.f41688y = rl0Var;
    }

    public static void k(xy xyVar, org.telegram.ui.Components.pl0 pl0Var) {
        xyVar.f41684r = pl0Var;
    }

    public static void l(xy xyVar, int i10) {
        xyVar.f41685s = i10;
    }

    public static hg.m m(xy xyVar) {
        return xyVar.d;
    }

    public static void n(xy xyVar, fx fxVar) {
        xyVar.d = fxVar;
    }

    public static void o(xy xyVar, ex exVar) {
        xyVar.f41683n = exVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f41679a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f41685s;
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
                this.f41679a.setItemAnimator(this.f41687x);
                axVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f41687x.k()) {
                    this.f41679a.setItemAnimator(null);
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
            if (yyVar.f42023h3 && (xyVar = yyVar.f42004e0[0]) == this) {
                yyVar.f42110z0.g(Math.abs(xyVar.getTranslationX()) / yyVar.f42004e0[0].getMeasuredWidth(), yyVar.f42004e0[1].h);
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
