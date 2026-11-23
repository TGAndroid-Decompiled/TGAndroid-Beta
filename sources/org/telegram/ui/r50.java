package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class r50 extends ReplacementSpan {
    public final Paint f51482a;
    public final ImageReceiver f51483b;
    public final float f51484c;
    public float d;
    public final View f51485e;
    public boolean f51486f;
    public float h;
    public int f51487n;

    public r50(float f10, int i7, View view) {
        e5 e5Var = new e5(this, 3);
        this.f51486f = true;
        this.f51487n = 255;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f51483b = imageReceiver;
        imageReceiver.d = i7;
        this.f51484c = f10;
        Paint paint = new Paint(1);
        this.f51482a = paint;
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), 855638016);
        View view2 = this.f51485e;
        if (view2 != view) {
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(e5Var);
                if (this.f51485e.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.R();
                }
            }
            View view3 = this.f51485e;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.P();
            }
            this.f51485e = view;
            imageReceiver.H0(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(e5Var);
            }
        }
    }

    public final void a(float f10) {
        float L = org.telegram.messenger.g0.L(f10);
        this.d = L;
        this.f51483b.J0((int) L);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        boolean z10 = this.f51486f;
        Paint paint2 = this.f51482a;
        if (z10 && this.f51487n != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.f51487n = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.m6.r1(this.f51487n / 255.0f, 855638016));
        }
        float f11 = this.h + f10;
        float L = (((i11 + i13) / 2.0f) + 0.0f) - (org.telegram.messenger.g0.L(this.f51484c) / 2.0f);
        if (this.f51486f) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(f11, L, org.telegram.messenger.g0.L(this.f51484c) + f11, org.telegram.messenger.g0.L(this.f51484c) + L);
            float f12 = this.d;
            canvas.drawRoundRect(rectF, f12, f12, paint2);
        }
        ImageReceiver imageReceiver = this.f51483b;
        imageReceiver.y0(f11, L, org.telegram.messenger.g0.L(this.f51484c), org.telegram.messenger.g0.L(this.f51484c));
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.h(canvas, null);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.g0.L(this.f51484c);
    }
}
