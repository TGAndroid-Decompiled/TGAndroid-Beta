package sg;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public class c1 {
    public final f6 f46031a;
    public LinearGradient d;
    public final int f46036g;
    public final int h;
    public final int f46037i;
    public final int f46038j;
    public boolean f46041m;
    public boolean f46042n;
    public float f46032b = 0.5f;
    public float f46033c = 0.5f;
    public final Matrix f46034e = new Matrix();
    public final Paint f46035f = new Paint(1);
    public final int[] f46040l = new int[5];
    public float f46043o = 1.0f;
    public float f46044p = 1.5f;
    public float f46045q = 0.0f;
    public final int f46039k = -1;

    public c1(int i10, int i11, int i12, int i13, f6 f6Var) {
        this.f46031a = f6Var;
        this.f46036g = i10;
        this.h = i11;
        this.f46037i = i12;
        this.f46038j = i13;
    }

    public final void a() {
        int b10;
        int b11;
        int b12;
        int b13 = b(this.f46036g);
        int b14 = b(this.h);
        int i10 = this.f46037i;
        if (i10 < 0) {
            b10 = 0;
        } else {
            b10 = b(i10);
        }
        int i11 = this.f46038j;
        if (i11 < 0) {
            b11 = 0;
        } else {
            b11 = b(i11);
        }
        int i12 = this.f46039k;
        if (i12 < 0) {
            b12 = 0;
        } else {
            b12 = b(i12);
        }
        LinearGradient linearGradient = this.d;
        int[] iArr = this.f46040l;
        if (linearGradient != null && iArr[0] == b13 && iArr[1] == b14 && iArr[2] == b10 && iArr[3] == b11 && iArr[4] == b12) {
            return;
        }
        iArr[0] = b13;
        iArr[1] = b14;
        iArr[2] = b10;
        iArr[3] = b11;
        iArr[4] = b12;
        if (b10 == 0) {
            this.d = new LinearGradient(0.0f, this.f46043o * 100.0f, this.f46044p * 100.0f, this.f46045q * 100.0f, new int[]{iArr[0], iArr[1]}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b11 == 0) {
            this.d = new LinearGradient(0.0f, this.f46043o * 100.0f, this.f46044p * 100.0f, this.f46045q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2]}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        } else if (b12 == 0) {
            this.d = new LinearGradient(0.0f, this.f46043o * 100.0f, this.f46044p * 100.0f, this.f46045q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3]}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.d = new LinearGradient(0.0f, this.f46043o * 100.0f, this.f46044p * 100.0f, this.f46045q * 100.0f, new int[]{iArr[0], iArr[1], iArr[2], iArr[3], iArr[4]}, new float[]{0.0f, 0.425f, 0.655f, 0.78f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.d.setLocalMatrix(this.f46034e);
        this.f46035f.setShader(this.d);
    }

    public final int b(int i10) {
        int c10 = c(i10);
        if (this.f46042n) {
            return Color.argb(Color.alpha(c10), Color.red(c10) - 15, Color.green(c10) - 15, Color.blue(c10) - 15);
        }
        return c10;
    }

    public int c(int i10) {
        return j6.v0(i10, this.f46031a);
    }

    public final void d(int i10, float f7, int i11, int i12, float f10, int i13) {
        a();
        boolean z10 = this.f46041m;
        Matrix matrix = this.f46034e;
        if (z10) {
            matrix.reset();
            matrix.postScale((i12 - i10) / 100.0f, (i13 - i11) / 100.0f, this.f46032b * 100.0f, this.f46033c * 100.0f);
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
