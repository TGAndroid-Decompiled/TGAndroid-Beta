package rg;

import android.graphics.RectF;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class u1 {
    public long f47454a;
    public final int f47455b;
    public float d;
    public float f47457e;
    public float f47458f;
    public float f47459g;
    public float h;
    public float f47460i;
    public float f47461j;
    public float f47462k;
    public int f47463l;
    public int f47464m;
    public float f47465n;
    public float f47466o;
    public float f47467p;
    public final v1 f47469r;
    public float f47456c = 1.0f;
    public boolean f47468q = true;

    public u1(v1 v1Var) {
        this.f47469r = v1Var;
        int i10 = v1Var.S;
        v1Var.S = i10 + 1;
        this.f47455b = i10;
    }

    public final void a(android.graphics.Canvas r11, long r12, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: rg.u1.a(android.graphics.Canvas, long, float):void");
    }

    public final void b(long j3) {
        int i10;
        float f7;
        float f10;
        float f11;
        double atan2;
        int i11;
        float f12;
        float f13;
        float nextFloat;
        v1 v1Var = this.f47469r;
        int i12 = v1Var.N;
        ArrayList arrayList = v1Var.f47487n;
        RectF rectF = v1Var.f47476a;
        int i13 = 0;
        if (i12 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.f47463l = 0;
            } else {
                this.f47463l = (int) Math.floor((nextFloat * (v1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f47463l = Math.abs(Utilities.fastRandom.nextInt() % v1Var.d.length);
        }
        long j10 = j3 + v1Var.f47496x;
        Random random = Utilities.fastRandom;
        int i14 = v1Var.f47497y;
        if (v1Var.f47480f[this.f47463l]) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        this.f47454a = j10 + random.nextInt(i14 * i10);
        float f14 = 0.0f;
        this.f47465n = 0.0f;
        float f15 = 0.6f;
        if (v1Var.f47486m) {
            this.f47456c = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
        }
        if (v1Var.B) {
            float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
            float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            float f16 = 0.0f;
            int i15 = 0;
            while (i15 < 10) {
                float abs3 = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                float f17 = f15;
                float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
                float f18 = 2.1474836E9f;
                float f19 = f14;
                while (i13 < arrayList.size()) {
                    if (v1Var.h) {
                        f12 = ((u1) arrayList.get(i13)).f47458f - abs3;
                        f13 = ((u1) arrayList.get(i13)).f47459g;
                    } else {
                        f12 = ((u1) arrayList.get(i13)).d - abs3;
                        f13 = ((u1) arrayList.get(i13)).f47457e;
                    }
                    float f20 = f13 - abs4;
                    float f21 = (f20 * f20) + (f12 * f12);
                    if (f21 < f18) {
                        f18 = f21;
                    }
                    i13++;
                }
                if (f18 > f16) {
                    abs2 = abs4;
                    f16 = f18;
                    abs = abs3;
                }
                i15++;
                f15 = f17;
                f14 = f19;
                i13 = 0;
            }
            f7 = f14;
            f10 = f15;
            this.d = abs;
            this.f47457e = abs2;
        } else {
            f7 = 0.0f;
            f10 = 0.6f;
            if (v1Var.J) {
                float width = rectF.width();
                float f22 = v1Var.f47483j;
                float y3 = e2.y(width, f22, org.telegram.ui.Cells.c1.d(Utilities.fastRandom, 1000) / 1000.0f, f22);
                float d = org.telegram.ui.Cells.c1.d(Utilities.fastRandom, 360);
                if (v1Var.f47480f[this.f47463l] && !this.f47468q) {
                    y3 = Math.min(y3, AndroidUtilities.dp(10.0f));
                    f11 = AndroidUtilities.dp(30.0f) + 0.0f;
                } else {
                    f11 = 0.0f;
                }
                double d10 = y3;
                double d11 = d;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d11)) * d10));
                this.f47457e = rectF.centerY() + f11 + v1Var.f47484k + ((float) (Math.cos(Math.toRadians(d11)) * d10));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.f47457e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (v1Var.f47480f[this.f47463l]) {
            this.f47467p = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        if (v1Var.f47480f[this.f47463l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f));
        } else if (v1Var.h) {
            atan2 = Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.f47457e - (rectF.centerY() + v1Var.f47484k), this.d - (rectF.centerX() + f7));
        }
        this.f47461j = (float) Math.cos(atan2);
        this.f47462k = (float) Math.sin(atan2);
        if (v1Var.f47479e[this.f47463l]) {
            this.f47464m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f47464m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = v1Var.N;
        if ((i16 == 6 && ((i11 = this.f47463l) == 1 || i11 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f47465n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (v1Var.N != 101) {
            this.f47466o = f7;
        }
        if (v1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f10)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f47458f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + v1Var.f47484k;
            this.f47457e = sin;
            this.f47459g = sin;
        }
        this.f47468q = false;
    }
}
