package rg;

import android.graphics.RectF;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.q3;
public final class t1 {
    public long f42471a;
    public final int f42472b;
    public float d;
    public float e;
    public float f42474f;
    public float f42475g;
    public float h;
    public float f42476i;
    public float f42477j;
    public float f42478k;
    public int f42479l;
    public int f42480m;
    public float f42481n;
    public float f42482o;
    public float f42483p;
    public final u1 f42485r;
    public float f42473c = 1.0f;
    public boolean f42484q = true;

    public t1(u1 u1Var) {
        this.f42485r = u1Var;
        int i10 = u1Var.S;
        u1Var.S = i10 + 1;
        this.f42472b = i10;
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
        u1 u1Var = this.f42485r;
        int i12 = u1Var.N;
        ArrayList arrayList = u1Var.f42502n;
        RectF rectF = u1Var.f42492a;
        int i13 = 0;
        if (i12 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.f42479l = 0;
            } else {
                this.f42479l = (int) Math.floor((nextFloat * (u1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f42479l = Math.abs(Utilities.fastRandom.nextInt() % u1Var.d.length);
        }
        long j10 = j3 + u1Var.f42511x;
        Random random = Utilities.fastRandom;
        int i14 = u1Var.f42512y;
        if (u1Var.f42495f[this.f42479l]) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        this.f42471a = j10 + random.nextInt(i14 * i10);
        this.f42481n = 0.0f;
        if (u1Var.f42501m) {
            this.f42473c = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
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
                        f12 = ((t1) arrayList.get(i13)).f42474f - abs3;
                        f13 = ((t1) arrayList.get(i13)).f42475g;
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
                float f18 = u1Var.f42498j;
                float z10 = e2.z(width, f18, q3.c(Utilities.fastRandom, 1000) / 1000.0f, f18);
                float c10 = q3.c(Utilities.fastRandom, 360);
                if (u1Var.f42495f[this.f42479l] && !this.f42484q) {
                    z10 = Math.min(z10, AndroidUtilities.dp(10.0f));
                    f11 = AndroidUtilities.dp(30.0f) + 0.0f;
                } else {
                    f11 = 0.0f;
                }
                double d = z10;
                double d10 = c10;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.e = rectF.centerY() + f11 + u1Var.f42499k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (u1Var.f42495f[this.f42479l]) {
            this.f42483p = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        if (u1Var.f42495f[this.f42479l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f));
        } else if (u1Var.h) {
            atan2 = Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.e - (rectF.centerY() + u1Var.f42499k), this.d - (rectF.centerX() + f10));
        }
        this.f42477j = (float) Math.cos(atan2);
        this.f42478k = (float) Math.sin(atan2);
        if (u1Var.e[this.f42479l]) {
            this.f42480m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f42480m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = u1Var.N;
        if ((i16 == 6 && ((i11 = this.f42479l) == 1 || i11 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f42481n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (u1Var.N != 101) {
            this.f42482o = 0.0f;
        }
        if (u1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f7)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f42474f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + u1Var.f42499k;
            this.e = sin;
            this.f42475g = sin;
        }
        this.f42484q = false;
    }
}
