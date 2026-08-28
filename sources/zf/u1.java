package zf;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.j2;
public final class u1 {
    public long f50713a;
    public final int f50714b;
    public float d;
    public float f50716e;
    public float f50717f;
    public float f50718g;
    public float h;
    public float f50719i;
    public float f50720j;
    public float f50721k;
    public int f50722l;
    public int f50723m;
    public float f50724n;
    public float f50725o;
    public float f50726p;
    public final v1 f50728r;
    public float f50715c = 1.0f;
    public boolean f50727q = true;

    public u1(v1 v1Var) {
        this.f50728r = v1Var;
        int i9 = v1Var.S;
        v1Var.S = i9 + 1;
        this.f50714b = i9;
    }

    public final void a(android.graphics.Canvas r11, long r12, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: zf.u1.a(android.graphics.Canvas, long, float):void");
    }

    public final void b(long j10) {
        int i9;
        float f10;
        float f11;
        float f12;
        double atan2;
        int i10;
        float f13;
        float f14;
        float nextFloat;
        v1 v1Var = this.f50728r;
        int i11 = v1Var.N;
        ArrayList arrayList = v1Var.f50744n;
        RectF rectF = v1Var.f50733a;
        int i12 = 0;
        if (i11 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.f50722l = 0;
            } else {
                this.f50722l = (int) Math.floor((nextFloat * (v1Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f50722l = Math.abs(Utilities.fastRandom.nextInt() % v1Var.d.length);
        }
        long j11 = j10 + v1Var.f50753x;
        Random random = Utilities.fastRandom;
        int i13 = v1Var.f50754y;
        if (v1Var.f50737f[this.f50722l]) {
            i9 = 3;
        } else {
            i9 = 1;
        }
        this.f50713a = j11 + random.nextInt(i13 * i9);
        this.f50724n = 0.0f;
        if (v1Var.f50743m) {
            this.f50715c = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
        }
        if (v1Var.B) {
            float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
            float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            int i14 = 0;
            float f15 = 0.0f;
            while (i14 < 10) {
                float abs3 = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
                float f16 = 2.1474836E9f;
                while (i12 < arrayList.size()) {
                    if (v1Var.h) {
                        f13 = ((u1) arrayList.get(i12)).f50717f - abs3;
                        f14 = ((u1) arrayList.get(i12)).f50718g;
                    } else {
                        f13 = ((u1) arrayList.get(i12)).d - abs3;
                        f14 = ((u1) arrayList.get(i12)).f50716e;
                    }
                    float f17 = f14 - abs4;
                    float f18 = (f17 * f17) + (f13 * f13);
                    if (f18 < f16) {
                        f16 = f18;
                    }
                    i12++;
                }
                if (f16 > f15) {
                    abs2 = abs4;
                    f15 = f16;
                    abs = abs3;
                }
                i14++;
                i12 = 0;
            }
            f10 = 0.6f;
            f11 = 0.0f;
            this.d = abs;
            this.f50716e = abs2;
        } else {
            f10 = 0.6f;
            f11 = 0.0f;
            if (v1Var.J) {
                float width = rectF.width();
                float f19 = v1Var.f50740j;
                float z10 = e2.c.z(width, f19, j2.e(Utilities.fastRandom, 1000) / 1000.0f, f19);
                float e10 = j2.e(Utilities.fastRandom, 360);
                if (v1Var.f50737f[this.f50722l] && !this.f50727q) {
                    z10 = Math.min(z10, AndroidUtilities.dp(10.0f));
                    f12 = AndroidUtilities.dp(30.0f) + 0.0f;
                } else {
                    f12 = 0.0f;
                }
                double d = z10;
                double d9 = e10;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d9)) * d));
                this.f50716e = rectF.centerY() + f12 + v1Var.f50741k + ((float) (Math.cos(Math.toRadians(d9)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.f50716e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (v1Var.f50737f[this.f50722l]) {
            this.f50726p = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        if (v1Var.f50737f[this.f50722l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f));
        } else if (v1Var.h) {
            atan2 = Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.f50716e - (rectF.centerY() + v1Var.f50741k), this.d - (rectF.centerX() + f11));
        }
        this.f50720j = (float) Math.cos(atan2);
        this.f50721k = (float) Math.sin(atan2);
        if (v1Var.f50736e[this.f50722l]) {
            this.f50723m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f50723m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i15 = v1Var.N;
        if ((i15 == 6 && ((i10 = this.f50722l) == 1 || i10 == 2)) || i15 == 9 || i15 == 3 || i15 == 7 || i15 == 24 || i15 == 11 || i15 == 22 || i15 == 4) {
            this.f50724n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (v1Var.N != 101) {
            this.f50725o = 0.0f;
        }
        if (v1Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f10)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f50717f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + v1Var.f50741k;
            this.f50716e = sin;
            this.f50718g = sin;
        }
        this.f50727q = false;
    }
}
