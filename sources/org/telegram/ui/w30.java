package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
public final class w30 {
    public float f50685c;
    public float d;
    public float f50686e;
    public float f50687f;
    public Shader f50688g;
    public final int f50689i;
    public float f50683a = -1.0f;
    public float f50684b = -1.0f;
    public final Matrix h = new Matrix();

    public w30(int i3) {
        this.f50689i = i3;
    }

    public final void a() {
        int i3 = this.f50689i;
        if (x30.r1(i3)) {
            this.f50683a = a1.g.e(Utilities.f21385b.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.f50684b = 1.0f;
        } else if (i3 == 1) {
            SecureRandom secureRandom = Utilities.f21385b;
            this.f50683a = a1.g.e(secureRandom.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.f50684b = a1.g.e(secureRandom.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            SecureRandom secureRandom2 = Utilities.f21385b;
            this.f50683a = a1.g.A(secureRandom2.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f50684b = secureRandom2.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i3, int i10, int i11, long j10, float f10) {
        float f11;
        if (this.f50688g == null) {
            return;
        }
        float f12 = this.f50686e;
        if (f12 == 0.0f || this.f50687f >= f12) {
            this.f50686e = Utilities.f21385b.nextInt(200) + 1500;
            this.f50687f = 0.0f;
            if (this.f50683a == -1.0f) {
                a();
            }
            this.f50685c = this.f50683a;
            this.d = this.f50684b;
            a();
        }
        float f13 = (float) j10;
        float f14 = 1.0f;
        float f15 = (f13 * 0.02f * f10) + (f13 * 1.0f) + this.f50687f;
        this.f50687f = f15;
        float f16 = this.f50686e;
        if (f15 > f16) {
            this.f50687f = f16;
        }
        float interpolation = org.telegram.ui.Components.xq.f40453g.getInterpolation(this.f50687f / f16);
        float f17 = i11;
        float f18 = this.f50685c;
        float f19 = (((((this.f50683a - f18) * interpolation) + f18) * f17) + i10) - 200.0f;
        float f20 = this.d;
        float f21 = (((((this.f50684b - f20) * interpolation) + f20) * f17) + i3) - 200.0f;
        int i12 = this.f50689i;
        if (!x30.r1(i12)) {
            if (i12 == 1) {
                f11 = 4.0f;
            } else {
                f11 = 2.5f;
            }
            f14 = f11;
        }
        float L = (org.telegram.messenger.g0.L(122.0f) / 400.0f) * f14;
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f19, f21);
        matrix.postScale(L, L, f19 + 200.0f, f21 + 200.0f);
        this.f50688g.setLocalMatrix(matrix);
    }
}
