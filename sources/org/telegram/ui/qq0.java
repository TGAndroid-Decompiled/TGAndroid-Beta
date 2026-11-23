package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class qq0 extends ImageView {
    public int f51263a;
    public boolean f51264b;
    public boolean f51265c;
    public boolean d;
    public org.telegram.ui.Components.i61 f51266e;
    public final org.telegram.ui.Components.nr f51267f;
    public ValueAnimator h;
    public final PhotoViewer f51268n;

    public qq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f51268n = photoViewer;
        this.f51263a = 0;
        this.f51264b = false;
        this.f51265c = false;
        this.d = false;
        this.f51267f = org.telegram.ui.Components.nr.f37919i;
        setAlpha(0.0f);
    }

    public static void a(qq0 qq0Var) {
        PhotoViewer photoViewer = qq0Var.f51268n;
        org.telegram.ui.Components.i61 i61Var = photoViewer.G2;
        if (i61Var != null && i61Var.U() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.G2.U() - photoViewer.G2.S());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = qq0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    qq0Var.h = null;
                }
                qq0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.G2.d0()) {
                if (qq0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    qq0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new a3(qq0Var, 22));
                    qq0Var.h.setDuration(max);
                    qq0Var.h.setInterpolator(qq0Var.f51267f);
                    qq0Var.h.start();
                    qq0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = qq0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    qq0Var.h = null;
                }
                qq0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = qq0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            qq0Var.h = null;
        }
        qq0Var.setAlpha(0.0f);
    }
}
