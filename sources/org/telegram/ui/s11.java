package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class s11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37099a;
    public final Object f37100b;

    public s11(Object obj, int i10) {
        this.f37099a = i10;
        this.f37100b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f37099a) {
            case 0:
                u11 u11Var = (u11) this.f37100b;
                u11Var.f37876y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u11Var.a();
                return;
            case 1:
                h21 h21Var = (h21) this.f37100b;
                h21Var.f33720y = AndroidUtilities.lerp(h21Var.E, valueAnimator.getAnimatedFraction());
                h21Var.h.setTextColor(i0.a.d(h21Var.f33720y, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19189z6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false)));
                h21Var.f33716r.setAlpha((h21Var.f33720y / 2.0f) + 0.5f);
                return;
            case 2:
                ((x21) this.f37100b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                w21 w21Var = (w21) this.f37100b;
                w21Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w21Var.O.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = ((p41) this.f37100b).d;
                secretMediaViewer.f31408a0.f33928k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f31408a0.invalidate();
                return;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((p41) this.f37100b).d;
                secretMediaViewer2.f31408a0.f33928k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f31408a0.invalidate();
                return;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.fm0) this.f37100b).f24009b).f31408a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                a51 a51Var = (a51) this.f37100b;
                a51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (a51Var.S) {
                    a51Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                ((p51) this.f37100b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                o61 o61Var = (o61) this.f37100b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o61Var.f35694r = floatValue;
                View view = o61Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.ig0 ig0Var = o61Var.d;
                if (ig0Var != null) {
                    ig0Var.invalidate();
                    return;
                }
                return;
            case 10:
                v61 v61Var = (v61) this.f37100b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v61Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = v61Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.rr.f27702g.getInterpolation(v61Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(v61Var.L, i10, itemsCount, 4.0f);
                    j1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    j1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 11:
                x81.a0((x81) this.f37100b, valueAnimator);
                return;
            case 12:
                ba1 ba1Var = (ba1) this.f37100b;
                ba1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ba1Var.e.setAlpha(1.0f - floatValue3);
                ig.g gVar = ba1Var.f32035b;
                gVar.f11161z0.f13627f = floatValue3;
                ba1Var.f32036c.invalidate();
                gVar.invalidate();
                return;
            case 13:
                od1 od1Var = (od1) this.f37100b;
                od1Var.getClass();
                od1Var.f35821o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                od1Var.f35842x0.invalidate();
                od1Var.C0.invalidate();
                od1Var.R1.setAlpha(od1Var.f35821o1);
                od1Var.Q1.invalidate();
                od1Var.V0();
                return;
            case 14:
                od1 od1Var2 = ((cd1) this.f37100b).f32316a;
                od1Var2.f35821o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                od1Var2.f35842x0.invalidate();
                od1Var2.C0.invalidate();
                od1Var2.R1.setAlpha(od1Var2.f35821o1);
                od1Var2.Q1.invalidate();
                od1Var2.V0();
                return;
            case 15:
                le1 le1Var = (le1) this.f37100b;
                le1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = le1Var.f34956a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(le1Var.f34956a.getChildAt(i11));
                    int i12 = le1Var.d.e;
                    if (R >= i12 && i12 > 0) {
                        le1Var.f34956a.getChildAt(i11).setAlpha(le1Var.E);
                    } else {
                        le1Var.f34956a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 16:
                qe1 qe1Var = (qe1) this.f37100b;
                qe1Var.getClass();
                qe1Var.f36412c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qe1Var.invalidate();
                return;
            case 17:
                wf1 wf1Var = (wf1) this.f37100b;
                wf1Var.getClass();
                wf1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                tf1 tf1Var = (tf1) this.f37100b;
                tf1Var.getClass();
                tf1Var.f37637f5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tf1Var.f0();
                return;
            case 19:
                uf1 uf1Var = (uf1) this.f37100b;
                uf1Var.getClass();
                uf1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                mi1 mi1Var = (mi1) this.f37100b;
                mi1Var.getClass();
                mi1Var.f35346y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mi1Var.G();
                return;
        }
    }
}
