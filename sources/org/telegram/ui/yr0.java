package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class yr0 implements Runnable {
    public final PhotoViewer f40304a;
    public final View f40305b;
    public final ct0 f40306c;
    public final float d;
    public final float e;
    public final AnimatorSet f40307f;

    public yr0(PhotoViewer photoViewer, View view, ct0 ct0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.f40304a = photoViewer;
        this.f40305b = view;
        this.f40306c = ct0Var;
        this.d = f7;
        this.e = f10;
        this.f40307f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.f40305b;
        ct0 ct0Var = this.f40306c;
        view.setOutlineProvider(ct0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f40304a;
        photoViewer.f31397x3.setOutlineProvider(ct0Var);
        photoViewer.f31397x3.setClipToOutline(true);
        pu0 pu0Var = photoViewer.E2;
        if (pu0Var != null) {
            pu0Var.setOutlineProvider(ct0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.f31397x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        pu0 pu0Var2 = photoViewer.E2;
        if (pu0Var2 != null) {
            pu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.f31225e0.invalidate();
        this.f40307f.start();
    }
}
