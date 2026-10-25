package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class u50 {
    public float f44016c;
    public float d;
    public float e;
    public float f44017f;
    public Shader f44018g;
    public final int f44019i;
    public float f44014a = -1.0f;
    public float f44015b = -1.0f;
    public final Matrix h = new Matrix();

    public u50(int i10) {
        this.f44019i = i10;
    }

    public final void a() {
        int i10 = this.f44019i;
        if (v50.p1(i10)) {
            this.f44014a = a1.g.C(Utilities.random.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.f44015b = 1.0f;
        } else if (i10 == 1) {
            this.f44014a = a1.g.C(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.f44015b = a1.g.C(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            this.f44014a = a1.g.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f44015b = Utilities.random.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i10, int i11, int i12, long j10, float f7) {
        float f10;
        if (this.f44018g == null) {
            return;
        }
        float f11 = this.e;
        if (f11 == 0.0f || this.f44017f >= f11) {
            this.e = Utilities.random.nextInt(200) + 1500;
            this.f44017f = 0.0f;
            if (this.f44014a == -1.0f) {
                a();
            }
            this.f44016c = this.f44014a;
            this.d = this.f44015b;
            a();
        }
        float f12 = (float) j10;
        float f13 = 1.0f;
        float f14 = (f12 * 0.02f * f7) + (f12 * 1.0f) + this.f44017f;
        this.f44017f = f14;
        float f15 = this.e;
        if (f14 > f15) {
            this.f44017f = f15;
        }
        float interpolation = org.telegram.ui.Components.ds.f27585g.getInterpolation(this.f44017f / f15);
        float f16 = i12;
        float f17 = this.f44016c;
        float f18 = (((((this.f44014a - f17) * interpolation) + f17) * f16) + i11) - 200.0f;
        float f19 = this.d;
        float f20 = (((((this.f44015b - f19) * interpolation) + f19) * f16) + i10) - 200.0f;
        int i13 = this.f44019i;
        if (!v50.p1(i13)) {
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
        this.f44018g.setLocalMatrix(matrix);
    }
}
