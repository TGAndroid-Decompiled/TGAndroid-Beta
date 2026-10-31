package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class u01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41982a;
    public final Object f41983b;

    public u01(Object obj, int i10) {
        this.f41982a = i10;
        this.f41983b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41982a) {
            case 0:
                SecretMediaViewer secretMediaViewer = ((v01) this.f41983b).d;
                secretMediaViewer.Y.f41928k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Y.invalidate();
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = ((v01) this.f41983b).d;
                secretMediaViewer2.Y.f41928k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Y.invalidate();
                return;
            case 2:
                ((SecretMediaViewer) ((org.telegram.ui.Components.rl0) this.f41983b).f29952b).Y.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                i11 i11Var = (i11) this.f41983b;
                i11Var.f38094w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (i11Var.S) {
                    i11Var.N.invalidate();
                    return;
                }
                return;
            case 4:
                ((z11) this.f41983b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                a21 a21Var = (a21) this.f41983b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a21Var.f35532r = floatValue;
                View view = a21Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                kg.x xVar = a21Var.d;
                if (xVar != null) {
                    xVar.invalidate();
                    return;
                }
                return;
            case 6:
                e31 e31Var = (e31) this.f41983b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e31Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e31Var.f36910w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                u71 u71Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.gr.f26496g.getInterpolation(e31Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float s10 = org.telegram.messenger.i0.s(e31Var.L, i10, itemsCount, 4.0f);
                    u71Var.getChildAt(i10).setTranslationY((1.0f - s10) * org.telegram.messenger.i0.L(-12.0f));
                    u71Var.getChildAt(i10).setAlpha(s10);
                }
                return;
            case 7:
                e51 e51Var = (e51) this.f41983b;
                e51Var.getClass();
                e51Var.k0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                e61 e61Var = (e61) this.f41983b;
                e61Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e61Var.e.setAlpha(1.0f - floatValue3);
                bg.i iVar = e61Var.f36960b;
                iVar.f2748z0.f5928f = floatValue3;
                e61Var.f36961c.invalidate();
                iVar.invalidate();
                return;
            case 9:
                m91 m91Var = (m91) this.f41983b;
                m91Var.getClass();
                m91Var.f39581p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m91Var.f39603y0.invalidate();
                m91Var.D0.invalidate();
                m91Var.S1.setAlpha(m91Var.f39581p1);
                m91Var.R1.invalidate();
                m91Var.Z0();
                return;
            case 10:
                m91 m91Var2 = ((b91) this.f41983b).f36142a;
                m91Var2.f39581p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m91Var2.f39603y0.invalidate();
                m91Var2.D0.invalidate();
                m91Var2.S1.setAlpha(m91Var2.f39581p1);
                m91Var2.R1.invalidate();
                m91Var2.Z0();
                return;
            case 11:
                ea1 ea1Var = (ea1) this.f41983b;
                ea1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = ea1Var.f36999a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(ea1Var.f36999a.getChildAt(i11));
                    int i12 = ea1Var.d.e;
                    if (R >= i12 && i12 > 0) {
                        ea1Var.f36999a.getChildAt(i11).setAlpha(ea1Var.E);
                    } else {
                        ea1Var.f36999a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 12:
                ja1 ja1Var = (ja1) this.f41983b;
                ja1Var.getClass();
                ja1Var.f38481b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ja1Var.invalidate();
                return;
            case 13:
                pb1 pb1Var = (pb1) this.f41983b;
                pb1Var.getClass();
                pb1Var.V0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 14:
                mb1 mb1Var = (mb1) this.f41983b;
                mb1Var.getClass();
                mb1Var.f39635j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mb1Var.m0();
                return;
            case 15:
                nb1 nb1Var = (nb1) this.f41983b;
                nb1Var.getClass();
                nb1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                be1 be1Var = (be1) this.f41983b;
                be1Var.getClass();
                be1Var.f36241y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                be1Var.F();
                return;
        }
    }
}
