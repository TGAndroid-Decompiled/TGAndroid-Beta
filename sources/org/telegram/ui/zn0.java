package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class zn0 implements Runnable {
    public final PhotoViewer f52614a;
    public final View f52615b;
    public final ep0 f52616c;
    public final float d;
    public final float f52617e;
    public final AnimatorSet f52618f;

    public zn0(PhotoViewer photoViewer, View view, ep0 ep0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.f52614a = photoViewer;
        this.f52615b = view;
        this.f52616c = ep0Var;
        this.d = f10;
        this.f52617e = f11;
        this.f52618f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Y8;
        View view = this.f52615b;
        ep0 ep0Var = this.f52616c;
        view.setOutlineProvider(ep0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f52614a;
        photoViewer.f41517w3.setOutlineProvider(ep0Var);
        photoViewer.f41517w3.setClipToOutline(true);
        nq0 nq0Var = photoViewer.E2;
        if (nq0Var != null) {
            nq0Var.setOutlineProvider(ep0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f41517w3.setTranslationY(this.d);
        float f10 = this.f52617e;
        view.setTranslationY(f10);
        nq0 nq0Var2 = photoViewer.E2;
        if (nq0Var2 != null) {
            nq0Var2.setTranslationY(f10);
        }
        photoViewer.X5 = 0.0f;
        photoViewer.f41356e0.invalidate();
        this.f52618f.start();
    }
}
