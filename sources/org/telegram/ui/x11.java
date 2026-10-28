package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class x11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45456a;
    public final Object f45457b;

    public x11(Object obj, int i10) {
        this.f45456a = i10;
        this.f45457b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45456a) {
            case 0:
                d21 d21Var = (d21) this.f45457b;
                d21Var.f38507y = AndroidUtilities.lerp(d21Var.E, valueAnimator.getAnimatedFraction());
                d21Var.h.setTextColor(i0.a.f(d21Var.f38507y, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23768z6, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23598q6, false)));
                return;
            case 1:
                SecretMediaViewer secretMediaViewer = ((u31) this.f45457b).d;
                secretMediaViewer.f36176a0.f38687k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f36176a0.invalidate();
                return;
            case 2:
                SecretMediaViewer secretMediaViewer2 = ((u31) this.f45457b).d;
                secretMediaViewer2.f36176a0.f38687k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f36176a0.invalidate();
                return;
            case 3:
                ((SecretMediaViewer) ((org.telegram.ui.Components.mn0) this.f45457b).f30564b).f36176a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 4:
                f41 f41Var = (f41) this.f45457b;
                f41Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (f41Var.S) {
                    f41Var.N.invalidate();
                    return;
                }
                return;
            case 5:
                ((v41) this.f45457b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 6:
                u51 u51Var = (u51) this.f45457b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u51Var.f43884r = floatValue;
                View view = u51Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.hh0 hh0Var = u51Var.d;
                if (hh0Var != null) {
                    hh0Var.invalidate();
                    return;
                }
                return;
            case 7:
                b61 b61Var = (b61) this.f45457b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b61Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b61Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.ds.f27531g.getInterpolation(b61Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(b61Var.L, i10, itemsCount, 4.0f);
                    k1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    k1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 8:
                f81 f81Var = (f81) this.f45457b;
                f81Var.getClass();
                f81Var.k0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 9:
                i91 i91Var = (i91) this.f45457b;
                i91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i91Var.e.setAlpha(1.0f - floatValue3);
                kg.h hVar = i91Var.f40072b;
                hVar.f16626z0.f18483f = floatValue3;
                i91Var.f40073c.invalidate();
                hVar.invalidate();
                return;
            case 10:
                vc1 vc1Var = (vc1) this.f45457b;
                vc1Var.getClass();
                vc1Var.f44290p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vc1Var.f44312y0.invalidate();
                vc1Var.D0.invalidate();
                vc1Var.S1.setAlpha(vc1Var.f44290p1);
                vc1Var.R1.invalidate();
                vc1Var.W0();
                return;
            case 11:
                vc1 vc1Var2 = ((jc1) this.f45457b).f40509a;
                vc1Var2.f44290p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vc1Var2.f44312y0.invalidate();
                vc1Var2.D0.invalidate();
                vc1Var2.S1.setAlpha(vc1Var2.f44290p1);
                vc1Var2.R1.invalidate();
                vc1Var2.W0();
                return;
            case 12:
                rd1 rd1Var = (rd1) this.f45457b;
                rd1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = rd1Var.f42964a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(rd1Var.f42964a.getChildAt(i11));
                    int i12 = rd1Var.d.e;
                    if (R >= i12 && i12 > 0) {
                        rd1Var.f42964a.getChildAt(i11).setAlpha(rd1Var.E);
                    } else {
                        rd1Var.f42964a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 13:
                wd1 wd1Var = (wd1) this.f45457b;
                wd1Var.getClass();
                wd1Var.f44649c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wd1Var.invalidate();
                return;
            case 14:
                cf1 cf1Var = (cf1) this.f45457b;
                cf1Var.getClass();
                cf1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                ze1 ze1Var = (ze1) this.f45457b;
                ze1Var.getClass();
                ze1Var.f46252j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ze1Var.e0();
                return;
            case 16:
                af1 af1Var = (af1) this.f45457b;
                af1Var.getClass();
                af1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                rh1 rh1Var = (rh1) this.f45457b;
                rh1Var.getClass();
                rh1Var.f43045y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rh1Var.F();
                return;
        }
    }
}
