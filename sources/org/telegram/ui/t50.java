package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class t50 extends ReplacementSpan {
    public final Paint f50129a;
    public final ImageReceiver f50130b;
    public final float f50131c;
    public float d;
    public final View f50132e;
    public boolean f50133f;
    public float h;
    public int f50134n;

    public t50(float f10, int i7, View view) {
        e5 e5Var = new e5(this, 3);
        this.f50133f = true;
        this.f50134n = 255;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f50130b = imageReceiver;
        imageReceiver.d = i7;
        this.f50131c = f10;
        Paint paint = new Paint(1);
        this.f50129a = paint;
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), 855638016);
        View view2 = this.f50132e;
        if (view2 != view) {
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(e5Var);
                if (this.f50132e.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.R();
                }
            }
            View view3 = this.f50132e;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.P();
            }
            this.f50132e = view;
            imageReceiver.H0(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(e5Var);
            }
        }
    }

    public final void a(float f10) {
        float L = org.telegram.messenger.g0.L(f10);
        this.d = L;
        this.f50130b.J0((int) L);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        boolean z9 = this.f50133f;
        Paint paint2 = this.f50129a;
        if (z9 && this.f50134n != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.f50134n = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.m6.r1(this.f50134n / 255.0f, 855638016));
        }
        float f11 = this.h + f10;
        float L = (((i11 + i13) / 2.0f) + 0.0f) - (org.telegram.messenger.g0.L(this.f50131c) / 2.0f);
        if (this.f50133f) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(f11, L, org.telegram.messenger.g0.L(this.f50131c) + f11, org.telegram.messenger.g0.L(this.f50131c) + L);
            float f12 = this.d;
            canvas.drawRoundRect(rectF, f12, f12, paint2);
        }
        ImageReceiver imageReceiver = this.f50130b;
        imageReceiver.y0(f11, L, org.telegram.messenger.g0.L(this.f50131c), org.telegram.messenger.g0.L(this.f50131c));
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.h(canvas, null);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.g0.L(this.f50131c);
    }
}
