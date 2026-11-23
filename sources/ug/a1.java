package ug;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public class a1 {
    public final i6 f58723a;
    public LinearGradient d;
    public final int f58728g;
    public final int h;
    public final int f58729i;
    public final int f58730j;
    public boolean f58733m;
    public boolean f58734n;
    public float f58724b = 0.5f;
    public float f58725c = 0.5f;
    public final Matrix f58726e = new Matrix();
    public final Paint f58727f = new Paint(1);
    public final int[] f58732l = new int[5];
    public float f58735o = 1.0f;
    public float f58736p = 1.5f;
    public float f58737q = 0.0f;
    public final int f58731k = -1;

    public a1(int i7, int i10, int i11, int i12, i6 i6Var) {
        this.f58723a = i6Var;
        this.f58728g = i7;
        this.h = i10;
        this.f58729i = i11;
        this.f58730j = i12;
    }

    public final void a() {
        int b10;
        int b11;
        int b12;
        int b13 = b(this.f58728g);
        int b14 = b(this.h);
        int i7 = this.f58729i;
        if (i7 < 0) {
            b10 = 0;
        } else {
            b10 = b(i7);
        }
        int i10 = this.f58730j;
        if (i10 < 0) {
            b11 = 0;
        } else {
            b11 = b(i10);
        }
        int i11 = this.f58731k;
        if (i11 < 0) {
            b12 = 0;
        } else {
            b12 = b(i11);
        }
        LinearGradient linearGradient = this.d;
        int[] iArr = this.f58732l;
        if (linearGradient != null && iArr[0] == b13 && iArr[1] == b14 && iArr[2] == b10 && iArr[3] == b11 && iArr[4] == b12) {
            return;
        }
        iArr[0] = b13;
        iArr[1] = b14;
        iArr[2] = b10;
        iArr[3] = b11;
        iArr[4] = b12;
        if (b10 == 0) {
            this.d = new LinearGradient(0.0f, this.f58735o * 100.0f, this.f58736p * 100.0f, this.f58737q * 100.0f, new int[]{iArr[0], iArr[1]}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b11 == 0) {
            this.d = new LinearGradient(0.0f, this.f58735o * 100.0f, this.f58736p * 100.0f, this.f58737q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2]}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b12 == 0) {
            this.d = new LinearGradient(0.0f, this.f58735o * 100.0f, this.f58736p * 100.0f, this.f58737q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3]}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.d = new LinearGradient(0.0f, this.f58735o * 100.0f, this.f58736p * 100.0f, this.f58737q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3], iArr[4]}, new float[]{0.0f, 0.425f, 0.655f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.d.setLocalMatrix(this.f58726e);
        this.f58727f.setShader(this.d);
    }

    public final int b(int i7) {
        int c10 = c(i7);
        if (this.f58734n) {
            return Color.argb(Color.alpha(c10), Color.red(c10) - 15, Color.green(c10) - 15, Color.blue(c10) - 15);
        }
        return c10;
    }

    public int c(int i7) {
        return n6.w0(i7, this.f58723a);
    }

    public final void d(int i7, float f10, int i10, int i11, float f11, int i12) {
        a();
        boolean z10 = this.f58733m;
        Matrix matrix = this.f58726e;
        if (z10) {
            matrix.reset();
            matrix.postScale((i11 - i7) / 100.0f, (i12 - i10) / 100.0f, this.f58724b * 100.0f, this.f58725c * 100.0f);
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
