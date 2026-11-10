package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
public final class yw extends FrameLayout {
    public static final int L = 0;
    public org.telegram.ui.Components.si0 D;
    public boolean E;
    public tv F;
    public jg.n G;
    public boolean H;
    public final ev I;
    public final ev J;
    public final zw K;
    public vw f52125a;
    public a8.wa f52126b;
    public fv f52127c;
    public jv d;
    public v4.y f52128e;
    public xw f52129f;
    public int h;
    public iv f52130n;
    public org.telegram.ui.Components.ri0 f52131r;
    public int f52132s;
    public int f52133w;
    public org.telegram.ui.Components.lz f52134x;
    public dv f52135y;

    public yw(Context context, zw zwVar) {
        super(context);
        this.K = zwVar;
        this.I = new ev(this, 1);
        this.J = new ev(this, 2);
    }

    public static void a(yw ywVar, fv fvVar) {
        ywVar.f52127c = fvVar;
    }

    public static v4.y b(yw ywVar) {
        return ywVar.f52128e;
    }

    public static void c(yw ywVar, v4.y yVar) {
        ywVar.f52128e = yVar;
    }

    public static int d(yw ywVar) {
        return ywVar.f52133w;
    }

    public static void e(yw ywVar, int i7) {
        ywVar.f52133w = i7;
    }

    public static void f(yw ywVar, org.telegram.ui.Components.lz lzVar) {
        ywVar.f52134x = lzVar;
    }

    public static xw g(yw ywVar) {
        return ywVar.f52129f;
    }

    public static void h(yw ywVar, xw xwVar) {
        ywVar.f52129f = xwVar;
    }

    public static void i(yw ywVar, dv dvVar) {
        ywVar.f52135y = dvVar;
    }

    public static void j(yw ywVar, org.telegram.ui.Components.si0 si0Var) {
        ywVar.D = si0Var;
    }

    public static void k(yw ywVar, org.telegram.ui.Components.ri0 ri0Var) {
        ywVar.f52131r = ri0Var;
    }

    public static void l(yw ywVar, int i7) {
        ywVar.f52132s = i7;
    }

    public static jg.n m(yw ywVar) {
        return ywVar.d;
    }

    public static void n(yw ywVar, jv jvVar) {
        ywVar.d = jvVar;
    }

    public static void o(yw ywVar, iv ivVar) {
        ywVar.f52130n = ivVar;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ((FrameLayout.LayoutParams) this.f52125a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i7, i10);
    }

    public final boolean p() {
        int i7 = this.f52132s;
        if (i7 != 0 && i7 != 7 && i7 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z9) {
        boolean z10;
        z10 = ((org.telegram.ui.ActionBar.f2) this.K).isPaused;
        if (!z10) {
            ev evVar = this.J;
            if (z9) {
                org.telegram.messenger.g0.r(evVar);
                this.f52125a.setItemAnimator(this.f52135y);
                evVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f52135y.k()) {
                    this.f52125a.setItemAnimator(null);
                }
                org.telegram.messenger.g0.i3(evVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f10) {
        oi.q qVar;
        yw ywVar;
        if (getTranslationX() != f10) {
            super.setTranslationX(f10);
            zw zwVar = this.K;
            if (zwVar.f52601i3 && (ywVar = zwVar.f52577e0[0]) == this) {
                zwVar.f52683z0.g(Math.abs(ywVar.getTranslationX()) / zwVar.f52577e0[0].getMeasuredWidth(), zwVar.f52577e0[1].h);
            }
            qVar = ((org.telegram.ui.ActionBar.f2) zwVar).glassEngine;
            qVar.g();
        }
    }

    @Override
    public void setTranslationY(float f10) {
        oi.q qVar;
        if (getTranslationY() != f10) {
            qVar = ((org.telegram.ui.ActionBar.f2) this.K).glassEngine;
            qVar.g();
        }
        super.setTranslationY(f10);
    }
}
