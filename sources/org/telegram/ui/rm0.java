package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
public final class rm0 extends FrameLayout {
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final tm0 I;
    public final Paint f51653a;
    public final Paint f51654b;
    public final Paint f51655c;
    public float d;
    public float f51656e;
    public float f51657f;
    public float h;
    public int f51658n;
    public float f51659r;
    public float f51660s;
    public int f51661w;
    public int f51662x;
    public int f51663y;

    public rm0(tm0 tm0Var, Context context) {
        super(context);
        this.I = tm0Var;
        this.f51653a = null;
        this.f51654b = null;
        this.f51655c = null;
        this.d = 600.0f;
        this.f51656e = 600.0f;
        this.f51657f = -1.0f;
        this.h = -1.0f;
        this.f51658n = 0;
        this.f51659r = 0.0f;
        this.f51660s = 0.0f;
        Paint paint = new Paint();
        this.f51653a = paint;
        paint.setColor(1073412858);
        this.f51653a.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.f51653a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f51654b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f51655c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new d0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10;
        tm0 tm0Var = this.I;
        BitmapDrawable bitmapDrawable = tm0Var.f52302b;
        if (bitmapDrawable != null) {
            try {
                int i11 = this.f51663y;
                int i12 = this.E;
                bitmapDrawable.setBounds(i11, i12, this.f51661w + i11, this.f51662x + i12);
                tm0Var.f52302b.draw(canvas);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        canvas.drawRect(this.f51663y, this.E, i7 + this.f51661w, this.h, this.f51655c);
        float f10 = this.h;
        canvas.drawRect(this.f51663y, f10, this.f51657f, f10 + this.f51656e, this.f51655c);
        float f11 = this.h;
        canvas.drawRect(this.f51657f + this.d, f11, this.f51663y + this.f51661w, f11 + this.f51656e, this.f51655c);
        canvas.drawRect(this.f51663y, this.h + this.f51656e, i10 + this.f51661w, this.E + this.f51662x, this.f51655c);
        float f12 = this.f51657f;
        float f13 = this.h;
        canvas.drawRect(f12, f13, f12 + this.d, f13 + this.f51656e, this.f51653a);
        int L = org.telegram.messenger.g0.L(1.0f);
        float f14 = L;
        float f15 = this.f51657f + f14;
        float f16 = L * 3;
        canvas.drawRect(f15, this.h + f14, f15 + org.telegram.messenger.g0.L(20.0f), this.h + f16, this.f51654b);
        float f17 = this.f51657f;
        float f18 = this.h + f14;
        canvas.drawRect(f17 + f14, f18, f17 + f16, f18 + org.telegram.messenger.g0.L(20.0f), this.f51654b);
        float L2 = ((this.f51657f + this.d) - f14) - org.telegram.messenger.g0.L(20.0f);
        float f19 = this.h;
        canvas.drawRect(L2, f19 + f14, (this.f51657f + this.d) - f14, f19 + f16, this.f51654b);
        float f20 = this.f51657f + this.d;
        float f21 = this.h + f14;
        canvas.drawRect(f20 - f16, f21, f20 - f14, f21 + org.telegram.messenger.g0.L(20.0f), this.f51654b);
        canvas.drawRect(this.f51657f + f14, ((this.h + this.f51656e) - f14) - org.telegram.messenger.g0.L(20.0f), this.f51657f + f16, (this.h + this.f51656e) - f14, this.f51654b);
        float f22 = this.f51657f + f14;
        canvas.drawRect(f22, (this.h + this.f51656e) - f16, f22 + org.telegram.messenger.g0.L(20.0f), (this.h + this.f51656e) - f14, this.f51654b);
        float L3 = ((this.f51657f + this.d) - f14) - org.telegram.messenger.g0.L(20.0f);
        float f23 = this.h + this.f51656e;
        canvas.drawRect(L3, f23 - f16, (this.f51657f + this.d) - f14, f23 - f14, this.f51654b);
        canvas.drawRect((this.f51657f + this.d) - f16, ((this.h + this.f51656e) - f14) - org.telegram.messenger.g0.L(20.0f), (this.f51657f + this.d) - f14, (this.h + this.f51656e) - f14, this.f51654b);
        for (int i13 = 1; i13 < 3; i13++) {
            float f24 = this.f51657f;
            float f25 = i13;
            float f26 = (this.d / 3.0f) * f25;
            float f27 = this.h;
            canvas.drawRect(f26 + f24, f27 + f14, f24 + f14 + f26, (f27 + this.f51656e) - f14, this.f51654b);
            float f28 = this.f51657f;
            float c10 = com.google.android.gms.internal.vision.e2.c(this.f51656e, 3.0f, f25, this.h);
            canvas.drawRect(f28 + f14, c10, (f28 - f14) + this.d, c10 + f14, this.f51654b);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        tm0 tm0Var;
        Bitmap bitmap;
        float f10;
        int i13;
        int i14;
        super.onLayout(z10, i7, i10, i11, i12);
        this.F = (i11 - i7) - org.telegram.messenger.g0.L(28.0f);
        int L = (i12 - i10) - org.telegram.messenger.g0.L(28.0f);
        this.G = L;
        if (this.F != 0 && L != 0 && (bitmap = (tm0Var = this.I).f52301a) != null) {
            float f11 = this.f51657f - this.f51663y;
            float f12 = this.f51661w;
            float f13 = f11 / f12;
            float f14 = this.h - this.E;
            float f15 = this.f51662x;
            float f16 = f14 / f15;
            float f17 = this.d / f12;
            float f18 = this.f51656e / f15;
            float width = bitmap.getWidth();
            float height = tm0Var.f52301a.getHeight();
            int i15 = this.F;
            float f19 = i15 / width;
            int i16 = this.G;
            if (f19 > i16 / height) {
                this.f51662x = i16;
                this.f51661w = (int) Math.ceil(width * f10);
            } else {
                this.f51661w = i15;
                this.f51662x = (int) Math.ceil(height * f19);
            }
            this.f51663y = org.telegram.messenger.g0.L(14.0f) + ((this.F - this.f51661w) / 2);
            int L2 = org.telegram.messenger.g0.L(14.0f) + ((this.G - this.f51662x) / 2);
            this.E = L2;
            if (this.f51657f == -1.0f && this.h == -1.0f) {
                if (this.H) {
                    this.h = L2;
                    this.f51657f = this.f51663y;
                    this.d = this.f51661w;
                    this.f51656e = this.f51662x;
                } else {
                    if (this.f51661w > this.f51662x) {
                        this.h = L2;
                        this.f51657f = org.telegram.messenger.g0.L(14.0f) + ((this.F - i14) / 2);
                        float f20 = this.f51662x;
                        this.d = f20;
                        this.f51656e = f20;
                    } else {
                        this.f51657f = this.f51663y;
                        this.h = org.telegram.messenger.g0.L(14.0f) + ((this.G - i13) / 2);
                        float f21 = this.f51661w;
                        this.d = f21;
                        this.f51656e = f21;
                    }
                }
            } else {
                float f22 = this.f51661w;
                this.f51657f = (f13 * f22) + this.f51663y;
                float f23 = this.f51662x;
                this.h = (f16 * f23) + L2;
                this.d = f17 * f22;
                this.f51656e = f18 * f23;
            }
            invalidate();
        }
    }
}
