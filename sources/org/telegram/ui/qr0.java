package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class qr0 implements Runnable {
    public final PhotoViewer f40628a;
    public final View f40629b;
    public final ts0 f40630c;
    public final float d;
    public final float f40631e;
    public final AnimatorSet f40632f;

    public qr0(PhotoViewer photoViewer, View view, ts0 ts0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.f40628a = photoViewer;
        this.f40629b = view;
        this.f40630c = ts0Var;
        this.d = f10;
        this.f40631e = f11;
        this.f40632f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Q8;
        View view = this.f40629b;
        ts0 ts0Var = this.f40630c;
        view.setOutlineProvider(ts0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f40628a;
        photoViewer.f34404u3.setOutlineProvider(ts0Var);
        photoViewer.f34404u3.setClipToOutline(true);
        hu0 hu0Var = photoViewer.B2;
        if (hu0Var != null) {
            hu0Var.setOutlineProvider(ts0Var);
            photoViewer.B2.setClipToOutline(true);
        }
        photoViewer.f34404u3.setTranslationY(this.d);
        float f10 = this.f40631e;
        view.setTranslationY(f10);
        hu0 hu0Var2 = photoViewer.B2;
        if (hu0Var2 != null) {
            hu0Var2.setTranslationY(f10);
        }
        photoViewer.V5 = 0.0f;
        photoViewer.f34230b0.invalidate();
        this.f40632f.start();
    }
}
