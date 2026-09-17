package rg;

import android.graphics.RectF;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.p6;
public final class t1 {
    public long f42497a;
    public final int f42498b;
    public float d;
    public float e;
    public float f42500f;
    public float f42501g;
    public float h;
    public float f42502i;
    public float f42503j;
    public float f42504k;
    public int f42505l;
    public int f42506m;
    public float f42507n;
    public float f42508o;
    public float f42509p;
    public final u1 f42511r;
    public float f42499c = 1.0f;
    public boolean f42510q = true;

    public t1(u1 u1Var) {
        this.f42511r = u1Var;
        int i10 = u1Var.S;
        u1Var.S = i10 + 1;
        this.f42498b = i10;
    }

    public final void a(android.graphics.Canvas r11, long r12, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: rg.t1.a(android.graphics.Canvas, long, float):void");
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
        u1 u1Var = this.f42511r;
        int i12 = u1Var.N;
        ArrayList arrayList = u1Var.f42528n;
        RectF rectF = u1Var.f42518a;
        int i13 = 0;
        if (i12 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.f42505l = 0;
            } else {
                this.f42505l = (int) Math.floor((nextFloat * (u1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f42505l = Math.abs(Utilities.fastRandom.nextInt() % u1Var.d.length);
        }
        long j10 = j3 + u1Var.f42537x;
        Random random = Utilities.fastRandom;
        int i14 = u1Var.f42538y;
        if (u1Var.f42521f[this.f42505l]) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        this.f42497a = j10 + random.nextInt(i14 * i10);
        this.f42507n = 0.0f;
        if (u1Var.f42527m) {
            this.f42499c = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
        }
        if (u1Var.B) {
            float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
            float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            int i15 = 0;
            float f14 = 0.0f;
            while (i15 < 10) {
                float abs3 = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
                float f15 = 2.1474836E9f;
                while (i13 < arrayList.size()) {
                    if (u1Var.h) {
                        f12 = ((t1) arrayList.get(i13)).f42500f - abs3;
                        f13 = ((t1) arrayList.get(i13)).f42501g;
                    } else {
                        f12 = ((t1) arrayList.get(i13)).d - abs3;
                        f13 = ((t1) arrayList.get(i13)).e;
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
            if (u1Var.J) {
                float width = rectF.width();
                float f18 = u1Var.f42524j;
                float z10 = e2.z(width, f18, p6.c(Utilities.fastRandom, 1000) / 1000.0f, f18);
                float c10 = p6.c(Utilities.fastRandom, 360);
                if (u1Var.f42521f[this.f42505l] && !this.f42510q) {
                    z10 = Math.min(z10, AndroidUtilities.dp(10.0f));
                    f11 = AndroidUtilities.dp(30.0f) + 0.0f;
                } else {
                    f11 = 0.0f;
                }
                double d = z10;
                double d10 = c10;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.e = rectF.centerY() + f11 + u1Var.f42525k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (u1Var.f42521f[this.f42505l]) {
            this.f42509p = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        if (u1Var.f42521f[this.f42505l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f));
        } else if (u1Var.h) {
            atan2 = Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.e - (rectF.centerY() + u1Var.f42525k), this.d - (rectF.centerX() + f10));
        }
        this.f42503j = (float) Math.cos(atan2);
        this.f42504k = (float) Math.sin(atan2);
        if (u1Var.e[this.f42505l]) {
            this.f42506m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f42506m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = u1Var.N;
        if ((i16 == 6 && ((i11 = this.f42505l) == 1 || i11 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f42507n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (u1Var.N != 101) {
            this.f42508o = 0.0f;
        }
        if (u1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f7)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f42500f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + u1Var.f42525k;
            this.e = sin;
            this.f42501g = sin;
        }
        this.f42510q = false;
    }
}
