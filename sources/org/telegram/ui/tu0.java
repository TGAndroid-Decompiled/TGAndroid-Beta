package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class tu0 extends ImageView {
    public int f40831a;
    public boolean f40832b;
    public boolean f40833c;
    public boolean d;
    public org.telegram.ui.Components.g71 f40834e;
    public final org.telegram.ui.Components.pr f40835f;
    public ValueAnimator h;
    public final PhotoViewer f40836n;

    public tu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f40836n = photoViewer;
        this.f40831a = 0;
        this.f40832b = false;
        this.f40833c = false;
        this.d = false;
        this.f40835f = org.telegram.ui.Components.pr.f29469i;
        setAlpha(0.0f);
    }

    public static void a(tu0 tu0Var) {
        PhotoViewer photoViewer = tu0Var.f40836n;
        org.telegram.ui.Components.g71 g71Var = photoViewer.F2;
        if (g71Var != null && g71Var.p() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.p() - photoViewer.F2.n());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = tu0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    tu0Var.h = null;
                }
                tu0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.y()) {
                if (tu0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    tu0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new c3(tu0Var, 24));
                    tu0Var.h.setDuration(max);
                    tu0Var.h.setInterpolator(tu0Var.f40835f);
                    tu0Var.h.start();
                    tu0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = tu0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    tu0Var.h = null;
                }
                tu0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = tu0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            tu0Var.h = null;
        }
        tu0Var.setAlpha(0.0f);
    }
}
