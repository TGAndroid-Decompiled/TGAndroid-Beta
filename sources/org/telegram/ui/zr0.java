package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class zr0 extends ImageView {
    public int f44220a;
    public boolean f44221b;
    public boolean f44222c;
    public boolean d;
    public org.telegram.ui.Components.u61 e;
    public final org.telegram.ui.Components.gr f44223f;
    public ValueAnimator h;
    public final PhotoViewer f44224n;

    public zr0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f44224n = photoViewer;
        this.f44220a = 0;
        this.f44221b = false;
        this.f44222c = false;
        this.d = false;
        this.f44223f = org.telegram.ui.Components.gr.f26497i;
        setAlpha(0.0f);
    }

    public static void a(zr0 zr0Var) {
        PhotoViewer photoViewer = zr0Var.f44224n;
        org.telegram.ui.Components.u61 u61Var = photoViewer.F2;
        if (u61Var != null && u61Var.U() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.U() - photoViewer.F2.S());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = zr0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    zr0Var.h = null;
                }
                zr0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.d0()) {
                if (zr0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    zr0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new a3(zr0Var, 22));
                    zr0Var.h.setDuration(max);
                    zr0Var.h.setInterpolator(zr0Var.f44223f);
                    zr0Var.h.start();
                    zr0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = zr0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    zr0Var.h = null;
                }
                zr0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = zr0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            zr0Var.h = null;
        }
        zr0Var.setAlpha(0.0f);
    }
}
