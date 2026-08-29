package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class w01 implements ValueAnimator.AnimatorUpdateListener {
    public final int f43808a;
    public final Object f43809b;

    public w01(Object obj, int i10) {
        this.f43808a = i10;
        this.f43809b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f43808a) {
            case 0:
                y01 y01Var = (y01) this.f43809b;
                y01Var.f44691y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y01Var.a();
                return;
            case 1:
                l11 l11Var = (l11) this.f43809b;
                l11Var.A = AndroidUtilities.lerp(l11Var.B, valueAnimator.getAnimatedFraction());
                l11Var.h.setTextColor(i0.a.d(l11Var.A, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23450z6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false)));
                l11Var.f40059r.setAlpha((l11Var.A / 2.0f) + 0.5f);
                return;
            case 2:
                ((a21) this.f43809b).h.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                z11 z11Var = (z11) this.f43809b;
                z11Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z11Var.K.invalidate();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = ((u31) this.f43809b).d;
                secretMediaViewer.W.f40012g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer.W.invalidate();
                return;
            case 5:
                SecretMediaViewer secretMediaViewer2 = ((u31) this.f43809b).d;
                secretMediaViewer2.W.f40012g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                secretMediaViewer2.W.invalidate();
                return;
            case 6:
                ((SecretMediaViewer) ((org.telegram.ui.Components.cm0) this.f43809b).f27510b).W.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                f41 f41Var = (f41) this.f43809b;
                f41Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (f41Var.O) {
                    f41Var.J.invalidate();
                    return;
                }
                return;
            case 8:
                ((t41) this.f43809b).f42550e.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                s51 s51Var = (s51) this.f43809b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s51Var.f42277r = floatValue;
                View view = s51Var.f42274e;
                if (view != null) {
                    view.setAlpha(floatValue);
                    return;
                }
                cg.y yVar = s51Var.d;
                if (yVar != null) {
                    yVar.invalidate();
                    return;
                }
                return;
            case 10:
                z51 z51Var = (z51) this.f43809b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z51Var.H = floatValue2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = z51Var.v;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(floatValue2);
                org.telegram.ui.ActionBar.k1 k1Var = actionBarPopupWindow$ActionBarPopupWindowLayout.H;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.jr.f29801g.getInterpolation(z51Var.H));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(z51Var.H, i10, itemsCount, 4.0f);
                    k1Var.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    k1Var.getChildAt(i10).setAlpha(cascade);
                }
                return;
            case 11:
                b81.Z((b81) this.f43809b, valueAnimator);
                return;
            case 12:
                d91 d91Var = (d91) this.f43809b;
                d91Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d91Var.f37427e.setAlpha(1.0f - floatValue3);
                tf.g gVar = d91Var.f37425b;
                gVar.f48286v0.f49593f = floatValue3;
                d91Var.f37426c.invalidate();
                gVar.invalidate();
                return;
            case 13:
                qc1 qc1Var = (qc1) this.f43809b;
                qc1Var.getClass();
                qc1Var.f41654k1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qc1Var.f41672t0.invalidate();
                qc1Var.f41685y0.invalidate();
                qc1Var.N1.setAlpha(qc1Var.f41654k1);
                qc1Var.M1.invalidate();
                qc1Var.V0();
                return;
            case 14:
                qc1 qc1Var2 = ((ec1) this.f43809b).f37790a;
                qc1Var2.f41654k1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qc1Var2.f41672t0.invalidate();
                qc1Var2.f41685y0.invalidate();
                qc1Var2.N1.setAlpha(qc1Var2.f41654k1);
                qc1Var2.M1.invalidate();
                qc1Var2.V0();
                return;
            case 15:
                md1 md1Var = (md1) this.f43809b;
                md1Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int childCount = md1Var.f40529a.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    int R = RecyclerView.R(md1Var.f40529a.getChildAt(i11));
                    int i12 = md1Var.d.f39517e;
                    if (R >= i12 && i12 > 0) {
                        md1Var.f40529a.getChildAt(i11).setAlpha(md1Var.A);
                    } else {
                        md1Var.f40529a.getChildAt(i11).setAlpha(1.0f);
                    }
                }
                return;
            case 16:
                rd1 rd1Var = (rd1) this.f43809b;
                rd1Var.getClass();
                rd1Var.f42077c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rd1Var.invalidate();
                return;
            case 17:
                ze1 ze1Var = (ze1) this.f43809b;
                ze1Var.getClass();
                ze1Var.S0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                we1 we1Var = (we1) this.f43809b;
                we1Var.getClass();
                we1Var.f43960b5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                we1Var.f0();
                return;
            case 19:
                xe1 xe1Var = (xe1) this.f43809b;
                xe1Var.getClass();
                xe1Var.setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                oh1 oh1Var = (oh1) this.f43809b;
                oh1Var.getClass();
                oh1Var.f41172u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oh1Var.G();
                return;
        }
    }
}
