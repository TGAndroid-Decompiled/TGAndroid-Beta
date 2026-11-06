package ug;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
public class y0 {
    public final f6 f56772a;
    public LinearGradient d;
    public final int f56777g;
    public final int h;
    public final int f56778i;
    public final int f56779j;
    public boolean f56782m;
    public boolean f56783n;
    public float f56773b = 0.5f;
    public float f56774c = 0.5f;
    public final Matrix f56775e = new Matrix();
    public final Paint f56776f = new Paint(1);
    public final int[] f56781l = new int[5];
    public float f56784o = 1.0f;
    public float f56785p = 1.5f;
    public float f56786q = 0.0f;
    public final int f56780k = -1;

    public y0(int i7, int i10, int i11, int i12, f6 f6Var) {
        this.f56772a = f6Var;
        this.f56777g = i7;
        this.h = i10;
        this.f56778i = i11;
        this.f56779j = i12;
    }

    public final void a() {
        int b10;
        int b11;
        int b12;
        int b13 = b(this.f56777g);
        int b14 = b(this.h);
        int i7 = this.f56778i;
        if (i7 < 0) {
            b10 = 0;
        } else {
            b10 = b(i7);
        }
        int i10 = this.f56779j;
        if (i10 < 0) {
            b11 = 0;
        } else {
            b11 = b(i10);
        }
        int i11 = this.f56780k;
        if (i11 < 0) {
            b12 = 0;
        } else {
            b12 = b(i11);
        }
        LinearGradient linearGradient = this.d;
        int[] iArr = this.f56781l;
        if (linearGradient != null && iArr[0] == b13 && iArr[1] == b14 && iArr[2] == b10 && iArr[3] == b11 && iArr[4] == b12) {
            return;
        }
        iArr[0] = b13;
        iArr[1] = b14;
        iArr[2] = b10;
        iArr[3] = b11;
        iArr[4] = b12;
        if (b10 == 0) {
            this.d = new LinearGradient(0.0f, this.f56784o * 100.0f, this.f56785p * 100.0f, this.f56786q * 100.0f, new int[]{iArr[0], iArr[1]}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b11 == 0) {
            this.d = new LinearGradient(0.0f, this.f56784o * 100.0f, this.f56785p * 100.0f, this.f56786q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2]}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b12 == 0) {
            this.d = new LinearGradient(0.0f, this.f56784o * 100.0f, this.f56785p * 100.0f, this.f56786q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3]}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.d = new LinearGradient(0.0f, this.f56784o * 100.0f, this.f56785p * 100.0f, this.f56786q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3], iArr[4]}, new float[]{0.0f, 0.425f, 0.655f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.d.setLocalMatrix(this.f56775e);
        this.f56776f.setShader(this.d);
    }

    public final int b(int i7) {
        int c10 = c(i7);
        if (this.f56783n) {
            return Color.argb(Color.alpha(c10), Color.red(c10) - 15, Color.green(c10) - 15, Color.blue(c10) - 15);
        }
        return c10;
    }

    public int c(int i7) {
        return k6.w0(i7, this.f56772a);
    }

    public final void d(int i7, float f10, int i10, int i11, float f11, int i12) {
        a();
        boolean z9 = this.f56782m;
        Matrix matrix = this.f56775e;
        if (z9) {
            matrix.reset();
            matrix.postScale((i11 - i7) / 100.0f, (i12 - i10) / 100.0f, this.f56773b * 100.0f, this.f56774c * 100.0f);
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
