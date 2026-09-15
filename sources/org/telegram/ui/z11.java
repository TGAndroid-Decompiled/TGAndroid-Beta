package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class z11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40044a;
    public final Object f40045b;

    public z11(Object obj, int i10) {
        this.f40044a = i10;
        this.f40045b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40044a) {
            case 0:
                b21 b21Var = (b21) this.f40045b;
                b21Var.f32035y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b21Var.a();
                return;
            case 1:
                o21 o21Var = (o21) this.f40045b;
                o21Var.f36097y = AndroidUtilities.lerp(o21Var.E, valueAnimator.getAnimatedFraction());
                o21Var.h.setTextColor(i0.a.d(o21Var.f36097y, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19237z6, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false)));
                o21Var.f36093r.setAlpha((o21Var.f36097y / 2.0f) + 0.5f);
                return;
            case 2:
                ((e31) this.f40045b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                d31 d31Var = (d31) this.f40045b;
                d31Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d31Var.O.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = ((w41) this.f40045b).d;
                secretMediaViewer.f31437a0.f36350k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f31437a0.invalidate();
                return;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((w41) this.f40045b).d;
                secretMediaViewer2.f31437a0.f36350k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f31437a0.invalidate();
                return;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.em0) this.f40045b).f23694b).f31437a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                h51 h51Var = (h51) this.f40045b;
                h51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (h51Var.S) {
                    h51Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                ((w51) this.f40045b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                v61 v61Var = (v61) this.f40045b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v61Var.f38377r = floatValue;
                View view = v61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.ig0 ig0Var = v61Var.d;
                if (ig0Var != null) {
                    ig0Var.invalidate();
                    return;
                }
                return;
            case 10:
                c71 c71Var = (c71) this.f40045b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c71Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c71Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.qr.f27424g.getInterpolation(c71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(c71Var.L, i10, itemsCount, 4.0f);
                    j1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    j1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 11:
                e91.a0((e91) this.f40045b, valueAnimator);
                return;
            case 12:
                ia1 ia1Var = (ia1) this.f40045b;
                ia1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ia1Var.e.setAlpha(1.0f - floatValue3);
                ig.g gVar = ia1Var.f34572b;
                gVar.f11171z0.f13637f = floatValue3;
                ia1Var.f34573c.invalidate();
                gVar.invalidate();
                return;
            case 13:
                vd1 vd1Var = (vd1) this.f40045b;
                vd1Var.getClass();
                vd1Var.f38554o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vd1Var.f38575x0.invalidate();
                vd1Var.C0.invalidate();
                vd1Var.R1.setAlpha(vd1Var.f38554o1);
                vd1Var.Q1.invalidate();
                vd1Var.V0();
                return;
            case 14:
                vd1 vd1Var2 = ((jd1) this.f40045b).f34857a;
                vd1Var2.f38554o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vd1Var2.f38575x0.invalidate();
                vd1Var2.C0.invalidate();
                vd1Var2.R1.setAlpha(vd1Var2.f38554o1);
                vd1Var2.Q1.invalidate();
                vd1Var2.V0();
                return;
            case 15:
                se1 se1Var = (se1) this.f40045b;
                se1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = se1Var.f37368a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(se1Var.f37368a.getChildAt(i11));
                    int i12 = se1Var.d.e;
                    if (R >= i12 && i12 > 0) {
                        se1Var.f37368a.getChildAt(i11).setAlpha(se1Var.E);
                    } else {
                        se1Var.f37368a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 16:
                xe1 xe1Var = (xe1) this.f40045b;
                xe1Var.getClass();
                xe1Var.f39608c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xe1Var.invalidate();
                return;
            case 17:
                dg1 dg1Var = (dg1) this.f40045b;
                dg1Var.getClass();
                dg1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                ag1 ag1Var = (ag1) this.f40045b;
                ag1Var.getClass();
                ag1Var.f31828f5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ag1Var.f0();
                return;
            case 19:
                bg1 bg1Var = (bg1) this.f40045b;
                bg1Var.getClass();
                bg1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ti1 ti1Var = (ti1) this.f40045b;
                ti1Var.getClass();
                ti1Var.f37738y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti1Var.G();
                return;
        }
    }
}
