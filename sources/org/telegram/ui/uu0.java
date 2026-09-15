package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class uu0 extends ImageView {
    public int f38163a;
    public boolean f38164b;
    public boolean f38165c;
    public boolean d;
    public org.telegram.ui.Components.g71 e;
    public final org.telegram.ui.Components.qr f38166f;
    public ValueAnimator h;
    public final PhotoViewer f38167n;

    public uu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f38167n = photoViewer;
        this.f38163a = 0;
        this.f38164b = false;
        this.f38165c = false;
        this.d = false;
        this.f38166f = org.telegram.ui.Components.qr.f27425i;
        setAlpha(0.0f);
    }

    public static void a(uu0 uu0Var) {
        PhotoViewer photoViewer = uu0Var.f38167n;
        org.telegram.ui.Components.g71 g71Var = photoViewer.F2;
        if (g71Var != null && g71Var.p() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = uu0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    uu0Var.h = null;
                }
                uu0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.y()) {
                if (uu0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    uu0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new b3(uu0Var, 24));
                    uu0Var.h.setDuration(max);
                    uu0Var.h.setInterpolator(uu0Var.f38166f);
                    uu0Var.h.start();
                    uu0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = uu0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    uu0Var.h = null;
                }
                uu0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = uu0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            uu0Var.h = null;
        }
        uu0Var.setAlpha(0.0f);
    }
}
