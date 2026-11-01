package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class z40 {
    public float f43816c;
    public float d;
    public float e;
    public float f43817f;
    public Shader f43818g;
    public final int f43819i;
    public float f43814a = -1.0f;
    public float f43815b = -1.0f;
    public final Matrix h = new Matrix();

    public z40(int i10) {
        this.f43819i = i10;
    }

    public final void a() {
        int i10 = this.f43819i;
        if (a50.r1(i10)) {
            this.f43814a = a1.g.A(Utilities.f14520b.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.f43815b = 1.0f;
        } else if (i10 == 1) {
            SecureRandom secureRandom = Utilities.f14520b;
            this.f43814a = a1.g.A(secureRandom.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.f43815b = a1.g.A(secureRandom.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            SecureRandom secureRandom2 = Utilities.f14520b;
            this.f43814a = a1.g.c(secureRandom2.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f43815b = secureRandom2.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i10, int i11, int i12, long j10, float f7) {
        float f10;
        if (this.f43818g == null) {
            return;
        }
        float f11 = this.e;
        if (f11 == 0.0f || this.f43817f >= f11) {
            this.e = Utilities.f14520b.nextInt(200) + 1500;
            this.f43817f = 0.0f;
            if (this.f43814a == -1.0f) {
                a();
            }
            this.f43816c = this.f43814a;
            this.d = this.f43815b;
            a();
        }
        float f12 = (float) j10;
        float f13 = 1.0f;
        float f14 = (f12 * 0.02f * f7) + (f12 * 1.0f) + this.f43817f;
        this.f43817f = f14;
        float f15 = this.e;
        if (f14 > f15) {
            this.f43817f = f15;
        }
        float interpolation = org.telegram.ui.Components.gr.f26524g.getInterpolation(this.f43817f / f15);
        float f16 = i12;
        float f17 = this.f43816c;
        float f18 = (((((this.f43814a - f17) * interpolation) + f17) * f16) + i11) - 200.0f;
        float f19 = this.d;
        float f20 = (((((this.f43815b - f19) * interpolation) + f19) * f16) + i10) - 200.0f;
        int i13 = this.f43819i;
        if (!a50.r1(i13)) {
            if (i13 == 1) {
                f10 = 4.0f;
            } else {
                f10 = 2.5f;
            }
            f13 = f10;
        }
        float L = (org.telegram.messenger.i0.L(122.0f) / 400.0f) * f13;
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f18, f20);
        matrix.postScale(L, L, f18 + 200.0f, f20 + 200.0f);
        this.f43818g.setLocalMatrix(matrix);
    }
}
