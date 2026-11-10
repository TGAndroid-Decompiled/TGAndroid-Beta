package sg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.h10;
public final class h1 {
    public v0 f55076a;
    public p0 f55077b;
    public Paint f55078c;
    public Paint d;
    public Paint f55079e;
    public Paint f55080f;
    public Paint f55081g;
    public y0 h;
    public float f55082i;
    public float f55083j;
    public g1 f55084k;
    public d1 f55085l;
    public ArrayList f55086m;
    public ArrayList f55087n;
    public Matrix f55088o;
    public float[] f55089p;

    public static float a(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f14 - f12;
        float f17 = f15 - f13;
        float max = Math.max(Math.min((((f11 - f13) * f17) + ((f10 - f12) * f16)) / ((f17 * f17) + (f16 * f16)), 1.0f), 0.0f);
        float f18 = ((f16 * max) + f12) - f10;
        float f19 = ((max * f17) + f13) - f11;
        return (float) Math.sqrt((f19 * f19) + (f18 * f18));
    }

    public final void b(Canvas canvas, nt0 nt0Var, g1 g1Var) {
        Paint paint;
        Paint paint2;
        float width = (g1Var.d / nt0Var.f36392a) * canvas.getWidth();
        float height = (g1Var.f55072e / nt0Var.f36393b) * canvas.getHeight();
        float L = org.telegram.messenger.g0.L(5.0f);
        boolean z9 = g1Var.f55069a;
        if (z9) {
            paint = this.d;
        } else {
            paint = this.f55080f;
        }
        canvas.drawCircle(width, height, L, paint);
        float width2 = (g1Var.d / nt0Var.f36392a) * canvas.getWidth();
        float height2 = (g1Var.f55072e / nt0Var.f36393b) * canvas.getHeight();
        float L2 = org.telegram.messenger.g0.L(5.0f);
        if (z9) {
            paint2 = this.f55079e;
        } else {
            paint2 = this.f55081g;
        }
        canvas.drawCircle(width2, height2, L2, paint2);
    }

    public final void c(float f10, float f11, boolean z9) {
        float[] fArr = this.f55089p;
        fArr[0] = f10;
        fArr[1] = f11;
        d(z9);
    }

    public final void d(boolean z9) {
        int i7;
        float[] fArr = this.f55089p;
        y0 y0Var = this.h;
        if (y0Var != null) {
            float f10 = y0Var.h;
            if (f10 != 0.0f) {
                float f11 = fArr[0] - y0Var.f55275b;
                fArr[0] = f11;
                fArr[1] = fArr[1] - y0Var.f55276c;
                if (z9) {
                    i7 = -1;
                } else {
                    i7 = 1;
                }
                double d = f10 * i7;
                float cos = (float) ((Math.cos(d) * f11) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                y0 y0Var2 = this.h;
                fArr[0] = cos + y0Var2.f55275b;
                fArr[1] = ((float) jg.g.d(d, fArr[1], sin)) + y0Var2.f55276c;
            }
        }
    }

    public final void e() {
        y0 y0Var;
        v0 v0Var = this.f55076a;
        if (v0Var != null && v0Var.getPainting() != null && (y0Var = this.h) != null) {
            y0Var.f55278f = v0Var.getCurrentWeight();
            j0 painting = v0Var.getPainting();
            y0 y0Var2 = this.h;
            int currentColor = v0Var.getCurrentColor();
            if (y0Var2 != null) {
                if (painting.f55113r != null) {
                    painting.f55102f.f(new h10(painting, y0Var2, currentColor, 22));
                }
            } else {
                painting.getClass();
            }
            this.f55086m.clear();
            this.f55087n.clear();
            this.h = null;
            u0 u0Var = v0Var.f55233a;
            if (u0Var != null) {
                u0Var.p();
            }
            v0Var.f55236e.f55266z = true;
        }
    }
}
