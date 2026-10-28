package tg;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.d3;
public final class v1 {
    public long f49104a;
    public final int f49105b;
    public float d;
    public float e;
    public float f49107f;
    public float f49108g;
    public float h;
    public float f49109i;
    public float f49110j;
    public float f49111k;
    public int f49112l;
    public int f49113m;
    public float f49114n;
    public long f49115o;
    public float f49116p;
    public float f49117q;
    public float f49118r;
    public final w1 f49120t;
    public float f49106c = 1.0f;
    public boolean f49119s = true;

    public v1(w1 w1Var) {
        this.f49120t = w1Var;
        int i10 = w1Var.T;
        w1Var.T = i10 + 1;
        this.f49105b = i10;
    }

    public final void a(android.graphics.Canvas r21, long r22, float r24) {
        throw new UnsupportedOperationException("Method not decompiled: tg.v1.a(android.graphics.Canvas, long, float):void");
    }

    public final void b(long j10) {
        int i10;
        float f7;
        float f10;
        double atan2;
        int i11;
        float f11;
        float f12;
        float nextFloat;
        w1 w1Var = this.f49120t;
        int i12 = w1Var.O;
        ArrayList arrayList = w1Var.f49135n;
        RectF rectF = w1Var.f49125a;
        if (i12 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.f49112l = 0;
            } else {
                this.f49112l = (int) Math.floor((nextFloat * (w1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f49112l = Math.abs(Utilities.fastRandom.nextInt() % w1Var.d.length);
        }
        long j11 = w1Var.f49144x + j10;
        Random random = Utilities.fastRandom;
        int i13 = w1Var.f49145y;
        if (w1Var.f49128f[this.f49112l]) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        this.f49104a = random.nextInt(i13 * i10) + j11;
        this.f49115o = j10;
        this.f49116p = Utilities.fastRandom.nextFloat() * 6.28f;
        float f13 = 0.0f;
        this.f49114n = 0.0f;
        if (w1Var.f49134m) {
            this.f49106c = d3.f(Utilities.fastRandom, 0.6f, 0.4f);
        }
        if (w1Var.B) {
            float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
            float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            float f14 = 0.0f;
            int i14 = 0;
            while (i14 < 10) {
                float abs3 = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
                float f15 = 2.1474836E9f;
                float f16 = f13;
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    if (w1Var.h) {
                        f11 = ((v1) arrayList.get(i15)).f49107f - abs3;
                        f12 = ((v1) arrayList.get(i15)).f49108g;
                    } else {
                        f11 = ((v1) arrayList.get(i15)).d - abs3;
                        f12 = ((v1) arrayList.get(i15)).e;
                    }
                    float f17 = f12 - abs4;
                    float f18 = (f17 * f17) + (f11 * f11);
                    if (f18 < f15) {
                        f15 = f18;
                    }
                }
                if (f15 > f14) {
                    abs2 = abs4;
                    f14 = f15;
                    abs = abs3;
                }
                i14++;
                f13 = f16;
            }
            f7 = f13;
            this.d = abs;
            this.e = abs2;
        } else {
            f7 = 0.0f;
            if (w1Var.J) {
                float width = rectF.width();
                float f19 = w1Var.f49131j;
                float z10 = c3.h0.z(width, f19, d3.j(Utilities.fastRandom, 1000) / 1000.0f, f19);
                float j12 = d3.j(Utilities.fastRandom, 360);
                if (w1Var.f49128f[this.f49112l] && !this.f49119s) {
                    z10 = Math.min(z10, AndroidUtilities.dp(10.0f));
                    f10 = AndroidUtilities.dp(30.0f) + 0.0f;
                } else {
                    f10 = 0.0f;
                }
                double d = z10;
                double d10 = j12;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.e = rectF.centerY() + f10 + w1Var.f49132k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (w1Var.f49128f[this.f49112l]) {
            this.f49118r = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        if (w1Var.f49128f[this.f49112l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f));
        } else if (w1Var.h) {
            atan2 = Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.e - (rectF.centerY() + w1Var.f49132k), this.d - (rectF.centerX() + f7));
        }
        this.f49110j = (float) Math.cos(atan2);
        this.f49111k = (float) Math.sin(atan2);
        if (w1Var.e[this.f49112l]) {
            this.f49113m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f49113m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = w1Var.O;
        if ((i16 == 6 && ((i11 = this.f49112l) == 1 || i11 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f49114n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (w1Var.O != 101) {
            this.f49117q = f7;
        }
        if (w1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * d3.f(Utilities.fastRandom, 1.2f, 0.6f)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f49107f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + w1Var.f49132k;
            this.e = sin;
            this.f49108g = sin;
        }
        this.f49119s = false;
    }
}
