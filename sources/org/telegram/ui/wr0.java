package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class wr0 implements Runnable {
    public final PhotoViewer f39842a;
    public final View f39843b;
    public final zs0 f39844c;
    public final float d;
    public final float e;
    public final AnimatorSet f39845f;

    public wr0(PhotoViewer photoViewer, View view, zs0 zs0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f39842a = photoViewer;
        this.f39843b = view;
        this.f39844c = zs0Var;
        this.d = f7;
        this.e = f10;
        this.f39845f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f39843b;
        zs0 zs0Var = this.f39844c;
        view.setOutlineProvider(zs0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f39842a;
        photoViewer.f31469x3.setOutlineProvider(zs0Var);
        photoViewer.f31469x3.setClipToOutline(true);
        mu0 mu0Var = photoViewer.E2;
        if (mu0Var != null) {
            mu0Var.setOutlineProvider(zs0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f31469x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        mu0 mu0Var2 = photoViewer.E2;
        if (mu0Var2 != null) {
            mu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f31297e0.invalidate();
        this.f39845f.start();
    }
}
