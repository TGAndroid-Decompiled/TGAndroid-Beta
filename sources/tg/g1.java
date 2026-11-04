package tg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import k2.p1;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.rw;
public final class g1 {
    public u0 f55169a;
    public o0 f55170b;
    public Paint f55171c;
    public Paint d;
    public Paint f55172e;
    public Paint f55173f;
    public Paint f55174g;
    public x0 h;
    public float f55175i;
    public float f55176j;
    public f1 f55177k;
    public c1 f55178l;
    public ArrayList f55179m;
    public ArrayList f55180n;
    public Matrix f55181o;
    public float[] f55182p;

    public static float a(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f14 - f12;
        float f17 = f15 - f13;
        float max = Math.max(Math.min((((f11 - f13) * f17) + ((f10 - f12) * f16)) / ((f17 * f17) + (f16 * f16)), 1.0f), 0.0f);
        float f18 = ((f16 * max) + f12) - f10;
        float f19 = ((max * f17) + f13) - f11;
        return (float) Math.sqrt((f19 * f19) + (f18 * f18));
    }

    public final void b(Canvas canvas, lt0 lt0Var, f1 f1Var) {
        Paint paint;
        Paint paint2;
        float width = (f1Var.d / lt0Var.f35877a) * canvas.getWidth();
        float height = (f1Var.f55163e / lt0Var.f35878b) * canvas.getHeight();
        float L = org.telegram.messenger.g0.L(5.0f);
        boolean z10 = f1Var.f55160a;
        if (z10) {
            paint = this.d;
        } else {
            paint = this.f55173f;
        }
        canvas.drawCircle(width, height, L, paint);
        float width2 = (f1Var.d / lt0Var.f35877a) * canvas.getWidth();
        float height2 = (f1Var.f55163e / lt0Var.f35878b) * canvas.getHeight();
        float L2 = org.telegram.messenger.g0.L(5.0f);
        if (z10) {
            paint2 = this.f55172e;
        } else {
            paint2 = this.f55174g;
        }
        canvas.drawCircle(width2, height2, L2, paint2);
    }

    public final void c(float f10, float f11, boolean z10) {
        float[] fArr = this.f55182p;
        fArr[0] = f10;
        fArr[1] = f11;
        d(z10);
    }

    public final void d(boolean z10) {
        int i3;
        float[] fArr = this.f55182p;
        x0 x0Var = this.h;
        if (x0Var != null) {
            float f10 = x0Var.h;
            if (f10 != 0.0f) {
                float f11 = fArr[0] - x0Var.f55365b;
                fArr[0] = f11;
                fArr[1] = fArr[1] - x0Var.f55366c;
                if (z10) {
                    i3 = -1;
                } else {
                    i3 = 1;
                }
                double d = f10 * i3;
                float cos = (float) ((Math.cos(d) * f11) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                x0 x0Var2 = this.h;
                fArr[0] = cos + x0Var2.f55365b;
                fArr[1] = ((float) p1.c(d, fArr[1], sin)) + x0Var2.f55366c;
            }
        }
    }

    public final void e() {
        x0 x0Var;
        u0 u0Var = this.f55169a;
        if (u0Var != null && u0Var.getPainting() != null && (x0Var = this.h) != null) {
            x0Var.f55368f = u0Var.getCurrentWeight();
            i0 painting = u0Var.getPainting();
            x0 x0Var2 = this.h;
            int currentColor = u0Var.getCurrentColor();
            if (x0Var2 != null) {
                if (painting.f55204r != null) {
                    painting.f55193f.f(new rw(painting, x0Var2, currentColor, 25));
                }
            } else {
                painting.getClass();
            }
            this.f55179m.clear();
            this.f55180n.clear();
            this.h = null;
            t0 t0Var = u0Var.f55321a;
            if (t0Var != null) {
                t0Var.m();
            }
            u0Var.f55324e.f55361z = true;
        }
    }
}
