package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class rq0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41210a;
    public final PhotoViewer f41211b;

    public rq0(PhotoViewer photoViewer, int i10) {
        this.f41210a = i10;
        this.f41211b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f41210a;
        PhotoViewer photoViewer = this.f41211b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33620i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.f29903b.f16980a;
                float lerp = AndroidUtilities.lerp(photoViewer.f33550a6, photoViewer.f33588e6, photoViewer.f33648l6);
                float lerp2 = AndroidUtilities.lerp(photoViewer.X5, photoViewer.f33570c6, photoViewer.f33648l6);
                float lerp3 = AndroidUtilities.lerp(photoViewer.Y5, photoViewer.f33579d6, photoViewer.f33648l6);
                cropAreaView.f24345n0 = 0.0f;
                cropAreaView.f24346o0 = lerp;
                cropAreaView.f24347p0 = lerp2;
                cropAreaView.f24348q0 = lerp3;
                cropAreaView.invalidate();
                return;
            case 2:
                photoViewer.L1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33656m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.u3();
                return;
            case 6:
                photoViewer.L1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                it0 it0Var = photoViewer.L1;
                if (it0Var != null) {
                    it0Var.f45887d1.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                it0 it0Var2 = photoViewer.L1;
                if (it0Var2 != null && Math.abs(floatValue - it0Var2.X1) > 0.1f) {
                    it0Var2.X1 = floatValue;
                    it0Var2.v0(it0Var2.I0, it0Var2.J0, it0Var2.K0, it0Var2.N0, it0Var2.O0);
                }
                photoViewer.f33582e0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer.f33656m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.H1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33656m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33656m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f33656m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
