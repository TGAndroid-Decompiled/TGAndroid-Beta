package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class sp0 extends FrameLayout {
    public int B;
    public int C;
    public boolean D;
    public final up0 E;
    public final Paint f41337a;
    public final Paint f41338b;
    public final Paint f41339c;
    public float d;
    public float f41340e;
    public float f41341f;
    public float h;
    public int f41342n;
    public float f41343r;
    public float f41344s;
    public int v;
    public int f41345w;
    public int f41346x;
    public int f41347y;

    public sp0(up0 up0Var, Context context) {
        super(context);
        this.E = up0Var;
        this.f41337a = null;
        this.f41338b = null;
        this.f41339c = null;
        this.d = 600.0f;
        this.f41340e = 600.0f;
        this.f41341f = -1.0f;
        this.h = -1.0f;
        this.f41342n = 0;
        this.f41343r = 0.0f;
        this.f41344s = 0.0f;
        Paint paint = new Paint();
        this.f41337a = paint;
        paint.setColor(1073412858);
        this.f41337a.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.f41337a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f41338b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f41339c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new f0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        up0 up0Var = this.E;
        BitmapDrawable bitmapDrawable = up0Var.f42004b;
        if (bitmapDrawable != null) {
            try {
                int i12 = this.f41346x;
                int i13 = this.f41347y;
                bitmapDrawable.setBounds(i12, i13, this.v + i12, this.f41345w + i13);
                up0Var.f42004b.draw(canvas);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        canvas.drawRect(this.f41346x, this.f41347y, i10 + this.v, this.h, this.f41339c);
        float f10 = this.h;
        canvas.drawRect(this.f41346x, f10, this.f41341f, f10 + this.f41340e, this.f41339c);
        float f11 = this.h;
        canvas.drawRect(this.f41341f + this.d, f11, this.f41346x + this.v, f11 + this.f41340e, this.f41339c);
        canvas.drawRect(this.f41346x, this.h + this.f41340e, i11 + this.v, this.f41347y + this.f41345w, this.f41339c);
        float f12 = this.f41341f;
        float f13 = this.h;
        canvas.drawRect(f12, f13, f12 + this.d, f13 + this.f41340e, this.f41337a);
        int dp = AndroidUtilities.dp(1.0f);
        float f14 = this.f41341f;
        float f15 = dp;
        float f16 = dp * 3;
        canvas.drawRect(f14 + f15, this.h + f15, f14 + f15 + AndroidUtilities.dp(20.0f), this.h + f16, this.f41338b);
        float f17 = this.f41341f;
        float f18 = this.h;
        canvas.drawRect(f17 + f15, f18 + f15, f17 + f16, f18 + f15 + AndroidUtilities.dp(20.0f), this.f41338b);
        float dp2 = ((this.f41341f + this.d) - f15) - AndroidUtilities.dp(20.0f);
        float f19 = this.h;
        canvas.drawRect(dp2, f19 + f15, (this.f41341f + this.d) - f15, f19 + f16, this.f41338b);
        float f20 = this.f41341f;
        float f21 = this.d;
        float f22 = this.h;
        canvas.drawRect((f20 + f21) - f16, f22 + f15, (f20 + f21) - f15, f22 + f15 + AndroidUtilities.dp(20.0f), this.f41338b);
        canvas.drawRect(this.f41341f + f15, ((this.h + this.f41340e) - f15) - AndroidUtilities.dp(20.0f), this.f41341f + f16, (this.h + this.f41340e) - f15, this.f41338b);
        float f23 = this.f41341f;
        canvas.drawRect(f23 + f15, (this.h + this.f41340e) - f16, f23 + f15 + AndroidUtilities.dp(20.0f), (this.h + this.f41340e) - f15, this.f41338b);
        float dp3 = ((this.f41341f + this.d) - f15) - AndroidUtilities.dp(20.0f);
        float f24 = this.h;
        float f25 = this.f41340e;
        canvas.drawRect(dp3, (f24 + f25) - f16, (this.f41341f + this.d) - f15, (f24 + f25) - f15, this.f41338b);
        canvas.drawRect((this.f41341f + this.d) - f16, ((this.h + this.f41340e) - f15) - AndroidUtilities.dp(20.0f), (this.f41341f + this.d) - f15, (this.h + this.f41340e) - f15, this.f41338b);
        for (int i14 = 1; i14 < 3; i14++) {
            float f26 = this.f41341f;
            float f27 = this.d;
            float f28 = i14;
            float f29 = this.h;
            canvas.drawRect(((f27 / 3.0f) * f28) + f26, f29 + f15, w.c.c(f27, 3.0f, f28, f26 + f15), (f29 + this.f41340e) - f15, this.f41338b);
            float f30 = this.f41341f;
            float f31 = this.h;
            float f32 = this.f41340e;
            canvas.drawRect(f30 + f15, w.c.c(f32, 3.0f, f28, f31), this.d + (f30 - f15), ((f32 / 3.0f) * f28) + f31 + f15, this.f41338b);
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        up0 up0Var;
        Bitmap bitmap;
        float f10;
        int i14;
        int i15;
        super.onLayout(z4, i10, i11, i12, i13);
        this.B = (i12 - i10) - AndroidUtilities.dp(28.0f);
        int dp = (i13 - i11) - AndroidUtilities.dp(28.0f);
        this.C = dp;
        if (this.B != 0 && dp != 0 && (bitmap = (up0Var = this.E).f42003a) != null) {
            float f11 = this.f41341f - this.f41346x;
            float f12 = this.v;
            float f13 = f11 / f12;
            float f14 = this.h - this.f41347y;
            float f15 = this.f41345w;
            float f16 = f14 / f15;
            float f17 = this.d / f12;
            float f18 = this.f41340e / f15;
            float width = bitmap.getWidth();
            float height = up0Var.f42003a.getHeight();
            int i16 = this.B;
            float f19 = i16 / width;
            int i17 = this.C;
            if (f19 > i17 / height) {
                this.f41345w = i17;
                this.v = (int) Math.ceil(width * f10);
            } else {
                this.v = i16;
                this.f41345w = (int) Math.ceil(height * f19);
            }
            this.f41346x = AndroidUtilities.dp(14.0f) + ((this.B - this.v) / 2);
            int dp2 = AndroidUtilities.dp(14.0f) + ((this.C - this.f41345w) / 2);
            this.f41347y = dp2;
            if (this.f41341f == -1.0f && this.h == -1.0f) {
                if (this.D) {
                    this.h = dp2;
                    this.f41341f = this.f41346x;
                    this.d = this.v;
                    this.f41340e = this.f41345w;
                } else {
                    if (this.v > this.f41345w) {
                        this.h = dp2;
                        this.f41341f = AndroidUtilities.dp(14.0f) + ((this.B - i15) / 2);
                        float f20 = this.f41345w;
                        this.d = f20;
                        this.f41340e = f20;
                    } else {
                        this.f41341f = this.f41346x;
                        this.h = AndroidUtilities.dp(14.0f) + ((this.C - i14) / 2);
                        float f21 = this.v;
                        this.d = f21;
                        this.f41340e = f21;
                    }
                }
            } else {
                float f22 = this.v;
                this.f41341f = (f13 * f22) + this.f41346x;
                float f23 = this.f41345w;
                this.h = (f16 * f23) + dp2;
                this.d = f17 * f22;
                this.f41340e = f18 * f23;
            }
            invalidate();
        }
    }
}
