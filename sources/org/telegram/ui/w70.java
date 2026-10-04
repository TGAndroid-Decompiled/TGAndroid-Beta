package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class w70 extends ReplacementSpan {
    public final Paint f41946a;
    public final ImageReceiver f41947b;
    public final float f41948c;
    public float d;
    public final View f41949e;
    public boolean f41950f;
    public float h;
    public int f41951n;

    public w70(View view, float f7, int i10) {
        g5 g5Var = new g5(this, 2);
        this.f41950f = true;
        this.f41951n = 255;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f41947b = imageReceiver;
        imageReceiver.setCurrentAccount(i10);
        this.f41948c = f7;
        Paint paint = new Paint(1);
        this.f41946a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        View view2 = this.f41949e;
        if (view2 != view) {
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(g5Var);
                if (this.f41949e.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.onDetachedFromWindow();
                }
            }
            View view3 = this.f41949e;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.onAttachedToWindow();
            }
            this.f41949e = view;
            imageReceiver.setParentView(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(g5Var);
            }
        }
    }

    public final void a(float f7) {
        float dp = AndroidUtilities.dp(f7);
        this.d = dp;
        this.f41947b.setRoundRadius((int) dp);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        boolean z10 = this.f41950f;
        Paint paint2 = this.f41946a;
        if (z10 && this.f41951n != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.f41951n = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.i6.l1(this.f41951n / 255.0f, 855638016));
        }
        float f10 = this.h + f7;
        float dp = (((i12 + i14) / 2.0f) + 0.0f) - (AndroidUtilities.dp(this.f41948c) / 2.0f);
        if (this.f41950f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f10, dp, AndroidUtilities.dp(this.f41948c) + f10, AndroidUtilities.dp(this.f41948c) + dp);
            float f11 = this.d;
            canvas.drawRoundRect(rectF, f11, f11, paint2);
        }
        ImageReceiver imageReceiver = this.f41947b;
        imageReceiver.setImageCoords(f10, dp, AndroidUtilities.dp(this.f41948c), AndroidUtilities.dp(this.f41948c));
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.draw(canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.f41948c);
    }
}
