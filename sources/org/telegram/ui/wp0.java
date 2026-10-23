package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class wp0 extends FrameLayout {
    public int E;
    public int F;
    public boolean G;
    public final yp0 H;
    public final Paint f43409a;
    public final Paint f43410b;
    public final Paint f43411c;
    public float d;
    public float e;
    public float f43412f;
    public float h;
    public int f43413n;
    public float f43414r;
    public float f43415s;
    public int v;
    public int f43416w;
    public int f43417x;
    public int f43418y;

    public wp0(yp0 yp0Var, Context context) {
        super(context);
        this.H = yp0Var;
        this.f43409a = null;
        this.f43410b = null;
        this.f43411c = null;
        this.d = 600.0f;
        this.e = 600.0f;
        this.f43412f = -1.0f;
        this.h = -1.0f;
        this.f43413n = 0;
        this.f43414r = 0.0f;
        this.f43415s = 0.0f;
        Paint paint = new Paint();
        this.f43409a = paint;
        paint.setColor(1073412858);
        this.f43409a.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.f43409a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f43410b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f43411c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new d0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        yp0 yp0Var = this.H;
        BitmapDrawable bitmapDrawable = yp0Var.f43946b;
        if (bitmapDrawable != null) {
            try {
                int i12 = this.f43417x;
                int i13 = this.f43418y;
                bitmapDrawable.setBounds(i12, i13, this.v + i12, this.f43416w + i13);
                yp0Var.f43946b.draw(canvas);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        canvas.drawRect(this.f43417x, this.f43418y, i10 + this.v, this.h, this.f43411c);
        float f7 = this.h;
        canvas.drawRect(this.f43417x, f7, this.f43412f, f7 + this.e, this.f43411c);
        float f10 = this.h;
        canvas.drawRect(this.f43412f + this.d, f10, this.f43417x + this.v, f10 + this.e, this.f43411c);
        canvas.drawRect(this.f43417x, this.h + this.e, i11 + this.v, this.f43418y + this.f43416w, this.f43411c);
        float f11 = this.f43412f;
        float f12 = this.h;
        canvas.drawRect(f11, f12, f11 + this.d, f12 + this.e, this.f43409a);
        int dp = AndroidUtilities.dp(1.0f);
        float f13 = this.f43412f;
        float f14 = dp;
        float f15 = dp * 3;
        canvas.drawRect(f13 + f14, this.h + f14, f13 + f14 + AndroidUtilities.dp(20.0f), this.h + f15, this.f43410b);
        float f16 = this.f43412f;
        float f17 = this.h;
        canvas.drawRect(f16 + f14, f17 + f14, f16 + f15, f17 + f14 + AndroidUtilities.dp(20.0f), this.f43410b);
        float dp2 = ((this.f43412f + this.d) - f14) - AndroidUtilities.dp(20.0f);
        float f18 = this.h;
        canvas.drawRect(dp2, f18 + f14, (this.f43412f + this.d) - f14, f18 + f15, this.f43410b);
        float f19 = this.f43412f;
        float f20 = this.d;
        float f21 = this.h;
        canvas.drawRect((f19 + f20) - f15, f21 + f14, (f19 + f20) - f14, f21 + f14 + AndroidUtilities.dp(20.0f), this.f43410b);
        canvas.drawRect(this.f43412f + f14, ((this.h + this.e) - f14) - AndroidUtilities.dp(20.0f), this.f43412f + f15, (this.h + this.e) - f14, this.f43410b);
        float f22 = this.f43412f;
        canvas.drawRect(f22 + f14, (this.h + this.e) - f15, f22 + f14 + AndroidUtilities.dp(20.0f), (this.h + this.e) - f14, this.f43410b);
        float dp3 = ((this.f43412f + this.d) - f14) - AndroidUtilities.dp(20.0f);
        float f23 = this.h;
        float f24 = this.e;
        canvas.drawRect(dp3, (f23 + f24) - f15, (this.f43412f + this.d) - f14, (f23 + f24) - f14, this.f43410b);
        canvas.drawRect((this.f43412f + this.d) - f15, ((this.h + this.e) - f14) - AndroidUtilities.dp(20.0f), (this.f43412f + this.d) - f14, (this.h + this.e) - f14, this.f43410b);
        for (int i14 = 1; i14 < 3; i14++) {
            float f25 = this.f43412f;
            float f26 = this.d;
            float f27 = i14;
            float f28 = this.h;
            canvas.drawRect(((f26 / 3.0f) * f27) + f25, f28 + f14, a1.g.d(f26, 3.0f, f27, f25 + f14), (f28 + this.e) - f14, this.f43410b);
            float f29 = this.f43412f;
            float f30 = this.h;
            float f31 = this.e;
            canvas.drawRect(f29 + f14, a1.g.d(f31, 3.0f, f27, f30), this.d + (f29 - f14), ((f31 / 3.0f) * f27) + f30 + f14, this.f43410b);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yp0 yp0Var;
        Bitmap bitmap;
        float f7;
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        this.E = (i12 - i10) - AndroidUtilities.dp(28.0f);
        int dp = (i13 - i11) - AndroidUtilities.dp(28.0f);
        this.F = dp;
        if (this.E != 0 && dp != 0 && (bitmap = (yp0Var = this.H).f43945a) != null) {
            float f10 = this.f43412f - this.f43417x;
            float f11 = this.v;
            float f12 = f10 / f11;
            float f13 = this.h - this.f43418y;
            float f14 = this.f43416w;
            float f15 = f13 / f14;
            float f16 = this.d / f11;
            float f17 = this.e / f14;
            float width = bitmap.getWidth();
            float height = yp0Var.f43945a.getHeight();
            int i16 = this.E;
            float f18 = i16 / width;
            int i17 = this.F;
            if (f18 > i17 / height) {
                this.f43416w = i17;
                this.v = (int) Math.ceil(width * f7);
            } else {
                this.v = i16;
                this.f43416w = (int) Math.ceil(height * f18);
            }
            this.f43417x = AndroidUtilities.dp(14.0f) + ((this.E - this.v) / 2);
            int dp2 = AndroidUtilities.dp(14.0f) + ((this.F - this.f43416w) / 2);
            this.f43418y = dp2;
            if (this.f43412f == -1.0f && this.h == -1.0f) {
                if (this.G) {
                    this.h = dp2;
                    this.f43412f = this.f43417x;
                    this.d = this.v;
                    this.e = this.f43416w;
                } else {
                    if (this.v > this.f43416w) {
                        this.h = dp2;
                        this.f43412f = AndroidUtilities.dp(14.0f) + ((this.E - i15) / 2);
                        float f19 = this.f43416w;
                        this.d = f19;
                        this.e = f19;
                    } else {
                        this.f43412f = this.f43417x;
                        this.h = AndroidUtilities.dp(14.0f) + ((this.F - i14) / 2);
                        float f20 = this.v;
                        this.d = f20;
                        this.e = f20;
                    }
                }
            } else {
                float f21 = this.v;
                this.f43412f = (f12 * f21) + this.f43417x;
                float f22 = this.f43416w;
                this.h = (f15 * f22) + dp2;
                this.d = f16 * f21;
                this.e = f17 * f22;
            }
            invalidate();
        }
    }
}
