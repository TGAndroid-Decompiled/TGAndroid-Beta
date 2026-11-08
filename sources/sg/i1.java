package sg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.d10;
public final class i1 {
    public w0 f55070a;
    public p0 f55071b;
    public Paint f55072c;
    public Paint d;
    public Paint f55073e;
    public Paint f55074f;
    public Paint f55075g;
    public z0 h;
    public float f55076i;
    public float f55077j;
    public h1 f55078k;
    public e1 f55079l;
    public ArrayList f55080m;
    public ArrayList f55081n;
    public Matrix f55082o;
    public float[] f55083p;

    public static float a(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f14 - f12;
        float f17 = f15 - f13;
        float max = Math.max(Math.min((((f11 - f13) * f17) + ((f10 - f12) * f16)) / ((f17 * f17) + (f16 * f16)), 1.0f), 0.0f);
        float f18 = ((f16 * max) + f12) - f10;
        float f19 = ((max * f17) + f13) - f11;
        return (float) Math.sqrt((f19 * f19) + (f18 * f18));
    }

    public final void b(Canvas canvas, mt0 mt0Var, h1 h1Var) {
        Paint paint;
        Paint paint2;
        float width = (h1Var.d / mt0Var.f36114a) * canvas.getWidth();
        float height = (h1Var.f55066e / mt0Var.f36115b) * canvas.getHeight();
        float L = org.telegram.messenger.g0.L(5.0f);
        boolean z9 = h1Var.f55063a;
        if (z9) {
            paint = this.d;
        } else {
            paint = this.f55074f;
        }
        canvas.drawCircle(width, height, L, paint);
        float width2 = (h1Var.d / mt0Var.f36114a) * canvas.getWidth();
        float height2 = (h1Var.f55066e / mt0Var.f36115b) * canvas.getHeight();
        float L2 = org.telegram.messenger.g0.L(5.0f);
        if (z9) {
            paint2 = this.f55073e;
        } else {
            paint2 = this.f55075g;
        }
        canvas.drawCircle(width2, height2, L2, paint2);
    }

    public final void c(float f10, float f11, boolean z9) {
        float[] fArr = this.f55083p;
        fArr[0] = f10;
        fArr[1] = f11;
        d(z9);
    }

    public final void d(boolean z9) {
        int i7;
        float[] fArr = this.f55083p;
        z0 z0Var = this.h;
        if (z0Var != null) {
            float f10 = z0Var.h;
            if (f10 != 0.0f) {
                float f11 = fArr[0] - z0Var.f55268b;
                fArr[0] = f11;
                fArr[1] = fArr[1] - z0Var.f55269c;
                if (z9) {
                    i7 = -1;
                } else {
                    i7 = 1;
                }
                double d = f10 * i7;
                float cos = (float) ((Math.cos(d) * f11) - (Math.sin(d) * fArr[1]));
                double sin = Math.sin(d) * fArr[0];
                z0 z0Var2 = this.h;
                fArr[0] = cos + z0Var2.f55268b;
                fArr[1] = ((float) jg.g.d(d, fArr[1], sin)) + z0Var2.f55269c;
            }
        }
    }

    public final void e() {
        z0 z0Var;
        w0 w0Var = this.f55070a;
        if (w0Var != null && w0Var.getPainting() != null && (z0Var = this.h) != null) {
            z0Var.f55271f = w0Var.getCurrentWeight();
            j0 painting = w0Var.getPainting();
            z0 z0Var2 = this.h;
            int currentColor = w0Var.getCurrentColor();
            if (z0Var2 != null) {
                if (painting.f55101r != null) {
                    painting.f55090f.f(new d10(painting, z0Var2, currentColor, 22));
                }
            } else {
                painting.getClass();
            }
            this.f55080m.clear();
            this.f55081n.clear();
            this.h = null;
            v0 v0Var = w0Var.f55249a;
            if (v0Var != null) {
                v0Var.p();
            }
            w0Var.f55252e.f55248z = true;
        }
    }
}
