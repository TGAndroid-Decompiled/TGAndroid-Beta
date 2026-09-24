package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class vr0 implements Runnable {
    public final PhotoViewer f38785a;
    public final View f38786b;
    public final zs0 f38787c;
    public final float d;
    public final float e;
    public final AnimatorSet f38788f;

    public vr0(PhotoViewer photoViewer, View view, zs0 zs0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f38785a = photoViewer;
        this.f38786b = view;
        this.f38787c = zs0Var;
        this.d = f7;
        this.e = f10;
        this.f38788f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f38786b;
        zs0 zs0Var = this.f38787c;
        view.setOutlineProvider(zs0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f38785a;
        photoViewer.f31381x3.setOutlineProvider(zs0Var);
        photoViewer.f31381x3.setClipToOutline(true);
        mu0 mu0Var = photoViewer.E2;
        if (mu0Var != null) {
            mu0Var.setOutlineProvider(zs0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f31381x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        mu0 mu0Var2 = photoViewer.E2;
        if (mu0Var2 != null) {
            mu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f31209e0.invalidate();
        this.f38788f.start();
    }
}
