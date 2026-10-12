package sg;

import android.graphics.RectF;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class v1 {
    public long f45380a;
    public final int f45381b;
    public float d;
    public float e;
    public float f45383f;
    public float f45384g;
    public float h;
    public float f45385i;
    public float f45386j;
    public float f45387k;
    public int f45388l;
    public int f45389m;
    public float f45390n;
    public float f45391o;
    public float f45392p;
    public final w1 f45394r;
    public float f45382c = 1.0f;
    public boolean f45393q = true;

    public v1(w1 w1Var) {
        this.f45394r = w1Var;
        int i10 = w1Var.S;
        w1Var.S = i10 + 1;
        this.f45381b = i10;
    }

    public final void a(android.graphics.Canvas r11, long r12, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: sg.v1.a(android.graphics.Canvas, long, float):void");
    }

    public final void b(long j10) {
        int i10;
        float f7;
        float f10;
        float f11;
        double atan2;
        int i11;
        float f12;
        float f13;
        float nextFloat;
        w1 w1Var = this.f45394r;
        int i12 = w1Var.N;
        ArrayList arrayList = w1Var.f45409n;
        RectF rectF = w1Var.f45399a;
        int i13 = 0;
        if (i12 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.f45388l = 0;
            } else {
                this.f45388l = (int) Math.floor((nextFloat * (w1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f45388l = Math.abs(Utilities.fastRandom.nextInt() % w1Var.d.length);
        }
        long j11 = j10 + w1Var.f45418x;
        Random random = Utilities.fastRandom;
        int i14 = w1Var.f45419y;
        if (w1Var.f45402f[this.f45388l]) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        this.f45380a = j11 + random.nextInt(i14 * i10);
        float f14 = 0.0f;
        this.f45390n = 0.0f;
        float f15 = 0.6f;
        if (w1Var.f45408m) {
            this.f45382c = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
        }
        if (w1Var.B) {
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
                    if (w1Var.h) {
                        f12 = ((v1) arrayList.get(i13)).f45383f - abs3;
                        f13 = ((v1) arrayList.get(i13)).f45384g;
                    } else {
                        f12 = ((v1) arrayList.get(i13)).d - abs3;
                        f13 = ((v1) arrayList.get(i13)).e;
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
            this.e = abs2;
        } else {
            f7 = 0.0f;
            f10 = 0.6f;
            if (w1Var.J) {
                float width = rectF.width();
                float f22 = w1Var.f45405j;
                float y3 = k3.y(width, f22, org.telegram.ui.Cells.d0.e(Utilities.fastRandom, 1000) / 1000.0f, f22);
                float e = org.telegram.ui.Cells.d0.e(Utilities.fastRandom, 360);
                if (w1Var.f45402f[this.f45388l] && !this.f45393q) {
                    y3 = Math.min(y3, AndroidUtilities.dp(10.0f));
                    f11 = AndroidUtilities.dp(30.0f) + 0.0f;
                } else {
                    f11 = 0.0f;
                }
                double d = y3;
                double d10 = e;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.e = rectF.centerY() + f11 + w1Var.f45406k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (w1Var.f45402f[this.f45388l]) {
            this.f45392p = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        if (w1Var.f45402f[this.f45388l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f));
        } else if (w1Var.h) {
            atan2 = Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.e - (rectF.centerY() + w1Var.f45406k), this.d - (rectF.centerX() + f7));
        }
        this.f45386j = (float) Math.cos(atan2);
        this.f45387k = (float) Math.sin(atan2);
        if (w1Var.e[this.f45388l]) {
            this.f45389m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f45389m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = w1Var.N;
        if ((i16 == 6 && ((i11 = this.f45388l) == 1 || i11 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f45390n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (w1Var.N != 101) {
            this.f45391o = f7;
        }
        if (w1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f10)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f45383f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + w1Var.f45406k;
            this.e = sin;
            this.f45384g = sin;
        }
        this.f45393q = false;
    }
}
