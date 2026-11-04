package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class wm0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f51572a;
    public final PhotoViewer f51573b;

    public wm0(PhotoViewer photoViewer, int i3) {
        this.f51572a = i3;
        this.f51573b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = this.f51572a;
        PhotoViewer photoViewer = this.f51573b;
        switch (i3) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.V8;
                photoViewer.getClass();
                photoViewer.f41456j3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.D1.f31808b.f53511a;
                float T1 = org.telegram.messenger.g0.T1(photoViewer.f41388b6, photoViewer.f41426f6, photoViewer.f41483m6);
                float T12 = org.telegram.messenger.g0.T1(photoViewer.Y5, photoViewer.f41406d6, photoViewer.f41483m6);
                float T13 = org.telegram.messenger.g0.T1(photoViewer.Z5, photoViewer.f41416e6, photoViewer.f41483m6);
                cropAreaView.f31388o0 = 0.0f;
                cropAreaView.f31389p0 = T1;
                cropAreaView.f31390q0 = T12;
                cropAreaView.f31392r0 = T13;
                cropAreaView.invalidate();
                return;
            case 2:
                photoViewer.M1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                photoViewer.M1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.V8;
                photoViewer.getClass();
                photoViewer.f41492n6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.V8;
                photoViewer.v3();
                return;
            case 6:
                photoViewer.M1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                photoViewer.M1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                lp0 lp0Var = photoViewer.M1;
                if (lp0Var != null) {
                    lp0Var.N0.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.V8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.f41378a6 = floatValue;
                lp0 lp0Var2 = photoViewer.M1;
                if (lp0Var2 != null && Math.abs(floatValue - lp0Var2.H1) > 0.1f) {
                    lp0Var2.H1 = floatValue;
                    lp0Var2.v0(lp0Var2.f55987s0, lp0Var2.f55989t0, lp0Var2.f55991u0, lp0Var2.f55997x0, lp0Var2.f55999y0);
                }
                photoViewer.f41420f0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.V8;
                photoViewer.f41492n6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.I1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.V8;
                photoViewer.getClass();
                photoViewer.f41492n6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.V8;
                photoViewer.getClass();
                photoViewer.f41492n6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.X0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.V8;
                photoViewer.getClass();
                photoViewer.f41492n6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
