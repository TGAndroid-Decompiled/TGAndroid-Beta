package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class w70 extends ReplacementSpan {
    public final Paint f41961a;
    public final ImageReceiver f41962b;
    public final float f41963c;
    public float d;
    public final View f41964e;
    public boolean f41965f;
    public float h;
    public int f41966n;

    public w70(View view, float f7, int i10) {
        g5 g5Var = new g5(this, 2);
        this.f41965f = true;
        this.f41966n = 255;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f41962b = imageReceiver;
        imageReceiver.setCurrentAccount(i10);
        this.f41963c = f7;
        Paint paint = new Paint(1);
        this.f41961a = paint;
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), 855638016);
        View view2 = this.f41964e;
        if (view2 != view) {
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(g5Var);
                if (this.f41964e.isAttachedToWindow() && !view.isAttachedToWindow()) {
                    imageReceiver.onDetachedFromWindow();
                }
            }
            View view3 = this.f41964e;
            if ((view3 == null || !view3.isAttachedToWindow()) && view != null && view.isAttachedToWindow()) {
                imageReceiver.onAttachedToWindow();
            }
            this.f41964e = view;
            imageReceiver.setParentView(view);
            if (view != null) {
                view.addOnAttachStateChangeListener(g5Var);
            }
        }
    }

    public final void a(float f7) {
        float dp = AndroidUtilities.dp(f7);
        this.d = dp;
        this.f41962b.setRoundRadius((int) dp);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        boolean z10 = this.f41965f;
        Paint paint2 = this.f41961a;
        if (z10 && this.f41966n != paint.getAlpha()) {
            int alpha = paint.getAlpha();
            this.f41966n = alpha;
            paint2.setAlpha(alpha);
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.66f), org.telegram.ui.ActionBar.i6.l1(this.f41966n / 255.0f, 855638016));
        }
        float f10 = this.h + f7;
        float dp = (((i12 + i14) / 2.0f) + 0.0f) - (AndroidUtilities.dp(this.f41963c) / 2.0f);
        if (this.f41965f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(f10, dp, AndroidUtilities.dp(this.f41963c) + f10, AndroidUtilities.dp(this.f41963c) + dp);
            float f11 = this.d;
            canvas.drawRoundRect(rectF, f11, f11, paint2);
        }
        ImageReceiver imageReceiver = this.f41962b;
        imageReceiver.setImageCoords(f10, dp, AndroidUtilities.dp(this.f41963c), AndroidUtilities.dp(this.f41963c));
        imageReceiver.setAlpha(paint.getAlpha() / 255.0f);
        imageReceiver.draw(canvas);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(this.f41963c);
    }
}
