package sg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.xt0;
public final class f1 {
    public t0 f57317a;
    public n0 f57318b;
    public Paint f57319c;
    public Paint d;
    public Paint f57320e;
    public Paint f57321f;
    public Paint f57322g;
    public w0 h;
    public float f57323i;
    public float f57324j;
    public e1 f57325k;
    public b1 f57326l;
    public ArrayList f57327m;
    public ArrayList f57328n;
    public Matrix f57329o;
    public float[] f57330p;

    public static float a(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f14 - f12;
        float f17 = f15 - f13;
        float max = Math.max(Math.min((((f11 - f13) * f17) + ((f10 - f12) * f16)) / ((f17 * f17) + (f16 * f16)), 1.0f), 0.0f);
        float f18 = ((f16 * max) + f12) - f10;
        float f19 = ((max * f17) + f13) - f11;
        return (float) Math.sqrt((f19 * f19) + (f18 * f18));
    }

    public final void b(Canvas canvas, xt0 xt0Var, e1 e1Var) {
        Paint paint;
        Paint paint2;
        float width = (e1Var.d / xt0Var.f42189a) * canvas.getWidth();
        float height = (e1Var.f57313e / xt0Var.f42190b) * canvas.getHeight();
        float L = org.telegram.messenger.g0.L(5.0f);
        boolean z10 = e1Var.f57310a;
        if (z10) {
            paint = this.d;
        } else {
            paint = this.f57321f;
        }
        canvas.drawCircle(width, height, L, paint);
        float width2 = (e1Var.d / xt0Var.f42189a) * canvas.getWidth();
        float height2 = (e1Var.f57313e / xt0Var.f42190b) * canvas.getHeight();
        float L2 = org.telegram.messenger.g0.L(5.0f);
        if (z10) {
            paint2 = this.f57320e;
        } else {
            paint2 = this.f57322g;
        }
        canvas.drawCircle(width2, height2, L2, paint2);
    }

    public final void c(float f10, float f11, boolean z10) {
        float[] fArr = this.f57330p;
        fArr[0] = f10;
        fArr[1] = f11;
        d(z10);
    }

    public final void d(boolean z10) {
        int i7;
        float[] fArr = this.f57330p;
        w0 w0Var = this.h;
        if (w0Var != null) {
            float f10 = w0Var.h;
            if (f10 != 0.0f) {
                float f11 = fArr[0] - w0Var.f57513b;
                fArr[0] = f11;
                fArr[1] = fArr[1] - w0Var.f57514c;
                if (z10) {
                    i7 = -1;
                } else {
                    i7 = 1;
                }
                double d = f10 * i7;
                float cos = (float) ((Math.cos(d) * f11) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                w0 w0Var2 = this.h;
                fArr[0] = cos + w0Var2.f57513b;
                fArr[1] = ((float) i5.c.c(d, fArr[1], sin)) + w0Var2.f57514c;
            }
        }
    }

    public final void e() {
        w0 w0Var;
        t0 t0Var = this.f57317a;
        if (t0Var != null && t0Var.getPainting() != null && (w0Var = this.h) != null) {
            w0Var.f57516f = t0Var.getCurrentWeight();
            h0 painting = t0Var.getPainting();
            w0 w0Var2 = this.h;
            int currentColor = t0Var.getCurrentColor();
            if (w0Var2 != null) {
                if (painting.f57354r != null) {
                    painting.f57343f.f(new e21(painting, w0Var2, currentColor, 25));
                }
            } else {
                painting.getClass();
            }
            this.f57327m.clear();
            this.f57328n.clear();
            this.h = null;
            s0 s0Var = t0Var.f57469a;
            if (s0Var != null) {
                s0Var.q();
            }
            t0Var.f57472e.f57509z = true;
        }
    }
}
