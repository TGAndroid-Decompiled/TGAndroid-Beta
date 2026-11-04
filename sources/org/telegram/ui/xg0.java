package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
public final class xg0 extends View implements org.telegram.ui.ActionBar.z5 {
    public final Paint f52021a;
    public final Paint f52022b;
    public final org.telegram.ui.Components.u5 f52023c;
    public final org.telegram.ui.Components.g6 d;
    public int f52024e;
    public float f52025f;
    public ValueAnimator h;

    public xg0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f52021a = paint;
        Paint paint2 = new Paint(1);
        this.f52022b = paint2;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.f52023c = new org.telegram.ui.Components.u5(this, 0L, 320L, xqVar);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.d = g6Var;
        this.f52025f = 1.0f;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
        paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        g6Var.setCallback(this);
        g6Var.n(0.35f, 200L, xqVar);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = g6Var.f33981a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(org.telegram.messenger.g0.L(0.24f));
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        g6Var.w(org.telegram.messenger.g0.L(13.3f));
        g6Var.u(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false));
        g6Var.M = org.telegram.messenger.g0.L(64.0f);
        g6Var.f33983b = 1;
    }

    public final boolean a(int i3) {
        int i10 = this.f52024e;
        boolean z10 = false;
        if (i10 != i3) {
            if (i10 < i3) {
                z10 = true;
            }
            this.f52024e = i3;
            String str = "";
            if (i3 > 0) {
                str = "" + this.f52024e;
            }
            this.d.t(str, true, true);
            if (z10) {
                ValueAnimator valueAnimator = this.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.h = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.h = ofFloat;
                ofFloat.addUpdateListener(new b3(this, 16));
                this.h.addListener(new y20(this, 6));
                org.telegram.messenger.camera.q.i(2.0f, this.h);
                this.h.setDuration(200L);
                this.h.start();
            }
        }
        return z10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        if (this.f52024e > 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.f52023c.e(false, f10);
        canvas.save();
        float f11 = this.f52025f;
        canvas.scale(f11 * e10, f11 * e10, getWidth() / 2.0f, getHeight() / 2.0f);
        org.telegram.ui.Components.g6 g6Var = this.d;
        float N = org.telegram.messenger.g0.N(12.66f) + g6Var.c();
        float N2 = org.telegram.messenger.g0.N(20.3f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - N) / 2.0f, (getHeight() - N2) / 2.0f, (getWidth() + N) / 2.0f, (getHeight() + N2) / 2.0f);
        int i3 = (int) (e10 * 255.0f);
        Paint paint = this.f52022b;
        paint.setAlpha(i3);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), paint);
        Paint paint2 = this.f52021a;
        paint2.setAlpha(i3);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), paint2);
        canvas.save();
        canvas.translate(0.0f, -org.telegram.messenger.g0.L(1.0f));
        g6Var.setBounds(0, 0, getWidth(), getHeight());
        g6Var.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void updateColors() {
        try {
            this.f52021a.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
            this.f52022b.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.d && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
