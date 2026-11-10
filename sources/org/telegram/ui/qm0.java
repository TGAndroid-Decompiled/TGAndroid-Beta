package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
public final class qm0 extends FrameLayout {
    public int D;
    public int E;
    public int F;
    public boolean G;
    public final sm0 H;
    public final Paint f49096a;
    public final Paint f49097b;
    public final Paint f49098c;
    public float d;
    public float f49099e;
    public float f49100f;
    public float h;
    public int f49101n;
    public float f49102r;
    public float f49103s;
    public int f49104w;
    public int f49105x;
    public int f49106y;

    public qm0(sm0 sm0Var, Context context) {
        super(context);
        this.H = sm0Var;
        this.f49096a = null;
        this.f49097b = null;
        this.f49098c = null;
        this.d = 600.0f;
        this.f49099e = 600.0f;
        this.f49100f = -1.0f;
        this.h = -1.0f;
        this.f49101n = 0;
        this.f49102r = 0.0f;
        this.f49103s = 0.0f;
        Paint paint = new Paint();
        this.f49096a = paint;
        paint.setColor(1073412858);
        this.f49096a.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.f49096a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f49097b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f49098c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new d0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10;
        sm0 sm0Var = this.H;
        BitmapDrawable bitmapDrawable = sm0Var.f49893b;
        if (bitmapDrawable != null) {
            try {
                int i11 = this.f49106y;
                int i12 = this.D;
                bitmapDrawable.setBounds(i11, i12, this.f49104w + i11, this.f49105x + i12);
                sm0Var.f49893b.draw(canvas);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        canvas.drawRect(this.f49106y, this.D, i7 + this.f49104w, this.h, this.f49098c);
        float f10 = this.h;
        canvas.drawRect(this.f49106y, f10, this.f49100f, f10 + this.f49099e, this.f49098c);
        float f11 = this.h;
        canvas.drawRect(this.f49100f + this.d, f11, this.f49106y + this.f49104w, f11 + this.f49099e, this.f49098c);
        canvas.drawRect(this.f49106y, this.h + this.f49099e, i10 + this.f49104w, this.D + this.f49105x, this.f49098c);
        float f12 = this.f49100f;
        float f13 = this.h;
        canvas.drawRect(f12, f13, f12 + this.d, f13 + this.f49099e, this.f49096a);
        int L = org.telegram.messenger.g0.L(1.0f);
        float f14 = L;
        float f15 = this.f49100f + f14;
        float f16 = L * 3;
        canvas.drawRect(f15, this.h + f14, f15 + org.telegram.messenger.g0.L(20.0f), this.h + f16, this.f49097b);
        float f17 = this.f49100f;
        float f18 = this.h + f14;
        canvas.drawRect(f17 + f14, f18, f17 + f16, f18 + org.telegram.messenger.g0.L(20.0f), this.f49097b);
        float L2 = ((this.f49100f + this.d) - f14) - org.telegram.messenger.g0.L(20.0f);
        float f19 = this.h;
        canvas.drawRect(L2, f19 + f14, (this.f49100f + this.d) - f14, f19 + f16, this.f49097b);
        float f20 = this.f49100f + this.d;
        float f21 = this.h + f14;
        canvas.drawRect(f20 - f16, f21, f20 - f14, f21 + org.telegram.messenger.g0.L(20.0f), this.f49097b);
        canvas.drawRect(this.f49100f + f14, ((this.h + this.f49099e) - f14) - org.telegram.messenger.g0.L(20.0f), this.f49100f + f16, (this.h + this.f49099e) - f14, this.f49097b);
        float f22 = this.f49100f + f14;
        canvas.drawRect(f22, (this.h + this.f49099e) - f16, f22 + org.telegram.messenger.g0.L(20.0f), (this.h + this.f49099e) - f14, this.f49097b);
        float L3 = ((this.f49100f + this.d) - f14) - org.telegram.messenger.g0.L(20.0f);
        float f23 = this.h + this.f49099e;
        canvas.drawRect(L3, f23 - f16, (this.f49100f + this.d) - f14, f23 - f14, this.f49097b);
        canvas.drawRect((this.f49100f + this.d) - f16, ((this.h + this.f49099e) - f14) - org.telegram.messenger.g0.L(20.0f), (this.f49100f + this.d) - f14, (this.h + this.f49099e) - f14, this.f49097b);
        for (int i13 = 1; i13 < 3; i13++) {
            float f24 = this.f49100f;
            float f25 = i13;
            float f26 = (this.d / 3.0f) * f25;
            float f27 = this.h;
            canvas.drawRect(f26 + f24, f27 + f14, f24 + f14 + f26, (f27 + this.f49099e) - f14, this.f49097b);
            float f28 = this.f49100f;
            float c10 = com.google.android.recaptcha.internal.a.c(this.f49099e, 3.0f, f25, this.h);
            canvas.drawRect(f28 + f14, c10, (f28 - f14) + this.d, c10 + f14, this.f49097b);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        sm0 sm0Var;
        Bitmap bitmap;
        float f10;
        int i13;
        int i14;
        super.onLayout(z9, i7, i10, i11, i12);
        this.E = (i11 - i7) - org.telegram.messenger.g0.L(28.0f);
        int L = (i12 - i10) - org.telegram.messenger.g0.L(28.0f);
        this.F = L;
        if (this.E != 0 && L != 0 && (bitmap = (sm0Var = this.H).f49892a) != null) {
            float f11 = this.f49100f - this.f49106y;
            float f12 = this.f49104w;
            float f13 = f11 / f12;
            float f14 = this.h - this.D;
            float f15 = this.f49105x;
            float f16 = f14 / f15;
            float f17 = this.d / f12;
            float f18 = this.f49099e / f15;
            float width = bitmap.getWidth();
            float height = sm0Var.f49892a.getHeight();
            int i15 = this.E;
            float f19 = i15 / width;
            int i16 = this.F;
            if (f19 > i16 / height) {
                this.f49105x = i16;
                this.f49104w = (int) Math.ceil(width * f10);
            } else {
                this.f49104w = i15;
                this.f49105x = (int) Math.ceil(height * f19);
            }
            this.f49106y = org.telegram.messenger.g0.L(14.0f) + ((this.E - this.f49104w) / 2);
            int L2 = org.telegram.messenger.g0.L(14.0f) + ((this.F - this.f49105x) / 2);
            this.D = L2;
            if (this.f49100f == -1.0f && this.h == -1.0f) {
                if (this.G) {
                    this.h = L2;
                    this.f49100f = this.f49106y;
                    this.d = this.f49104w;
                    this.f49099e = this.f49105x;
                } else {
                    if (this.f49104w > this.f49105x) {
                        this.h = L2;
                        this.f49100f = org.telegram.messenger.g0.L(14.0f) + ((this.E - i14) / 2);
                        float f20 = this.f49105x;
                        this.d = f20;
                        this.f49099e = f20;
                    } else {
                        this.f49100f = this.f49106y;
                        this.h = org.telegram.messenger.g0.L(14.0f) + ((this.F - i13) / 2);
                        float f21 = this.f49104w;
                        this.d = f21;
                        this.f49099e = f21;
                    }
                }
            } else {
                float f22 = this.f49104w;
                this.f49100f = (f13 * f22) + this.f49106y;
                float f23 = this.f49105x;
                this.h = (f16 * f23) + L2;
                this.d = f17 * f22;
                this.f49099e = f18 * f23;
            }
            invalidate();
        }
    }
}
