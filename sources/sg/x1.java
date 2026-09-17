package sg;

import android.graphics.RectF;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.p6;
public final class x1 {
    public long f46353a;
    public final int f46354b;
    public float d;
    public float f46356e;
    public float f46357f;
    public float f46358g;
    public float h;
    public float f46359i;
    public float f46360j;
    public float f46361k;
    public int f46362l;
    public int f46363m;
    public float f46364n;
    public float f46365o;
    public float f46366p;
    public final y1 f46368r;
    public float f46355c = 1.0f;
    public boolean f46367q = true;

    public x1(y1 y1Var) {
        this.f46368r = y1Var;
        int i10 = y1Var.S;
        y1Var.S = i10 + 1;
        this.f46354b = i10;
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
        y1 y1Var = this.f46368r;
        int i12 = y1Var.N;
        ArrayList arrayList = y1Var.f46384n;
        RectF rectF = y1Var.f46373a;
        int i13 = 0;
        if (i12 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.f46362l = 0;
            } else {
                this.f46362l = (int) Math.floor((nextFloat * (y1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f46362l = Math.abs(Utilities.fastRandom.nextInt() % y1Var.d.length);
        }
        long j10 = j3 + y1Var.f46393x;
        Random random = Utilities.fastRandom;
        int i14 = y1Var.f46394y;
        if (y1Var.f46377f[this.f46362l]) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        this.f46353a = j10 + random.nextInt(i14 * i10);
        this.f46364n = 0.0f;
        if (y1Var.f46383m) {
            this.f46355c = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
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
                        f12 = ((x1) arrayList.get(i13)).f46357f - abs3;
                        f13 = ((x1) arrayList.get(i13)).f46358g;
                    } else {
                        f12 = ((x1) arrayList.get(i13)).d - abs3;
                        f13 = ((x1) arrayList.get(i13)).f46356e;
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
            this.f46356e = abs2;
        } else {
            f7 = 0.6f;
            f10 = 0.0f;
            if (y1Var.J) {
                float width = rectF.width();
                float f18 = y1Var.f46380j;
                float z10 = e2.z(width, f18, p6.c(Utilities.fastRandom, 1000) / 1000.0f, f18);
                float c10 = p6.c(Utilities.fastRandom, 360);
                if (y1Var.f46377f[this.f46362l] && !this.f46367q) {
                    z10 = Math.min(z10, AndroidUtilities.dp(10.0f));
                    f11 = AndroidUtilities.dp(30.0f) + 0.0f;
                } else {
                    f11 = 0.0f;
                }
                double d = z10;
                double d10 = c10;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.f46356e = rectF.centerY() + f11 + y1Var.f46381k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.f46356e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (y1Var.f46377f[this.f46362l]) {
            this.f46366p = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        if (y1Var.f46377f[this.f46362l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f));
        } else if (y1Var.h) {
            atan2 = Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.f46356e - (rectF.centerY() + y1Var.f46381k), this.d - (rectF.centerX() + f10));
        }
        this.f46360j = (float) Math.cos(atan2);
        this.f46361k = (float) Math.sin(atan2);
        if (y1Var.f46376e[this.f46362l]) {
            this.f46363m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f46363m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = y1Var.N;
        if ((i16 == 6 && ((i11 = this.f46362l) == 1 || i11 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f46364n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (y1Var.N != 101) {
            this.f46365o = 0.0f;
        }
        if (y1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f7)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f46357f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + y1Var.f46381k;
            this.f46356e = sin;
            this.f46358g = sin;
        }
        this.f46367q = false;
    }
}
