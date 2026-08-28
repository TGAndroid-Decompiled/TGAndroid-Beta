package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class v01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43352a;
    public final Object f43353b;

    public v01(Object obj, int i9) {
        this.f43352a = i9;
        this.f43353b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43352a) {
            case 0:
                x01 x01Var = (x01) this.f43353b;
                x01Var.f44306y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x01Var.a();
                return;
            case 1:
                k11 k11Var = (k11) this.f43353b;
                k11Var.A = AndroidUtilities.lerp(k11Var.B, valueAnimator.getAnimatedFraction());
                k11Var.h.setTextColor(i0.a.d(k11Var.A, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23386z6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23229q6, false)));
                k11Var.f39671r.setAlpha((k11Var.A / 2.0f) + 0.5f);
                return;
            case 2:
                ((z11) this.f43353b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                y11 y11Var = (y11) this.f43353b;
                y11Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y11Var.K.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = ((s31) this.f43353b).d;
                secretMediaViewer.W.f40524g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.W.invalidate();
                return;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((s31) this.f43353b).d;
                secretMediaViewer2.W.f40524g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.W.invalidate();
                return;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.pl0) this.f43353b).f31689b).W.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                d41 d41Var = (d41) this.f43353b;
                d41Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (d41Var.O) {
                    d41Var.J.invalidate();
                    return;
                }
                return;
            case 8:
                ((r41) this.f43353b).f42269e.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                q51 q51Var = (q51) this.f43353b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q51Var.f41688r = floatValue;
                View view = q51Var.f41685e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.tf0 tf0Var = q51Var.d;
                if (tf0Var != null) {
                    tf0Var.invalidate();
                    return;
                }
                return;
            case 10:
                x51 x51Var = (x51) this.f43353b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x51Var.H = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = x51Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.H;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.gr.f28845g.getInterpolation(x51Var.H));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i9 = 0; i9 < itemsCount; i9++) {
                    float cascade = AndroidUtilities.cascade(x51Var.H, i9, itemsCount, 4.0f);
                    k1Var.getChildAt(i9).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    k1Var.getChildAt(i9).setAlpha(cascade);
                }
                return;
            case 11:
                z71.Y((z71) this.f43353b, valueAnimator);
                return;
            case 12:
                c91 c91Var = (c91) this.f43353b;
                c91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c91Var.f37130e.setAlpha(1.0f - floatValue3);
                qf.g gVar = c91Var.f37128b;
                gVar.f46227v0.f47567f = floatValue3;
                c91Var.f37129c.invalidate();
                gVar.invalidate();
                return;
            case 13:
                oc1 oc1Var = (oc1) this.f43353b;
                oc1Var.getClass();
                oc1Var.f41087k1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oc1Var.f41105t0.invalidate();
                oc1Var.f41118y0.invalidate();
                oc1Var.N1.setAlpha(oc1Var.f41087k1);
                oc1Var.M1.invalidate();
                oc1Var.V0();
                return;
            case 14:
                oc1 oc1Var2 = ((cc1) this.f43353b).f37167a;
                oc1Var2.f41087k1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oc1Var2.f41105t0.invalidate();
                oc1Var2.f41118y0.invalidate();
                oc1Var2.N1.setAlpha(oc1Var2.f41087k1);
                oc1Var2.M1.invalidate();
                oc1Var2.V0();
                return;
            case 15:
                kd1 kd1Var = (kd1) this.f43353b;
                kd1Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = kd1Var.f39808a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    int R = RecyclerView.R(kd1Var.f39808a.getChildAt(i10));
                    int i11 = kd1Var.d.f38756e;
                    if (R >= i11 && i11 > 0) {
                        kd1Var.f39808a.getChildAt(i10).setAlpha(kd1Var.A);
                    } else {
                        kd1Var.f39808a.getChildAt(i10).setAlpha(1.0f);
                    }
                }
                return;
            case 16:
                pd1 pd1Var = (pd1) this.f43353b;
                pd1Var.getClass();
                pd1Var.f41495c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pd1Var.invalidate();
                return;
            case 17:
                we1 we1Var = (we1) this.f43353b;
                we1Var.getClass();
                we1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                se1 se1Var = (se1) this.f43353b;
                se1Var.getClass();
                se1Var.f42677b5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                se1Var.e0();
                return;
            case 19:
                ue1 ue1Var = (ue1) this.f43353b;
                ue1Var.getClass();
                ue1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                mh1 mh1Var = (mh1) this.f43353b;
                mh1Var.getClass();
                mh1Var.f40464u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mh1Var.G();
                return;
        }
    }
}
