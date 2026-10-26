package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class v11 implements ValueAnimator.AnimatorUpdateListener {
    public final int f44573a;
    public final Object f44574b;

    public v11(Object obj, int i10) {
        this.f44573a = i10;
        this.f44574b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44573a) {
            case 0:
                b21 b21Var = (b21) this.f44574b;
                b21Var.f37964y = AndroidUtilities.lerp(b21Var.E, valueAnimator.getAnimatedFraction());
                b21Var.h.setTextColor(i0.a.f(b21Var.f37964y, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23767z6, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23597q6, false)));
                return;
            case 1:
                SecretMediaViewer secretMediaViewer = ((r31) this.f44574b).d;
                secretMediaViewer.f36152a0.f38170k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.f36152a0.invalidate();
                return;
            case 2:
                SecretMediaViewer secretMediaViewer2 = ((r31) this.f44574b).d;
                secretMediaViewer2.f36152a0.f38170k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.f36152a0.invalidate();
                return;
            case 3:
                ((SecretMediaViewer) ((org.telegram.ui.Components.ln0) this.f44574b).f30234b).f36152a0.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 4:
                c41 c41Var = (c41) this.f44574b;
                c41Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (c41Var.S) {
                    c41Var.N.invalidate();
                    return;
                }
                return;
            case 5:
                ((s41) this.f44574b).e.U0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 6:
                r51 r51Var = (r51) this.f44574b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r51Var.f43004r = floatValue;
                View view = r51Var.e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                org.telegram.ui.Components.gh0 gh0Var = r51Var.d;
                if (gh0Var != null) {
                    gh0Var.invalidate();
                    return;
                }
                return;
            case 7:
                y51 y51Var = (y51) this.f44574b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y51Var.L = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = y51Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.L;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.ds.f27587g.getInterpolation(y51Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(y51Var.L, i10, itemsCount, 4.0f);
                    k1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    k1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 8:
                d81 d81Var = (d81) this.f44574b;
                d81Var.getClass();
                d81Var.k0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 9:
                g91 g91Var = (g91) this.f44574b;
                g91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g91Var.e.setAlpha(1.0f - floatValue3);
                kg.h hVar = g91Var.f39572b;
                hVar.f16627z0.f18484f = floatValue3;
                g91Var.f39573c.invalidate();
                hVar.invalidate();
                return;
            case 10:
                tc1 tc1Var = (tc1) this.f44574b;
                tc1Var.getClass();
                tc1Var.f43780p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tc1Var.f43802y0.invalidate();
                tc1Var.D0.invalidate();
                tc1Var.S1.setAlpha(tc1Var.f43780p1);
                tc1Var.R1.invalidate();
                tc1Var.W0();
                return;
            case 11:
                tc1 tc1Var2 = ((hc1) this.f44574b).f39982a;
                tc1Var2.f43780p1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tc1Var2.f43802y0.invalidate();
                tc1Var2.D0.invalidate();
                tc1Var2.S1.setAlpha(tc1Var2.f43780p1);
                tc1Var2.R1.invalidate();
                tc1Var2.W0();
                return;
            case 12:
                pd1 pd1Var = (pd1) this.f44574b;
                pd1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = pd1Var.f42471a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(pd1Var.f42471a.getChildAt(i11));
                    int i12 = pd1Var.d.e;
                    if (R >= i12 && i12 > 0) {
                        pd1Var.f42471a.getChildAt(i11).setAlpha(pd1Var.E);
                    } else {
                        pd1Var.f42471a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 13:
                ud1 ud1Var = (ud1) this.f44574b;
                ud1Var.getClass();
                ud1Var.f44114c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ud1Var.invalidate();
                return;
            case 14:
                af1 af1Var = (af1) this.f44574b;
                af1Var.getClass();
                af1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                xe1 xe1Var = (xe1) this.f44574b;
                xe1Var.getClass();
                xe1Var.f45758j5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xe1Var.e0();
                return;
            case 16:
                ye1 ye1Var = (ye1) this.f44574b;
                ye1Var.getClass();
                ye1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ph1 ph1Var = (ph1) this.f44574b;
                ph1Var.getClass();
                ph1Var.f42555y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ph1Var.F();
                return;
        }
    }
}
