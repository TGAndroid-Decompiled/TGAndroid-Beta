package ug;

import android.graphics.RectF;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class q1 {
    public long f58274a;
    public final int f58275b;
    public float d;
    public float f58277e;
    public float f58278f;
    public float f58279g;
    public float h;
    public float f58280i;
    public float f58281j;
    public float f58282k;
    public int f58283l;
    public int f58284m;
    public float f58285n;
    public long f58286o;
    public float f58287p;
    public float f58288q;
    public float f58289r;
    public final r1 f58291t;
    public float f58276c = 1.0f;
    public boolean f58290s = true;

    public q1(r1 r1Var) {
        this.f58291t = r1Var;
        int i7 = r1Var.T;
        r1Var.T = i7 + 1;
        this.f58275b = i7;
    }

    public final void a(android.graphics.Canvas r21, long r22, float r24) {
        throw new UnsupportedOperationException("Method not decompiled: ug.q1.a(android.graphics.Canvas, long, float):void");
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
        r1 r1Var = this.f58291t;
        int i11 = r1Var.O;
        ArrayList arrayList = r1Var.f58316n;
        RectF rectF = r1Var.f58305a;
        if (i11 == 28) {
            if (Utilities.f22415c.nextFloat() < 0.13f) {
                this.f58283l = 0;
            } else {
                this.f58283l = (int) Math.floor((nextFloat * (r1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f58283l = Math.abs(((int) Utilities.f22415c.nextLong()) % r1Var.d.length);
        }
        long j10 = r1Var.f58325x + j3;
        g5.a aVar = Utilities.f22415c;
        int i12 = r1Var.f58326y;
        if (r1Var.f58309f[this.f58283l]) {
            i7 = 3;
        } else {
            i7 = 1;
        }
        this.f58274a = aVar.nextInt(i12 * i7) + j10;
        this.f58286o = j3;
        this.f58287p = aVar.nextFloat() * 6.28f;
        float f16 = 0.0f;
        this.f58285n = 0.0f;
        float f17 = 0.6f;
        if (r1Var.f58315m) {
            this.f58276c = (aVar.nextFloat() * 0.6f) + 0.4f;
        }
        if (r1Var.B) {
            float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
            float abs2 = Math.abs(((int) aVar.nextLong()) % rectF.height()) + rectF.top;
            float f18 = 0.0f;
            int i13 = 0;
            while (i13 < 10) {
                float f19 = rectF.left;
                g5.a aVar2 = Utilities.f22415c;
                float f20 = f16;
                int i14 = i13;
                float abs3 = Math.abs(((int) aVar2.nextLong()) % rectF.width()) + f19;
                float abs4 = Math.abs(((int) aVar2.nextLong()) % rectF.height()) + rectF.top;
                float f21 = 2.1474836E9f;
                int i15 = 0;
                while (i15 < arrayList.size()) {
                    if (r1Var.h) {
                        f14 = ((q1) arrayList.get(i15)).f58278f - abs3;
                        f13 = f17;
                        f15 = ((q1) arrayList.get(i15)).f58279g;
                    } else {
                        f13 = f17;
                        f14 = ((q1) arrayList.get(i15)).d - abs3;
                        f15 = ((q1) arrayList.get(i15)).f58277e;
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
            this.f58277e = abs2;
        } else {
            f10 = 0.0f;
            f11 = 0.6f;
            if (r1Var.J) {
                float width = rectF.width();
                float f25 = r1Var.f58312j;
                float z10 = e2.z(width, f25, Math.abs(((int) aVar.nextLong()) % 1000) / 1000.0f, f25);
                float abs5 = Math.abs(((int) aVar.nextLong()) % 360);
                if (r1Var.f58309f[this.f58283l] && !this.f58290s) {
                    z10 = Math.min(z10, org.telegram.messenger.g0.L(10.0f));
                    f12 = org.telegram.messenger.g0.L(30.0f) + 0.0f;
                } else {
                    f12 = 0.0f;
                }
                double d = z10;
                double d2 = abs5;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d2)) * d));
                this.f58277e = rectF.centerY() + f12 + r1Var.f58313k + ((float) (Math.cos(Math.toRadians(d2)) * d));
            } else {
                this.d = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
                this.f58277e = Math.abs(((int) aVar.nextLong()) % rectF.height()) + rectF.top;
            }
        }
        if (r1Var.f58309f[this.f58283l]) {
            this.f58289r = Math.abs(Utilities.f22415c.nextFloat() * 2.0f);
        }
        if (r1Var.f58309f[this.f58283l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.f22415c.nextFloat() * 200.0f));
        } else if (r1Var.h) {
            atan2 = Utilities.f22415c.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.f58277e - (rectF.centerY() + r1Var.f58313k), this.d - (rectF.centerX() + f10));
        }
        this.f58281j = (float) Math.cos(atan2);
        this.f58282k = (float) Math.sin(atan2);
        if (r1Var.f58308e[this.f58283l]) {
            this.f58284m = (int) (((Utilities.f22415c.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f58284m = (int) (((Utilities.f22415c.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = r1Var.O;
        if ((i16 == 6 && ((i10 = this.f58283l) == 1 || i10 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f58285n = (int) (((((int) Utilities.f22415c.nextLong()) % 100) / 100.0f) * 45.0f);
        }
        if (r1Var.O != 101) {
            this.f58288q = f10;
        }
        if (r1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.f22415c.nextFloat() * 1.2f) + f11)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f58278f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + r1Var.f58313k;
            this.f58277e = sin;
            this.f58279g = sin;
        }
        this.f58290s = false;
    }
}
