package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class u01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41761a;
    public final Object f41762b;

    public u01(Object obj, int i10) {
        this.f41761a = i10;
        this.f41762b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41761a) {
            case 0:
                SecretMediaViewer secretMediaViewer = ((v01) this.f41762b).d;
                secretMediaViewer.Y.f41451k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Y.invalidate();
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = ((v01) this.f41762b).d;
                secretMediaViewer2.Y.f41451k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Y.invalidate();
                return;
            case 2:
                ((SecretMediaViewer) ((org.telegram.ui.Components.sl0) this.f41762b).f30331b).Y.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                h11 h11Var = (h11) this.f41762b;
                h11Var.f37627w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (h11Var.S) {
                    h11Var.N.invalidate();
                    return;
                }
                return;
            case 4:
                ((x11) this.f41762b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                y11 y11Var = (y11) this.f41762b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var.f43537r = floatValue;
                View view = y11Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                kg.x xVar = y11Var.d;
                if (xVar != null) {
                    xVar.invalidate();
                    return;
                }
                return;
            case 6:
                c31 c31Var = (c31) this.f41762b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c31Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c31Var.f36178w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                s71 s71Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.gr.f26524g.getInterpolation(c31Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float s10 = org.telegram.messenger.i0.s(c31Var.L, i10, itemsCount, 4.0f);
                    s71Var.getChildAt(i10).setTranslationY((1.0f - s10) * org.telegram.messenger.i0.L(-12.0f));
                    s71Var.getChildAt(i10).setAlpha(s10);
                }
                return;
            case 7:
                c51 c51Var = (c51) this.f41762b;
                c51Var.getClass();
                c51Var.l0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                c61 c61Var = (c61) this.f41762b;
                c61Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c61Var.e.setAlpha(1.0f - floatValue3);
                bg.i iVar = c61Var.f36206b;
                iVar.f2748z0.f5928f = floatValue3;
                c61Var.f36207c.invalidate();
                iVar.invalidate();
                return;
            case 9:
                k91 k91Var = (k91) this.f41762b;
                k91Var.getClass();
                k91Var.f38756p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k91Var.f38778y0.invalidate();
                k91Var.D0.invalidate();
                k91Var.S1.setAlpha(k91Var.f38756p1);
                k91Var.R1.invalidate();
                k91Var.a1();
                return;
            case 10:
                k91 k91Var2 = ((z81) this.f41762b).f43849a;
                k91Var2.f38756p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k91Var2.f38778y0.invalidate();
                k91Var2.D0.invalidate();
                k91Var2.S1.setAlpha(k91Var2.f38756p1);
                k91Var2.R1.invalidate();
                k91Var2.a1();
                return;
            case 11:
                ca1 ca1Var = (ca1) this.f41762b;
                ca1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = ca1Var.f36270a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(ca1Var.f36270a.getChildAt(i11));
                    int i12 = ca1Var.d.e;
                    if (R >= i12 && i12 > 0) {
                        ca1Var.f36270a.getChildAt(i11).setAlpha(ca1Var.E);
                    } else {
                        ca1Var.f36270a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 12:
                ha1 ha1Var = (ha1) this.f41762b;
                ha1Var.getClass();
                ha1Var.f37770b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ha1Var.invalidate();
                return;
            case 13:
                nb1 nb1Var = (nb1) this.f41762b;
                nb1Var.getClass();
                nb1Var.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 14:
                kb1 kb1Var = (kb1) this.f41762b;
                kb1Var.getClass();
                kb1Var.f38797j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kb1Var.m0();
                return;
            case 15:
                lb1 lb1Var = (lb1) this.f41762b;
                lb1Var.getClass();
                lb1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                zd1 zd1Var = (zd1) this.f41762b;
                zd1Var.getClass();
                zd1Var.f43980y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zd1Var.F();
                return;
        }
    }
}
