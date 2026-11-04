package vg;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class r1 {
    public long f56810a;
    public final int f56811b;
    public float d;
    public float f56813e;
    public float f56814f;
    public float f56815g;
    public float h;
    public float f56816i;
    public float f56817j;
    public float f56818k;
    public int f56819l;
    public int f56820m;
    public float f56821n;
    public long f56822o;
    public float f56823p;
    public float f56824q;
    public float f56825r;
    public final s1 f56827t;
    public float f56812c = 1.0f;
    public boolean f56826s = true;

    public r1(s1 s1Var) {
        this.f56827t = s1Var;
        int i3 = s1Var.T;
        s1Var.T = i3 + 1;
        this.f56811b = i3;
    }

    public final void a(android.graphics.Canvas r21, long r22, float r24) {
        throw new UnsupportedOperationException("Method not decompiled: vg.r1.a(android.graphics.Canvas, long, float):void");
    }

    public final void b(long j10) {
        int i3;
        float f10;
        float f11;
        float f12;
        double atan2;
        int i10;
        float f13;
        float f14;
        float f15;
        float nextFloat;
        s1 s1Var = this.f56827t;
        int i11 = s1Var.O;
        ArrayList arrayList = s1Var.f56840n;
        RectF rectF = s1Var.f56829a;
        if (i11 == 28) {
            if (Utilities.f21386c.nextFloat() < 0.13f) {
                this.f56819l = 0;
            } else {
                this.f56819l = (int) Math.floor((nextFloat * (s1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f56819l = Math.abs(((int) Utilities.f21386c.nextLong()) % s1Var.d.length);
        }
        long j11 = s1Var.f56849x + j10;
        f5.a aVar = Utilities.f21386c;
        int i12 = s1Var.f56850y;
        if (s1Var.f56833f[this.f56819l]) {
            i3 = 3;
        } else {
            i3 = 1;
        }
        this.f56810a = aVar.nextInt(i12 * i3) + j11;
        this.f56822o = j10;
        this.f56823p = aVar.nextFloat() * 6.28f;
        float f16 = 0.0f;
        this.f56821n = 0.0f;
        float f17 = 0.6f;
        if (s1Var.f56839m) {
            this.f56812c = (aVar.nextFloat() * 0.6f) + 0.4f;
        }
        if (s1Var.B) {
            float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
            float abs2 = Math.abs(((int) aVar.nextLong()) % rectF.height()) + rectF.top;
            float f18 = 0.0f;
            int i13 = 0;
            while (i13 < 10) {
                float f19 = rectF.left;
                f5.a aVar2 = Utilities.f21386c;
                float f20 = f16;
                int i14 = i13;
                float abs3 = Math.abs(((int) aVar2.nextLong()) % rectF.width()) + f19;
                float abs4 = Math.abs(((int) aVar2.nextLong()) % rectF.height()) + rectF.top;
                float f21 = 2.1474836E9f;
                int i15 = 0;
                while (i15 < arrayList.size()) {
                    if (s1Var.h) {
                        f14 = ((r1) arrayList.get(i15)).f56814f - abs3;
                        f13 = f17;
                        f15 = ((r1) arrayList.get(i15)).f56815g;
                    } else {
                        f13 = f17;
                        f14 = ((r1) arrayList.get(i15)).d - abs3;
                        f15 = ((r1) arrayList.get(i15)).f56813e;
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
            this.f56813e = abs2;
        } else {
            f10 = 0.0f;
            f11 = 0.6f;
            if (s1Var.J) {
                float width = rectF.width();
                float f25 = s1Var.f56836j;
                float y9 = com.google.android.recaptcha.internal.a.y(width, f25, Math.abs(((int) aVar.nextLong()) % 1000) / 1000.0f, f25);
                float abs5 = Math.abs(((int) aVar.nextLong()) % 360);
                if (s1Var.f56833f[this.f56819l] && !this.f56826s) {
                    y9 = Math.min(y9, org.telegram.messenger.g0.L(10.0f));
                    f12 = org.telegram.messenger.g0.L(30.0f) + 0.0f;
                } else {
                    f12 = 0.0f;
                }
                double d = y9;
                double d10 = abs5;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.f56813e = rectF.centerY() + f12 + s1Var.f56837k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
                this.f56813e = Math.abs(((int) aVar.nextLong()) % rectF.height()) + rectF.top;
            }
        }
        if (s1Var.f56833f[this.f56819l]) {
            this.f56825r = Math.abs(Utilities.f21386c.nextFloat() * 2.0f);
        }
        if (s1Var.f56833f[this.f56819l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.f21386c.nextFloat() * 200.0f));
        } else if (s1Var.h) {
            atan2 = Utilities.f21386c.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.f56813e - (rectF.centerY() + s1Var.f56837k), this.d - (rectF.centerX() + f10));
        }
        this.f56817j = (float) Math.cos(atan2);
        this.f56818k = (float) Math.sin(atan2);
        if (s1Var.f56832e[this.f56819l]) {
            this.f56820m = (int) (((Utilities.f21386c.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f56820m = (int) (((Utilities.f21386c.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = s1Var.O;
        if ((i16 == 6 && ((i10 = this.f56819l) == 1 || i10 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f56821n = (int) (((((int) Utilities.f21386c.nextLong()) % 100) / 100.0f) * 45.0f);
        }
        if (s1Var.O != 101) {
            this.f56824q = f10;
        }
        if (s1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.f21386c.nextFloat() * 1.2f) + f11)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f56814f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + s1Var.f56837k;
            this.f56813e = sin;
            this.f56815g = sin;
        }
        this.f56826s = false;
    }
}
