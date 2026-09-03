package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class xp0 extends FrameLayout {
    public int B;
    public int C;
    public boolean D;
    public final zp0 E;
    public final Paint f40041a;
    public final Paint f40042b;
    public final Paint f40043c;
    public float d;
    public float e;
    public float f40044f;
    public float h;
    public int f40045n;
    public float f40046r;
    public float f40047s;
    public int v;
    public int f40048w;
    public int f40049x;
    public int f40050y;

    public xp0(zp0 zp0Var, Context context) {
        super(context);
        this.E = zp0Var;
        this.f40041a = null;
        this.f40042b = null;
        this.f40043c = null;
        this.d = 600.0f;
        this.e = 600.0f;
        this.f40044f = -1.0f;
        this.h = -1.0f;
        this.f40045n = 0;
        this.f40046r = 0.0f;
        this.f40047s = 0.0f;
        Paint paint = new Paint();
        this.f40041a = paint;
        paint.setColor(1073412858);
        this.f40041a.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.f40041a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f40042b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f40043c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new g0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        zp0 zp0Var = this.E;
        BitmapDrawable bitmapDrawable = zp0Var.f40853b;
        if (bitmapDrawable != null) {
            try {
                int i12 = this.f40049x;
                int i13 = this.f40050y;
                bitmapDrawable.setBounds(i12, i13, this.v + i12, this.f40048w + i13);
                zp0Var.f40853b.draw(canvas);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        canvas.drawRect(this.f40049x, this.f40050y, i10 + this.v, this.h, this.f40043c);
        float f10 = this.h;
        canvas.drawRect(this.f40049x, f10, this.f40044f, f10 + this.e, this.f40043c);
        float f11 = this.h;
        canvas.drawRect(this.f40044f + this.d, f11, this.f40049x + this.v, f11 + this.e, this.f40043c);
        canvas.drawRect(this.f40049x, this.h + this.e, i11 + this.v, this.f40050y + this.f40048w, this.f40043c);
        float f12 = this.f40044f;
        float f13 = this.h;
        canvas.drawRect(f12, f13, f12 + this.d, f13 + this.e, this.f40041a);
        int dp = AndroidUtilities.dp(1.0f);
        float f14 = this.f40044f;
        float f15 = dp;
        float f16 = dp * 3;
        canvas.drawRect(f14 + f15, this.h + f15, f14 + f15 + AndroidUtilities.dp(20.0f), this.h + f16, this.f40042b);
        float f17 = this.f40044f;
        float f18 = this.h;
        canvas.drawRect(f17 + f15, f18 + f15, f17 + f16, f18 + f15 + AndroidUtilities.dp(20.0f), this.f40042b);
        float dp2 = ((this.f40044f + this.d) - f15) - AndroidUtilities.dp(20.0f);
        float f19 = this.h;
        canvas.drawRect(dp2, f19 + f15, (this.f40044f + this.d) - f15, f19 + f16, this.f40042b);
        float f20 = this.f40044f;
        float f21 = this.d;
        float f22 = this.h;
        canvas.drawRect((f20 + f21) - f16, f22 + f15, (f20 + f21) - f15, f22 + f15 + AndroidUtilities.dp(20.0f), this.f40042b);
        canvas.drawRect(this.f40044f + f15, ((this.h + this.e) - f15) - AndroidUtilities.dp(20.0f), this.f40044f + f16, (this.h + this.e) - f15, this.f40042b);
        float f23 = this.f40044f;
        canvas.drawRect(f23 + f15, (this.h + this.e) - f16, f23 + f15 + AndroidUtilities.dp(20.0f), (this.h + this.e) - f15, this.f40042b);
        float dp3 = ((this.f40044f + this.d) - f15) - AndroidUtilities.dp(20.0f);
        float f24 = this.h;
        float f25 = this.e;
        canvas.drawRect(dp3, (f24 + f25) - f16, (this.f40044f + this.d) - f15, (f24 + f25) - f15, this.f40042b);
        canvas.drawRect((this.f40044f + this.d) - f16, ((this.h + this.e) - f15) - AndroidUtilities.dp(20.0f), (this.f40044f + this.d) - f15, (this.h + this.e) - f15, this.f40042b);
        for (int i14 = 1; i14 < 3; i14++) {
            float f26 = this.f40044f;
            float f27 = this.d;
            float f28 = i14;
            float f29 = this.h;
            canvas.drawRect(((f27 / 3.0f) * f28) + f26, f29 + f15, vh.w2.c(f27, 3.0f, f28, f26 + f15), (f29 + this.e) - f15, this.f40042b);
            float f30 = this.f40044f;
            float f31 = this.h;
            float f32 = this.e;
            canvas.drawRect(f30 + f15, vh.w2.c(f32, 3.0f, f28, f31), this.d + (f30 - f15), ((f32 / 3.0f) * f28) + f31 + f15, this.f40042b);
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        zp0 zp0Var;
        Bitmap bitmap;
        float f10;
        int i14;
        int i15;
        super.onLayout(z4, i10, i11, i12, i13);
        this.B = (i12 - i10) - AndroidUtilities.dp(28.0f);
        int dp = (i13 - i11) - AndroidUtilities.dp(28.0f);
        this.C = dp;
        if (this.B != 0 && dp != 0 && (bitmap = (zp0Var = this.E).f40852a) != null) {
            float f11 = this.f40044f - this.f40049x;
            float f12 = this.v;
            float f13 = f11 / f12;
            float f14 = this.h - this.f40050y;
            float f15 = this.f40048w;
            float f16 = f14 / f15;
            float f17 = this.d / f12;
            float f18 = this.e / f15;
            float width = bitmap.getWidth();
            float height = zp0Var.f40852a.getHeight();
            int i16 = this.B;
            float f19 = i16 / width;
            int i17 = this.C;
            if (f19 > i17 / height) {
                this.f40048w = i17;
                this.v = (int) Math.ceil(width * f10);
            } else {
                this.v = i16;
                this.f40048w = (int) Math.ceil(height * f19);
            }
            this.f40049x = AndroidUtilities.dp(14.0f) + ((this.B - this.v) / 2);
            int dp2 = AndroidUtilities.dp(14.0f) + ((this.C - this.f40048w) / 2);
            this.f40050y = dp2;
            if (this.f40044f == -1.0f && this.h == -1.0f) {
                if (this.D) {
                    this.h = dp2;
                    this.f40044f = this.f40049x;
                    this.d = this.v;
                    this.e = this.f40048w;
                } else {
                    if (this.v > this.f40048w) {
                        this.h = dp2;
                        this.f40044f = AndroidUtilities.dp(14.0f) + ((this.B - i15) / 2);
                        float f20 = this.f40048w;
                        this.d = f20;
                        this.e = f20;
                    } else {
                        this.f40044f = this.f40049x;
                        this.h = AndroidUtilities.dp(14.0f) + ((this.C - i14) / 2);
                        float f21 = this.v;
                        this.d = f21;
                        this.e = f21;
                    }
                }
            } else {
                float f22 = this.v;
                this.f40044f = (f13 * f22) + this.f40049x;
                float f23 = this.f40048w;
                this.h = (f16 * f23) + dp2;
                this.d = f17 * f22;
                this.e = f18 * f23;
            }
            invalidate();
        }
    }
}
