package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class r50 extends ReplacementSpan {
    public final Paint f51625a;
    public final ImageReceiver f51626b;
    public final float f51627c;
    public float d;
    public final View f51628e;
    public boolean f51629f;
    public float h;
    public int f51630n;

    public r50(float f10, int i7, View view) {
        e5 e5Var = new e5(this, 3);
        this.f51629f = true;
        this.f51630n = 255;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f51626b = imageReceiver;
        imageReceiver.d = i7;
        this.f51627c = f10;
        Paint paint = new Paint(1);
        this.f51625a = paint;
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), 855638016);
        View view2 = this.f51628e;
        if (view2 != view) {
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(e5Var);
                if (this.f51628e.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.S();
                }
            }
            View view3 = this.f51628e;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.Q();
            }
            this.f51628e = view;
            imageReceiver.I0(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(e5Var);
            }
        }
    }

    public final void a(float f10) {
        float L = org.telegram.messenger.g0.L(f10);
        this.d = L;
        this.f51626b.K0((int) L);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        boolean z10 = this.f51629f;
        Paint paint2 = this.f51625a;
        if (z10 && this.f51630n != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.f51630n = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.n6.r1(this.f51630n / 255.0f, 855638016));
        }
        float f11 = this.h + f10;
        float L = (((i11 + i13) / 2.0f) + 0.0f) - (org.telegram.messenger.g0.L(this.f51627c) / 2.0f);
        if (this.f51629f) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(f11, L, org.telegram.messenger.g0.L(this.f51627c) + f11, org.telegram.messenger.g0.L(this.f51627c) + L);
            float f12 = this.d;
            canvas.drawRoundRect(rectF, f12, f12, paint2);
        }
        ImageReceiver imageReceiver = this.f51626b;
        imageReceiver.z0(f11, L, org.telegram.messenger.g0.L(this.f51627c), org.telegram.messenger.g0.L(this.f51627c));
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.h(canvas, null);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return org.telegram.messenger.g0.L(this.f51627c);
    }
}
