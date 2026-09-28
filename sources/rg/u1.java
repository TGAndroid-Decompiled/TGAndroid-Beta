package rg;

import android.graphics.RectF;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class u1 {
    public long f42768a;
    public final int f42769b;
    public float d;
    public float e;
    public float f42771f;
    public float f42772g;
    public float h;
    public float f42773i;
    public float f42774j;
    public float f42775k;
    public int f42776l;
    public int f42777m;
    public float f42778n;
    public float f42779o;
    public float f42780p;
    public final v1 f42782r;
    public float f42770c = 1.0f;
    public boolean f42781q = true;

    public u1(v1 v1Var) {
        this.f42782r = v1Var;
        int i10 = v1Var.S;
        v1Var.S = i10 + 1;
        this.f42769b = i10;
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
        v1 v1Var = this.f42782r;
        int i12 = v1Var.N;
        ArrayList arrayList = v1Var.f42797n;
        RectF rectF = v1Var.f42787a;
        int i13 = 0;
        if (i12 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.f42776l = 0;
            } else {
                this.f42776l = (int) Math.floor((nextFloat * (v1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f42776l = Math.abs(Utilities.fastRandom.nextInt() % v1Var.d.length);
        }
        long j10 = j3 + v1Var.f42806x;
        Random random = Utilities.fastRandom;
        int i14 = v1Var.f42807y;
        if (v1Var.f42790f[this.f42776l]) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        this.f42768a = j10 + random.nextInt(i14 * i10);
        this.f42778n = 0.0f;
        if (v1Var.f42796m) {
            this.f42770c = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
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
                        f12 = ((u1) arrayList.get(i13)).f42771f - abs3;
                        f13 = ((u1) arrayList.get(i13)).f42772g;
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
                float f18 = v1Var.f42793j;
                float z10 = e2.z(width, f18, org.telegram.ui.Cells.c1.e(Utilities.fastRandom, 1000) / 1000.0f, f18);
                float e = org.telegram.ui.Cells.c1.e(Utilities.fastRandom, 360);
                if (v1Var.f42790f[this.f42776l] && !this.f42781q) {
                    z10 = Math.min(z10, AndroidUtilities.dp(10.0f));
                    f11 = AndroidUtilities.dp(30.0f) + 0.0f;
                } else {
                    f11 = 0.0f;
                }
                double d = z10;
                double d10 = e;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.e = rectF.centerY() + f11 + v1Var.f42794k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (v1Var.f42790f[this.f42776l]) {
            this.f42780p = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        if (v1Var.f42790f[this.f42776l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f));
        } else if (v1Var.h) {
            atan2 = Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.e - (rectF.centerY() + v1Var.f42794k), this.d - (rectF.centerX() + f10));
        }
        this.f42774j = (float) Math.cos(atan2);
        this.f42775k = (float) Math.sin(atan2);
        if (v1Var.e[this.f42776l]) {
            this.f42777m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f42777m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = v1Var.N;
        if ((i16 == 6 && ((i11 = this.f42776l) == 1 || i11 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f42778n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (v1Var.N != 101) {
            this.f42779o = 0.0f;
        }
        if (v1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f7)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f42771f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + v1Var.f42794k;
            this.e = sin;
            this.f42772g = sin;
        }
        this.f42781q = false;
    }
}
