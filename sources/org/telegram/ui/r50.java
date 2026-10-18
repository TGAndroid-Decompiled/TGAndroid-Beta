package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r50 {
    public float f40570c;
    public float d;
    public float e;
    public float f40571f;
    public Shader f40572g;
    public final int f40573i;
    public float f40568a = -1.0f;
    public float f40569b = -1.0f;
    public final Matrix h = new Matrix();

    public r50(int i10) {
        this.f40573i = i10;
    }

    public final void a() {
        int i10 = this.f40573i;
        if (s50.q1(i10)) {
            this.f40568a = a1.g.B(Utilities.random.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.f40569b = 1.0f;
        } else if (i10 == 1) {
            this.f40568a = a1.g.B(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.f40569b = a1.g.B(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            this.f40568a = a1.g.d(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f40569b = Utilities.random.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i10, int i11, int i12, long j10, float f7) {
        float f10;
        if (this.f40572g == null) {
            return;
        }
        float f11 = this.e;
        if (f11 == 0.0f || this.f40571f >= f11) {
            this.e = Utilities.random.nextInt(200) + 1500;
            this.f40571f = 0.0f;
            if (this.f40568a == -1.0f) {
                a();
            }
            this.f40570c = this.f40568a;
            this.d = this.f40569b;
            a();
        }
        float f12 = (float) j10;
        float f13 = 1.0f;
        float f14 = (f12 * 0.02f * f7) + (f12 * 1.0f) + this.f40571f;
        this.f40571f = f14;
        float f15 = this.e;
        if (f14 > f15) {
            this.f40571f = f15;
        }
        float interpolation = org.telegram.ui.Components.bs.f25031g.getInterpolation(this.f40571f / f15);
        float f16 = i12;
        float f17 = this.f40570c;
        float f18 = (((((this.f40568a - f17) * interpolation) + f17) * f16) + i11) - 200.0f;
        float f19 = this.d;
        float f20 = (((((this.f40569b - f19) * interpolation) + f19) * f16) + i10) - 200.0f;
        int i13 = this.f40573i;
        if (!s50.q1(i13)) {
            if (i13 == 1) {
                f10 = 4.0f;
            } else {
                f10 = 2.5f;
            }
            f13 = f10;
        }
        float dp = (AndroidUtilities.dp(122.0f) / 400.0f) * f13;
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f18, f20);
        matrix.postScale(dp, dp, f18 + 200.0f, f20 + 200.0f);
        this.f40572g.setLocalMatrix(matrix);
    }
}
