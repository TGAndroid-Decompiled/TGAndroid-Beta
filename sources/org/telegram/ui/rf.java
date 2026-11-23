package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rf implements ValueAnimator.AnimatorUpdateListener {
    public final int f51714a;
    public final float f51715b;
    public final Object f51716c;

    public rf(Object obj, float f10, int i7) {
        this.f51714a = i7;
        this.f51716c = obj;
        this.f51715b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        boolean z10;
        switch (this.f51714a) {
            case 0:
                bn bnVar = (bn) this.f51716c;
                bnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar.X8 = floatValue;
                bnVar.f46142b9 = floatValue / this.f51715b;
                View view = bnVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f51716c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    View view2 = (View) arrayList.get(i10);
                    if (view2 != null) {
                        view2.setTranslationY(this.f51715b * floatValue2);
                    }
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f51716c;
                org.telegram.ui.Components.ge geVar = chatActivityEnterView.R0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.hf hfVar = chatActivityEnterView.F0;
                if (hfVar != null) {
                    hfVar.setAlpha(1.0f - floatValue3);
                }
                chatActivityEnterView.P4.set(geVar, Float.valueOf(org.telegram.messenger.g0.T1(1.0f, 0.6f, floatValue3)));
                chatActivityEnterView.R4.set(geVar, Float.valueOf((1.0f - floatValue3) * this.f51715b));
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) ((org.telegram.ui.ActionBar.s0) this.f51716c).f30038c;
                org.telegram.ui.Components.de deVar = chatActivityEnterView2.P4;
                org.telegram.ui.Components.ge geVar2 = chatActivityEnterView2.R0;
                deVar.set(geVar2, Float.valueOf(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue4)));
                chatActivityEnterView2.R4.set(geVar2, Float.valueOf(this.f51715b * floatValue4));
                return;
            case 4:
                ((org.telegram.ui.Components.qn) this.f51716c).F.setTranslationY(org.telegram.messenger.g0.T1(this.f51715b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 5:
                ((pr0) this.f51716c).S.setTranslationY(org.telegram.messenger.g0.T1(this.f51715b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 6:
                px0 px0Var = (px0) this.f51716c;
                px0Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float T1 = org.telegram.messenger.g0.T1(0.0f, this.f51715b, floatValue5);
                px0Var.f51165a.setTranslationX(T1);
                px0Var.f51166b.setTranslationX(T1);
                ImageView imageView = px0Var.f51167c;
                imageView.setTranslationX(T1);
                org.telegram.ui.Components.lp lpVar = px0Var.f51169f;
                if (org.telegram.messenger.gd.f24314a0) {
                    i7 = org.telegram.messenger.g0.L(32.0f);
                } else {
                    i7 = -org.telegram.messenger.g0.L(32.0f);
                }
                lpVar.setTranslationX(i7 + T1);
                float f10 = (floatValue5 * 0.5f) + 0.5f;
                lpVar.setScaleX(f10);
                lpVar.setScaleY(f10);
                lpVar.setAlpha(floatValue5);
                float f11 = 1.0f - floatValue5;
                float f12 = (f11 * 0.5f) + 0.5f;
                imageView.setScaleX(f12);
                imageView.setScaleY(f12);
                imageView.setAlpha(f11);
                return;
            case 7:
                org.telegram.ui.Wallet.n4 n4Var = (org.telegram.ui.Wallet.n4) this.f51716c;
                n4Var.getClass();
                n4Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f51715b) % 360.0f;
                n4Var.f44695a.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.f9 f9Var = (org.telegram.ui.Wallet.f9) this.f51716c;
                f9Var.getClass();
                float floatValue6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f9Var.f44313c = f9Var.c();
                f9Var.d = this.f51715b * floatValue6;
                if (floatValue6 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f9Var.f44318s = z10;
                return;
        }
    }
}
