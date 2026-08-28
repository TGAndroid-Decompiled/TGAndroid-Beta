package zf;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public class z0 {
    public final b6 f50788a;
    public LinearGradient d;
    public final int f50793g;
    public final int h;
    public final int f50794i;
    public final int f50795j;
    public boolean f50798m;
    public boolean f50799n;
    public float f50789b = 0.5f;
    public float f50790c = 0.5f;
    public final Matrix f50791e = new Matrix();
    public final Paint f50792f = new Paint(1);
    public final int[] f50797l = new int[5];
    public float f50800o = 1.0f;
    public float f50801p = 1.5f;
    public float f50802q = 0.0f;
    public final int f50796k = -1;

    public z0(int i9, int i10, int i11, int i12, b6 b6Var) {
        this.f50788a = b6Var;
        this.f50793g = i9;
        this.h = i10;
        this.f50794i = i11;
        this.f50795j = i12;
    }

    public final void a() {
        int b10;
        int b11;
        int b12;
        int b13 = b(this.f50793g);
        int b14 = b(this.h);
        int i9 = this.f50794i;
        if (i9 < 0) {
            b10 = 0;
        } else {
            b10 = b(i9);
        }
        int i10 = this.f50795j;
        if (i10 < 0) {
            b11 = 0;
        } else {
            b11 = b(i10);
        }
        int i11 = this.f50796k;
        if (i11 < 0) {
            b12 = 0;
        } else {
            b12 = b(i11);
        }
        LinearGradient linearGradient = this.d;
        int[] iArr = this.f50797l;
        if (linearGradient != null && iArr[0] == b13 && iArr[1] == b14 && iArr[2] == b10 && iArr[3] == b11 && iArr[4] == b12) {
            return;
        }
        iArr[0] = b13;
        iArr[1] = b14;
        iArr[2] = b10;
        iArr[3] = b11;
        iArr[4] = b12;
        if (b10 == 0) {
            this.d = new LinearGradient(0.0f, this.f50800o * 100.0f, this.f50801p * 100.0f, this.f50802q * 100.0f, new int[]{iArr[0], iArr[1]}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b11 == 0) {
            this.d = new LinearGradient(0.0f, this.f50800o * 100.0f, this.f50801p * 100.0f, this.f50802q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2]}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b12 == 0) {
            this.d = new LinearGradient(0.0f, this.f50800o * 100.0f, this.f50801p * 100.0f, this.f50802q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3]}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.d = new LinearGradient(0.0f, this.f50800o * 100.0f, this.f50801p * 100.0f, this.f50802q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3], iArr[4]}, new float[]{0.0f, 0.425f, 0.655f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.d.setLocalMatrix(this.f50791e);
        this.f50792f.setShader(this.d);
    }

    public final int b(int i9) {
        int c10 = c(i9);
        if (this.f50799n) {
            return Color.argb(Color.alpha(c10), Color.red(c10) - 15, Color.green(c10) - 15, Color.blue(c10) - 15);
        }
        return c10;
    }

    public int c(int i9) {
        return f6.v0(i9, this.f50788a);
    }

    public final void d(int i9, float f10, int i10, int i11, float f11, int i12) {
        a();
        boolean z10 = this.f50798m;
        Matrix matrix = this.f50791e;
        if (z10) {
            matrix.reset();
            matrix.postScale((i11 - i9) / 100.0f, (i12 - i10) / 100.0f, this.f50789b * 100.0f, this.f50790c * 100.0f);
            matrix.postTranslate(f10, f11);
            this.d.setLocalMatrix(matrix);
            return;
        }
        int i13 = i12 - i10;
        int i14 = i13 + i13;
        a();
        matrix.reset();
        matrix.postScale((i11 - i9) / 100.0f, i14 / 100.0f, 75.0f, 50.0f);
        matrix.postTranslate(f10, (-i14) + f11);
        this.d.setLocalMatrix(matrix);
    }

    public final void e(RectF rectF) {
        d((int) rectF.left, 0.0f, (int) rectF.top, (int) rectF.right, 0.0f, (int) rectF.bottom);
    }
}
