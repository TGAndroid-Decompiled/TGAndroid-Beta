package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class wj0 extends View {
    public final Paint f42832a;
    public final Paint f42833b;
    public final org.telegram.ui.Components.z5 f42834c;
    public final org.telegram.ui.Components.j6 d;
    public int f42835e;
    public float f42836f;
    public ValueAnimator h;

    public wj0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f42832a = paint;
        Paint paint2 = new Paint(1);
        this.f42833b = paint2;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.f42834c = new org.telegram.ui.Components.z5(this, 0L, 320L, prVar);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.d = j6Var;
        this.f42836f = 1.0f;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false));
        paint2.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21731h5, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(4.0f));
        j6Var.setCallback(this);
        j6Var.k(0.35f, 200L, prVar);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = j6Var.f28028a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dp(0.24f));
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        j6Var.t(AndroidUtilities.dp(13.3f));
        j6Var.r(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
        j6Var.G = AndroidUtilities.dp(64.0f);
        j6Var.f28029b = 1;
    }

    public final boolean a(int i10) {
        int i11 = this.f42835e;
        boolean z4 = false;
        if (i11 != i10) {
            if (i11 < i10) {
                z4 = true;
            }
            this.f42835e = i10;
            String str = "";
            if (i10 > 0) {
                str = "" + this.f42835e;
            }
            this.d.q(str, true, true);
            if (z4) {
                ValueAnimator valueAnimator = this.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.h = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.h = ofFloat;
                ofFloat.addUpdateListener(new e3(this, 18));
                this.h.addListener(new org.telegram.ui.Components.g91(this, 26));
                this.h.setInterpolator(new OvershootInterpolator(2.0f));
                this.h.setDuration(200L);
                this.h.start();
            }
        }
        return z4;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        if (this.f42835e > 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.f42834c.d(f10, false);
        canvas.save();
        float f11 = this.f42836f;
        canvas.scale(f11 * d, f11 * d, getWidth() / 2.0f, getHeight() / 2.0f);
        org.telegram.ui.Components.j6 j6Var = this.d;
        float dpf2 = AndroidUtilities.dpf2(12.66f) + j6Var.d();
        float dpf22 = AndroidUtilities.dpf2(20.3f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dpf2) / 2.0f, (getHeight() - dpf22) / 2.0f, (getWidth() + dpf2) / 2.0f, (getHeight() + dpf22) / 2.0f);
        int i10 = (int) (d * 255.0f);
        Paint paint = this.f42833b;
        paint.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint);
        Paint paint2 = this.f42832a;
        paint2.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint2);
        canvas.save();
        canvas.translate(0.0f, -AndroidUtilities.dp(1.0f));
        j6Var.setBounds(0, 0, getWidth(), getHeight());
        j6Var.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
