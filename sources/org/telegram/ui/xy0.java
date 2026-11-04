package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class xy0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f52127a;
    public final Object f52128b;

    public xy0(Object obj, int i3) {
        this.f52127a = i3;
        this.f52128b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f52127a) {
            case 0:
                SecretMediaViewer secretMediaViewer = ((yy0) this.f52128b).d;
                secretMediaViewer.Z.f52735l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.Z.invalidate();
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = ((yy0) this.f52128b).d;
                secretMediaViewer2.Z.f52735l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.Z.invalidate();
                return;
            case 2:
                ((SecretMediaViewer) ((org.telegram.ui.Components.rk0) this.f52128b).f37747b).Z.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                iz0 iz0Var = (iz0) this.f52128b;
                iz0Var.f46470w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (iz0Var.T) {
                    iz0Var.O.invalidate();
                    return;
                }
                return;
            case 4:
                ((xz0) this.f52128b).f52134e.V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                yz0 yz0Var = (yz0) this.f52128b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yz0Var.f52471r = floatValue;
                View view = yz0Var.f52468e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                gi.q3 q3Var = yz0Var.d;
                if (q3Var != null) {
                    q3Var.invalidate();
                    return;
                }
                return;
            case 6:
                c11 c11Var = (c11) this.f52128b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c11Var.M = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c11Var.f44198w;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                s51 s51Var = actionBarPopupWindow$ActionBarPopupWindowLayout.M;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.xq.f40453g.getInterpolation(c11Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i3 = 0; i3 < itemsCount; i3++) {
                    float s6 = org.telegram.messenger.g0.s(c11Var.M, i3, itemsCount, 4.0f);
                    s51Var.getChildAt(i3).setTranslationY((1.0f - s6) * org.telegram.messenger.g0.L(-12.0f));
                    s51Var.getChildAt(i3).setAlpha(s6);
                }
                return;
            case 7:
                c31 c31Var = (c31) this.f52128b;
                c31Var.getClass();
                c31Var.l0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                b41 b41Var = (b41) this.f52128b;
                b41Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b41Var.f43920e.setAlpha(1.0f - floatValue3);
                mg.g gVar = b41Var.f43918b;
                gVar.A0.f21106f = floatValue3;
                b41Var.f43919c.invalidate();
                gVar.invalidate();
                return;
            case 9:
                l71 l71Var = (l71) this.f52128b;
                l71Var.getClass();
                l71Var.f47188q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l71Var.f47210z0.invalidate();
                l71Var.E0.invalidate();
                l71Var.T1.setAlpha(l71Var.f47188q1);
                l71Var.S1.invalidate();
                l71Var.a1();
                return;
            case 10:
                l71 l71Var2 = ((a71) this.f52128b).f43680a;
                l71Var2.f47188q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l71Var2.f47210z0.invalidate();
                l71Var2.E0.invalidate();
                l71Var2.T1.setAlpha(l71Var2.f47188q1);
                l71Var2.S1.invalidate();
                l71Var2.a1();
                return;
            case 11:
                d81 d81Var = (d81) this.f52128b;
                d81Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = d81Var.f44593a.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    int R = RecyclerView.R(d81Var.f44593a.getChildAt(i10));
                    int i11 = d81Var.d.f43685e;
                    if (R >= i11 && i11 > 0) {
                        d81Var.f44593a.getChildAt(i10).setAlpha(d81Var.F);
                    } else {
                        d81Var.f44593a.getChildAt(i10).setAlpha(1.0f);
                    }
                }
                return;
            case 12:
                j81 j81Var = (j81) this.f52128b;
                j81Var.getClass();
                j81Var.f46561b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j81Var.invalidate();
                return;
            case 13:
                m91 m91Var = (m91) this.f52128b;
                m91Var.getClass();
                m91Var.W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 14:
                j91 j91Var = (j91) this.f52128b;
                j91Var.getClass();
                j91Var.f46574k5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j91Var.n0();
                return;
            case 15:
                k91 k91Var = (k91) this.f52128b;
                k91Var.getClass();
                k91Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                zb1 zb1Var = (zb1) this.f52128b;
                zb1Var.getClass();
                zb1Var.f52651z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zb1Var.F();
                return;
        }
    }
}
