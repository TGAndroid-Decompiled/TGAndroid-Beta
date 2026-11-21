package ug;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public class a1 {
    public final h6 f58639a;
    public LinearGradient d;
    public final int f58644g;
    public final int h;
    public final int f58645i;
    public final int f58646j;
    public boolean f58649m;
    public boolean f58650n;
    public float f58640b = 0.5f;
    public float f58641c = 0.5f;
    public final Matrix f58642e = new Matrix();
    public final Paint f58643f = new Paint(1);
    public final int[] f58648l = new int[5];
    public float f58651o = 1.0f;
    public float f58652p = 1.5f;
    public float f58653q = 0.0f;
    public final int f58647k = -1;

    public a1(int i7, int i10, int i11, int i12, h6 h6Var) {
        this.f58639a = h6Var;
        this.f58644g = i7;
        this.h = i10;
        this.f58645i = i11;
        this.f58646j = i12;
    }

    public final void a() {
        int b10;
        int b11;
        int b12;
        int b13 = b(this.f58644g);
        int b14 = b(this.h);
        int i7 = this.f58645i;
        if (i7 < 0) {
            b10 = 0;
        } else {
            b10 = b(i7);
        }
        int i10 = this.f58646j;
        if (i10 < 0) {
            b11 = 0;
        } else {
            b11 = b(i10);
        }
        int i11 = this.f58647k;
        if (i11 < 0) {
            b12 = 0;
        } else {
            b12 = b(i11);
        }
        LinearGradient linearGradient = this.d;
        int[] iArr = this.f58648l;
        if (linearGradient != null && iArr[0] == b13 && iArr[1] == b14 && iArr[2] == b10 && iArr[3] == b11 && iArr[4] == b12) {
            return;
        }
        iArr[0] = b13;
        iArr[1] = b14;
        iArr[2] = b10;
        iArr[3] = b11;
        iArr[4] = b12;
        if (b10 == 0) {
            this.d = new LinearGradient(0.0f, this.f58651o * 100.0f, this.f58652p * 100.0f, this.f58653q * 100.0f, new int[]{iArr[0], iArr[1]}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b11 == 0) {
            this.d = new LinearGradient(0.0f, this.f58651o * 100.0f, this.f58652p * 100.0f, this.f58653q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2]}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b12 == 0) {
            this.d = new LinearGradient(0.0f, this.f58651o * 100.0f, this.f58652p * 100.0f, this.f58653q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3]}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.d = new LinearGradient(0.0f, this.f58651o * 100.0f, this.f58652p * 100.0f, this.f58653q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3], iArr[4]}, new float[]{0.0f, 0.425f, 0.655f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.d.setLocalMatrix(this.f58642e);
        this.f58643f.setShader(this.d);
    }

    public final int b(int i7) {
        int c10 = c(i7);
        if (this.f58650n) {
            return Color.argb(Color.alpha(c10), Color.red(c10) - 15, Color.green(c10) - 15, Color.blue(c10) - 15);
        }
        return c10;
    }

    public int c(int i7) {
        return m6.w0(i7, this.f58639a);
    }

    public final void d(int i7, float f10, int i10, int i11, float f11, int i12) {
        a();
        boolean z10 = this.f58649m;
        Matrix matrix = this.f58642e;
        if (z10) {
            matrix.reset();
            matrix.postScale((i11 - i7) / 100.0f, (i12 - i10) / 100.0f, this.f58640b * 100.0f, this.f58641c * 100.0f);
            matrix.postTranslate(f10, f11);
            this.d.setLocalMatrix(matrix);
            return;
        }
        int i13 = i12 - i10;
        int i14 = i13 + i13;
        a();
        matrix.reset();
        matrix.postScale((i11 - i7) / 100.0f, i14 / 100.0f, 75.0f, 50.0f);
        matrix.postTranslate(f10, (-i14) + f11);
        this.d.setLocalMatrix(matrix);
    }

    public final void e(RectF rectF) {
        d((int) rectF.left, 0.0f, (int) rectF.top, (int) rectF.right, 0.0f, (int) rectF.bottom);
    }
}
