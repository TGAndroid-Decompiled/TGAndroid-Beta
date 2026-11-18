package ug;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public class b1 {
    public final i6 f58602a;
    public LinearGradient d;
    public final int f58607g;
    public final int h;
    public final int f58608i;
    public final int f58609j;
    public boolean f58612m;
    public boolean f58613n;
    public float f58603b = 0.5f;
    public float f58604c = 0.5f;
    public final Matrix f58605e = new Matrix();
    public final Paint f58606f = new Paint(1);
    public final int[] f58611l = new int[5];
    public float f58614o = 1.0f;
    public float f58615p = 1.5f;
    public float f58616q = 0.0f;
    public final int f58610k = -1;

    public b1(int i7, int i10, int i11, int i12, i6 i6Var) {
        this.f58602a = i6Var;
        this.f58607g = i7;
        this.h = i10;
        this.f58608i = i11;
        this.f58609j = i12;
    }

    public final void a() {
        int b10;
        int b11;
        int b12;
        int b13 = b(this.f58607g);
        int b14 = b(this.h);
        int i7 = this.f58608i;
        if (i7 < 0) {
            b10 = 0;
        } else {
            b10 = b(i7);
        }
        int i10 = this.f58609j;
        if (i10 < 0) {
            b11 = 0;
        } else {
            b11 = b(i10);
        }
        int i11 = this.f58610k;
        if (i11 < 0) {
            b12 = 0;
        } else {
            b12 = b(i11);
        }
        LinearGradient linearGradient = this.d;
        int[] iArr = this.f58611l;
        if (linearGradient != null && iArr[0] == b13 && iArr[1] == b14 && iArr[2] == b10 && iArr[3] == b11 && iArr[4] == b12) {
            return;
        }
        iArr[0] = b13;
        iArr[1] = b14;
        iArr[2] = b10;
        iArr[3] = b11;
        iArr[4] = b12;
        if (b10 == 0) {
            this.d = new LinearGradient(0.0f, this.f58614o * 100.0f, this.f58615p * 100.0f, this.f58616q * 100.0f, new int[]{iArr[0], iArr[1]}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b11 == 0) {
            this.d = new LinearGradient(0.0f, this.f58614o * 100.0f, this.f58615p * 100.0f, this.f58616q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2]}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b12 == 0) {
            this.d = new LinearGradient(0.0f, this.f58614o * 100.0f, this.f58615p * 100.0f, this.f58616q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3]}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.d = new LinearGradient(0.0f, this.f58614o * 100.0f, this.f58615p * 100.0f, this.f58616q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3], iArr[4]}, new float[]{0.0f, 0.425f, 0.655f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.d.setLocalMatrix(this.f58605e);
        this.f58606f.setShader(this.d);
    }

    public final int b(int i7) {
        int c10 = c(i7);
        if (this.f58613n) {
            return Color.argb(Color.alpha(c10), Color.red(c10) - 15, Color.green(c10) - 15, Color.blue(c10) - 15);
        }
        return c10;
    }

    public int c(int i7) {
        return n6.w0(i7, this.f58602a);
    }

    public final void d(int i7, float f10, int i10, int i11, float f11, int i12) {
        a();
        boolean z10 = this.f58612m;
        Matrix matrix = this.f58605e;
        if (z10) {
            matrix.reset();
            matrix.postScale((i11 - i7) / 100.0f, (i12 - i10) / 100.0f, this.f58603b * 100.0f, this.f58604c * 100.0f);
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
