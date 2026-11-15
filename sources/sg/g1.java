package sg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.u11;
public final class g1 {
    public u0 f56626a;
    public o0 f56627b;
    public Paint f56628c;
    public Paint d;
    public Paint f56629e;
    public Paint f56630f;
    public Paint f56631g;
    public x0 h;
    public float f56632i;
    public float f56633j;
    public f1 f56634k;
    public c1 f56635l;
    public ArrayList f56636m;
    public ArrayList f56637n;
    public Matrix f56638o;
    public float[] f56639p;

    public static float a(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f14 - f12;
        float f17 = f15 - f13;
        float max = Math.max(Math.min((((f11 - f13) * f17) + ((f10 - f12) * f16)) / ((f17 * f17) + (f16 * f16)), 1.0f), 0.0f);
        float f18 = ((f16 * max) + f12) - f10;
        float f19 = ((max * f17) + f13) - f11;
        return (float) Math.sqrt((f19 * f19) + (f18 * f18));
    }

    public final void b(Canvas canvas, nt0 nt0Var, f1 f1Var) {
        Paint paint;
        Paint paint2;
        float width = (f1Var.d / nt0Var.f37713a) * canvas.getWidth();
        float height = (f1Var.f56621e / nt0Var.f37714b) * canvas.getHeight();
        float L = org.telegram.messenger.g0.L(5.0f);
        boolean z10 = f1Var.f56618a;
        if (z10) {
            paint = this.d;
        } else {
            paint = this.f56630f;
        }
        canvas.drawCircle(width, height, L, paint);
        float width2 = (f1Var.d / nt0Var.f37713a) * canvas.getWidth();
        float height2 = (f1Var.f56621e / nt0Var.f37714b) * canvas.getHeight();
        float L2 = org.telegram.messenger.g0.L(5.0f);
        if (z10) {
            paint2 = this.f56629e;
        } else {
            paint2 = this.f56631g;
        }
        canvas.drawCircle(width2, height2, L2, paint2);
    }

    public final void c(float f10, float f11, boolean z10) {
        float[] fArr = this.f56639p;
        fArr[0] = f10;
        fArr[1] = f11;
        d(z10);
    }

    public final void d(boolean z10) {
        int i7;
        float[] fArr = this.f56639p;
        x0 x0Var = this.h;
        if (x0Var != null) {
            float f10 = x0Var.h;
            if (f10 != 0.0f) {
                float f11 = fArr[0] - x0Var.f56824b;
                fArr[0] = f11;
                fArr[1] = fArr[1] - x0Var.f56825c;
                if (z10) {
                    i7 = -1;
                } else {
                    i7 = 1;
                }
                double d = f10 * i7;
                float cos = (float) ((Math.cos(d) * f11) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                x0 x0Var2 = this.h;
                fArr[0] = cos + x0Var2.f56824b;
                fArr[1] = ((float) i5.c.c(d, fArr[1], sin)) + x0Var2.f56825c;
            }
        }
    }

    public final void e() {
        x0 x0Var;
        u0 u0Var = this.f56626a;
        if (u0Var != null && u0Var.getPainting() != null && (x0Var = this.h) != null) {
            x0Var.f56827f = u0Var.getCurrentWeight();
            i0 painting = u0Var.getPainting();
            x0 x0Var2 = this.h;
            int currentColor = u0Var.getCurrentColor();
            if (x0Var2 != null) {
                if (painting.f56662r != null) {
                    painting.f56651f.f(new u11(painting, x0Var2, currentColor, 25));
                }
            } else {
                painting.getClass();
            }
            this.f56636m.clear();
            this.f56637n.clear();
            this.h = null;
            t0 t0Var = u0Var.f56782a;
            if (t0Var != null) {
                t0Var.t();
            }
            u0Var.f56785e.f56815z = true;
        }
    }
}
