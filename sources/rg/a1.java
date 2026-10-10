package rg;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
public class a1 {
    public final e6 f47219a;
    public LinearGradient d;
    public final int f47224g;
    public final int h;
    public final int f47225i;
    public final int f47226j;
    public boolean f47229m;
    public boolean f47230n;
    public float f47220b = 0.5f;
    public float f47221c = 0.5f;
    public final Matrix f47222e = new Matrix();
    public final Paint f47223f = new Paint(1);
    public final int[] f47228l = new int[5];
    public float f47231o = 1.0f;
    public float f47232p = 1.5f;
    public float f47233q = 0.0f;
    public final int f47227k = -1;

    public a1(int i10, int i11, int i12, int i13, e6 e6Var) {
        this.f47219a = e6Var;
        this.f47224g = i10;
        this.h = i11;
        this.f47225i = i12;
        this.f47226j = i13;
    }

    public final void a() {
        int b10;
        int b11;
        int b12;
        int b13 = b(this.f47224g);
        int b14 = b(this.h);
        int i10 = this.f47225i;
        if (i10 < 0) {
            b10 = 0;
        } else {
            b10 = b(i10);
        }
        int i11 = this.f47226j;
        if (i11 < 0) {
            b11 = 0;
        } else {
            b11 = b(i11);
        }
        int i12 = this.f47227k;
        if (i12 < 0) {
            b12 = 0;
        } else {
            b12 = b(i12);
        }
        LinearGradient linearGradient = this.d;
        int[] iArr = this.f47228l;
        if (linearGradient != null && iArr[0] == b13 && iArr[1] == b14 && iArr[2] == b10 && iArr[3] == b11 && iArr[4] == b12) {
            return;
        }
        iArr[0] = b13;
        iArr[1] = b14;
        iArr[2] = b10;
        iArr[3] = b11;
        iArr[4] = b12;
        if (b10 == 0) {
            this.d = new LinearGradient(0.0f, this.f47231o * 100.0f, this.f47232p * 100.0f, this.f47233q * 100.0f, new int[]{iArr[0], iArr[1]}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b11 == 0) {
            this.d = new LinearGradient(0.0f, this.f47231o * 100.0f, this.f47232p * 100.0f, this.f47233q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2]}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b12 == 0) {
            this.d = new LinearGradient(0.0f, this.f47231o * 100.0f, this.f47232p * 100.0f, this.f47233q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3]}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.d = new LinearGradient(0.0f, this.f47231o * 100.0f, this.f47232p * 100.0f, this.f47233q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3], iArr[4]}, new float[]{0.0f, 0.425f, 0.655f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.d.setLocalMatrix(this.f47222e);
        this.f47223f.setShader(this.d);
    }

    public final int b(int i10) {
        int c10 = c(i10);
        if (this.f47230n) {
            return Color.argb(Color.alpha(c10), Color.red(c10) - 15, Color.green(c10) - 15, Color.blue(c10) - 15);
        }
        return c10;
    }

    public int c(int i10) {
        return i6.w0(i10, this.f47219a);
    }

    public final void d(int i10, float f7, int i11, int i12, float f10, int i13) {
        a();
        boolean z10 = this.f47229m;
        Matrix matrix = this.f47222e;
        if (z10) {
            matrix.reset();
            matrix.postScale((i12 - i10) / 100.0f, (i13 - i11) / 100.0f, this.f47220b * 100.0f, this.f47221c * 100.0f);
            matrix.postTranslate(f7, f10);
            this.d.setLocalMatrix(matrix);
            return;
        }
        int i14 = i13 - i11;
        int i15 = i14 + i14;
        a();
        matrix.reset();
        matrix.postScale((i12 - i10) / 100.0f, i15 / 100.0f, 75.0f, 50.0f);
        matrix.postTranslate(f7, (-i15) + f10);
        this.d.setLocalMatrix(matrix);
    }

    public final void e(RectF rectF) {
        d((int) rectF.left, 0.0f, (int) rectF.top, (int) rectF.right, 0.0f, (int) rectF.bottom);
    }
}
