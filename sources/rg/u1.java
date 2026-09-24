package rg;

import android.graphics.RectF;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class u1 {
    public long f42753a;
    public final int f42754b;
    public float d;
    public float e;
    public float f42756f;
    public float f42757g;
    public float h;
    public float f42758i;
    public float f42759j;
    public float f42760k;
    public int f42761l;
    public int f42762m;
    public float f42763n;
    public float f42764o;
    public float f42765p;
    public final v1 f42767r;
    public float f42755c = 1.0f;
    public boolean f42766q = true;

    public u1(v1 v1Var) {
        this.f42767r = v1Var;
        int i10 = v1Var.S;
        v1Var.S = i10 + 1;
        this.f42754b = i10;
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
        v1 v1Var = this.f42767r;
        int i12 = v1Var.N;
        ArrayList arrayList = v1Var.f42782n;
        RectF rectF = v1Var.f42772a;
        int i13 = 0;
        if (i12 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.f42761l = 0;
            } else {
                this.f42761l = (int) Math.floor((nextFloat * (v1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f42761l = Math.abs(Utilities.fastRandom.nextInt() % v1Var.d.length);
        }
        long j10 = j3 + v1Var.f42791x;
        Random random = Utilities.fastRandom;
        int i14 = v1Var.f42792y;
        if (v1Var.f42775f[this.f42761l]) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        this.f42753a = j10 + random.nextInt(i14 * i10);
        this.f42763n = 0.0f;
        if (v1Var.f42781m) {
            this.f42755c = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
        }
        if (v1Var.B) {
            float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
            float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            int i15 = 0;
            float f14 = 0.0f;
            while (i15 < 10) {
                float abs3 = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
                float f15 = 2.1474836E9f;
                while (i13 < arrayList.size()) {
                    if (v1Var.h) {
                        f12 = ((u1) arrayList.get(i13)).f42756f - abs3;
                        f13 = ((u1) arrayList.get(i13)).f42757g;
                    } else {
                        f12 = ((u1) arrayList.get(i13)).d - abs3;
                        f13 = ((u1) arrayList.get(i13)).e;
                    }
                    float f16 = f13 - abs4;
                    float f17 = (f16 * f16) + (f12 * f12);
                    if (f17 < f15) {
                        f15 = f17;
                    }
                    i13++;
                }
                if (f15 > f14) {
                    abs2 = abs4;
                    f14 = f15;
                    abs = abs3;
                }
                i15++;
                i13 = 0;
            }
            f7 = 0.6f;
            f10 = 0.0f;
            this.d = abs;
            this.e = abs2;
        } else {
            f7 = 0.6f;
            f10 = 0.0f;
            if (v1Var.J) {
                float width = rectF.width();
                float f18 = v1Var.f42778j;
                float z10 = e2.z(width, f18, org.telegram.ui.Cells.c1.e(Utilities.fastRandom, 1000) / 1000.0f, f18);
                float e = org.telegram.ui.Cells.c1.e(Utilities.fastRandom, 360);
                if (v1Var.f42775f[this.f42761l] && !this.f42766q) {
                    z10 = Math.min(z10, AndroidUtilities.dp(10.0f));
                    f11 = AndroidUtilities.dp(30.0f) + 0.0f;
                } else {
                    f11 = 0.0f;
                }
                double d = z10;
                double d10 = e;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.e = rectF.centerY() + f11 + v1Var.f42779k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (v1Var.f42775f[this.f42761l]) {
            this.f42765p = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        if (v1Var.f42775f[this.f42761l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f));
        } else if (v1Var.h) {
            atan2 = Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.e - (rectF.centerY() + v1Var.f42779k), this.d - (rectF.centerX() + f10));
        }
        this.f42759j = (float) Math.cos(atan2);
        this.f42760k = (float) Math.sin(atan2);
        if (v1Var.e[this.f42761l]) {
            this.f42762m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f42762m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = v1Var.N;
        if ((i16 == 6 && ((i11 = this.f42761l) == 1 || i11 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f42763n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (v1Var.N != 101) {
            this.f42764o = 0.0f;
        }
        if (v1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f7)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f42756f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + v1Var.f42779k;
            this.e = sin;
            this.f42757g = sin;
        }
        this.f42766q = false;
    }
}
