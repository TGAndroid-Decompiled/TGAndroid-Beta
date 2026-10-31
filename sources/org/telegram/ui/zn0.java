package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
public final class zn0 extends FrameLayout {
    public int D;
    public int E;
    public int F;
    public boolean G;
    public final bo0 H;
    public final Paint f44194a;
    public final Paint f44195b;
    public final Paint f44196c;
    public float d;
    public float e;
    public float f44197f;
    public float h;
    public int f44198n;
    public float f44199r;
    public float f44200s;
    public int f44201w;
    public int f44202x;
    public int f44203y;

    public zn0(bo0 bo0Var, Context context) {
        super(context);
        this.H = bo0Var;
        this.f44194a = null;
        this.f44195b = null;
        this.f44196c = null;
        this.d = 600.0f;
        this.e = 600.0f;
        this.f44197f = -1.0f;
        this.h = -1.0f;
        this.f44198n = 0;
        this.f44199r = 0.0f;
        this.f44200s = 0.0f;
        Paint paint = new Paint();
        this.f44194a = paint;
        paint.setColor(1073412858);
        this.f44194a.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        this.f44194a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f44195b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f44196c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new d0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        bo0 bo0Var = this.H;
        BitmapDrawable bitmapDrawable = bo0Var.f36284b;
        if (bitmapDrawable != null) {
            try {
                int i12 = this.f44203y;
                int i13 = this.D;
                bitmapDrawable.setBounds(i12, i13, this.f44201w + i12, this.f44202x + i13);
                bo0Var.f36284b.draw(canvas);
            } catch (Throwable th2) {
                org.telegram.messenger.f8.g(th2, true);
            }
        }
        canvas.drawRect(this.f44203y, this.D, i10 + this.f44201w, this.h, this.f44196c);
        float f7 = this.h;
        canvas.drawRect(this.f44203y, f7, this.f44197f, f7 + this.e, this.f44196c);
        float f10 = this.h;
        canvas.drawRect(this.f44197f + this.d, f10, this.f44203y + this.f44201w, f10 + this.e, this.f44196c);
        canvas.drawRect(this.f44203y, this.h + this.e, i11 + this.f44201w, this.D + this.f44202x, this.f44196c);
        float f11 = this.f44197f;
        float f12 = this.h;
        canvas.drawRect(f11, f12, f11 + this.d, f12 + this.e, this.f44194a);
        int L = org.telegram.messenger.i0.L(1.0f);
        float f13 = L;
        float f14 = this.f44197f + f13;
        float f15 = L * 3;
        canvas.drawRect(f14, this.h + f13, f14 + org.telegram.messenger.i0.L(20.0f), this.h + f15, this.f44195b);
        float f16 = this.f44197f;
        float f17 = this.h + f13;
        canvas.drawRect(f16 + f13, f17, f16 + f15, f17 + org.telegram.messenger.i0.L(20.0f), this.f44195b);
        float L2 = ((this.f44197f + this.d) - f13) - org.telegram.messenger.i0.L(20.0f);
        float f18 = this.h;
        canvas.drawRect(L2, f18 + f13, (this.f44197f + this.d) - f13, f18 + f15, this.f44195b);
        float f19 = this.f44197f + this.d;
        float f20 = this.h + f13;
        canvas.drawRect(f19 - f15, f20, f19 - f13, f20 + org.telegram.messenger.i0.L(20.0f), this.f44195b);
        canvas.drawRect(this.f44197f + f13, ((this.h + this.e) - f13) - org.telegram.messenger.i0.L(20.0f), this.f44197f + f15, (this.h + this.e) - f13, this.f44195b);
        float f21 = this.f44197f + f13;
        canvas.drawRect(f21, (this.h + this.e) - f15, f21 + org.telegram.messenger.i0.L(20.0f), (this.h + this.e) - f13, this.f44195b);
        float L3 = ((this.f44197f + this.d) - f13) - org.telegram.messenger.i0.L(20.0f);
        float f22 = this.h + this.e;
        canvas.drawRect(L3, f22 - f15, (this.f44197f + this.d) - f13, f22 - f13, this.f44195b);
        canvas.drawRect((this.f44197f + this.d) - f15, ((this.h + this.e) - f13) - org.telegram.messenger.i0.L(20.0f), (this.f44197f + this.d) - f13, (this.h + this.e) - f13, this.f44195b);
        for (int i14 = 1; i14 < 3; i14++) {
            float f23 = this.f44197f;
            float f24 = i14;
            float f25 = (this.d / 3.0f) * f24;
            float f26 = this.h;
            canvas.drawRect(f25 + f23, f26 + f13, f23 + f13 + f25, (f26 + this.e) - f13, this.f44195b);
            float f27 = this.f44197f;
            float c10 = a1.g.c(this.e, 3.0f, f24, this.h);
            canvas.drawRect(f27 + f13, c10, (f27 - f13) + this.d, c10 + f13, this.f44195b);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        bo0 bo0Var;
        Bitmap bitmap;
        float f7;
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        this.E = (i12 - i10) - org.telegram.messenger.i0.L(28.0f);
        int L = (i13 - i11) - org.telegram.messenger.i0.L(28.0f);
        this.F = L;
        if (this.E != 0 && L != 0 && (bitmap = (bo0Var = this.H).f36283a) != null) {
            float f10 = this.f44197f - this.f44203y;
            float f11 = this.f44201w;
            float f12 = f10 / f11;
            float f13 = this.h - this.D;
            float f14 = this.f44202x;
            float f15 = f13 / f14;
            float f16 = this.d / f11;
            float f17 = this.e / f14;
            float width = bitmap.getWidth();
            float height = bo0Var.f36283a.getHeight();
            int i16 = this.E;
            float f18 = i16 / width;
            int i17 = this.F;
            if (f18 > i17 / height) {
                this.f44202x = i17;
                this.f44201w = (int) Math.ceil(width * f7);
            } else {
                this.f44201w = i16;
                this.f44202x = (int) Math.ceil(height * f18);
            }
            this.f44203y = org.telegram.messenger.i0.L(14.0f) + ((this.E - this.f44201w) / 2);
            int L2 = org.telegram.messenger.i0.L(14.0f) + ((this.F - this.f44202x) / 2);
            this.D = L2;
            if (this.f44197f == -1.0f && this.h == -1.0f) {
                if (this.G) {
                    this.h = L2;
                    this.f44197f = this.f44203y;
                    this.d = this.f44201w;
                    this.e = this.f44202x;
                } else {
                    if (this.f44201w > this.f44202x) {
                        this.h = L2;
                        this.f44197f = org.telegram.messenger.i0.L(14.0f) + ((this.E - i15) / 2);
                        float f19 = this.f44202x;
                        this.d = f19;
                        this.e = f19;
                    } else {
                        this.f44197f = this.f44203y;
                        this.h = org.telegram.messenger.i0.L(14.0f) + ((this.F - i14) / 2);
                        float f20 = this.f44201w;
                        this.d = f20;
                        this.e = f20;
                    }
                }
            } else {
                float f21 = this.f44201w;
                this.f44197f = (f12 * f21) + this.f44203y;
                float f22 = this.f44202x;
                this.h = (f15 * f22) + L2;
                this.d = f16 * f21;
                this.e = f17 * f22;
            }
            invalidate();
        }
    }
}
