package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class y11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f44258a;
    public final Object f44259b;

    public y11(Object obj, int i10) {
        this.f44258a = i10;
        this.f44259b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44258a) {
            case 0:
                a21 a21Var = (a21) this.f44259b;
                a21Var.f35860y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a21Var.a();
                return;
            case 1:
                n21 n21Var = (n21) this.f44259b;
                n21Var.f40106y = AndroidUtilities.lerp(n21Var.E, valueAnimator.getAnimatedFraction());
                n21Var.h.setTextColor(i0.a.d(n21Var.f40106y, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21203z6, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q6, false)));
                n21Var.f40102r.setAlpha((n21Var.f40106y / 2.0f) + 0.5f);
                return;
            case 2:
                ((e31) this.f44259b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                d31 d31Var = (d31) this.f44259b;
                d31Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d31Var.O.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = ((z41) this.f44259b).d;
                secretMediaViewer.f34451a0.f40938k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f34451a0.invalidate();
                return;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((z41) this.f44259b).d;
                secretMediaViewer2.f34451a0.f40938k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f34451a0.invalidate();
                return;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.ln0) this.f44259b).f28432b).f34451a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                k51 k51Var = (k51) this.f44259b;
                k51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (k51Var.S) {
                    k51Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                ((a61) this.f44259b).f35899e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                z61 z61Var = (z61) this.f44259b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z61Var.f44542r = floatValue;
                View view = z61Var.f44539e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.lh0 lh0Var = z61Var.d;
                if (lh0Var != null) {
                    lh0Var.invalidate();
                    return;
                }
                return;
            case 10:
                g71 g71Var = (g71) this.f44259b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g71Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g71Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.is.f27444g.getInterpolation(g71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(g71Var.L, i10, itemsCount, 4.0f);
                    j1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    j1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 11:
                i91.a0((i91) this.f44259b, valueAnimator);
                return;
            case 12:
                la1 la1Var = (la1) this.f44259b;
                la1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                la1Var.f39535e.setAlpha(1.0f - floatValue3);
                ig.g gVar = la1Var.f39533b;
                gVar.f12201z0.f14862f = floatValue3;
                la1Var.f39534c.invalidate();
                gVar.invalidate();
                return;
            case 13:
                xd1 xd1Var = (xd1) this.f44259b;
                xd1Var.getClass();
                xd1Var.f44023o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd1Var.f44044x0.invalidate();
                xd1Var.C0.invalidate();
                xd1Var.R1.setAlpha(xd1Var.f44023o1);
                xd1Var.Q1.invalidate();
                xd1Var.V0();
                return;
            case 14:
                xd1 xd1Var2 = ((ld1) this.f44259b).f39590a;
                xd1Var2.f44023o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd1Var2.f44044x0.invalidate();
                xd1Var2.C0.invalidate();
                xd1Var2.R1.setAlpha(xd1Var2.f44023o1);
                xd1Var2.Q1.invalidate();
                xd1Var2.V0();
                return;
            case 15:
                ue1 ue1Var = (ue1) this.f44259b;
                ue1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = ue1Var.f42456a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(ue1Var.f42456a.getChildAt(i11));
                    int i12 = ue1Var.d.f41446e;
                    if (R >= i12 && i12 > 0) {
                        ue1Var.f42456a.getChildAt(i11).setAlpha(ue1Var.E);
                    } else {
                        ue1Var.f42456a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 16:
                ze1 ze1Var = (ze1) this.f44259b;
                ze1Var.getClass();
                ze1Var.f44622c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ze1Var.invalidate();
                return;
            case 17:
                fg1 fg1Var = (fg1) this.f44259b;
                fg1Var.getClass();
                fg1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                cg1 cg1Var = (cg1) this.f44259b;
                cg1Var.getClass();
                cg1Var.f36710j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cg1Var.f0();
                return;
            case 19:
                dg1 dg1Var = (dg1) this.f44259b;
                dg1Var.getClass();
                dg1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                wi1 wi1Var = (wi1) this.f44259b;
                wi1Var.getClass();
                wi1Var.f43716y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi1Var.F();
                return;
        }
    }
}
