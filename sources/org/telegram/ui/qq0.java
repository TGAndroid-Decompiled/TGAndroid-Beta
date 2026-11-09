package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
public final class qq0 extends ImageView {
    public int f49175a;
    public boolean f49176b;
    public boolean f49177c;
    public boolean d;
    public org.telegram.ui.Components.u51 f49178e;
    public final org.telegram.ui.Components.xq f49179f;
    public ValueAnimator h;
    public final PhotoViewer f49180n;

    public qq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f49180n = photoViewer;
        this.f49175a = 0;
        this.f49176b = false;
        this.f49177c = false;
        this.d = false;
        this.f49179f = org.telegram.ui.Components.xq.f40460i;
        setAlpha(0.0f);
    }

    public static void a(qq0 qq0Var) {
        PhotoViewer photoViewer = qq0Var.f49180n;
        org.telegram.ui.Components.u51 u51Var = photoViewer.F2;
        if (u51Var != null && u51Var.U() != -9223372036854775807L) {
            long max = Math.max(0L, photoViewer.F2.U() - photoViewer.F2.S());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator = qq0Var.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    qq0Var.h = null;
                }
                qq0Var.setAlpha(0.0f);
                return;
            } else if (photoViewer.F2.d0()) {
                if (qq0Var.h == null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                    qq0Var.h = ofFloat;
                    ofFloat.addUpdateListener(new a3(qq0Var, 22));
                    qq0Var.h.setDuration(max);
                    qq0Var.h.setInterpolator(qq0Var.f49179f);
                    qq0Var.h.start();
                    qq0Var.setAlpha(max2);
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimator2 = qq0Var.h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    qq0Var.h = null;
                }
                qq0Var.setAlpha(max2);
                return;
            }
        }
        ValueAnimator valueAnimator3 = qq0Var.h;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            qq0Var.h = null;
        }
        qq0Var.setAlpha(0.0f);
    }
}
