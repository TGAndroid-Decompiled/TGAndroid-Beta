package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class st0 extends ImageView {
    public int f42760a;
    public boolean f42761b;
    public boolean f42762c;
    public boolean d;
    public org.telegram.ui.Components.k61 f42763e;
    public final org.telegram.ui.Components.gr f42764f;
    public ValueAnimator h;
    public final PhotoViewer f42765n;

    public st0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f42765n = photoViewer;
        this.f42760a = 0;
        this.f42761b = false;
        this.f42762c = false;
        this.d = false;
        this.f42764f = org.telegram.ui.Components.gr.f28846i;
        setAlpha(0.0f);
    }

    public static void a(st0 st0Var) {
        PhotoViewer photoViewer = st0Var.f42765n;
        org.telegram.ui.Components.k61 k61Var = photoViewer.B2;
        if (k61Var != null && k61Var.q() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.B2.q() - photoViewer.B2.o());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = st0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    st0Var.h = null;
                }
                st0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.B2.z()) {
                if (st0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    st0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new f3(st0Var, 24));
                    st0Var.h.setDuration(max);
                    st0Var.h.setInterpolator(st0Var.f42764f);
                    st0Var.h.start();
                    st0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = st0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    st0Var.h = null;
                }
                st0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = st0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            st0Var.h = null;
        }
        st0Var.setAlpha(0.0f);
    }
}
