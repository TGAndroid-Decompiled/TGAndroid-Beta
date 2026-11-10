package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class rq0 extends ImageView {
    public int f49556a;
    public boolean f49557b;
    public boolean f49558c;
    public boolean d;
    public org.telegram.ui.Components.t51 f49559e;
    public final org.telegram.ui.Components.wq f49560f;
    public ValueAnimator h;
    public final PhotoViewer f49561n;

    public rq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f49561n = photoViewer;
        this.f49556a = 0;
        this.f49557b = false;
        this.f49558c = false;
        this.d = false;
        this.f49560f = org.telegram.ui.Components.wq.f40048i;
        setAlpha(0.0f);
    }

    public static void a(rq0 rq0Var) {
        PhotoViewer photoViewer = rq0Var.f49561n;
        org.telegram.ui.Components.t51 t51Var = photoViewer.F2;
        if (t51Var != null && t51Var.U() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.U() - photoViewer.F2.S());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = rq0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    rq0Var.h = null;
                }
                rq0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.d0()) {
                if (rq0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    rq0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new a3(rq0Var, 22));
                    rq0Var.h.setDuration(max);
                    rq0Var.h.setInterpolator(rq0Var.f49560f);
                    rq0Var.h.start();
                    rq0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = rq0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    rq0Var.h = null;
                }
                rq0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = rq0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            rq0Var.h = null;
        }
        rq0Var.setAlpha(0.0f);
    }
}
