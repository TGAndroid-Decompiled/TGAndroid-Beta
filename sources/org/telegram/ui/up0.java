package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class up0 extends FrameLayout {
    public int E;
    public int F;
    public boolean G;
    public final wp0 H;
    public final Paint f42024a;
    public final Paint f42025b;
    public final Paint f42026c;
    public float d;
    public float e;
    public float f42027f;
    public float h;
    public int f42028n;
    public float f42029r;
    public float f42030s;
    public int v;
    public int f42031w;
    public int f42032x;
    public int f42033y;

    public up0(wp0 wp0Var, Context context) {
        super(context);
        this.H = wp0Var;
        this.f42024a = null;
        this.f42025b = null;
        this.f42026c = null;
        this.d = 600.0f;
        this.e = 600.0f;
        this.f42027f = -1.0f;
        this.h = -1.0f;
        this.f42028n = 0;
        this.f42029r = 0.0f;
        this.f42030s = 0.0f;
        Paint paint = new Paint();
        this.f42024a = paint;
        paint.setColor(1073412858);
        this.f42024a.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.f42024a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f42025b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f42026c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new e0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        wp0 wp0Var = this.H;
        BitmapDrawable bitmapDrawable = wp0Var.f42905b;
        if (bitmapDrawable != null) {
            try {
                int i12 = this.f42032x;
                int i13 = this.f42033y;
                bitmapDrawable.setBounds(i12, i13, this.v + i12, this.f42031w + i13);
                wp0Var.f42905b.draw(canvas);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        canvas.drawRect(this.f42032x, this.f42033y, i10 + this.v, this.h, this.f42026c);
        float f7 = this.h;
        canvas.drawRect(this.f42032x, f7, this.f42027f, f7 + this.e, this.f42026c);
        float f10 = this.h;
        canvas.drawRect(this.f42027f + this.d, f10, this.f42032x + this.v, f10 + this.e, this.f42026c);
        canvas.drawRect(this.f42032x, this.h + this.e, i11 + this.v, this.f42033y + this.f42031w, this.f42026c);
        float f11 = this.f42027f;
        float f12 = this.h;
        canvas.drawRect(f11, f12, f11 + this.d, f12 + this.e, this.f42024a);
        int dp = AndroidUtilities.dp(1.0f);
        float f13 = this.f42027f;
        float f14 = dp;
        float f15 = dp * 3;
        canvas.drawRect(f13 + f14, this.h + f14, f13 + f14 + AndroidUtilities.dp(20.0f), this.h + f15, this.f42025b);
        float f16 = this.f42027f;
        float f17 = this.h;
        canvas.drawRect(f16 + f14, f17 + f14, f16 + f15, f17 + f14 + AndroidUtilities.dp(20.0f), this.f42025b);
        float dp2 = ((this.f42027f + this.d) - f14) - AndroidUtilities.dp(20.0f);
        float f18 = this.h;
        canvas.drawRect(dp2, f18 + f14, (this.f42027f + this.d) - f14, f18 + f15, this.f42025b);
        float f19 = this.f42027f;
        float f20 = this.d;
        float f21 = this.h;
        canvas.drawRect((f19 + f20) - f15, f21 + f14, (f19 + f20) - f14, f21 + f14 + AndroidUtilities.dp(20.0f), this.f42025b);
        canvas.drawRect(this.f42027f + f14, ((this.h + this.e) - f14) - AndroidUtilities.dp(20.0f), this.f42027f + f15, (this.h + this.e) - f14, this.f42025b);
        float f22 = this.f42027f;
        canvas.drawRect(f22 + f14, (this.h + this.e) - f15, f22 + f14 + AndroidUtilities.dp(20.0f), (this.h + this.e) - f14, this.f42025b);
        float dp3 = ((this.f42027f + this.d) - f14) - AndroidUtilities.dp(20.0f);
        float f23 = this.h;
        float f24 = this.e;
        canvas.drawRect(dp3, (f23 + f24) - f15, (this.f42027f + this.d) - f14, (f23 + f24) - f14, this.f42025b);
        canvas.drawRect((this.f42027f + this.d) - f15, ((this.h + this.e) - f14) - AndroidUtilities.dp(20.0f), (this.f42027f + this.d) - f14, (this.h + this.e) - f14, this.f42025b);
        for (int i14 = 1; i14 < 3; i14++) {
            float f25 = this.f42027f;
            float f26 = this.d;
            float f27 = i14;
            float f28 = this.h;
            canvas.drawRect(((f26 / 3.0f) * f27) + f25, f28 + f14, a1.g.d(f26, 3.0f, f27, f25 + f14), (f28 + this.e) - f14, this.f42025b);
            float f29 = this.f42027f;
            float f30 = this.h;
            float f31 = this.e;
            canvas.drawRect(f29 + f14, a1.g.d(f31, 3.0f, f27, f30), this.d + (f29 - f14), ((f31 / 3.0f) * f27) + f30 + f14, this.f42025b);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        wp0 wp0Var;
        Bitmap bitmap;
        float f7;
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        this.E = (i12 - i10) - AndroidUtilities.dp(28.0f);
        int dp = (i13 - i11) - AndroidUtilities.dp(28.0f);
        this.F = dp;
        if (this.E != 0 && dp != 0 && (bitmap = (wp0Var = this.H).f42904a) != null) {
            float f10 = this.f42027f - this.f42032x;
            float f11 = this.v;
            float f12 = f10 / f11;
            float f13 = this.h - this.f42033y;
            float f14 = this.f42031w;
            float f15 = f13 / f14;
            float f16 = this.d / f11;
            float f17 = this.e / f14;
            float width = bitmap.getWidth();
            float height = wp0Var.f42904a.getHeight();
            int i16 = this.E;
            float f18 = i16 / width;
            int i17 = this.F;
            if (f18 > i17 / height) {
                this.f42031w = i17;
                this.v = (int) Math.ceil(width * f7);
            } else {
                this.v = i16;
                this.f42031w = (int) Math.ceil(height * f18);
            }
            this.f42032x = AndroidUtilities.dp(14.0f) + ((this.E - this.v) / 2);
            int dp2 = AndroidUtilities.dp(14.0f) + ((this.F - this.f42031w) / 2);
            this.f42033y = dp2;
            if (this.f42027f == -1.0f && this.h == -1.0f) {
                if (this.G) {
                    this.h = dp2;
                    this.f42027f = this.f42032x;
                    this.d = this.v;
                    this.e = this.f42031w;
                } else {
                    if (this.v > this.f42031w) {
                        this.h = dp2;
                        this.f42027f = AndroidUtilities.dp(14.0f) + ((this.E - i15) / 2);
                        float f19 = this.f42031w;
                        this.d = f19;
                        this.e = f19;
                    } else {
                        this.f42027f = this.f42032x;
                        this.h = AndroidUtilities.dp(14.0f) + ((this.F - i14) / 2);
                        float f20 = this.v;
                        this.d = f20;
                        this.e = f20;
                    }
                }
            } else {
                float f21 = this.v;
                this.f42027f = (f12 * f21) + this.f42032x;
                float f22 = this.f42031w;
                this.h = (f15 * f22) + dp2;
                this.d = f16 * f21;
                this.e = f17 * f22;
            }
            invalidate();
        }
    }
}
