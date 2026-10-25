package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class sr0 implements Runnable {
    public final PhotoViewer f43577a;
    public final View f43578b;
    public final us0 f43579c;
    public final float d;
    public final float e;
    public final AnimatorSet f43580f;

    public sr0(PhotoViewer photoViewer, View view, us0 us0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f43577a = photoViewer;
        this.f43578b = view;
        this.f43579c = us0Var;
        this.d = f7;
        this.e = f10;
        this.f43580f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f43578b;
        us0 us0Var = this.f43579c;
        view.setOutlineProvider(us0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f43577a;
        photoViewer.f35816x3.setOutlineProvider(us0Var);
        photoViewer.f35816x3.setClipToOutline(true);
        hu0 hu0Var = photoViewer.E2;
        if (hu0Var != null) {
            hu0Var.setOutlineProvider(us0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f35816x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        hu0 hu0Var2 = photoViewer.E2;
        if (hu0Var2 != null) {
            hu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f35643e0.invalidate();
        this.f43580f.start();
    }
}
