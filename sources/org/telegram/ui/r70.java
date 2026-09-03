package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class r70 extends ReplacementSpan {
    public final Paint f37724a;
    public final ImageReceiver f37725b;
    public final float f37726c;
    public float d;
    public final View e;
    public boolean f37727f;
    public float h;
    public int f37728n;

    public r70(View view, float f10, int i10) {
        j5 j5Var = new j5(this, 2);
        this.f37727f = true;
        this.f37728n = 255;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f37725b = imageReceiver;
        imageReceiver.setCurrentAccount(i10);
        this.f37726c = f10;
        Paint paint = new Paint(1);
        this.f37724a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        View view2 = this.e;
        if (view2 != view) {
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(j5Var);
                if (this.e.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.onDetachedFromWindow();
                }
            }
            View view3 = this.e;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.onAttachedToWindow();
            }
            this.e = view;
            imageReceiver.setParentView(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(j5Var);
            }
        }
    }

    public final void a(float f10) {
        float dp = AndroidUtilities.dp(f10);
        this.d = dp;
        this.f37725b.setRoundRadius((int) dp);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        boolean z4 = this.f37727f;
        Paint paint2 = this.f37724a;
        if (z4 && this.f37728n != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.f37728n = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.j6.l1(this.f37728n / 255.0f, 855638016));
        }
        float f11 = this.h + f10;
        float dp = (((i12 + i14) / 2.0f) + 0.0f) - (AndroidUtilities.dp(this.f37726c) / 2.0f);
        if (this.f37727f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f11, dp, AndroidUtilities.dp(this.f37726c) + f11, AndroidUtilities.dp(this.f37726c) + dp);
            float f12 = this.d;
            canvas.drawRoundRect(rectF, f12, f12, paint2);
        }
        ImageReceiver imageReceiver = this.f37725b;
        imageReceiver.setImageCoords(f11, dp, AndroidUtilities.dp(this.f37726c), AndroidUtilities.dp(this.f37726c));
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.draw(canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.f37726c);
    }
}
