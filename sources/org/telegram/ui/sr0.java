package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class sr0 implements Runnable {
    public final PhotoViewer f43580a;
    public final View f43581b;
    public final us0 f43582c;
    public final float d;
    public final float e;
    public final AnimatorSet f43583f;

    public sr0(PhotoViewer photoViewer, View view, us0 us0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f43580a = photoViewer;
        this.f43581b = view;
        this.f43582c = us0Var;
        this.d = f7;
        this.e = f10;
        this.f43583f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f43581b;
        us0 us0Var = this.f43582c;
        view.setOutlineProvider(us0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f43580a;
        photoViewer.f35819x3.setOutlineProvider(us0Var);
        photoViewer.f35819x3.setClipToOutline(true);
        hu0 hu0Var = photoViewer.E2;
        if (hu0Var != null) {
            hu0Var.setOutlineProvider(us0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f35819x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        hu0 hu0Var2 = photoViewer.E2;
        if (hu0Var2 != null) {
            hu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f35646e0.invalidate();
        this.f43583f.start();
    }
}
