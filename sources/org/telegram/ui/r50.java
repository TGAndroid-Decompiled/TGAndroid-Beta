package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class r50 {

    public float f41811c;
    public float d;

    public float f41812e;

    public float f41813f;

    public Shader f41814g;

    public final int f41815i;

    public float f41809a = -1.0f;

    public float f41810b = -1.0f;
    public final Matrix h = new Matrix();

    public r50(int i10) {
        this.f41815i = i10;
    }

    public final void a() {
        int i10 = this.f41815i;
        if (s50.p1(i10)) {
            this.f41809a = a9.p.d(Utilities.random.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.f41810b = 1.0f;
        } else if (i10 == 1) {
            this.f41809a = a9.p.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.f41810b = a9.p.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            this.f41809a = s3.c.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.f41810b = Utilities.random.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i10, int i11, int i12, long j10, float f10) {
        if (this.f41814g == null) {
            return;
        }
        float f11 = this.f41812e;
        if (f11 == 0.0f || this.f41813f >= f11) {
            this.f41812e = Utilities.random.nextInt(200) + 1500;
            this.f41813f = 0.0f;
            if (this.f41809a == -1.0f) {
                a();
            }
            this.f41811c = this.f41809a;
            this.d = this.f41810b;
            a();
        }
        float f12 = j10;
        float f13 = 1.0f;
        float f14 = (f12 * 0.02f * f10) + (f12 * 1.0f) + this.f41813f;
        this.f41813f = f14;
        float f15 = this.f41812e;
        if (f14 > f15) {
            this.f41813f = f15;
        }
        float interpolation = org.telegram.ui.Components.er.f28123g.getInterpolation(this.f41813f / f15);
        float f16 = i12;
        float f17 = this.f41811c;
        float f18 = (((((this.f41809a - f17) * interpolation) + f17) * f16) + i11) - 200.0f;
        float f19 = this.d;
        float f20 = (((((this.f41810b - f19) * interpolation) + f19) * f16) + i10) - 200.0f;
        int i13 = this.f41815i;
        if (!s50.p1(i13)) {
            f13 = i13 == 1 ? 4.0f : 2.5f;
        }
        float fDp = (AndroidUtilities.dp(122.0f) / 400.0f) * f13;
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f18, f20);
        matrix.postScale(fDp, fDp, f18 + 200.0f, f20 + 200.0f);
        this.f41814g.setLocalMatrix(matrix);
    }
}
