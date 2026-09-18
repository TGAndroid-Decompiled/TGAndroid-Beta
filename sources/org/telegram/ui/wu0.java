package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class wu0 extends ImageView {
    public int f39176a;
    public boolean f39177b;
    public boolean f39178c;
    public boolean d;
    public org.telegram.ui.Components.h71 e;
    public final org.telegram.ui.Components.qr f39179f;
    public ValueAnimator h;
    public final PhotoViewer f39180n;

    public wu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f39180n = photoViewer;
        this.f39176a = 0;
        this.f39177b = false;
        this.f39178c = false;
        this.d = false;
        this.f39179f = org.telegram.ui.Components.qr.f27385i;
        setAlpha(0.0f);
    }

    public static void a(wu0 wu0Var) {
        PhotoViewer photoViewer = wu0Var.f39180n;
        org.telegram.ui.Components.h71 h71Var = photoViewer.F2;
        if (h71Var != null && h71Var.p() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = wu0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    wu0Var.h = null;
                }
                wu0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.y()) {
                if (wu0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    wu0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new b3(wu0Var, 23));
                    wu0Var.h.setDuration(max);
                    wu0Var.h.setInterpolator(wu0Var.f39179f);
                    wu0Var.h.start();
                    wu0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = wu0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    wu0Var.h = null;
                }
                wu0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = wu0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            wu0Var.h = null;
        }
        wu0Var.setAlpha(0.0f);
    }
}
