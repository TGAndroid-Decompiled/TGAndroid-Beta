package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class qr0 implements Runnable {
    public final PhotoViewer f37465a;
    public final View f37466b;
    public final ts0 f37467c;
    public final float d;
    public final float e;
    public final AnimatorSet f37468f;

    public qr0(PhotoViewer photoViewer, View view, ts0 ts0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.f37465a = photoViewer;
        this.f37466b = view;
        this.f37467c = ts0Var;
        this.d = f10;
        this.e = f11;
        this.f37468f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Q8;
        View view = this.f37466b;
        ts0 ts0Var = this.f37467c;
        view.setOutlineProvider(ts0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f37465a;
        photoViewer.f31852u3.setOutlineProvider(ts0Var);
        photoViewer.f31852u3.setClipToOutline(true);
        hu0 hu0Var = photoViewer.B2;
        if (hu0Var != null) {
            hu0Var.setOutlineProvider(ts0Var);
            photoViewer.B2.setClipToOutline(true);
        }
        photoViewer.f31852u3.setTranslationY(this.d);
        float f10 = this.e;
        view.setTranslationY(f10);
        hu0 hu0Var2 = photoViewer.B2;
        if (hu0Var2 != null) {
            hu0Var2.setTranslationY(f10);
        }
        photoViewer.V5 = 0.0f;
        photoViewer.f31679b0.invalidate();
        this.f37468f.start();
    }
}
