package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class wr0 implements Runnable {
    public final PhotoViewer f39746a;
    public final View f39747b;
    public final zs0 f39748c;
    public final float d;
    public final float e;
    public final AnimatorSet f39749f;

    public wr0(PhotoViewer photoViewer, View view, zs0 zs0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f39746a = photoViewer;
        this.f39747b = view;
        this.f39748c = zs0Var;
        this.d = f7;
        this.e = f10;
        this.f39749f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f39747b;
        zs0 zs0Var = this.f39748c;
        view.setOutlineProvider(zs0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f39746a;
        photoViewer.f31394x3.setOutlineProvider(zs0Var);
        photoViewer.f31394x3.setClipToOutline(true);
        mu0 mu0Var = photoViewer.E2;
        if (mu0Var != null) {
            mu0Var.setOutlineProvider(zs0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f31394x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        mu0 mu0Var2 = photoViewer.E2;
        if (mu0Var2 != null) {
            mu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f31222e0.invalidate();
        this.f39749f.start();
    }
}
