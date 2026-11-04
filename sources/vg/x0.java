package vg;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
public class x0 {
    public final e6 f56907a;
    public LinearGradient d;
    public final int f56912g;
    public final int h;
    public final int f56913i;
    public final int f56914j;
    public boolean f56917m;
    public boolean f56918n;
    public float f56908b = 0.5f;
    public float f56909c = 0.5f;
    public final Matrix f56910e = new Matrix();
    public final Paint f56911f = new Paint(1);
    public final int[] f56916l = new int[5];
    public float f56919o = 1.0f;
    public float f56920p = 1.5f;
    public float f56921q = 0.0f;
    public final int f56915k = -1;

    public x0(int i3, int i10, int i11, int i12, e6 e6Var) {
        this.f56907a = e6Var;
        this.f56912g = i3;
        this.h = i10;
        this.f56913i = i11;
        this.f56914j = i12;
    }

    public final void a() {
        int b10;
        int b11;
        int b12;
        int b13 = b(this.f56912g);
        int b14 = b(this.h);
        int i3 = this.f56913i;
        if (i3 < 0) {
            b10 = 0;
        } else {
            b10 = b(i3);
        }
        int i10 = this.f56914j;
        if (i10 < 0) {
            b11 = 0;
        } else {
            b11 = b(i10);
        }
        int i11 = this.f56915k;
        if (i11 < 0) {
            b12 = 0;
        } else {
            b12 = b(i11);
        }
        LinearGradient linearGradient = this.d;
        int[] iArr = this.f56916l;
        if (linearGradient != null && iArr[0] == b13 && iArr[1] == b14 && iArr[2] == b10 && iArr[3] == b11 && iArr[4] == b12) {
            return;
        }
        iArr[0] = b13;
        iArr[1] = b14;
        iArr[2] = b10;
        iArr[3] = b11;
        iArr[4] = b12;
        if (b10 == 0) {
            this.d = new LinearGradient(0.0f, this.f56919o * 100.0f, this.f56920p * 100.0f, this.f56921q * 100.0f, new int[]{iArr[0], iArr[1]}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b11 == 0) {
            this.d = new LinearGradient(0.0f, this.f56919o * 100.0f, this.f56920p * 100.0f, this.f56921q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2]}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b12 == 0) {
            this.d = new LinearGradient(0.0f, this.f56919o * 100.0f, this.f56920p * 100.0f, this.f56921q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3]}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.d = new LinearGradient(0.0f, this.f56919o * 100.0f, this.f56920p * 100.0f, this.f56921q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3], iArr[4]}, new float[]{0.0f, 0.425f, 0.655f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.d.setLocalMatrix(this.f56910e);
        this.f56911f.setShader(this.d);
    }

    public final int b(int i3) {
        int c2 = c(i3);
        if (this.f56918n) {
            return Color.argb(Color.alpha(c2), Color.red(c2) - 15, Color.green(c2) - 15, Color.blue(c2) - 15);
        }
        return c2;
    }

    public int c(int i3) {
        return k6.w0(i3, this.f56907a);
    }

    public final void d(int i3, float f10, int i10, int i11, float f11, int i12) {
        a();
        boolean z10 = this.f56917m;
        Matrix matrix = this.f56910e;
        if (z10) {
            matrix.reset();
            matrix.postScale((i11 - i3) / 100.0f, (i12 - i10) / 100.0f, this.f56908b * 100.0f, this.f56909c * 100.0f);
            matrix.postTranslate(f10, f11);
            this.d.setLocalMatrix(matrix);
            return;
        }
        int i13 = i12 - i10;
        int i14 = i13 + i13;
        a();
        matrix.reset();
        matrix.postScale((i11 - i3) / 100.0f, i14 / 100.0f, 75.0f, 50.0f);
        matrix.postTranslate(f10, (-i14) + f11);
        this.d.setLocalMatrix(matrix);
    }

    public final void e(RectF rectF) {
        d((int) rectF.left, 0.0f, (int) rectF.top, (int) rectF.right, 0.0f, (int) rectF.bottom);
    }
}
