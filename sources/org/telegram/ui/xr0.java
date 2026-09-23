package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class xr0 implements Runnable {
    public final PhotoViewer f39647a;
    public final View f39648b;
    public final at0 f39649c;
    public final float d;
    public final float e;
    public final AnimatorSet f39650f;

    public xr0(PhotoViewer photoViewer, View view, at0 at0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f39647a = photoViewer;
        this.f39648b = view;
        this.f39649c = at0Var;
        this.d = f7;
        this.e = f10;
        this.f39650f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f39648b;
        at0 at0Var = this.f39649c;
        view.setOutlineProvider(at0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f39647a;
        photoViewer.f31080x3.setOutlineProvider(at0Var);
        photoViewer.f31080x3.setClipToOutline(true);
        nu0 nu0Var = photoViewer.E2;
        if (nu0Var != null) {
            nu0Var.setOutlineProvider(at0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f31080x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        nu0 nu0Var2 = photoViewer.E2;
        if (nu0Var2 != null) {
            nu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f30908e0.invalidate();
        this.f39650f.start();
    }
}
