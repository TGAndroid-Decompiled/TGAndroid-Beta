package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class w70 extends ReplacementSpan {
    public final Paint f37736a;
    public final ImageReceiver f37737b;
    public final float f37738c;
    public float d;
    public final View e;
    public boolean f37739f;
    public float h;
    public int f37740n;

    public w70(View view, float f7, int i10) {
        f5 f5Var = new f5(this, 2);
        this.f37739f = true;
        this.f37740n = 255;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f37737b = imageReceiver;
        imageReceiver.setCurrentAccount(i10);
        this.f37738c = f7;
        Paint paint = new Paint(1);
        this.f37736a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        View view2 = this.e;
        if (view2 != view) {
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(f5Var);
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
                view.addOnAttachStateChangeListener(f5Var);
            }
        }
    }

    public final void a(float f7) {
        float dp = AndroidUtilities.dp(f7);
        this.d = dp;
        this.f37737b.setRoundRadius((int) dp);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        boolean z10 = this.f37739f;
        Paint paint2 = this.f37736a;
        if (z10 && this.f37740n != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.f37740n = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.j6.l1(this.f37740n / 255.0f, 855638016));
        }
        float f10 = this.h + f7;
        float dp = (((i12 + i14) / 2.0f) + 0.0f) - (AndroidUtilities.dp(this.f37738c) / 2.0f);
        if (this.f37739f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f10, dp, AndroidUtilities.dp(this.f37738c) + f10, AndroidUtilities.dp(this.f37738c) + dp);
            float f11 = this.d;
            canvas.drawRoundRect(rectF, f11, f11, paint2);
        }
        ImageReceiver imageReceiver = this.f37737b;
        imageReceiver.setImageCoords(f10, dp, AndroidUtilities.dp(this.f37738c), AndroidUtilities.dp(this.f37738c));
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.draw(canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.f37738c);
    }
}
