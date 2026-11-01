package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
public final class xn0 extends FrameLayout {
    public int D;
    public int E;
    public int F;
    public boolean G;
    public final zn0 H;
    public final Paint f43417a;
    public final Paint f43418b;
    public final Paint f43419c;
    public float d;
    public float e;
    public float f43420f;
    public float h;
    public int f43421n;
    public float f43422r;
    public float f43423s;
    public int f43424w;
    public int f43425x;
    public int f43426y;

    public xn0(zn0 zn0Var, Context context) {
        super(context);
        this.H = zn0Var;
        this.f43417a = null;
        this.f43418b = null;
        this.f43419c = null;
        this.d = 600.0f;
        this.e = 600.0f;
        this.f43420f = -1.0f;
        this.h = -1.0f;
        this.f43421n = 0;
        this.f43422r = 0.0f;
        this.f43423s = 0.0f;
        Paint paint = new Paint();
        this.f43417a = paint;
        paint.setColor(1073412858);
        this.f43417a.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        this.f43417a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f43418b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f43419c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new d0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        zn0 zn0Var = this.H;
        BitmapDrawable bitmapDrawable = zn0Var.f44027b;
        if (bitmapDrawable != null) {
            try {
                int i12 = this.f43426y;
                int i13 = this.D;
                bitmapDrawable.setBounds(i12, i13, this.f43424w + i12, this.f43425x + i13);
                zn0Var.f44027b.draw(canvas);
            } catch (Throwable th2) {
                org.telegram.messenger.f8.g(th2, true);
            }
        }
        canvas.drawRect(this.f43426y, this.D, i10 + this.f43424w, this.h, this.f43419c);
        float f7 = this.h;
        canvas.drawRect(this.f43426y, f7, this.f43420f, f7 + this.e, this.f43419c);
        float f10 = this.h;
        canvas.drawRect(this.f43420f + this.d, f10, this.f43426y + this.f43424w, f10 + this.e, this.f43419c);
        canvas.drawRect(this.f43426y, this.h + this.e, i11 + this.f43424w, this.D + this.f43425x, this.f43419c);
        float f11 = this.f43420f;
        float f12 = this.h;
        canvas.drawRect(f11, f12, f11 + this.d, f12 + this.e, this.f43417a);
        int L = org.telegram.messenger.i0.L(1.0f);
        float f13 = L;
        float f14 = this.f43420f + f13;
        float f15 = L * 3;
        canvas.drawRect(f14, this.h + f13, f14 + org.telegram.messenger.i0.L(20.0f), this.h + f15, this.f43418b);
        float f16 = this.f43420f;
        float f17 = this.h + f13;
        canvas.drawRect(f16 + f13, f17, f16 + f15, f17 + org.telegram.messenger.i0.L(20.0f), this.f43418b);
        float L2 = ((this.f43420f + this.d) - f13) - org.telegram.messenger.i0.L(20.0f);
        float f18 = this.h;
        canvas.drawRect(L2, f18 + f13, (this.f43420f + this.d) - f13, f18 + f15, this.f43418b);
        float f19 = this.f43420f + this.d;
        float f20 = this.h + f13;
        canvas.drawRect(f19 - f15, f20, f19 - f13, f20 + org.telegram.messenger.i0.L(20.0f), this.f43418b);
        canvas.drawRect(this.f43420f + f13, ((this.h + this.e) - f13) - org.telegram.messenger.i0.L(20.0f), this.f43420f + f15, (this.h + this.e) - f13, this.f43418b);
        float f21 = this.f43420f + f13;
        canvas.drawRect(f21, (this.h + this.e) - f15, f21 + org.telegram.messenger.i0.L(20.0f), (this.h + this.e) - f13, this.f43418b);
        float L3 = ((this.f43420f + this.d) - f13) - org.telegram.messenger.i0.L(20.0f);
        float f22 = this.h + this.e;
        canvas.drawRect(L3, f22 - f15, (this.f43420f + this.d) - f13, f22 - f13, this.f43418b);
        canvas.drawRect((this.f43420f + this.d) - f15, ((this.h + this.e) - f13) - org.telegram.messenger.i0.L(20.0f), (this.f43420f + this.d) - f13, (this.h + this.e) - f13, this.f43418b);
        for (int i14 = 1; i14 < 3; i14++) {
            float f23 = this.f43420f;
            float f24 = i14;
            float f25 = (this.d / 3.0f) * f24;
            float f26 = this.h;
            canvas.drawRect(f25 + f23, f26 + f13, f23 + f13 + f25, (f26 + this.e) - f13, this.f43418b);
            float f27 = this.f43420f;
            float c10 = a1.g.c(this.e, 3.0f, f24, this.h);
            canvas.drawRect(f27 + f13, c10, (f27 - f13) + this.d, c10 + f13, this.f43418b);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        zn0 zn0Var;
        Bitmap bitmap;
        float f7;
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        this.E = (i12 - i10) - org.telegram.messenger.i0.L(28.0f);
        int L = (i13 - i11) - org.telegram.messenger.i0.L(28.0f);
        this.F = L;
        if (this.E != 0 && L != 0 && (bitmap = (zn0Var = this.H).f44026a) != null) {
            float f10 = this.f43420f - this.f43426y;
            float f11 = this.f43424w;
            float f12 = f10 / f11;
            float f13 = this.h - this.D;
            float f14 = this.f43425x;
            float f15 = f13 / f14;
            float f16 = this.d / f11;
            float f17 = this.e / f14;
            float width = bitmap.getWidth();
            float height = zn0Var.f44026a.getHeight();
            int i16 = this.E;
            float f18 = i16 / width;
            int i17 = this.F;
            if (f18 > i17 / height) {
                this.f43425x = i17;
                this.f43424w = (int) Math.ceil(width * f7);
            } else {
                this.f43424w = i16;
                this.f43425x = (int) Math.ceil(height * f18);
            }
            this.f43426y = org.telegram.messenger.i0.L(14.0f) + ((this.E - this.f43424w) / 2);
            int L2 = org.telegram.messenger.i0.L(14.0f) + ((this.F - this.f43425x) / 2);
            this.D = L2;
            if (this.f43420f == -1.0f && this.h == -1.0f) {
                if (this.G) {
                    this.h = L2;
                    this.f43420f = this.f43426y;
                    this.d = this.f43424w;
                    this.e = this.f43425x;
                } else {
                    if (this.f43424w > this.f43425x) {
                        this.h = L2;
                        this.f43420f = org.telegram.messenger.i0.L(14.0f) + ((this.E - i15) / 2);
                        float f19 = this.f43425x;
                        this.d = f19;
                        this.e = f19;
                    } else {
                        this.f43420f = this.f43426y;
                        this.h = org.telegram.messenger.i0.L(14.0f) + ((this.F - i14) / 2);
                        float f20 = this.f43424w;
                        this.d = f20;
                        this.e = f20;
                    }
                }
            } else {
                float f21 = this.f43424w;
                this.f43420f = (f12 * f21) + this.f43426y;
                float f22 = this.f43425x;
                this.h = (f15 * f22) + L2;
                this.d = f16 * f21;
                this.e = f17 * f22;
            }
            invalidate();
        }
    }
}
