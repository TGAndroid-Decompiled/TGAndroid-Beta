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
    public final h6 f58608a;
    public LinearGradient d;
    public final int f58613g;
    public final int h;
    public final int f58614i;
    public final int f58615j;
    public boolean f58618m;
    public boolean f58619n;
    public float f58609b = 0.5f;
    public float f58610c = 0.5f;
    public final Matrix f58611e = new Matrix();
    public final Paint f58612f = new Paint(1);
    public final int[] f58617l = new int[5];
    public float f58620o = 1.0f;
    public float f58621p = 1.5f;
    public float f58622q = 0.0f;
    public final int f58616k = -1;

    public a1(int i7, int i10, int i11, int i12, h6 h6Var) {
        this.f58608a = h6Var;
        this.f58613g = i7;
        this.h = i10;
        this.f58614i = i11;
        this.f58615j = i12;
    }

    public final void a() {
        int b10;
        int b11;
        int b12;
        int b13 = b(this.f58613g);
        int b14 = b(this.h);
        int i7 = this.f58614i;
        if (i7 < 0) {
            b10 = 0;
        } else {
            b10 = b(i7);
        }
        int i10 = this.f58615j;
        if (i10 < 0) {
            b11 = 0;
        } else {
            b11 = b(i10);
        }
        int i11 = this.f58616k;
        if (i11 < 0) {
            b12 = 0;
        } else {
            b12 = b(i11);
        }
        LinearGradient linearGradient = this.d;
        int[] iArr = this.f58617l;
        if (linearGradient != null && iArr[0] == b13 && iArr[1] == b14 && iArr[2] == b10 && iArr[3] == b11 && iArr[4] == b12) {
            return;
        }
        iArr[0] = b13;
        iArr[1] = b14;
        iArr[2] = b10;
        iArr[3] = b11;
        iArr[4] = b12;
        if (b10 == 0) {
            this.d = new LinearGradient(0.0f, this.f58620o * 100.0f, this.f58621p * 100.0f, this.f58622q * 100.0f, new int[]{iArr[0], iArr[1]}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b11 == 0) {
            this.d = new LinearGradient(0.0f, this.f58620o * 100.0f, this.f58621p * 100.0f, this.f58622q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2]}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b12 == 0) {
            this.d = new LinearGradient(0.0f, this.f58620o * 100.0f, this.f58621p * 100.0f, this.f58622q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3]}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.d = new LinearGradient(0.0f, this.f58620o * 100.0f, this.f58621p * 100.0f, this.f58622q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3], iArr[4]}, new float[]{0.0f, 0.425f, 0.655f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.d.setLocalMatrix(this.f58611e);
        this.f58612f.setShader(this.d);
    }

    public final int b(int i7) {
        int c10 = c(i7);
        if (this.f58619n) {
            return Color.argb(Color.alpha(c10), Color.red(c10) - 15, Color.green(c10) - 15, Color.blue(c10) - 15);
        }
        return c10;
    }

    public int c(int i7) {
        return m6.w0(i7, this.f58608a);
    }

    public final void d(int i7, float f10, int i10, int i11, float f11, int i12) {
        a();
        boolean z10 = this.f58618m;
        Matrix matrix = this.f58611e;
        if (z10) {
            matrix.reset();
            matrix.postScale((i11 - i7) / 100.0f, (i12 - i10) / 100.0f, this.f58609b * 100.0f, this.f58610c * 100.0f);
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
