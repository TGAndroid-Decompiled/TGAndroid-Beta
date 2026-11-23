package sg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.yt0;
public final class g1 {
    public u0 f57210a;
    public o0 f57211b;
    public Paint f57212c;
    public Paint d;
    public Paint f57213e;
    public Paint f57214f;
    public Paint f57215g;
    public x0 h;
    public float f57216i;
    public float f57217j;
    public f1 f57218k;
    public c1 f57219l;
    public ArrayList f57220m;
    public ArrayList f57221n;
    public Matrix f57222o;
    public float[] f57223p;

    public static float a(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f14 - f12;
        float f17 = f15 - f13;
        float max = Math.max(Math.min((((f11 - f13) * f17) + ((f10 - f12) * f16)) / ((f17 * f17) + (f16 * f16)), 1.0f), 0.0f);
        float f18 = ((f16 * max) + f12) - f10;
        float f19 = ((max * f17) + f13) - f11;
        return (float) Math.sqrt((f19 * f19) + (f18 * f18));
    }

    public final void b(Canvas canvas, yt0 yt0Var, f1 f1Var) {
        Paint paint;
        Paint paint2;
        float width = (f1Var.d / yt0Var.f42506a) * canvas.getWidth();
        float height = (f1Var.f57205e / yt0Var.f42507b) * canvas.getHeight();
        float L = org.telegram.messenger.g0.L(5.0f);
        boolean z10 = f1Var.f57202a;
        if (z10) {
            paint = this.d;
        } else {
            paint = this.f57214f;
        }
        canvas.drawCircle(width, height, L, paint);
        float width2 = (f1Var.d / yt0Var.f42506a) * canvas.getWidth();
        float height2 = (f1Var.f57205e / yt0Var.f42507b) * canvas.getHeight();
        float L2 = org.telegram.messenger.g0.L(5.0f);
        if (z10) {
            paint2 = this.f57213e;
        } else {
            paint2 = this.f57215g;
        }
        canvas.drawCircle(width2, height2, L2, paint2);
    }

    public final void c(float f10, float f11, boolean z10) {
        float[] fArr = this.f57223p;
        fArr[0] = f10;
        fArr[1] = f11;
        d(z10);
    }

    public final void d(boolean z10) {
        int i7;
        float[] fArr = this.f57223p;
        x0 x0Var = this.h;
        if (x0Var != null) {
            float f10 = x0Var.h;
            if (f10 != 0.0f) {
                float f11 = fArr[0] - x0Var.f57408b;
                fArr[0] = f11;
                fArr[1] = fArr[1] - x0Var.f57409c;
                if (z10) {
                    i7 = -1;
                } else {
                    i7 = 1;
                }
                double d = f10 * i7;
                float cos = (float) ((Math.cos(d) * f11) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                x0 x0Var2 = this.h;
                fArr[0] = cos + x0Var2.f57408b;
                fArr[1] = ((float) i5.c.c(d, fArr[1], sin)) + x0Var2.f57409c;
            }
        }
    }

    public final void e() {
        x0 x0Var;
        u0 u0Var = this.f57210a;
        if (u0Var != null && u0Var.getPainting() != null && (x0Var = this.h) != null) {
            x0Var.f57411f = u0Var.getCurrentWeight();
            i0 painting = u0Var.getPainting();
            x0 x0Var2 = this.h;
            int currentColor = u0Var.getCurrentColor();
            if (x0Var2 != null) {
                if (painting.f57246r != null) {
                    painting.f57235f.f(new f21(painting, x0Var2, currentColor, 25));
                }
            } else {
                painting.getClass();
            }
            this.f57220m.clear();
            this.f57221n.clear();
            this.h = null;
            t0 t0Var = u0Var.f57366a;
            if (t0Var != null) {
                t0Var.n();
            }
            u0Var.f57369e.f57399z = true;
        }
    }
}
