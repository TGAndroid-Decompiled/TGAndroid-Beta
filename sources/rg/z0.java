package rg;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public class z0 {
    public final d6 f42837a;
    public LinearGradient d;
    public final int f42841g;
    public final int h;
    public final int f42842i;
    public final int f42843j;
    public boolean f42846m;
    public boolean f42847n;
    public float f42838b = 0.5f;
    public float f42839c = 0.5f;
    public final Matrix e = new Matrix();
    public final Paint f42840f = new Paint(1);
    public final int[] f42845l = new int[5];
    public float f42848o = 1.0f;
    public float f42849p = 1.5f;
    public float f42850q = 0.0f;
    public final int f42844k = -1;

    public z0(int i10, int i11, int i12, int i13, d6 d6Var) {
        this.f42837a = d6Var;
        this.f42841g = i10;
        this.h = i11;
        this.f42842i = i12;
        this.f42843j = i13;
    }

    public final void a() {
        int b10;
        int b11;
        int b12;
        int b13 = b(this.f42841g);
        int b14 = b(this.h);
        int i10 = this.f42842i;
        if (i10 < 0) {
            b10 = 0;
        } else {
            b10 = b(i10);
        }
        int i11 = this.f42843j;
        if (i11 < 0) {
            b11 = 0;
        } else {
            b11 = b(i11);
        }
        int i12 = this.f42844k;
        if (i12 < 0) {
            b12 = 0;
        } else {
            b12 = b(i12);
        }
        LinearGradient linearGradient = this.d;
        int[] iArr = this.f42845l;
        if (linearGradient != null && iArr[0] == b13 && iArr[1] == b14 && iArr[2] == b10 && iArr[3] == b11 && iArr[4] == b12) {
            return;
        }
        iArr[0] = b13;
        iArr[1] = b14;
        iArr[2] = b10;
        iArr[3] = b11;
        iArr[4] = b12;
        if (b10 == 0) {
            this.d = new LinearGradient(0.0f, this.f42848o * 100.0f, this.f42849p * 100.0f, this.f42850q * 100.0f, new int[]{iArr[0], iArr[1]}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b11 == 0) {
            this.d = new LinearGradient(0.0f, this.f42848o * 100.0f, this.f42849p * 100.0f, this.f42850q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2]}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b12 == 0) {
            this.d = new LinearGradient(0.0f, this.f42848o * 100.0f, this.f42849p * 100.0f, this.f42850q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3]}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.d = new LinearGradient(0.0f, this.f42848o * 100.0f, this.f42849p * 100.0f, this.f42850q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3], iArr[4]}, new float[]{0.0f, 0.425f, 0.655f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.d.setLocalMatrix(this.e);
        this.f42840f.setShader(this.d);
    }

    public final int b(int i10) {
        int c10 = c(i10);
        if (this.f42847n) {
            return Color.argb(Color.alpha(c10), Color.red(c10) - 15, Color.green(c10) - 15, Color.blue(c10) - 15);
        }
        return c10;
    }

    public int c(int i10) {
        return h6.v0(i10, this.f42837a);
    }

    public final void d(int i10, float f7, int i11, int i12, float f10, int i13) {
        a();
        boolean z10 = this.f42846m;
        Matrix matrix = this.e;
        if (z10) {
            matrix.reset();
            matrix.postScale((i12 - i10) / 100.0f, (i13 - i11) / 100.0f, this.f42838b * 100.0f, this.f42839c * 100.0f);
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
