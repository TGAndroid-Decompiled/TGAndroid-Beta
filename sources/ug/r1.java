package ug;

import android.graphics.RectF;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class r1 {
    public long f58907a;
    public final int f58908b;
    public float d;
    public float f58910e;
    public float f58911f;
    public float f58912g;
    public float h;
    public float f58913i;
    public float f58914j;
    public float f58915k;
    public int f58916l;
    public int f58917m;
    public float f58918n;
    public long f58919o;
    public float f58920p;
    public float f58921q;
    public float f58922r;
    public final s1 f58924t;
    public float f58909c = 1.0f;
    public boolean f58923s = true;

    public r1(s1 s1Var) {
        this.f58924t = s1Var;
        int i7 = s1Var.T;
        s1Var.T = i7 + 1;
        this.f58908b = i7;
    }

    public final void a(android.graphics.Canvas r21, long r22, float r24) {
        throw new UnsupportedOperationException("Method not decompiled: ug.r1.a(android.graphics.Canvas, long, float):void");
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
        s1 s1Var = this.f58924t;
        int i11 = s1Var.O;
        ArrayList arrayList = s1Var.f58938n;
        RectF rectF = s1Var.f58927a;
        if (i11 == 28) {
            if (Utilities.f22806c.nextFloat() < 0.13f) {
                this.f58916l = 0;
            } else {
                this.f58916l = (int) Math.floor((nextFloat * (s1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f58916l = Math.abs(((int) Utilities.f22806c.nextLong()) % s1Var.d.length);
        }
        long j10 = s1Var.f58947x + j3;
        g5.a aVar = Utilities.f22806c;
        int i12 = s1Var.f58948y;
        if (s1Var.f58931f[this.f58916l]) {
            i7 = 3;
        } else {
            i7 = 1;
        }
        this.f58907a = aVar.nextInt(i12 * i7) + j10;
        this.f58919o = j3;
        this.f58920p = aVar.nextFloat() * 6.28f;
        float f16 = 0.0f;
        this.f58918n = 0.0f;
        float f17 = 0.6f;
        if (s1Var.f58937m) {
            this.f58909c = (aVar.nextFloat() * 0.6f) + 0.4f;
        }
        if (s1Var.B) {
            float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
            float abs2 = Math.abs(((int) aVar.nextLong()) % rectF.height()) + rectF.top;
            float f18 = 0.0f;
            int i13 = 0;
            while (i13 < 10) {
                float f19 = rectF.left;
                g5.a aVar2 = Utilities.f22806c;
                float f20 = f16;
                int i14 = i13;
                float abs3 = Math.abs(((int) aVar2.nextLong()) % rectF.width()) + f19;
                float abs4 = Math.abs(((int) aVar2.nextLong()) % rectF.height()) + rectF.top;
                float f21 = 2.1474836E9f;
                int i15 = 0;
                while (i15 < arrayList.size()) {
                    if (s1Var.h) {
                        f14 = ((r1) arrayList.get(i15)).f58911f - abs3;
                        f13 = f17;
                        f15 = ((r1) arrayList.get(i15)).f58912g;
                    } else {
                        f13 = f17;
                        f14 = ((r1) arrayList.get(i15)).d - abs3;
                        f15 = ((r1) arrayList.get(i15)).f58910e;
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
            this.f58910e = abs2;
        } else {
            f10 = 0.0f;
            f11 = 0.6f;
            if (s1Var.J) {
                float width = rectF.width();
                float f25 = s1Var.f58934j;
                float z10 = e2.z(width, f25, Math.abs(((int) aVar.nextLong()) % 1000) / 1000.0f, f25);
                float abs5 = Math.abs(((int) aVar.nextLong()) % 360);
                if (s1Var.f58931f[this.f58916l] && !this.f58923s) {
                    z10 = Math.min(z10, org.telegram.messenger.g0.L(10.0f));
                    f12 = org.telegram.messenger.g0.L(30.0f) + 0.0f;
                } else {
                    f12 = 0.0f;
                }
                double d = z10;
                double d2 = abs5;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d2)) * d));
                this.f58910e = rectF.centerY() + f12 + s1Var.f58935k + ((float) (Math.cos(Math.toRadians(d2)) * d));
            } else {
                this.d = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
                this.f58910e = Math.abs(((int) aVar.nextLong()) % rectF.height()) + rectF.top;
            }
        }
        if (s1Var.f58931f[this.f58916l]) {
            this.f58922r = Math.abs(Utilities.f22806c.nextFloat() * 2.0f);
        }
        if (s1Var.f58931f[this.f58916l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.f22806c.nextFloat() * 200.0f));
        } else if (s1Var.h) {
            atan2 = Utilities.f22806c.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.f58910e - (rectF.centerY() + s1Var.f58935k), this.d - (rectF.centerX() + f10));
        }
        this.f58914j = (float) Math.cos(atan2);
        this.f58915k = (float) Math.sin(atan2);
        if (s1Var.f58930e[this.f58916l]) {
            this.f58917m = (int) (((Utilities.f22806c.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f58917m = (int) (((Utilities.f22806c.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = s1Var.O;
        if ((i16 == 6 && ((i10 = this.f58916l) == 1 || i10 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f58918n = (int) (((((int) Utilities.f22806c.nextLong()) % 100) / 100.0f) * 45.0f);
        }
        if (s1Var.O != 101) {
            this.f58921q = f10;
        }
        if (s1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.f22806c.nextFloat() * 1.2f) + f11)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f58911f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + s1Var.f58935k;
            this.f58910e = sin;
            this.f58912g = sin;
        }
        this.f58923s = false;
    }
}
