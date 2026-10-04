package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class yr0 implements Runnable {
    public final PhotoViewer f43607a;
    public final View f43608b;
    public final ct0 f43609c;
    public final float d;
    public final float f43610e;
    public final AnimatorSet f43611f;

    public yr0(PhotoViewer photoViewer, View view, ct0 ct0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f43607a = photoViewer;
        this.f43608b = view;
        this.f43609c = ct0Var;
        this.d = f7;
        this.f43610e = f10;
        this.f43611f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f43608b;
        ct0 ct0Var = this.f43609c;
        view.setOutlineProvider(ct0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f43607a;
        photoViewer.f34067x3.setOutlineProvider(ct0Var);
        photoViewer.f34067x3.setClipToOutline(true);
        pu0 pu0Var = photoViewer.E2;
        if (pu0Var != null) {
            pu0Var.setOutlineProvider(ct0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f34067x3.setTranslationY(this.d);
        float f7 = this.f43610e;
        view.setTranslationY(f7);
        pu0 pu0Var2 = photoViewer.E2;
        if (pu0Var2 != null) {
            pu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f33895e0.invalidate();
        this.f43611f.start();
    }
}
