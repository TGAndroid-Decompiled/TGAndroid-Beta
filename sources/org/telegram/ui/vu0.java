package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class vu0 extends ImageView {
    public int f37624a;
    public boolean f37625b;
    public boolean f37626c;
    public boolean d;
    public org.telegram.ui.Components.t71 e;
    public final org.telegram.ui.Components.wr f37627f;
    public ValueAnimator h;
    public final PhotoViewer f37628n;

    public vu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f37628n = photoViewer;
        this.f37624a = 0;
        this.f37625b = false;
        this.f37626c = false;
        this.d = false;
        this.f37627f = org.telegram.ui.Components.wr.f28821i;
        setAlpha(0.0f);
    }

    public static void a(vu0 vu0Var) {
        PhotoViewer photoViewer = vu0Var.f37628n;
        org.telegram.ui.Components.t71 t71Var = photoViewer.F2;
        if (t71Var != null && t71Var.p() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = vu0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    vu0Var.h = null;
                }
                vu0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.y()) {
                if (vu0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    vu0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new d3(vu0Var, 24));
                    vu0Var.h.setDuration(max);
                    vu0Var.h.setInterpolator(vu0Var.f37627f);
                    vu0Var.h.start();
                    vu0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = vu0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    vu0Var.h = null;
                }
                vu0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = vu0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            vu0Var.h = null;
        }
        vu0Var.setAlpha(0.0f);
    }
}
