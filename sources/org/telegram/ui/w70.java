package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class w70 extends ReplacementSpan {
    public final Paint f43103a;
    public final ImageReceiver f43104b;
    public final float f43105c;
    public float d;
    public final View f43106e;
    public boolean f43107f;
    public float h;
    public int f43108n;

    public w70(View view, float f7, int i10) {
        f5 f5Var = new f5(this, 2);
        this.f43107f = true;
        this.f43108n = 255;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f43104b = imageReceiver;
        imageReceiver.setCurrentAccount(i10);
        this.f43105c = f7;
        Paint paint = new Paint(1);
        this.f43103a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        View view2 = this.f43106e;
        if (view2 != view) {
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(f5Var);
                if (this.f43106e.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.onDetachedFromWindow();
                }
            }
            View view3 = this.f43106e;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.onAttachedToWindow();
            }
            this.f43106e = view;
            imageReceiver.setParentView(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(f5Var);
            }
        }
    }

    public final void a(float f7) {
        float dp = AndroidUtilities.dp(f7);
        this.d = dp;
        this.f43104b.setRoundRadius((int) dp);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        boolean z10 = this.f43107f;
        Paint paint2 = this.f43103a;
        if (z10 && this.f43108n != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.f43108n = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.i6.m1(this.f43108n / 255.0f, 855638016));
        }
        float f10 = this.h + f7;
        float dp = (((i12 + i14) / 2.0f) + 0.0f) - (AndroidUtilities.dp(this.f43105c) / 2.0f);
        if (this.f43107f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f10, dp, AndroidUtilities.dp(this.f43105c) + f10, AndroidUtilities.dp(this.f43105c) + dp);
            float f11 = this.d;
            canvas.drawRoundRect(rectF, f11, f11, paint2);
        }
        ImageReceiver imageReceiver = this.f43104b;
        imageReceiver.setImageCoords(f10, dp, AndroidUtilities.dp(this.f43105c), AndroidUtilities.dp(this.f43105c));
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.draw(canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.f43105c);
    }
}
