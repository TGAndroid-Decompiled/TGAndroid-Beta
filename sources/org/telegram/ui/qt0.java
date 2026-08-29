package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class qt0 extends ImageView {
    public int f41773a;
    public boolean f41774b;
    public boolean f41775c;
    public boolean d;
    public org.telegram.ui.Components.x61 f41776e;
    public final org.telegram.ui.Components.jr f41777f;
    public ValueAnimator h;
    public final PhotoViewer f41778n;

    public qt0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f41778n = photoViewer;
        this.f41773a = 0;
        this.f41774b = false;
        this.f41775c = false;
        this.d = false;
        this.f41777f = org.telegram.ui.Components.jr.f29802i;
        setAlpha(0.0f);
    }

    public static void a(qt0 qt0Var) {
        PhotoViewer photoViewer = qt0Var.f41778n;
        org.telegram.ui.Components.x61 x61Var = photoViewer.B2;
        if (x61Var != null && x61Var.q() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.B2.q() - photoViewer.B2.o());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = qt0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    qt0Var.h = null;
                }
                qt0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.B2.z()) {
                if (qt0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    qt0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new g3(qt0Var, 24));
                    qt0Var.h.setDuration(max);
                    qt0Var.h.setInterpolator(qt0Var.f41777f);
                    qt0Var.h.start();
                    qt0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = qt0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    qt0Var.h = null;
                }
                qt0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = qt0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            qt0Var.h = null;
        }
        qt0Var.setAlpha(0.0f);
    }
}
