package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class yr0 implements Runnable {
    public final PhotoViewer f43614a;
    public final View f43615b;
    public final ct0 f43616c;
    public final float d;
    public final float f43617e;
    public final AnimatorSet f43618f;

    public yr0(PhotoViewer photoViewer, View view, ct0 ct0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f43614a = photoViewer;
        this.f43615b = view;
        this.f43616c = ct0Var;
        this.d = f7;
        this.f43617e = f10;
        this.f43618f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f43615b;
        ct0 ct0Var = this.f43616c;
        view.setOutlineProvider(ct0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f43614a;
        photoViewer.f34073x3.setOutlineProvider(ct0Var);
        photoViewer.f34073x3.setClipToOutline(true);
        pu0 pu0Var = photoViewer.E2;
        if (pu0Var != null) {
            pu0Var.setOutlineProvider(ct0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f34073x3.setTranslationY(this.d);
        float f7 = this.f43617e;
        view.setTranslationY(f7);
        pu0 pu0Var2 = photoViewer.E2;
        if (pu0Var2 != null) {
            pu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f33901e0.invalidate();
        this.f43618f.start();
    }
}
