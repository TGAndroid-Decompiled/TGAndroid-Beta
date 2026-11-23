package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rf implements ValueAnimator.AnimatorUpdateListener {
    public final int f51599a;
    public final float f51600b;
    public final Object f51601c;

    public rf(Object obj, float f10, int i7) {
        this.f51599a = i7;
        this.f51601c = obj;
        this.f51600b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        boolean z10;
        switch (this.f51599a) {
            case 0:
                bn bnVar = (bn) this.f51601c;
                bnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bnVar.X8 = floatValue;
                bnVar.f45927b9 = floatValue / this.f51600b;
                View view = bnVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f51601c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    View view2 = (View) arrayList.get(i10);
                    if (view2 != null) {
                        view2.setTranslationY(this.f51600b * floatValue2);
                    }
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f51601c;
                org.telegram.ui.Components.fe feVar = chatActivityEnterView.R0;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Components.gf gfVar = chatActivityEnterView.F0;
                if (gfVar != null) {
                    gfVar.setAlpha(1.0f - floatValue3);
                }
                chatActivityEnterView.P4.set(feVar, Float.valueOf(org.telegram.messenger.g0.T1(1.0f, 0.6f, floatValue3)));
                chatActivityEnterView.R4.set(feVar, Float.valueOf((1.0f - floatValue3) * this.f51600b));
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) ((org.telegram.ui.ActionBar.s0) this.f51601c).f29942c;
                org.telegram.ui.Components.ce ceVar = chatActivityEnterView2.P4;
                org.telegram.ui.Components.fe feVar2 = chatActivityEnterView2.R0;
                ceVar.set(feVar2, Float.valueOf(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue4)));
                chatActivityEnterView2.R4.set(feVar2, Float.valueOf(this.f51600b * floatValue4));
                return;
            case 4:
                ((org.telegram.ui.Components.tn) this.f51601c).F.setTranslationY(org.telegram.messenger.g0.T1(this.f51600b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 5:
                ((qr0) this.f51601c).S.setTranslationY(org.telegram.messenger.g0.T1(this.f51600b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 6:
                rx0 rx0Var = (rx0) this.f51601c;
                rx0Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float T1 = org.telegram.messenger.g0.T1(0.0f, this.f51600b, floatValue5);
                rx0Var.f51818a.setTranslationX(T1);
                rx0Var.f51819b.setTranslationX(T1);
                ImageView imageView = rx0Var.f51820c;
                imageView.setTranslationX(T1);
                org.telegram.ui.Components.op opVar = rx0Var.f51822f;
                if (org.telegram.messenger.hd.f24408a0) {
                    i7 = org.telegram.messenger.g0.L(32.0f);
                } else {
                    i7 = -org.telegram.messenger.g0.L(32.0f);
                }
                opVar.setTranslationX(i7 + T1);
                float f10 = (floatValue5 * 0.5f) + 0.5f;
                opVar.setScaleX(f10);
                opVar.setScaleY(f10);
                opVar.setAlpha(floatValue5);
                float f11 = 1.0f - floatValue5;
                float f12 = (f11 * 0.5f) + 0.5f;
                imageView.setScaleX(f12);
                imageView.setScaleY(f12);
                imageView.setAlpha(f11);
                return;
            case 7:
                org.telegram.ui.Wallet.m4 m4Var = (org.telegram.ui.Wallet.m4) this.f51601c;
                m4Var.getClass();
                m4Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f51600b) % 360.0f;
                m4Var.f44525a.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.e9 e9Var = (org.telegram.ui.Wallet.e9) this.f51601c;
                e9Var.getClass();
                float floatValue6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e9Var.f44150c = e9Var.c();
                e9Var.d = this.f51600b * floatValue6;
                if (floatValue6 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e9Var.f44155s = z10;
                return;
        }
    }
}
