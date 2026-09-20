package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class uu0 extends ImageView {
    public int f38212a;
    public boolean f38213b;
    public boolean f38214c;
    public boolean d;
    public org.telegram.ui.Components.t71 e;
    public final org.telegram.ui.Components.qr f38215f;
    public ValueAnimator h;
    public final PhotoViewer f38216n;

    public uu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f38216n = photoViewer;
        this.f38212a = 0;
        this.f38213b = false;
        this.f38214c = false;
        this.d = false;
        this.f38215f = org.telegram.ui.Components.qr.f27644i;
        setAlpha(0.0f);
    }

    public static void a(uu0 uu0Var) {
        PhotoViewer photoViewer = uu0Var.f38216n;
        org.telegram.ui.Components.t71 t71Var = photoViewer.F2;
        if (t71Var != null && t71Var.p() != -9223372036854775807L) {
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
                    ofFloat.addUpdateListener(new b3(uu0Var, 23));
                    uu0Var.h.setDuration(max);
                    uu0Var.h.setInterpolator(uu0Var.f38215f);
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
