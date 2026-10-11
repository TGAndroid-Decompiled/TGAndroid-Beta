package rg;

import android.graphics.RectF;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class u1 {
    public long f47578a;
    public final int f47579b;
    public float d;
    public float f47581e;
    public float f47582f;
    public float f47583g;
    public float h;
    public float f47584i;
    public float f47585j;
    public float f47586k;
    public int f47587l;
    public int f47588m;
    public float f47589n;
    public float f47590o;
    public float f47591p;
    public final v1 f47593r;
    public float f47580c = 1.0f;
    public boolean f47592q = true;

    public u1(v1 v1Var) {
        this.f47593r = v1Var;
        int i10 = v1Var.S;
        v1Var.S = i10 + 1;
        this.f47579b = i10;
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
        v1 v1Var = this.f47593r;
        int i12 = v1Var.N;
        ArrayList arrayList = v1Var.f47611n;
        RectF rectF = v1Var.f47600a;
        int i13 = 0;
        if (i12 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.f47587l = 0;
            } else {
                this.f47587l = (int) Math.floor((nextFloat * (v1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f47587l = Math.abs(Utilities.fastRandom.nextInt() % v1Var.d.length);
        }
        long j10 = j3 + v1Var.f47620x;
        Random random = Utilities.fastRandom;
        int i14 = v1Var.f47621y;
        if (v1Var.f47604f[this.f47587l]) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        this.f47578a = j10 + random.nextInt(i14 * i10);
        float f14 = 0.0f;
        this.f47589n = 0.0f;
        float f15 = 0.6f;
        if (v1Var.f47610m) {
            this.f47580c = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
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
                        f12 = ((u1) arrayList.get(i13)).f47582f - abs3;
                        f13 = ((u1) arrayList.get(i13)).f47583g;
                    } else {
                        f12 = ((u1) arrayList.get(i13)).d - abs3;
                        f13 = ((u1) arrayList.get(i13)).f47581e;
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
            this.f47581e = abs2;
        } else {
            f7 = 0.0f;
            f10 = 0.6f;
            if (v1Var.J) {
                float width = rectF.width();
                float f22 = v1Var.f47607j;
                float y3 = e2.y(width, f22, org.telegram.ui.Cells.c1.d(Utilities.fastRandom, 1000) / 1000.0f, f22);
                float d = org.telegram.ui.Cells.c1.d(Utilities.fastRandom, 360);
                if (v1Var.f47604f[this.f47587l] && !this.f47592q) {
                    y3 = Math.min(y3, AndroidUtilities.dp(10.0f));
                    f11 = AndroidUtilities.dp(30.0f) + 0.0f;
                } else {
                    f11 = 0.0f;
                }
                double d10 = y3;
                double d11 = d;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d11)) * d10));
                this.f47581e = rectF.centerY() + f11 + v1Var.f47608k + ((float) (Math.cos(Math.toRadians(d11)) * d10));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.f47581e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (v1Var.f47604f[this.f47587l]) {
            this.f47591p = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        if (v1Var.f47604f[this.f47587l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f));
        } else if (v1Var.h) {
            atan2 = Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.f47581e - (rectF.centerY() + v1Var.f47608k), this.d - (rectF.centerX() + f7));
        }
        this.f47585j = (float) Math.cos(atan2);
        this.f47586k = (float) Math.sin(atan2);
        if (v1Var.f47603e[this.f47587l]) {
            this.f47588m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f47588m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = v1Var.N;
        if ((i16 == 6 && ((i11 = this.f47587l) == 1 || i11 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f47589n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (v1Var.N != 101) {
            this.f47590o = f7;
        }
        if (v1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f10)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f47582f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + v1Var.f47608k;
            this.f47581e = sin;
            this.f47583g = sin;
        }
        this.f47592q = false;
    }
}
