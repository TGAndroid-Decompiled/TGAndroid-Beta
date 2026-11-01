package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class yr0 extends ImageView {
    public int f43714a;
    public boolean f43715b;
    public boolean f43716c;
    public boolean d;
    public org.telegram.ui.Components.v61 e;
    public final org.telegram.ui.Components.gr f43717f;
    public ValueAnimator h;
    public final PhotoViewer f43718n;

    public yr0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f43718n = photoViewer;
        this.f43714a = 0;
        this.f43715b = false;
        this.f43716c = false;
        this.d = false;
        this.f43717f = org.telegram.ui.Components.gr.f26525i;
        setAlpha(0.0f);
    }

    public static void a(yr0 yr0Var) {
        PhotoViewer photoViewer = yr0Var.f43718n;
        org.telegram.ui.Components.v61 v61Var = photoViewer.F2;
        if (v61Var != null && v61Var.U() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.U() - photoViewer.F2.S());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = yr0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    yr0Var.h = null;
                }
                yr0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.d0()) {
                if (yr0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    yr0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new a3(yr0Var, 22));
                    yr0Var.h.setDuration(max);
                    yr0Var.h.setInterpolator(yr0Var.f43717f);
                    yr0Var.h.start();
                    yr0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = yr0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    yr0Var.h = null;
                }
                yr0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = yr0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            yr0Var.h = null;
        }
        yr0Var.setAlpha(0.0f);
    }
}
