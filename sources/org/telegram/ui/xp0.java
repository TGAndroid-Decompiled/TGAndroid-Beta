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
    public final Paint f43424a;
    public final Paint f43425b;
    public final Paint f43426c;
    public float d;
    public float f43427e;
    public float f43428f;
    public float h;
    public int f43429n;
    public float f43430r;
    public float f43431s;
    public int v;
    public int f43432w;
    public int f43433x;
    public int f43434y;

    public xp0(zp0 zp0Var, Context context) {
        super(context);
        this.E = zp0Var;
        this.f43424a = null;
        this.f43425b = null;
        this.f43426c = null;
        this.d = 600.0f;
        this.f43427e = 600.0f;
        this.f43428f = -1.0f;
        this.h = -1.0f;
        this.f43429n = 0;
        this.f43430r = 0.0f;
        this.f43431s = 0.0f;
        Paint paint = new Paint();
        this.f43424a = paint;
        paint.setColor(1073412858);
        this.f43424a.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.f43424a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f43425b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f43426c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new f0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        zp0 zp0Var = this.E;
        BitmapDrawable bitmapDrawable = zp0Var.f43998b;
        if (bitmapDrawable != null) {
            try {
                int i12 = this.f43433x;
                int i13 = this.f43434y;
                bitmapDrawable.setBounds(i12, i13, this.v + i12, this.f43432w + i13);
                zp0Var.f43998b.draw(canvas);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        canvas.drawRect(this.f43433x, this.f43434y, i10 + this.v, this.h, this.f43426c);
        float f10 = this.h;
        canvas.drawRect(this.f43433x, f10, this.f43428f, f10 + this.f43427e, this.f43426c);
        float f11 = this.h;
        canvas.drawRect(this.f43428f + this.d, f11, this.f43433x + this.v, f11 + this.f43427e, this.f43426c);
        canvas.drawRect(this.f43433x, this.h + this.f43427e, i11 + this.v, this.f43434y + this.f43432w, this.f43426c);
        float f12 = this.f43428f;
        float f13 = this.h;
        canvas.drawRect(f12, f13, f12 + this.d, f13 + this.f43427e, this.f43424a);
        int dp = AndroidUtilities.dp(1.0f);
        float f14 = this.f43428f;
        float f15 = dp;
        float f16 = dp * 3;
        canvas.drawRect(f14 + f15, this.h + f15, f14 + f15 + AndroidUtilities.dp(20.0f), this.h + f16, this.f43425b);
        float f17 = this.f43428f;
        float f18 = this.h;
        canvas.drawRect(f17 + f15, f18 + f15, f17 + f16, f18 + f15 + AndroidUtilities.dp(20.0f), this.f43425b);
        float dp2 = ((this.f43428f + this.d) - f15) - AndroidUtilities.dp(20.0f);
        float f19 = this.h;
        canvas.drawRect(dp2, f19 + f15, (this.f43428f + this.d) - f15, f19 + f16, this.f43425b);
        float f20 = this.f43428f;
        float f21 = this.d;
        float f22 = this.h;
        canvas.drawRect((f20 + f21) - f16, f22 + f15, (f20 + f21) - f15, f22 + f15 + AndroidUtilities.dp(20.0f), this.f43425b);
        canvas.drawRect(this.f43428f + f15, ((this.h + this.f43427e) - f15) - AndroidUtilities.dp(20.0f), this.f43428f + f16, (this.h + this.f43427e) - f15, this.f43425b);
        float f23 = this.f43428f;
        canvas.drawRect(f23 + f15, (this.h + this.f43427e) - f16, f23 + f15 + AndroidUtilities.dp(20.0f), (this.h + this.f43427e) - f15, this.f43425b);
        float dp3 = ((this.f43428f + this.d) - f15) - AndroidUtilities.dp(20.0f);
        float f24 = this.h;
        float f25 = this.f43427e;
        canvas.drawRect(dp3, (f24 + f25) - f16, (this.f43428f + this.d) - f15, (f24 + f25) - f15, this.f43425b);
        canvas.drawRect((this.f43428f + this.d) - f16, ((this.h + this.f43427e) - f15) - AndroidUtilities.dp(20.0f), (this.f43428f + this.d) - f15, (this.h + this.f43427e) - f15, this.f43425b);
        for (int i14 = 1; i14 < 3; i14++) {
            float f26 = this.f43428f;
            float f27 = this.d;
            float f28 = i14;
            float f29 = this.h;
            canvas.drawRect(((f27 / 3.0f) * f28) + f26, f29 + f15, w.c.c(f27, 3.0f, f28, f26 + f15), (f29 + this.f43427e) - f15, this.f43425b);
            float f30 = this.f43428f;
            float f31 = this.h;
            float f32 = this.f43427e;
            canvas.drawRect(f30 + f15, w.c.c(f32, 3.0f, f28, f31), this.d + (f30 - f15), ((f32 / 3.0f) * f28) + f31 + f15, this.f43425b);
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
        if (this.B != 0 && dp != 0 && (bitmap = (zp0Var = this.E).f43997a) != null) {
            float f11 = this.f43428f - this.f43433x;
            float f12 = this.v;
            float f13 = f11 / f12;
            float f14 = this.h - this.f43434y;
            float f15 = this.f43432w;
            float f16 = f14 / f15;
            float f17 = this.d / f12;
            float f18 = this.f43427e / f15;
            float width = bitmap.getWidth();
            float height = zp0Var.f43997a.getHeight();
            int i16 = this.B;
            float f19 = i16 / width;
            int i17 = this.C;
            if (f19 > i17 / height) {
                this.f43432w = i17;
                this.v = (int) Math.ceil(width * f10);
            } else {
                this.v = i16;
                this.f43432w = (int) Math.ceil(height * f19);
            }
            this.f43433x = AndroidUtilities.dp(14.0f) + ((this.B - this.v) / 2);
            int dp2 = AndroidUtilities.dp(14.0f) + ((this.C - this.f43432w) / 2);
            this.f43434y = dp2;
            if (this.f43428f == -1.0f && this.h == -1.0f) {
                if (this.D) {
                    this.h = dp2;
                    this.f43428f = this.f43433x;
                    this.d = this.v;
                    this.f43427e = this.f43432w;
                } else {
                    if (this.v > this.f43432w) {
                        this.h = dp2;
                        this.f43428f = AndroidUtilities.dp(14.0f) + ((this.B - i15) / 2);
                        float f20 = this.f43432w;
                        this.d = f20;
                        this.f43427e = f20;
                    } else {
                        this.f43428f = this.f43433x;
                        this.h = AndroidUtilities.dp(14.0f) + ((this.C - i14) / 2);
                        float f21 = this.v;
                        this.d = f21;
                        this.f43427e = f21;
                    }
                }
            } else {
                float f22 = this.v;
                this.f43428f = (f13 * f22) + this.f43433x;
                float f23 = this.f43432w;
                this.h = (f16 * f23) + dp2;
                this.d = f17 * f22;
                this.f43427e = f18 * f23;
            }
            invalidate();
        }
    }
}
