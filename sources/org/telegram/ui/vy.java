package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class vy extends FrameLayout {
    public static final int L = 0;
    public boolean E;
    public ox F;
    public fg.m G;
    public boolean H;
    public final yw I;
    public final yw J;
    public final wy K;
    public sy f37645a;
    public a5.a f37646b;
    public zw f37647c;
    public dx d;
    public s4.y e;
    public uy f37648f;
    public int h;
    public cx f37649n;
    public org.telegram.ui.Components.yk0 f37650r;
    public int f37651s;
    public int v;
    public org.telegram.ui.Components.a10 f37652w;
    public xw f37653x;
    public org.telegram.ui.Components.zk0 f37654y;

    public vy(Context context, wy wyVar) {
        super(context);
        this.K = wyVar;
        this.I = new yw(this, 1);
        this.J = new yw(this, 2);
    }

    public static void a(vy vyVar, zw zwVar) {
        vyVar.f37647c = zwVar;
    }

    public static s4.y b(vy vyVar) {
        return vyVar.e;
    }

    public static void c(vy vyVar, s4.y yVar) {
        vyVar.e = yVar;
    }

    public static int d(vy vyVar) {
        return vyVar.v;
    }

    public static void e(vy vyVar, int i10) {
        vyVar.v = i10;
    }

    public static void f(vy vyVar, org.telegram.ui.Components.a10 a10Var) {
        vyVar.f37652w = a10Var;
    }

    public static uy g(vy vyVar) {
        return vyVar.f37648f;
    }

    public static void h(vy vyVar, uy uyVar) {
        vyVar.f37648f = uyVar;
    }

    public static void i(vy vyVar, xw xwVar) {
        vyVar.f37653x = xwVar;
    }

    public static void j(vy vyVar, org.telegram.ui.Components.zk0 zk0Var) {
        vyVar.f37654y = zk0Var;
    }

    public static void k(vy vyVar, org.telegram.ui.Components.yk0 yk0Var) {
        vyVar.f37650r = yk0Var;
    }

    public static void l(vy vyVar, int i10) {
        vyVar.f37651s = i10;
    }

    public static fg.m m(vy vyVar) {
        return vyVar.d;
    }

    public static void n(vy vyVar, dx dxVar) {
        vyVar.d = dxVar;
    }

    public static void o(vy vyVar, cx cxVar) {
        vyVar.f37649n = cxVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ((FrameLayout.LayoutParams) this.f37645a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i10, i11);
    }

    public final boolean p() {
        int i10 = this.f37651s;
        if (i10 != 0 && i10 != 7 && i10 != 8) {
            return false;
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        z11 = ((org.telegram.ui.ActionBar.p2) this.K).isPaused;
        if (!z11) {
            yw ywVar = this.J;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(ywVar);
                this.f37645a.setItemAnimator(this.f37653x);
                ywVar.run();
            } else if (this.H) {
            } else {
                this.H = true;
                if (!this.f37653x.k()) {
                    this.f37645a.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(ywVar, 36L);
            }
        }
    }

    @Override
    public void setTranslationX(float f7) {
        vy vyVar;
        if (getTranslationX() != f7) {
            super.setTranslationX(f7);
            wy wyVar = this.K;
            if (wyVar.f38445g3 && (vyVar = wyVar.f38431e0[0]) == this) {
                wyVar.f38536z0.g(Math.abs(vyVar.getTranslationX()) / wyVar.f38431e0[0].getMeasuredWidth(), wyVar.f38431e0[1].h);
            }
            wyVar.m3();
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
