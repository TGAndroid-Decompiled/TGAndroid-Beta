package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class sy extends FrameLayout {
    public static final int L = 0;
    public boolean E;
    public ix F;
    public gg.m G;
    public boolean H;
    public final sw I;
    public final sw J;
    public final ty K;
    public py f37593a;
    public a5.a f37594b;
    public tw f37595c;
    public xw d;
    public s4.y e;
    public ry f37596f;
    public int h;
    public ww f37597n;
    public org.telegram.ui.Components.bl0 f37598r;
    public int f37599s;
    public int v;
    public org.telegram.ui.Components.v00 f37600w;
    public rw f37601x;
    public org.telegram.ui.Components.dl0 f37602y;

    public sy(Context context, ty tyVar) {
        super(context);
        this.K = tyVar;
        this.I = new sw(this, 1);
        this.J = new sw(this, 2);
    }

    public static void a(sy syVar, tw twVar) {
        syVar.f37595c = twVar;
    }

    public static s4.y b(sy syVar) {
        return syVar.e;
    }

    public static void c(sy syVar, s4.y yVar) {
        syVar.e = yVar;
    }

    public static int d(sy syVar) {
        return syVar.v;
    }

    public static void e(sy syVar, int i10) {
        syVar.v = i10;
    }

    public static void f(sy syVar, org.telegram.ui.Components.v00 v00Var) {
        syVar.f37600w = v00Var;
    }

    public static ry g(sy syVar) {
        return syVar.f37596f;
    }

    public static void h(sy syVar, ry ryVar) {
        syVar.f37596f = ryVar;
    }

    public static void i(sy syVar, rw rwVar) {
        syVar.f37601x = rwVar;
    }

    public static void j(sy syVar, org.telegram.ui.Components.dl0 dl0Var) {
        syVar.f37602y = dl0Var;
    }

    public static void k(sy syVar, org.telegram.ui.Components.bl0 bl0Var) {
        syVar.f37598r = bl0Var;
    }

    public static void l(sy syVar, int i10) {
        syVar.f37599s = i10;
    }

    public static gg.m m(sy syVar) {
        return syVar.d;
    }

    public static void n(sy syVar, xw xwVar) {
        syVar.d = xwVar;
    }

    public static void o(sy syVar, ww wwVar) {
        syVar.f37597n = wwVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f37593a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f37599s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.o2) this.K).isPaused;
        if (!z11) {
            sw swVar = this.J;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(swVar);
                this.f37593a.setItemAnimator(this.f37601x);
                swVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f37601x.k()) {
                    this.f37593a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(swVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f7) {
        li.l lVar;
        sy syVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            ty tyVar = this.K;
            if (tyVar.f37990g3 && (syVar = tyVar.f37976e0[0]) == this) {
                tyVar.f38079z0.g(Math.abs(syVar.getTranslationX()) / tyVar.f37976e0[0].getMeasuredWidth(), tyVar.f37976e0[1].h);
            }
            lVar = ((org.telegram.ui.ActionBar.o2) tyVar).glassEngine;
            lVar.f();
        }
    }

    @Override
    public void setTranslationY(float f7) {
        li.l lVar;
        if (getTranslationY() != f7) {
            lVar = ((org.telegram.ui.ActionBar.o2) this.K).glassEngine;
            lVar.f();
        }
        super.setTranslationY(f7);
    }
}
