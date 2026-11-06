package ug;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class o1 {
    public long f56640a;
    public final int f56641b;
    public float d;
    public float f56643e;
    public float f56644f;
    public float f56645g;
    public float h;
    public float f56646i;
    public float f56647j;
    public float f56648k;
    public int f56649l;
    public int f56650m;
    public float f56651n;
    public long f56652o;
    public float f56653p;
    public float f56654q;
    public float f56655r;
    public final p1 f56657t;
    public float f56642c = 1.0f;
    public boolean f56656s = true;

    public o1(p1 p1Var) {
        this.f56657t = p1Var;
        int i7 = p1Var.T;
        p1Var.T = i7 + 1;
        this.f56641b = i7;
    }

    public final void a(android.graphics.Canvas r21, long r22, float r24) {
        throw new UnsupportedOperationException("Method not decompiled: ug.o1.a(android.graphics.Canvas, long, float):void");
    }

    public final void b(long j3) {
        int i7;
        float f10;
        float f11;
        float f12;
        double atan2;
        int i10;
        float f13;
        float f14;
        float f15;
        float nextFloat;
        p1 p1Var = this.f56657t;
        int i11 = p1Var.O;
        ArrayList arrayList = p1Var.f56683n;
        RectF rectF = p1Var.f56672a;
        if (i11 == 28) {
            if (Utilities.f21332c.nextFloat() < 0.13f) {
                this.f56649l = 0;
            } else {
                this.f56649l = (int) Math.floor((nextFloat * (p1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f56649l = Math.abs(((int) Utilities.f21332c.nextLong()) % p1Var.d.length);
        }
        long j10 = p1Var.f56692x + j3;
        g5.a aVar = Utilities.f21332c;
        int i12 = p1Var.f56693y;
        if (p1Var.f56676f[this.f56649l]) {
            i7 = 3;
        } else {
            i7 = 1;
        }
        this.f56640a = aVar.nextInt(i12 * i7) + j10;
        this.f56652o = j3;
        this.f56653p = aVar.nextFloat() * 6.28f;
        float f16 = 0.0f;
        this.f56651n = 0.0f;
        float f17 = 0.6f;
        if (p1Var.f56682m) {
            this.f56642c = (aVar.nextFloat() * 0.6f) + 0.4f;
        }
        if (p1Var.B) {
            float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
            float abs2 = Math.abs(((int) aVar.nextLong()) % rectF.height()) + rectF.top;
            float f18 = 0.0f;
            int i13 = 0;
            while (i13 < 10) {
                float f19 = rectF.left;
                g5.a aVar2 = Utilities.f21332c;
                float f20 = f16;
                int i14 = i13;
                float abs3 = Math.abs(((int) aVar2.nextLong()) % rectF.width()) + f19;
                float abs4 = Math.abs(((int) aVar2.nextLong()) % rectF.height()) + rectF.top;
                float f21 = 2.1474836E9f;
                int i15 = 0;
                while (i15 < arrayList.size()) {
                    if (p1Var.h) {
                        f14 = ((o1) arrayList.get(i15)).f56644f - abs3;
                        f13 = f17;
                        f15 = ((o1) arrayList.get(i15)).f56645g;
                    } else {
                        f13 = f17;
                        f14 = ((o1) arrayList.get(i15)).d - abs3;
                        f15 = ((o1) arrayList.get(i15)).f56643e;
                    }
                    float f22 = f15 - abs4;
                    float f23 = (f22 * f22) + (f14 * f14);
                    if (f23 < f21) {
                        f21 = f23;
                    }
                    i15++;
                    f17 = f13;
                }
                float f24 = f17;
                if (f21 > f18) {
                    abs = abs3;
                    f18 = f21;
                    abs2 = abs4;
                }
                i13 = i14 + 1;
                f16 = f20;
                f17 = f24;
            }
            f10 = f16;
            f11 = f17;
            this.d = abs;
            this.f56643e = abs2;
        } else {
            f10 = 0.0f;
            f11 = 0.6f;
            if (p1Var.J) {
                float width = rectF.width();
                float f25 = p1Var.f56679j;
                float z9 = com.google.android.recaptcha.internal.a.z(width, f25, Math.abs(((int) aVar.nextLong()) % 1000) / 1000.0f, f25);
                float abs5 = Math.abs(((int) aVar.nextLong()) % 360);
                if (p1Var.f56676f[this.f56649l] && !this.f56656s) {
                    z9 = Math.min(z9, org.telegram.messenger.g0.L(10.0f));
                    f12 = org.telegram.messenger.g0.L(30.0f) + 0.0f;
                } else {
                    f12 = 0.0f;
                }
                double d = z9;
                double d2 = abs5;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d2)) * d));
                this.f56643e = rectF.centerY() + f12 + p1Var.f56680k + ((float) (Math.cos(Math.toRadians(d2)) * d));
            } else {
                this.d = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
                this.f56643e = Math.abs(((int) aVar.nextLong()) % rectF.height()) + rectF.top;
            }
        }
        if (p1Var.f56676f[this.f56649l]) {
            this.f56655r = Math.abs(Utilities.f21332c.nextFloat() * 2.0f);
        }
        if (p1Var.f56676f[this.f56649l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.f21332c.nextFloat() * 200.0f));
        } else if (p1Var.h) {
            atan2 = Utilities.f21332c.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.f56643e - (rectF.centerY() + p1Var.f56680k), this.d - (rectF.centerX() + f10));
        }
        this.f56647j = (float) Math.cos(atan2);
        this.f56648k = (float) Math.sin(atan2);
        if (p1Var.f56675e[this.f56649l]) {
            this.f56650m = (int) (((Utilities.f21332c.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f56650m = (int) (((Utilities.f21332c.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = p1Var.O;
        if ((i16 == 6 && ((i10 = this.f56649l) == 1 || i10 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f56651n = (int) (((((int) Utilities.f21332c.nextLong()) % 100) / 100.0f) * 45.0f);
        }
        if (p1Var.O != 101) {
            this.f56654q = f10;
        }
        if (p1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.f21332c.nextFloat() * 1.2f) + f11)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f56644f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + p1Var.f56680k;
            this.f56643e = sin;
            this.f56645g = sin;
        }
        this.f56656s = false;
    }
}
