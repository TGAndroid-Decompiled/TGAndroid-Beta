package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class sq0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41295a;
    public final PhotoViewer f41296b;

    public sq0(PhotoViewer photoViewer, int i10) {
        this.f41295a = i10;
        this.f41296b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f41295a;
        PhotoViewer photoViewer = this.f41296b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.getClass();
                photoViewer.f34270f3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.f34450z1.f25240b.f51201a;
                float lerp = AndroidUtilities.lerp(photoViewer.X5, photoViewer.f34236b6, photoViewer.f34300i6);
                float lerp2 = AndroidUtilities.lerp(photoViewer.U5, photoViewer.Z5, photoViewer.f34300i6);
                float lerp3 = AndroidUtilities.lerp(photoViewer.V5, photoViewer.f34226a6, photoViewer.f34300i6);
                cropAreaView.f24860k0 = 0.0f;
                cropAreaView.f24861l0 = lerp;
                cropAreaView.m0 = lerp2;
                cropAreaView.f24863n0 = lerp3;
                cropAreaView.invalidate();
                return;
            case 2:
                photoViewer.I1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                photoViewer.I1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                photoViewer.getClass();
                photoViewer.f34309j6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.Q8;
                photoViewer.s3();
                return;
            case 6:
                photoViewer.I1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                photoViewer.I1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                mt0 mt0Var = photoViewer.I1;
                if (mt0Var != null) {
                    mt0Var.f5101a1.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.Q8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.W5 = floatValue;
                mt0 mt0Var2 = photoViewer.I1;
                if (mt0Var2 != null && Math.abs(floatValue - mt0Var2.U1) > 0.1f) {
                    mt0Var2.U1 = floatValue;
                    mt0Var2.v0(mt0Var2.F0, mt0Var2.G0, mt0Var2.H0, mt0Var2.K0, mt0Var2.L0);
                }
                photoViewer.f34230b0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.Q8;
                photoViewer.getClass();
                photoViewer.f34309j6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.F1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.Q8;
                photoViewer.getClass();
                photoViewer.f34309j6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.Q8;
                photoViewer.getClass();
                photoViewer.f34309j6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.T0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.Q8;
                photoViewer.getClass();
                photoViewer.f34309j6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
