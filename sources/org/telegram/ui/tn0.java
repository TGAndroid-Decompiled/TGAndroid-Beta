package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class tn0 implements Runnable {
    public final PhotoViewer f49831a;
    public final View f49832b;
    public final wo0 f49833c;
    public final float d;
    public final float f49834e;
    public final AnimatorSet f49835f;

    public tn0(PhotoViewer photoViewer, View view, wo0 wo0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.f49831a = photoViewer;
        this.f49832b = view;
        this.f49833c = wo0Var;
        this.d = f10;
        this.f49834e = f11;
        this.f49835f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.V8;
        View view = this.f49832b;
        wo0 wo0Var = this.f49833c;
        view.setOutlineProvider(wo0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.f49831a;
        photoViewer.f41591y3.setOutlineProvider(wo0Var);
        photoViewer.f41591y3.setClipToOutline(true);
        fq0 fq0Var = photoViewer.F2;
        if (fq0Var != null) {
            fq0Var.setOutlineProvider(wo0Var);
            photoViewer.F2.setClipToOutline(true);
        }
        photoViewer.f41591y3.setTranslationY(this.d);
        float f10 = this.f49834e;
        view.setTranslationY(f10);
        fq0 fq0Var2 = photoViewer.F2;
        if (fq0Var2 != null) {
            fq0Var2.setTranslationY(f10);
        }
        photoViewer.Z5 = 0.0f;
        photoViewer.f41420f0.invalidate();
        this.f49835f.start();
    }
}
