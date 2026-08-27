package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class w01 implements ValueAnimator.AnimatorUpdateListener {

    public final int f43559a;

    public final Object f43560b;

    public w01(Object obj, int i10) {
        this.f43559a = i10;
        this.f43560b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43559a) {
            case 0:
                y01 y01Var = (y01) this.f43560b;
                y01Var.f44660y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y01Var.a();
                break;
            case 1:
                j11 j11Var = (j11) this.f43560b;
                j11Var.A = AndroidUtilities.lerp(j11Var.B, valueAnimator.getAnimatedFraction());
                j11Var.h.setTextColor(i0.b.d(j11Var.A, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23441z6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false)));
                j11Var.f39229r.setAlpha((j11Var.A / 2.0f) + 0.5f);
                break;
            case 2:
                ((y11) this.f43560b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                x11 x11Var = (x11) this.f43560b;
                x11Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x11Var.K.invalidate();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = ((r31) this.f43560b).d;
                secretMediaViewer.W.f40924g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.W.invalidate();
                break;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((r31) this.f43560b).d;
                secretMediaViewer2.W.f40924g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.W.invalidate();
                break;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.sl0) this.f43560b).f32482b).W.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 7:
                c41 c41Var = (c41) this.f43560b;
                c41Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (c41Var.O) {
                    c41Var.J.invalidate();
                }
                break;
            case 8:
                ((q41) this.f43560b).f41521e.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 9:
                p51 p51Var = (p51) this.f43560b;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p51Var.f41278r = fFloatValue;
                View view = p51Var.f41275e;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                } else {
                    ag.d0 d0Var = p51Var.d;
                    if (d0Var != null) {
                        d0Var.invalidate();
                    }
                }
                break;
            case 10:
                w51 w51Var = (w51) this.f43560b;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w51Var.H = fFloatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w51Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(fFloatValue2);
                org.telegram.ui.ActionBar.j1 j1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.H;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.er.f28123g.getInterpolation(w51Var.H));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float fCascade = AndroidUtilities.cascade(w51Var.H, i10, itemsCount, 4.0f);
                    j1Var.getChildAt(i10).setTranslationY((1.0f - fCascade) * AndroidUtilities.dp(-12.0f));
                    j1Var.getChildAt(i10).setAlpha(fCascade);
                }
                break;
            case 11:
                x71.Z((x71) this.f43560b, valueAnimator);
                break;
            case 12:
                a91 a91Var = (a91) this.f43560b;
                a91Var.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a91Var.f36466e.setAlpha(1.0f - fFloatValue3);
                rf.g gVar = a91Var.f36464b;
                gVar.f46986v0.f48216f = fFloatValue3;
                a91Var.f36465c.invalidate();
                gVar.invalidate();
                break;
            case 13:
                nc1 nc1Var = (nc1) this.f43560b;
                nc1Var.getClass();
                nc1Var.f40766k1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nc1Var.f40784t0.invalidate();
                nc1Var.f40797y0.invalidate();
                nc1Var.N1.setAlpha(nc1Var.f40766k1);
                nc1Var.M1.invalidate();
                nc1Var.V0();
                break;
            case 14:
                nc1 nc1Var2 = ((bc1) this.f43560b).f36778a;
                nc1Var2.f40766k1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nc1Var2.f40784t0.invalidate();
                nc1Var2.f40797y0.invalidate();
                nc1Var2.N1.setAlpha(nc1Var2.f40766k1);
                nc1Var2.M1.invalidate();
                nc1Var2.V0();
                break;
            case 15:
                ld1 ld1Var = (ld1) this.f43560b;
                ld1Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = ld1Var.f40055a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int iR = RecyclerView.R(ld1Var.f40055a.getChildAt(i11));
                    int i12 = ld1Var.d.f39062e;
                    if (iR < i12 || i12 <= 0) {
                        ld1Var.f40055a.getChildAt(i11).setAlpha(1.0f);
                    } else {
                        ld1Var.f40055a.getChildAt(i11).setAlpha(ld1Var.A);
                    }
                }
                break;
            case 16:
                qd1 qd1Var = (qd1) this.f43560b;
                qd1Var.getClass();
                qd1Var.f41640c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qd1Var.invalidate();
                break;
            case 17:
                we1 we1Var = (we1) this.f43560b;
                we1Var.getClass();
                we1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                te1 te1Var = (te1) this.f43560b;
                te1Var.getClass();
                te1Var.f42927b5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                te1Var.f0();
                break;
            case 19:
                ue1 ue1Var = (ue1) this.f43560b;
                ue1Var.getClass();
                ue1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                lh1 lh1Var = (lh1) this.f43560b;
                lh1Var.getClass();
                lh1Var.f40125u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lh1Var.G();
                break;
        }
    }
}
