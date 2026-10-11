package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class x11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43939a;
    public final Object f43940b;

    public x11(Object obj, int i10) {
        this.f43939a = i10;
        this.f43940b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43939a) {
            case 0:
                z11 z11Var = (z11) this.f43940b;
                z11Var.f44561y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z11Var.a();
                return;
            case 1:
                m21 m21Var = (m21) this.f43940b;
                m21Var.f39803y = AndroidUtilities.lerp(m21Var.E, valueAnimator.getAnimatedFraction());
                m21Var.h.setTextColor(i0.a.d(m21Var.f39803y, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21189z6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false)));
                m21Var.f39799r.setAlpha((m21Var.f39803y / 2.0f) + 0.5f);
                return;
            case 2:
                ((d31) this.f43940b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                c31 c31Var = (c31) this.f43940b;
                c31Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c31Var.O.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = ((y41) this.f43940b).d;
                secretMediaViewer.f34441a0.f40621k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f34441a0.invalidate();
                return;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((y41) this.f43940b).d;
                secretMediaViewer2.f34441a0.f40621k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f34441a0.invalidate();
                return;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.mn0) this.f43940b).f28805b).f34441a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                j51 j51Var = (j51) this.f43940b;
                j51Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (j51Var.S) {
                    j51Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                ((z51) this.f43940b).f44588e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                y61 y61Var = (y61) this.f43940b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y61Var.f44268r = floatValue;
                View view = y61Var.f44265e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.mh0 mh0Var = y61Var.d;
                if (mh0Var != null) {
                    mh0Var.invalidate();
                    return;
                }
                return;
            case 10:
                f71 f71Var = (f71) this.f43940b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f71Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f71Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.i1 i1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.is.f27452g.getInterpolation(f71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(f71Var.L, i10, itemsCount, 4.0f);
                    i1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    i1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 11:
                h91.a0((h91) this.f43940b, valueAnimator);
                return;
            case 12:
                ka1 ka1Var = (ka1) this.f43940b;
                ka1Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ka1Var.f39251e.setAlpha(1.0f - floatValue3);
                ig.g gVar = ka1Var.f39249b;
                gVar.f12200z0.f14861f = floatValue3;
                ka1Var.f39250c.invalidate();
                gVar.invalidate();
                return;
            case 13:
                wd1 wd1Var = (wd1) this.f43940b;
                wd1Var.getClass();
                wd1Var.f43367o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wd1Var.f43388x0.invalidate();
                wd1Var.C0.invalidate();
                wd1Var.R1.setAlpha(wd1Var.f43367o1);
                wd1Var.Q1.invalidate();
                wd1Var.V0();
                return;
            case 14:
                wd1 wd1Var2 = ((kd1) this.f43940b).f39306a;
                wd1Var2.f43367o1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wd1Var2.f43388x0.invalidate();
                wd1Var2.C0.invalidate();
                wd1Var2.R1.setAlpha(wd1Var2.f43367o1);
                wd1Var2.Q1.invalidate();
                wd1Var2.V0();
                return;
            case 15:
                te1 te1Var = (te1) this.f43940b;
                te1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = te1Var.f42167a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(te1Var.f42167a.getChildAt(i11));
                    int i12 = te1Var.d.f41162e;
                    if (R >= i12 && i12 > 0) {
                        te1Var.f42167a.getChildAt(i11).setAlpha(te1Var.E);
                    } else {
                        te1Var.f42167a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 16:
                ye1 ye1Var = (ye1) this.f43940b;
                ye1Var.getClass();
                ye1Var.f44348c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ye1Var.invalidate();
                return;
            case 17:
                eg1 eg1Var = (eg1) this.f43940b;
                eg1Var.getClass();
                eg1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                bg1 bg1Var = (bg1) this.f43940b;
                bg1Var.getClass();
                bg1Var.f36383j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bg1Var.f0();
                return;
            case 19:
                cg1 cg1Var = (cg1) this.f43940b;
                cg1Var.getClass();
                cg1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ui1 ui1Var = (ui1) this.f43940b;
                ui1Var.getClass();
                ui1Var.f42623y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui1Var.F();
                return;
        }
    }
}
