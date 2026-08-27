package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;

public final class tt0 extends ImageView {

    public int f43012a;

    public boolean f43013b;

    public boolean f43014c;
    public boolean d;

    public org.telegram.ui.Components.m61 f43015e;

    public final org.telegram.ui.Components.er f43016f;
    public ValueAnimator h;

    public final PhotoViewer f43017n;

    public tt0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f43017n = photoViewer;
        this.f43012a = 0;
        this.f43013b = false;
        this.f43014c = false;
        this.d = false;
        this.f43016f = org.telegram.ui.Components.er.f28124i;
        setAlpha(0.0f);
    }

    public static void a(tt0 tt0Var) {
        PhotoViewer photoViewer = tt0Var.f43017n;
        org.telegram.ui.Components.m61 m61Var = photoViewer.B2;
        if (m61Var == null || m61Var.q() == -9223372036854775807L) {
            ValueAnimator valueAnimator = tt0Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                tt0Var.h = null;
            }
            tt0Var.setAlpha(0.0f);
            return;
        }
        long jMax = Math.max(0L, photoViewer.B2.q() - photoViewer.B2.o());
        float fMax = 1.0f - Math.max(Math.min(jMax / 250.0f, 1.0f), 0.0f);
        if (fMax <= 0.0f) {
            ValueAnimator valueAnimator2 = tt0Var.h;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                tt0Var.h = null;
            }
            tt0Var.setAlpha(0.0f);
            return;
        }
        if (!photoViewer.B2.z()) {
            ValueAnimator valueAnimator3 = tt0Var.h;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                tt0Var.h = null;
            }
            tt0Var.setAlpha(fMax);
            return;
        }
        if (tt0Var.h == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fMax, 1.0f);
            tt0Var.h = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new g3(tt0Var, 24));
            tt0Var.h.setDuration(jMax);
            tt0Var.h.setInterpolator(tt0Var.f43016f);
            tt0Var.h.start();
            tt0Var.setAlpha(fMax);
        }
    }
}
