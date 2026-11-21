package sg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.yt0;
public final class g1 {
    public u0 f57241a;
    public o0 f57242b;
    public Paint f57243c;
    public Paint d;
    public Paint f57244e;
    public Paint f57245f;
    public Paint f57246g;
    public x0 h;
    public float f57247i;
    public float f57248j;
    public f1 f57249k;
    public c1 f57250l;
    public ArrayList f57251m;
    public ArrayList f57252n;
    public Matrix f57253o;
    public float[] f57254p;

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
        float width = (f1Var.d / yt0Var.f42553a) * canvas.getWidth();
        float height = (f1Var.f57236e / yt0Var.f42554b) * canvas.getHeight();
        float L = org.telegram.messenger.g0.L(5.0f);
        boolean z10 = f1Var.f57233a;
        if (z10) {
            paint = this.d;
        } else {
            paint = this.f57245f;
        }
        canvas.drawCircle(width, height, L, paint);
        float width2 = (f1Var.d / yt0Var.f42553a) * canvas.getWidth();
        float height2 = (f1Var.f57236e / yt0Var.f42554b) * canvas.getHeight();
        float L2 = org.telegram.messenger.g0.L(5.0f);
        if (z10) {
            paint2 = this.f57244e;
        } else {
            paint2 = this.f57246g;
        }
        canvas.drawCircle(width2, height2, L2, paint2);
    }

    public final void c(float f10, float f11, boolean z10) {
        float[] fArr = this.f57254p;
        fArr[0] = f10;
        fArr[1] = f11;
        d(z10);
    }

    public final void d(boolean z10) {
        int i7;
        float[] fArr = this.f57254p;
        x0 x0Var = this.h;
        if (x0Var != null) {
            float f10 = x0Var.h;
            if (f10 != 0.0f) {
                float f11 = fArr[0] - x0Var.f57439b;
                fArr[0] = f11;
                fArr[1] = fArr[1] - x0Var.f57440c;
                if (z10) {
                    i7 = -1;
                } else {
                    i7 = 1;
                }
                double d = f10 * i7;
                float cos = (float) ((Math.cos(d) * f11) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                x0 x0Var2 = this.h;
                fArr[0] = cos + x0Var2.f57439b;
                fArr[1] = ((float) i5.c.c(d, fArr[1], sin)) + x0Var2.f57440c;
            }
        }
    }

    public final void e() {
        x0 x0Var;
        u0 u0Var = this.f57241a;
        if (u0Var != null && u0Var.getPainting() != null && (x0Var = this.h) != null) {
            x0Var.f57442f = u0Var.getCurrentWeight();
            i0 painting = u0Var.getPainting();
            x0 x0Var2 = this.h;
            int currentColor = u0Var.getCurrentColor();
            if (x0Var2 != null) {
                if (painting.f57277r != null) {
                    painting.f57266f.f(new j01(painting, x0Var2, currentColor, 26));
                }
            } else {
                painting.getClass();
            }
            this.f57251m.clear();
            this.f57252n.clear();
            this.h = null;
            t0 t0Var = u0Var.f57397a;
            if (t0Var != null) {
                t0Var.n();
            }
            u0Var.f57400e.f57430z = true;
        }
    }
}
