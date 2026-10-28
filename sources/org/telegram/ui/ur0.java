package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ur0 implements Runnable {
    public final PhotoViewer f44094a;
    public final View f44095b;
    public final ws0 f44096c;
    public final float d;
    public final float e;
    public final AnimatorSet f44097f;

    public ur0(PhotoViewer photoViewer, View view, ws0 ws0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f44094a = photoViewer;
        this.f44095b = view;
        this.f44096c = ws0Var;
        this.d = f7;
        this.e = f10;
        this.f44097f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f44095b;
        ws0 ws0Var = this.f44096c;
        view.setOutlineProvider(ws0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f44094a;
        photoViewer.f35843x3.setOutlineProvider(ws0Var);
        photoViewer.f35843x3.setClipToOutline(true);
        ju0 ju0Var = photoViewer.E2;
        if (ju0Var != null) {
            ju0Var.setOutlineProvider(ws0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f35843x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        ju0 ju0Var2 = photoViewer.E2;
        if (ju0Var2 != null) {
            ju0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f35670e0.invalidate();
        this.f44097f.start();
    }
}
