package ug;

import android.graphics.RectF;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class s1 {
    public long f58871a;
    public final int f58872b;
    public float d;
    public float f58874e;
    public float f58875f;
    public float f58876g;
    public float h;
    public float f58877i;
    public float f58878j;
    public float f58879k;
    public int f58880l;
    public int f58881m;
    public float f58882n;
    public long f58883o;
    public float f58884p;
    public float f58885q;
    public float f58886r;
    public final t1 f58888t;
    public float f58873c = 1.0f;
    public boolean f58887s = true;

    public s1(t1 t1Var) {
        this.f58888t = t1Var;
        int i7 = t1Var.T;
        t1Var.T = i7 + 1;
        this.f58872b = i7;
    }

    public final void a(android.graphics.Canvas r21, long r22, float r24) {
        throw new UnsupportedOperationException("Method not decompiled: ug.s1.a(android.graphics.Canvas, long, float):void");
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
        t1 t1Var = this.f58888t;
        int i11 = t1Var.O;
        ArrayList arrayList = t1Var.f58904n;
        RectF rectF = t1Var.f58893a;
        if (i11 == 28) {
            if (Utilities.f22778c.nextFloat() < 0.13f) {
                this.f58880l = 0;
            } else {
                this.f58880l = (int) Math.floor((nextFloat * (t1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f58880l = Math.abs(((int) Utilities.f22778c.nextLong()) % t1Var.d.length);
        }
        long j10 = t1Var.f58913x + j3;
        g5.a aVar = Utilities.f22778c;
        int i12 = t1Var.f58914y;
        if (t1Var.f58897f[this.f58880l]) {
            i7 = 3;
        } else {
            i7 = 1;
        }
        this.f58871a = aVar.nextInt(i12 * i7) + j10;
        this.f58883o = j3;
        this.f58884p = aVar.nextFloat() * 6.28f;
        float f16 = 0.0f;
        this.f58882n = 0.0f;
        float f17 = 0.6f;
        if (t1Var.f58903m) {
            this.f58873c = (aVar.nextFloat() * 0.6f) + 0.4f;
        }
        if (t1Var.B) {
            float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
            float abs2 = Math.abs(((int) aVar.nextLong()) % rectF.height()) + rectF.top;
            float f18 = 0.0f;
            int i13 = 0;
            while (i13 < 10) {
                float f19 = rectF.left;
                g5.a aVar2 = Utilities.f22778c;
                float f20 = f16;
                int i14 = i13;
                float abs3 = Math.abs(((int) aVar2.nextLong()) % rectF.width()) + f19;
                float abs4 = Math.abs(((int) aVar2.nextLong()) % rectF.height()) + rectF.top;
                float f21 = 2.1474836E9f;
                int i15 = 0;
                while (i15 < arrayList.size()) {
                    if (t1Var.h) {
                        f14 = ((s1) arrayList.get(i15)).f58875f - abs3;
                        f13 = f17;
                        f15 = ((s1) arrayList.get(i15)).f58876g;
                    } else {
                        f13 = f17;
                        f14 = ((s1) arrayList.get(i15)).d - abs3;
                        f15 = ((s1) arrayList.get(i15)).f58874e;
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
            this.f58874e = abs2;
        } else {
            f10 = 0.0f;
            f11 = 0.6f;
            if (t1Var.J) {
                float width = rectF.width();
                float f25 = t1Var.f58900j;
                float z10 = e2.z(width, f25, Math.abs(((int) aVar.nextLong()) % 1000) / 1000.0f, f25);
                float abs5 = Math.abs(((int) aVar.nextLong()) % 360);
                if (t1Var.f58897f[this.f58880l] && !this.f58887s) {
                    z10 = Math.min(z10, org.telegram.messenger.g0.L(10.0f));
                    f12 = org.telegram.messenger.g0.L(30.0f) + 0.0f;
                } else {
                    f12 = 0.0f;
                }
                double d = z10;
                double d2 = abs5;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d2)) * d));
                this.f58874e = rectF.centerY() + f12 + t1Var.f58901k + ((float) (Math.cos(Math.toRadians(d2)) * d));
            } else {
                this.d = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
                this.f58874e = Math.abs(((int) aVar.nextLong()) % rectF.height()) + rectF.top;
            }
        }
        if (t1Var.f58897f[this.f58880l]) {
            this.f58886r = Math.abs(Utilities.f22778c.nextFloat() * 2.0f);
        }
        if (t1Var.f58897f[this.f58880l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.f22778c.nextFloat() * 200.0f));
        } else if (t1Var.h) {
            atan2 = Utilities.f22778c.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.f58874e - (rectF.centerY() + t1Var.f58901k), this.d - (rectF.centerX() + f10));
        }
        this.f58878j = (float) Math.cos(atan2);
        this.f58879k = (float) Math.sin(atan2);
        if (t1Var.f58896e[this.f58880l]) {
            this.f58881m = (int) (((Utilities.f22778c.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f58881m = (int) (((Utilities.f22778c.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = t1Var.O;
        if ((i16 == 6 && ((i10 = this.f58880l) == 1 || i10 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f58882n = (int) (((((int) Utilities.f22778c.nextLong()) % 100) / 100.0f) * 45.0f);
        }
        if (t1Var.O != 101) {
            this.f58885q = f10;
        }
        if (t1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.f22778c.nextFloat() * 1.2f) + f11)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f58875f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + t1Var.f58901k;
            this.f58874e = sin;
            this.f58876g = sin;
        }
        this.f58887s = false;
    }
}
