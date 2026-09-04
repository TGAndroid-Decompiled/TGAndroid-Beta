package sg;

import android.graphics.RectF;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.p6;
public final class x1 {
    public long f46324a;
    public final int f46325b;
    public float d;
    public float f46327e;
    public float f46328f;
    public float f46329g;
    public float h;
    public float f46330i;
    public float f46331j;
    public float f46332k;
    public int f46333l;
    public int f46334m;
    public float f46335n;
    public float f46336o;
    public float f46337p;
    public final y1 f46339r;
    public float f46326c = 1.0f;
    public boolean f46338q = true;

    public x1(y1 y1Var) {
        this.f46339r = y1Var;
        int i10 = y1Var.S;
        y1Var.S = i10 + 1;
        this.f46325b = i10;
    }

    public final void a(android.graphics.Canvas r11, long r12, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: sg.x1.a(android.graphics.Canvas, long, float):void");
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
        y1 y1Var = this.f46339r;
        int i12 = y1Var.N;
        ArrayList arrayList = y1Var.f46355n;
        RectF rectF = y1Var.f46344a;
        int i13 = 0;
        if (i12 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.f46333l = 0;
            } else {
                this.f46333l = (int) Math.floor((nextFloat * (y1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f46333l = Math.abs(Utilities.fastRandom.nextInt() % y1Var.d.length);
        }
        long j10 = j3 + y1Var.f46364x;
        Random random = Utilities.fastRandom;
        int i14 = y1Var.f46365y;
        if (y1Var.f46348f[this.f46333l]) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        this.f46324a = j10 + random.nextInt(i14 * i10);
        this.f46335n = 0.0f;
        if (y1Var.f46354m) {
            this.f46326c = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
        }
        if (y1Var.B) {
            float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
            float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            int i15 = 0;
            float f14 = 0.0f;
            while (i15 < 10) {
                float abs3 = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
                float f15 = 2.1474836E9f;
                while (i13 < arrayList.size()) {
                    if (y1Var.h) {
                        f12 = ((x1) arrayList.get(i13)).f46328f - abs3;
                        f13 = ((x1) arrayList.get(i13)).f46329g;
                    } else {
                        f12 = ((x1) arrayList.get(i13)).d - abs3;
                        f13 = ((x1) arrayList.get(i13)).f46327e;
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
            this.f46327e = abs2;
        } else {
            f7 = 0.6f;
            f10 = 0.0f;
            if (y1Var.J) {
                float width = rectF.width();
                float f18 = y1Var.f46351j;
                float z10 = e2.z(width, f18, p6.c(Utilities.fastRandom, 1000) / 1000.0f, f18);
                float c10 = p6.c(Utilities.fastRandom, 360);
                if (y1Var.f46348f[this.f46333l] && !this.f46338q) {
                    z10 = Math.min(z10, AndroidUtilities.dp(10.0f));
                    f11 = AndroidUtilities.dp(30.0f) + 0.0f;
                } else {
                    f11 = 0.0f;
                }
                double d = z10;
                double d10 = c10;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.f46327e = rectF.centerY() + f11 + y1Var.f46352k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.f46327e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (y1Var.f46348f[this.f46333l]) {
            this.f46337p = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        if (y1Var.f46348f[this.f46333l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f));
        } else if (y1Var.h) {
            atan2 = Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.f46327e - (rectF.centerY() + y1Var.f46352k), this.d - (rectF.centerX() + f10));
        }
        this.f46331j = (float) Math.cos(atan2);
        this.f46332k = (float) Math.sin(atan2);
        if (y1Var.f46347e[this.f46333l]) {
            this.f46334m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f46334m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = y1Var.N;
        if ((i16 == 6 && ((i11 = this.f46333l) == 1 || i11 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f46335n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (y1Var.N != 101) {
            this.f46336o = 0.0f;
        }
        if (y1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f7)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f46328f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + y1Var.f46352k;
            this.f46327e = sin;
            this.f46329g = sin;
        }
        this.f46338q = false;
    }
}
