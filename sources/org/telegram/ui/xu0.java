package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class xu0 extends ImageView {
    public int f44174a;
    public boolean f44175b;
    public boolean f44176c;
    public boolean d;
    public org.telegram.ui.Components.q81 f44177e;
    public final org.telegram.ui.Components.js f44178f;
    public ValueAnimator h;
    public final PhotoViewer f44179n;

    public xu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f44179n = photoViewer;
        this.f44174a = 0;
        this.f44175b = false;
        this.f44176c = false;
        this.d = false;
        this.f44178f = org.telegram.ui.Components.js.f27629i;
        setAlpha(0.0f);
    }

    public static void a(xu0 xu0Var) {
        PhotoViewer photoViewer = xu0Var.f44179n;
        org.telegram.ui.Components.q81 q81Var = photoViewer.F2;
        if (q81Var != null && q81Var.p() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = xu0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    xu0Var.h = null;
                }
                xu0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.y()) {
                if (xu0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    xu0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new c3(xu0Var, 24));
                    xu0Var.h.setDuration(max);
                    xu0Var.h.setInterpolator(xu0Var.f44178f);
                    xu0Var.h.start();
                    xu0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = xu0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    xu0Var.h = null;
                }
                xu0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = xu0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            xu0Var.h = null;
        }
        xu0Var.setAlpha(0.0f);
    }
}
