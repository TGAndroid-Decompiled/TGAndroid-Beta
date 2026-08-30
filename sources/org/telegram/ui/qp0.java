package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class qp0 extends FrameLayout {
    public int B;
    public int C;
    public boolean D;
    public final sp0 E;
    public final Paint f37813a;
    public final Paint f37814b;
    public final Paint f37815c;
    public float d;
    public float e;
    public float f37816f;
    public float h;
    public int f37817n;
    public float f37818r;
    public float f37819s;
    public int v;
    public int f37820w;
    public int f37821x;
    public int f37822y;

    public qp0(sp0 sp0Var, Context context) {
        super(context);
        this.E = sp0Var;
        this.f37813a = null;
        this.f37814b = null;
        this.f37815c = null;
        this.d = 600.0f;
        this.e = 600.0f;
        this.f37816f = -1.0f;
        this.h = -1.0f;
        this.f37817n = 0;
        this.f37818r = 0.0f;
        this.f37819s = 0.0f;
        Paint paint = new Paint();
        this.f37813a = paint;
        paint.setColor(1073412858);
        this.f37813a.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.f37813a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f37814b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f37815c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new f0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        sp0 sp0Var = this.E;
        BitmapDrawable bitmapDrawable = sp0Var.f38420b;
        if (bitmapDrawable != null) {
            try {
                int i12 = this.f37821x;
                int i13 = this.f37822y;
                bitmapDrawable.setBounds(i12, i13, this.v + i12, this.f37820w + i13);
                sp0Var.f38420b.draw(canvas);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        canvas.drawRect(this.f37821x, this.f37822y, i10 + this.v, this.h, this.f37815c);
        float f10 = this.h;
        canvas.drawRect(this.f37821x, f10, this.f37816f, f10 + this.e, this.f37815c);
        float f11 = this.h;
        canvas.drawRect(this.f37816f + this.d, f11, this.f37821x + this.v, f11 + this.e, this.f37815c);
        canvas.drawRect(this.f37821x, this.h + this.e, i11 + this.v, this.f37822y + this.f37820w, this.f37815c);
        float f12 = this.f37816f;
        float f13 = this.h;
        canvas.drawRect(f12, f13, f12 + this.d, f13 + this.e, this.f37813a);
        int dp = AndroidUtilities.dp(1.0f);
        float f14 = this.f37816f;
        float f15 = dp;
        float f16 = dp * 3;
        canvas.drawRect(f14 + f15, this.h + f15, f14 + f15 + AndroidUtilities.dp(20.0f), this.h + f16, this.f37814b);
        float f17 = this.f37816f;
        float f18 = this.h;
        canvas.drawRect(f17 + f15, f18 + f15, f17 + f16, f18 + f15 + AndroidUtilities.dp(20.0f), this.f37814b);
        float dp2 = ((this.f37816f + this.d) - f15) - AndroidUtilities.dp(20.0f);
        float f19 = this.h;
        canvas.drawRect(dp2, f19 + f15, (this.f37816f + this.d) - f15, f19 + f16, this.f37814b);
        float f20 = this.f37816f;
        float f21 = this.d;
        float f22 = this.h;
        canvas.drawRect((f20 + f21) - f16, f22 + f15, (f20 + f21) - f15, f22 + f15 + AndroidUtilities.dp(20.0f), this.f37814b);
        canvas.drawRect(this.f37816f + f15, ((this.h + this.e) - f15) - AndroidUtilities.dp(20.0f), this.f37816f + f16, (this.h + this.e) - f15, this.f37814b);
        float f23 = this.f37816f;
        canvas.drawRect(f23 + f15, (this.h + this.e) - f16, f23 + f15 + AndroidUtilities.dp(20.0f), (this.h + this.e) - f15, this.f37814b);
        float dp3 = ((this.f37816f + this.d) - f15) - AndroidUtilities.dp(20.0f);
        float f24 = this.h;
        float f25 = this.e;
        canvas.drawRect(dp3, (f24 + f25) - f16, (this.f37816f + this.d) - f15, (f24 + f25) - f15, this.f37814b);
        canvas.drawRect((this.f37816f + this.d) - f16, ((this.h + this.e) - f15) - AndroidUtilities.dp(20.0f), (this.f37816f + this.d) - f15, (this.h + this.e) - f15, this.f37814b);
        for (int i14 = 1; i14 < 3; i14++) {
            float f26 = this.f37816f;
            float f27 = this.d;
            float f28 = i14;
            float f29 = this.h;
            canvas.drawRect(((f27 / 3.0f) * f28) + f26, f29 + f15, vh.v2.c(f27, 3.0f, f28, f26 + f15), (f29 + this.e) - f15, this.f37814b);
            float f30 = this.f37816f;
            float f31 = this.h;
            float f32 = this.e;
            canvas.drawRect(f30 + f15, vh.v2.c(f32, 3.0f, f28, f31), this.d + (f30 - f15), ((f32 / 3.0f) * f28) + f31 + f15, this.f37814b);
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        sp0 sp0Var;
        Bitmap bitmap;
        float f10;
        int i14;
        int i15;
        super.onLayout(z4, i10, i11, i12, i13);
        this.B = (i12 - i10) - AndroidUtilities.dp(28.0f);
        int dp = (i13 - i11) - AndroidUtilities.dp(28.0f);
        this.C = dp;
        if (this.B != 0 && dp != 0 && (bitmap = (sp0Var = this.E).f38419a) != null) {
            float f11 = this.f37816f - this.f37821x;
            float f12 = this.v;
            float f13 = f11 / f12;
            float f14 = this.h - this.f37822y;
            float f15 = this.f37820w;
            float f16 = f14 / f15;
            float f17 = this.d / f12;
            float f18 = this.e / f15;
            float width = bitmap.getWidth();
            float height = sp0Var.f38419a.getHeight();
            int i16 = this.B;
            float f19 = i16 / width;
            int i17 = this.C;
            if (f19 > i17 / height) {
                this.f37820w = i17;
                this.v = (int) Math.ceil(width * f10);
            } else {
                this.v = i16;
                this.f37820w = (int) Math.ceil(height * f19);
            }
            this.f37821x = AndroidUtilities.dp(14.0f) + ((this.B - this.v) / 2);
            int dp2 = AndroidUtilities.dp(14.0f) + ((this.C - this.f37820w) / 2);
            this.f37822y = dp2;
            if (this.f37816f == -1.0f && this.h == -1.0f) {
                if (this.D) {
                    this.h = dp2;
                    this.f37816f = this.f37821x;
                    this.d = this.v;
                    this.e = this.f37820w;
                } else {
                    if (this.v > this.f37820w) {
                        this.h = dp2;
                        this.f37816f = AndroidUtilities.dp(14.0f) + ((this.B - i15) / 2);
                        float f20 = this.f37820w;
                        this.d = f20;
                        this.e = f20;
                    } else {
                        this.f37816f = this.f37821x;
                        this.h = AndroidUtilities.dp(14.0f) + ((this.C - i14) / 2);
                        float f21 = this.v;
                        this.d = f21;
                        this.e = f21;
                    }
                }
            } else {
                float f22 = this.v;
                this.f37816f = (f13 * f22) + this.f37821x;
                float f23 = this.f37820w;
                this.h = (f16 * f23) + dp2;
                this.d = f17 * f22;
                this.e = f18 * f23;
            }
            invalidate();
        }
    }
}
