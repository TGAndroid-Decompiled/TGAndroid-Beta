package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class wq0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45542a;
    public final PhotoViewer f45543b;

    public wq0(PhotoViewer photoViewer, int i10) {
        this.f45542a = i10;
        this.f45543b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f45542a;
        PhotoViewer photoViewer = this.f45543b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f35684i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.f31285b.f18843a;
                float lerp = AndroidUtilities.lerp(photoViewer.f35614a6, photoViewer.f35652e6, photoViewer.f35712l6);
                float lerp2 = AndroidUtilities.lerp(photoViewer.X5, photoViewer.f35634c6, photoViewer.f35712l6);
                float lerp3 = AndroidUtilities.lerp(photoViewer.Y5, photoViewer.f35643d6, photoViewer.f35712l6);
                cropAreaView.f26137n0 = 0.0f;
                cropAreaView.f26138o0 = lerp;
                cropAreaView.f26139p0 = lerp2;
                cropAreaView.f26140q0 = lerp3;
                cropAreaView.invalidate();
                return;
            case 2:
                photoViewer.L1.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f35720m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.u3();
                return;
            case 6:
                photoViewer.L1.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                nt0 nt0Var = photoViewer.L1;
                if (nt0Var != null) {
                    nt0Var.S0.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                nt0 nt0Var2 = photoViewer.L1;
                if (nt0Var2 != null && Math.abs(floatValue - nt0Var2.M1) > 0.1f) {
                    nt0Var2.M1 = floatValue;
                    nt0Var2.u0(nt0Var2.f48364x0, nt0Var2.f48366y0, nt0Var2.f48368z0, nt0Var2.C0, nt0Var2.D0);
                }
                photoViewer.f35646e0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer.f35720m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.H1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f35720m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f35720m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f35720m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
