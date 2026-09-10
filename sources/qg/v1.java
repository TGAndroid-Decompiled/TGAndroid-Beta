package qg;

import android.graphics.RectF;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.r6;
public final class v1 {
    public long f40937a;
    public final int f40938b;
    public float d;
    public float e;
    public float f40940f;
    public float f40941g;
    public float h;
    public float f40942i;
    public float f40943j;
    public float f40944k;
    public int f40945l;
    public int f40946m;
    public float f40947n;
    public float f40948o;
    public float f40949p;
    public final w1 f40951r;
    public float f40939c = 1.0f;
    public boolean f40950q = true;

    public v1(w1 w1Var) {
        this.f40951r = w1Var;
        int i10 = w1Var.S;
        w1Var.S = i10 + 1;
        this.f40938b = i10;
    }

    public final void a(android.graphics.Canvas r11, long r12, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: qg.v1.a(android.graphics.Canvas, long, float):void");
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
        w1 w1Var = this.f40951r;
        int i12 = w1Var.N;
        ArrayList arrayList = w1Var.f40965n;
        RectF rectF = w1Var.f40955a;
        int i13 = 0;
        if (i12 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.f40945l = 0;
            } else {
                this.f40945l = (int) Math.floor((nextFloat * (w1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f40945l = Math.abs(Utilities.fastRandom.nextInt() % w1Var.d.length);
        }
        long j10 = j3 + w1Var.f40974x;
        Random random = Utilities.fastRandom;
        int i14 = w1Var.f40975y;
        if (w1Var.f40958f[this.f40945l]) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        this.f40937a = j10 + random.nextInt(i14 * i10);
        this.f40947n = 0.0f;
        if (w1Var.f40964m) {
            this.f40939c = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
        }
        if (w1Var.B) {
            float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
            float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            int i15 = 0;
            float f14 = 0.0f;
            while (i15 < 10) {
                float abs3 = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
                float f15 = 2.1474836E9f;
                while (i13 < arrayList.size()) {
                    if (w1Var.h) {
                        f12 = ((v1) arrayList.get(i13)).f40940f - abs3;
                        f13 = ((v1) arrayList.get(i13)).f40941g;
                    } else {
                        f12 = ((v1) arrayList.get(i13)).d - abs3;
                        f13 = ((v1) arrayList.get(i13)).e;
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
            if (w1Var.J) {
                float width = rectF.width();
                float f18 = w1Var.f40961j;
                float z10 = e2.z(width, f18, r6.c(Utilities.fastRandom, 1000) / 1000.0f, f18);
                float c10 = r6.c(Utilities.fastRandom, 360);
                if (w1Var.f40958f[this.f40945l] && !this.f40950q) {
                    z10 = Math.min(z10, AndroidUtilities.dp(10.0f));
                    f11 = AndroidUtilities.dp(30.0f) + 0.0f;
                } else {
                    f11 = 0.0f;
                }
                double d = z10;
                double d10 = c10;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.e = rectF.centerY() + f11 + w1Var.f40962k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (w1Var.f40958f[this.f40945l]) {
            this.f40949p = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        if (w1Var.f40958f[this.f40945l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f));
        } else if (w1Var.h) {
            atan2 = Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.e - (rectF.centerY() + w1Var.f40962k), this.d - (rectF.centerX() + f10));
        }
        this.f40943j = (float) Math.cos(atan2);
        this.f40944k = (float) Math.sin(atan2);
        if (w1Var.e[this.f40945l]) {
            this.f40946m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f40946m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = w1Var.N;
        if ((i16 == 6 && ((i11 = this.f40945l) == 1 || i11 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f40947n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (w1Var.N != 101) {
            this.f40948o = 0.0f;
        }
        if (w1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f7)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f40940f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + w1Var.f40962k;
            this.e = sin;
            this.f40941g = sin;
        }
        this.f40950q = false;
    }
}
