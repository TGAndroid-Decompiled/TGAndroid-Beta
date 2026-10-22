package sg;

import android.graphics.RectF;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class v1 {
    public long f46457a;
    public final int f46458b;
    public float d;
    public float e;
    public float f46460f;
    public float f46461g;
    public float h;
    public float f46462i;
    public float f46463j;
    public float f46464k;
    public int f46465l;
    public int f46466m;
    public float f46467n;
    public long f46468o;
    public float f46469p;
    public float f46470q;
    public float f46471r;
    public final w1 f46473t;
    public float f46459c = 1.0f;
    public boolean f46472s = true;

    public v1(w1 w1Var) {
        this.f46473t = w1Var;
        int i10 = w1Var.T;
        w1Var.T = i10 + 1;
        this.f46458b = i10;
    }

    public final void a(android.graphics.Canvas r21, long r22, float r24) {
        throw new UnsupportedOperationException("Method not decompiled: sg.v1.a(android.graphics.Canvas, long, float):void");
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
        w1 w1Var = this.f46473t;
        int i12 = w1Var.O;
        ArrayList arrayList = w1Var.f46488n;
        RectF rectF = w1Var.f46478a;
        if (i12 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.f46465l = 0;
            } else {
                this.f46465l = (int) Math.floor((nextFloat * (w1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f46465l = Math.abs(Utilities.fastRandom.nextInt() % w1Var.d.length);
        }
        long j11 = w1Var.f46497x + j10;
        Random random = Utilities.fastRandom;
        int i13 = w1Var.f46498y;
        if (w1Var.f46481f[this.f46465l]) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        this.f46457a = random.nextInt(i13 * i10) + j11;
        this.f46468o = j10;
        this.f46469p = Utilities.fastRandom.nextFloat() * 6.28f;
        float f13 = 0.0f;
        this.f46467n = 0.0f;
        if (w1Var.f46487m) {
            this.f46459c = org.telegram.ui.Cells.c1.d(Utilities.fastRandom, 0.6f, 0.4f);
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
                        f11 = ((v1) arrayList.get(i15)).f46460f - abs3;
                        f12 = ((v1) arrayList.get(i15)).f46461g;
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
                float f19 = w1Var.f46484j;
                float y3 = k3.y(width, f19, org.telegram.ui.Cells.c1.g(Utilities.fastRandom, 1000) / 1000.0f, f19);
                float g10 = org.telegram.ui.Cells.c1.g(Utilities.fastRandom, 360);
                if (w1Var.f46481f[this.f46465l] && !this.f46472s) {
                    y3 = Math.min(y3, AndroidUtilities.dp(10.0f));
                    f10 = AndroidUtilities.dp(30.0f) + 0.0f;
                } else {
                    f10 = 0.0f;
                }
                double d = y3;
                double d10 = g10;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.e = rectF.centerY() + f10 + w1Var.f46485k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (w1Var.f46481f[this.f46465l]) {
            this.f46471r = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        if (w1Var.f46481f[this.f46465l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f));
        } else if (w1Var.h) {
            atan2 = Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.e - (rectF.centerY() + w1Var.f46485k), this.d - (rectF.centerX() + f7));
        }
        this.f46463j = (float) Math.cos(atan2);
        this.f46464k = (float) Math.sin(atan2);
        if (w1Var.e[this.f46465l]) {
            this.f46466m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f46466m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = w1Var.O;
        if ((i16 == 6 && ((i11 = this.f46465l) == 1 || i11 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f46467n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (w1Var.O != 101) {
            this.f46470q = f7;
        }
        if (w1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * org.telegram.ui.Cells.c1.d(Utilities.fastRandom, 1.2f, 0.6f)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f46460f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + w1Var.f46485k;
            this.e = sin;
            this.f46461g = sin;
        }
        this.f46472s = false;
    }
}
